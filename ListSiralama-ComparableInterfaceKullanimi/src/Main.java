import java.util.*;

public class Main {

    static class Player implements Comparable<Player>{ //Implement Onemli 
        private  String isim;
        private int id;

        @Override
        public String toString() {
            return "ID: " + id + " Isim:  " + isim ;
        }

        public Player(String isim, int id) {
            this.isim = isim;
            this.id = id;
        }

        @Override //ONEMLI BUYUKTEN KUCUGE SIRALIYOR..
        public int compareTo(Player player) {
            if(this.id > player.id){
                return 1;
            } else if (this.id < player.id) {
                return -1;
            }
            return 0;
        }
    }
    public static void main(String[] args) {


        List<String > list1 = new ArrayList<String>();

        list1.add("Java");
        list1.add("Php");
        list1.add("Cpp");
        list1.add("Css");
        list1.add("Flutter");
        list1.add("0");
        list1.add("3");

        //Collections Framework kullan static method.
        Collections.sort(list1);   //Alfabetik sıralandi



            List<Player> player1 = new ArrayList<Player>();


            player1.add(new Player("Emre", 94));
            player1.add(new Player("Suat", 3));
            player1.add(new Player("Melek", 6));



           Player p1 = new Player("Murat" , 5);
           Player p2 = new Player("Yusuf", 3);


            System.out.println(p1.compareTo(p2));
            System.out.println(p1.compareTo(p1));
            System.out.println(p2.compareTo(p1));

            for (Player p : player1 ){
                System.out.println(p);
            }


        Set<Player> treeSet = new TreeSet<Player>();
        treeSet.add(new Player("Selami", 93));
        treeSet.add(new Player("ahmet", 92));
        treeSet.add(new Player("Selami", 32));

        for (Player p : treeSet){

            System.out.println(p);
        }


    }
}