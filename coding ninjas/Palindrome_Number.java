int d=a;
		int y = 0;
		while(a>0)
		{
			int digit = a%10;
			
			y = y*10 + digit;
			
			a=a/10;
		}
		
		if(d==y)
		{
		System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
