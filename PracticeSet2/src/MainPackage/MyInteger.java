package MainPackage;


public class MyInteger {
		//field
		private int value; 
		
		public MyInteger(int value) // constructor, usually 1. Lots of data fields
		{
			this.value = value;
		}
		
		public int getValue() // need a getter and setter, put this first!!!!
		{
			return this.value;
		}
		
		public boolean isEven()
		{
			if (this.value%2 == 0){
				return true;}
				else {return false;}
			
		}
		
		public boolean isOdd()
		{
			if (this.value%2 == 1){
				return true;}
			else {return false;}
		}
		  
		public boolean IsPrime()
		{
			for (int x =2; x<value; x++) {
				if (value % x ==0)
					return false;
			}
			return true;
		}
		
		public static boolean isEven(int x) 
		{
			if(x%2 == 0) {
				return true;}
			else {return false;}
		
		}
		
		public static boolean isOdd(int x) 
		{
			if(x%2 == 1) {
				return true;}
			else {return false;}
			
		}
		
		public static boolean isPrime(int x) 
		{
			for (int i = 2; i < x; i++){
				if (x % i == 0){
					return false;}
			} return true;
				
		}
		
		public static boolean isEven(MyInteger a) //note to self: object already exists, use as type
		{
			int b = a.getValue();
		
			if(b%2 == 0) {
				return true;}
			else {return false;}
			
		}
		
		
		
		public static boolean isOdd(MyInteger a) //note to self: object already exists, use as type
		{
			int b = a.getValue();
		
			if(b%2 == 1) {
				return true;}
			else {return false;}
			
		}
		
		public static boolean isPrime(MyInteger a)
		{
			int b = a.getValue();
			for (int i = 2; i < b; i++){
				if (b % i == 0){
					return false;}
			} return true;
				
		}
		
		
		
		
		public static int parseInt(char[] characters)
		{
			char first = characters[0];
			int temp = (int)first; //type in parenthesis means casting
			return temp;
		}
		
		public static int parseInt(String value)
		{
			int temp = Integer.parseInt(value); //italicized because method name
			return temp;
		}
} 
