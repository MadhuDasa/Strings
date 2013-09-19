import java.util.*;

class LearnStr
{
	public static void main(String[] args)
	{
		/*String str= "sample string";
		int max=0;
		//System.out.println(str+str.length());
		HashMap<Character,Integer> ht=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{

			if(!ht.containsKey(str.charAt(i)))
				ht.put(str.charAt(i),1);
			else
				ht.put(str.charAt(i),ht.get(str.charAt(i))+1);
		}
	Collection val=ht.values();
	System.out.println(Collections.max(val));*/
//=================================================================================
	/*String str= "sample strinlg";
	HashMap<Character,Integer> ht=new HashMap<Character,Integer>();
			for(int i=0;i<str.length();i++)
			{

				if(!ht.containsKey(str.charAt(i)))
					ht.put(str.charAt(i),1);
				else
					ht.put(str.charAt(i),ht.get(str.charAt(i))+1);

				if(ht.get(str.charAt(i))>1)
					System.out.println(str.charAt(i));

		}//System.out.println(ht);*/
//========================================================================================
	/*String str1="geeks"; String str2="gee";char[] res=new char[45];
	HashMap<Character,Boolean> ht=new HashMap<Character,Boolean>();
				for(int i=0;i<str2.length();i++)
				{
						ht.put(str2.charAt(i),true);

				}
				for(int i=0,j=0;i<str1.length();i++)
				{
					if(!ht.containsKey(str1.charAt(i)))
						res[j]=str1.charAt(i);
					j++;
				}
				for(int i=0;i<res.length;i++)
				{
					System.out.println(res[i]);
				}*/
//========================================================================================
	/*String str1="abacd"; String str2="cdab";
	String sub=str1.concat(str1);
		if(sub.contains(str2))
			System.out.println("yes");
		else
			System.out.println("no");*/
//========================================================================================
	/*	List<String> list1=new ArrayList<String>();
		list1.add("mango");
		list1.add("mamner");
		list1.add("melt");
		list1.add("amess");

		String str="man";int length=str.length();
HashMap<Character,Boolean> ht=new HashMap<Character,Boolean>();
				for(int i=0;i<str.length();i++)
				{
						ht.put(str.charAt(i),true);

				}
				Iterator<String> itr=list1.iterator();
				while(itr.hasNext())
				{
					str=itr.next();int count=1;
					for(int i=0;i<str.length();)
					{
						if(ht.containsKey(str.charAt(i)) )
						{

							if(count==length){System.out.println(str);break;}
								else
								{	count++;
									i++;
								}
						}
						else
							{System.out.println("no");
							break;}

					}
				}*/
//================================================================================================================
	String str="Hello";char temp1,temp2;
	int length=str.length();
	for(int i=0,j=length;i<length/2 ;i++,j--)
	{
		temp1=str.charAt(i);
		str.replace(str.charAt(i),str.charAt(j));
		str.replace(str.charAt(j),temp1);
	}
	System.out.println(str);//DOTHIS
//================================================================================================================

	}
}

