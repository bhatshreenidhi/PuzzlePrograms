/* permutations of a string */

class Perm
{
	
	public static String addCharacter(String str,char c,int i)
	{
		String first = str.substring(0,i);
		String last = str.substring(i);
		return first + c + last;
	}
	
	public static Set<String> permute(String str)
	{
		Set<String> hashStr = new HashSet<String>();

		if(str==null)
			return hashStr;
		if(str.length()==0)
			return hashStr.add("");

		char firstChar = str.charAt(0);
		String remStr = srt.substring(1);

		Set<String> newWords = permute(remStr);

		for(String newString:newWords)
		{	
			for(int i=0;i<=newString.length();i++)
			{
				hashStr.add(addCharacter(newString,firstChar,i));
			}
		}

		return hashStr;

	}

}