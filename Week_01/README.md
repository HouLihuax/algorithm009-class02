学习笔记
这周学习的知识比较基础，在大一的时候用的比较多。算是复习一遍旧知识了。但是以前学的时候，太懒，看几遍代码理解了之后，就把代码复制提交了，自己打代码的时间太少了。现在大三了实习面试时都要考这些算法，我面腾讯的时候脑子一片空白，现在跟着老师的一步一步一个脚印的走，把基础先打牢。这一周我学到蛮多方法的，中间夹逼、快慢指针、哈希表记忆，还有就是利用队列解题，这个以前做得少。而且编码的时候也时刻提醒自己注意好编程格式，养成良好的编程习惯。万事开头难，如今的我已经迈出了第一步，希望自己能坚持下去，继续努力，为9月秋招做好充足准备！

新的 API 改写 Deque 的代码：
public class Solution {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<Integer>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addLast(4);
        deque.addLast(5);
        deque.addLast(6);
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
    }
}
