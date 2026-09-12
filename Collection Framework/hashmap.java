import java.util.HashMap;

public class hashmap {
    public static void main (String [] args)
    {
        HashMap<Integer,Integer> obj = new HashMap<>();
        obj.put(1,100);
        obj.put(2,200);
        System.out.println("The data inserted is "+ obj);
        System.out.println("The data at index 2 is  "+ obj.get(2));
        System.out.println("contains is  "+ obj.containsKey(1));
HashMap<String, Integer> map = new HashMap<>();

map.put("apple", 10);

System.out.println(map.containsKey("apple"));
//contains value
        System.out.println(obj.containsValue(100));
        //to remove key


System.out.println(obj.remove(1));
System.out.println(obj.size());
System.out.println(obj.isEmpty());
obj.clear();
System.out.println(obj);
obj.put(20,200);
obj.put(30,300);
System.out.println(obj.keySet());
// to get key value pairs
System.out.println(obj.entrySet());
// iterate through keys 
for (Integer key: obj.keySet())
{
    System.out.println(key);
}
for (Integer key : obj.keySet()) {
    System.out.println(key + " → " + obj.get(key));
}
int values = obj.getOrDefault(20, 0);
System.out.println(values);
obj.replace(20,700);
System.out.println(obj);

// replaceall
obj.replaceAll((key,value) -> value * 2);
System.out.println(obj);

    }
}
