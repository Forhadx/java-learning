import java.util.Map;
import java.util.HashMap;

public class i_map{
    public static void main(String[] args) {
        Map<Integer, String> student = new HashMap<>();

        student.put(1, "rahim");
        student.put(2, "mia");
        student.put(3, "ket");
        student.put(3, "ket2"); // value update

        System.out.println(student.get(2)); // mia
        System.out.println(student.get(5)); // null

        System.out.println(student); // {1=rahim, 2=mia, 3=ket2}

        for(Integer key: student.keySet()){
            System.out.println("key: "+key+" value: "+student.get(key));
            /*
                key: 1 value: rahim
                key: 2 value: mia
                key: 3 value: ket2
            */
        }

        for(Map.Entry<Integer, String> entry: student.entrySet()){
            // System.out.println(entry);
            /*
                1=rahim
                2=mia
                3=ket2
            */

            System.out.println("KEY: "+entry.getKey()+" Value: "+entry.getValue());
            /*
                KEY: 1 Value: rahim
                KEY: 2 Value: mia
                KEY: 3 Value: ket2
            */
        }

    }
}


// hashmap input order could be changed