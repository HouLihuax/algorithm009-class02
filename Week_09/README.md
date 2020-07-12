学习笔记
//冒泡排序
    public void bubbleSort(int []array) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    //选择排序
    public void selectionSort(int []array) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    //插入排序
    public void insertionSort(int []array) {
        int length = array.length;
        for (int i = 1; i < length; i++) {
            int preIndex = i - 1;
            int current = array[i];
            while (preIndex >= 0 && array[preIndex] > current) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            array[preIndex + 1] = current;
        }
    }

    //快速排序（n*logn）
    public void quickSort(int []array, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot - 1);
        quickSort(array, pivot + 1, end);
    }
    public int partition(int []array, int begin, int end) {
        int pivot = begin, counter = begin + 1;
        for (int i = begin + 1; i <= end; i++) {
            if (array[i] < array[pivot]) {
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        int temp = array[pivot];
        array[pivot] = array[counter - 1];
        array[counter - 1] = temp;
        return counter - 1;
    }

    //归并排序
    public void mergeSort(int []array, int left, int right) {
        if (right <= left) return;
        int mid = (left + right) >> 1;
        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);
        merge(array, left, mid, right);
    }
    public void merge(int []array, int left, int mid, int right) {
        int []temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        while(i <= mid && j <= right) {
            temp[k++] = array[i] <= array[j] ? array[i++] : array[j++];
        }

        while(i <= mid) {
            temp[k++] = array[i++];
        }
        while(j <= right) {
            temp[k++] = array[j++];
        }

        System.arraycopy(temp, 0, array, left, right - left + 1);
    }
