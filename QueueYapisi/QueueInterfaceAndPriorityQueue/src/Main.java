import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    static class Player implements Comparable<Player> {
        private String isim;
        private int id;

        @Override
        public String toString() {
            return  isim+ ": yas " +id;
        }

        public Player(String isim, int id) {
            this.isim = isim;
            this.id = id;
        }

        @Override
        public int compareTo(Player player1) {
           if (this.id < player1.id){ //id si kucuk olanin onceligi daha buyuk.
               return -1;
           } else if (this.id > player1.id) {
               return 1;
           }
            return 0;
        }
    }
    public static void main(String[] args) {


        Queue<Player> queue1 = new PriorityQueue<Player>();
        queue1.offer(new Player("mehmet",10));
        queue1.offer(new Player("ayse",66));
        queue1.offer(new Player("melek",23));

        while (!queue1.isEmpty()){

            System.out.println("Eleman cikariliyor "  + queue1.poll());  //ToString kullanman lazım eger isim cikasaksa
        }
    }
}