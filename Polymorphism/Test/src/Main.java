import java.sql.Array;
import java.util.*;

public class Main {

    static class BuyuktenKucuge implements Comparator<String>{
        @Override
        public int compare(String o1, String o2) {
            return -o1.compareTo(o2);
        }
    }

   static class Player implements Comparable<Player>{

        private String isim;
        private int id;

       public Player(String memo) {
       }

       //000000000000000000000000000000000000000000000000

       public String getIsim() {
           return isim;
       }

       public void setIsim(String isim) {
           this.isim = isim;
       }

       public int getId() {
           return id;
       }

       public void setId(int id) {
           this.id = id;
       }

       @Override
       public int compareTo(Player player) {
          if (this.id > player.id){
              return 1;
          } else if (this.id < player.id) {
              return -1;
          }
          return 0;
       }
   }
     public static void main(String[] args) {


         Set<String> linkedSet = new LinkedHashSet<>();

         linkedSet.add("Ahmet");
         linkedSet.add("Mehmet");
         linkedSet.add("Selami");
         linkedSet.add("Hasan");

         for (String s : linkedSet) {

             System.out.println(s);

             List<Player> p1 = new ArrayList<>();

             p1.add(new Player("Memo"));
             p1.add(new Player("Mem2"));
             p1.add(new Player("Mem3"));
             p1.add(new Player("Memo4"));


         }
     }}

