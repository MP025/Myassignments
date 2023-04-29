package work1.day1;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int n=23;
 boolean ans=false;
 for (int i=2;i<=n/2;++i)
 {
	 if(n%i==0)
		 
 {
		 ans= true;
		 break;
 }
 }
 if (!ans)
	 System.out.println(n+" "+"is a prime number");
 else
	 System.out.println(n+" "+"is not a prime number");
	}
	 
	}


