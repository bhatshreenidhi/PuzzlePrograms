
/*
given an expression like 3*4 + 8-9 (only +, - , * operators) as a string evaluate it strictly from left to right
*/

public class Evaluation
{
	public static int evaluateExp(String exp)
	{
		Stack<Integer> stInt = new Stack();
		Stack<String> stOptr = new Stack();


		int len = exp.length();

		for(int i=len-1;i>=0;i--)
		{	
			char token = exp.charAt(i);
			if(token=='*' || token=='-' || token=='+')
				stOptr.push(token);
			else
				stInt.push(Integer.Parse(token));
		}

		while(stOptr.peek()!=null)
		{
			char token = stOptr.pop();

			int num1 = stInt.pop();
			int num2 = stInt.pop();

			int newNum;

			if(token=='*')
				newNum = num1*num2;

			else if(token=='+')
				newNum = num1+num2;

			else
				newNum = num1-num2;

			stInt.push(newNum);
		}

		int result = stInt.pop();
		return result;

	}
}