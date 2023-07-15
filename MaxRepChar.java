//Program to find Maximum Occurring Character in String
import java.util.*;
class MaxRepChar
{
	public static void main(String [] args){
	String s="my name is rohini";
	HashMap<Character, Integer>map=new HashMap <Character, Integer>();
	
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(map.containsKey(ch)){
			int count=map.get(ch);
			count++;
			map.replace(ch, count);
	}
		else{
			map.put(ch, 1);
		}
	}

	for(Character key:map.keySet()){
		System.out.println(key+"-"+map.get(key));
	}

}
}