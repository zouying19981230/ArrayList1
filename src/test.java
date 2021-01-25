import java.util.ArrayList;
import java.util.Iterator;

public class test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(3);
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("C");
        list.add("D");
        list.add("E");
        for(int i=0; i<list.size(); i++){
            System.out.println(i);
            if(list.get(i).equals("C")){
                list.remove(list.get(i));
                i--;
            }
        }
        System.out.println(list);
        
    
    }
}