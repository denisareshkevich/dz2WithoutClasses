package String4;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       List<String> strings = new LinkedList<>();
        Collections.addAll(strings,"hgjf", "njek", "knie", "jd.ljse", "dfgh");
        System.out.println(string4SymbolAdder(strings));

    }
    private static List<String> string4SymbolAdder(List<String> strings) {
        LinkedList<String> linkedList = new LinkedList<>(strings);

        for (int i = 1; i < linkedList.size(); i++){
            if (linkedList.get(i).length() == 4){
                linkedList.add(i, "****");
                i++;
            }

        }
        if(linkedList.getFirst().length() == 4) linkedList.addFirst("****");


        return linkedList;
    }
}
