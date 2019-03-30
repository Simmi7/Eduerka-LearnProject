package learnJava;
import java.util.*;

public class HashmapsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> objMap=new HashMap<String,String>();
		objMap.put("Name","Suzuki");
		objMap.put("Power","220");
		objMap.put("Type","4-Wheeler");
		objMap.put("PRice","800000");
		System.out.println("Elements of the objMap:" +objMap);
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Java");
		map.put(2, "PHP");
		map.put(3, "C++");
		map.put(4, "Pyhton");
		map.put(5, "SQL");
		System.out.println("Elements of the Map:" +map);
		map.remove(5);
		System.out.println("Elements of the Map after removing:" +map);
		boolean chkItem=map.containsKey(5);
		System.out.println(chkItem);
		System.out.println("Keyset of the map:" +map.keySet());
		System.out.println("Check if Map is empty:" +map.isEmpty());
	}

}
