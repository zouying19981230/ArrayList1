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
 /*��һ�ַ�ʽ������ԭ���ǣ�ÿ��listɾ��Ԫ�غ󣬺����Ԫ�ض�Ҫ��ǰ�ƶ�һλ�����൱��i�����1��remove����������ͻ���һ��Ԫ�أ����Ծ���Ҫ�����е�i--������remove�󣬺���Ԫ��ǰ��һλ��Ӱ��*/


        for(int i=0; i<list.size(); i++){
            System.out.println(i);
            if(list.get(i).equals("C")){
                list.remove(list.get(i));
                i--;
            }
        }
      

/*�ڶ��ַ�ʽ���������Ӵ�С������remove������ɾ��Ԫ�ص��µĺ����Ԫ����ǰ�ƶ�һλ

 �Ա�����û��Ӱ����*/

    
        for(int i=list.size()-1; i>-1; i--){
            if(list.get(i).equals("C")){
                list.remove(list.get(i));
            }
        }

        
/*�����ַ�ʽ������˼��͵�һ�����ƣ���ͬ���ǣ�����Itr�����ں�����ָ��cursor��lastRetʵ�ֵģ��������remove���൱��cursor������һλ���͵�һ�ֵ�i--˼����Щ�����˽�ĸ����������ȥ��Դ��*/

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