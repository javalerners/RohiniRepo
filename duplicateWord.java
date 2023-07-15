public class duplicateWord
{
	public static void main (String[] args)
	{
	String input="this is java session , this session session is start from today";
	input=input.toLowerCase();
	
	String [] str=input.split(" ");
	int count;
	for(int i=0;i<str.length;i++){
		count=1;
		for(int j=i+1;j<str.length;j++){
			if(str[i].equals(str[j])){
			count++;
			str[j]="0";
			}		
		}
		if(str[i]!="0"){
			System.out.println(str[i]+"="+count);
			count=1;		

			}
		}
	}

}
	







