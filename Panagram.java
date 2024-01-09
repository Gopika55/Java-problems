package nila;
public class Panagram {
 
	public static void main(String args[])
	{
		String str="The Quick brown fox jumps over the lazy dog";
		
		 
		if(checkpanagram(str)==true)
		{
			System.out.println("It is Panagram");
		}
		else
		{
			System.out.println("It is not panagram");
		}
	}

	private static boolean checkpanagram(String str) 
	{
		Boolean[] mark=new Boolean[26];
		
		int index=0;
		
		for(int i=0;i<str.length();i++)
		{
			if('A'<=str.charAt(i)&& str.charAt(i)<='Z')
			{
				index=str.charAt(i)-'A';
			}
			
			else if('a'<=str.charAt(i)&& str.charAt(i)<='z')
			{
				index=str.charAt(i)-'a';
			}
			else
			{
				continue;
				
			}	
			
			mark[index]=true;
			
		}
		for(int i=0;i<=25;)
		{
			if(mark[i]==false)
				return (false);
			return (true);
		}
		return false;
	}
}