import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class NewDataStructure {
    //Design a data structure which performs the following opearions (insert an element/ remove/ find random)
    //element in O(1) time complexity
    HashMap<Integer, Integer> hash= new HashMap<>();
    ArrayList<Integer> array= new ArrayList<>();
    public  void insert(int Num){
        //we insert at the end of the array as well as insert it in the hashmap using the size variable
        if(hash.get(Num)!= null){
            return;
        }
        int size= array.size();
        array.add(Num);
        hash.put(Num, size);
    }

    public void remove(int Num){
        //to remove we first et the index using hashmap and remove the entry from hashmap
        //swap that index's element with array's last item and remove it from array
        //and
        int index= hash.get(Num);
        hash.remove(Num);
        int size= array.size();
        int last= array.get(size-1);
        Collections.swap(array, index, size-1);
        array.remove(size-1);
        hash.put(last, index);
    }

    public int getRandom(){
        //we use the math modulus to get the size using the arraylist
        int index= (int)(Math.random()%array.size());
        return array.get(index);
    }
}
