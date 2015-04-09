/*
given a horizontal array of strings convert it to vertical. like english characters are read left to right. convert them to a chinese format which is read vertically. 
eg. 
epic is a healthcare company. 
interviewing for software developer. 
print this vertically sentence by sentence.*/


public class Sentence
{
	public void horizontalToVertical(ArrayList<String> strings)
	{
		int maxLen = 0;

		for(int i=0;i<strings.length();i++)
		{
			int len = string.get(i).split(" ").length;
			maxLen = (maxLen<len)?len:maxLen;
		}

		String[][] str=new String[max][strings.length()];

		for(int i=0;i<strings.length();i++)
		{
			String[] tokens = string.get(i).split(" ");
			int tokenLen = tokens.length;

			for(int j=0;j<maxlen;j++)
			{
				if(j<tokenLen)
					str[j][i] = tokens[j];
				else
					str[j][i] = "";
			}
		}

		//print str[i][]

	}
}