import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {


    class Player{
        private String isim;

        public Player(String isim, int id) {
            this.isim = isim;
            this.id = String.valueOf(id);
        }

        private String id;


        public String toString() {
            return "|||| ID: " + id + "Isim " + isim;
        }
    }




   public void main(String[] args) {



        Set<Player> hashSet = new HashSet<Player>();

        Player player1 = new Player("Mustafa" , 30);
        Player player2 = new Player("Mehmet" , 10);
        Player player3 = new Player("Altan" , 20);
        Player player4 = new Player("Mustafa" , 45);
        Player player5 = new Player("Ahmet" , 45);

        hashSet.add(player1);
        hashSet.add(player2);
        hashSet.add(player3);
        hashSet.add(player4);
        hashSet.add(player5);

        for ( Player p : hashSet){

            System.out.println(p);


        } //iki deger de depolandi.


    }
}