package com.loop;

public class LoopExample {

	public static void main(String[] args) {
		
		int i=0,j=0,n=3;
		 char k;
		 for(i=0; i<n; i++)
   {
       k='a';
       for(j=0; j<(n+i); j++)
       {
          if(j<n-i-1)
               System.out.print("  ");
           else
           {
               System.out.print(" "+k);
               if(j<(n-1))
                   k++;

               else
                   k--;
           }
          
       }
       System.out.println("  ");
   }
		 
		 if(i==3){
       	  for(i=2;i>=0;i--){
       		k='a';
            for(j=0; j<(n+i); j++)
            {
               if(j<n-i)
                    System.out.print("  ");
                else
                {
                	
                    System.out.print(" "+k);
                    if(j<(n-1))
                        k++;

                    else if(j==(n))
                        k=' ';
                    else
                        --k;
                    
                }
               
            }
            System.out.println(" ");
       	  }
			 
         }

	}
	
}
