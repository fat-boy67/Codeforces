import java.io.*;


public class B
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		
		String s0 = br.readLine();
		int n=Integer.parseInt(s0.trim());
		String[] s= br.readLine().split(" ");
		int[] p = new int[n];
		for (int i=0;i<n ;i++)
		{
			p[i]=Integer.parseInt(s[i].trim());	
		}

		int count;
		boolean ans=true;

		for (int i=0;i<n ;i++) 
		{
			count=0;
			s0=br.readLine();
			for (int j=0;j<s0.length() ;j++) 
			{
				char temp=s0.charAt(j);
				if(temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u'||temp=='y')
				count++;		
			}

			if(count!=p[i])
				ans=false;
		}
/*
		char[] ch =s.toCharArray();

		ch[4]='w';*/

		/*for (String temp:s ) 
		{
			System.out.println(temp);	
		}*/
		//s=ch.toString();*/

/*		
		char[] ch =s.toCharArray();

		ch[4]='w';
		int n = Integer.parseInt(s0.trim());
		String[] s1 = br.readLine().split(" ");*/		
//		System.out.println(s);
		if(ans==true)
		System.out.println("YES");
		else
			System.out.println("NO");
	}
}
