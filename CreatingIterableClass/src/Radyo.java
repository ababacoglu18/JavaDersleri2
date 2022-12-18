import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Radyo implements Iterable<String>{

    private ArrayList<String> chanelList= new ArrayList<>();

    public Radyo(String[] kanal1){

        for(String kanal : kanal1){

            chanelList.add(kanal);
        }
    }

    @Override
    public Iterator<String> iterator() {
        return chanelList.iterator();
    }
}
