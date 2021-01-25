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
 /*第一种方式，基本原理是，每次list删除元素后，后面的元素都要往前移动一位，就相当于i多加了1，remove后继续遍历就会错过一个元素，所以就需要代码中的i--，抵消remove后，后面元素前移一位的影响*/


        for(int i=0; i<list.size(); i++){
            System.out.println(i);
            if(list.get(i).equals("C")){
                list.remove(list.get(i));
                i--;
            }
        }
      

/*第二种方式，按索引从大到小，这样remove方法的删除元素导致的后面的元素往前移动一位

 对遍历就没有影响了*/

    
        for(int i=list.size()-1; i>-1; i--){
            if(list.get(i).equals("C")){
                list.remove(list.get(i));
            }
        }

        
/*第三种方式，基本思想和第一种相似，不同的是，是用Itr对象，内含两个指针cursor和lastRet实现的，如果调用remove，相当于cursor回退了一位，和第一种的i--思想有些像，想了解的更清楚，可以去看源码*/

       Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String s = iterator.next();
            if(s.equals("C")){
                iterator.remove();
            }
        }
        
        System.out.println(list);
        
    
    }
}