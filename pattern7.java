import java.util.Scanner;
public class pattern7 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
//		 int sp=0;
//		 int st=1;
		  for(int i=1; i<=n; i++)
		  {
			  for(int j=1; j<=n; j++)
			  {
				  //System.out.print("*");
				  if(i==j)
				  {
					 System.out.print("*"); 
				  }
				  else
				  {
					  System.out.print(" ");
				  }
			  }
			  System.out.println();
		  }
	}

}

						/*
						
						 *    
						  *   
						   *  
						    * 
						     *
						
						 */
