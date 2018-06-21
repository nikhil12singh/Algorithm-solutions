public class BullsandCows {

	public static String getHint(String secret, String guess) {
		
		int len1 = secret.length();
		int len2 = guess.length();
		
		if(len1==0 || len2==0)
			return "0A0B";
		int i = 0;
		char arr1[] = new char[len1];
		char arr2[] = new char[len1];
		
		while(i<len1)
		{
			if(secret.charAt(i)==guess.charAt(i))
				{
				arr1[i] = 'A';
				arr2[i] = 'A';
				}
			i++;
		}
		//System.out.println("yes");
		i = 0;
		
		while(i<len1)
		{
			//System.out.println("w");
			
			if(arr1[i]!='A' && arr1[i]!='B')
			{
			    int j = 0;
				while(j<len1)
				{
					if(guess.charAt(j)==secret.charAt(i) && (arr2[j]!='A' && arr2[j]!='B'))
						{
						System.out.println(i+" "+j);
						arr2[j] = 'B';
						arr1[i] = 'B';
						break;
						}
					j++;	
				}
				}
			i++;
			//System.out.println(i);
			}
			
		int bullcount = 0;
		int cowcount = 0;
		
		for(char ch:arr1)
		{
			if(ch=='A')
				bullcount++;
			if(ch=='B')
				cowcount++;
		}
		System.out.println(cowcount);
		return bullcount+"A"+cowcount+"B";
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getHint("1122","2211"));
	}
	
    }
