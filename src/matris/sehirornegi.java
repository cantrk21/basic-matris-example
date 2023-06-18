package matris;

import java.util.Scanner;

public class sehirornegi {

	public static void main(String[] args) {

      int i=0,j=0,a=0;
      String[][] sehirler =new String[3][3];
      Scanner scanner = new Scanner(System.in);
		
      for(i=0;i<3;i++)
      {
    	  for(j=0;j<3;j++) {
    	  System.out.println("enter "+"["+i+"]"+"["+j+"]. element :");
    	  sehirler[i][j]=scanner.nextLine();
    	  }
      }
      
      for(i=0;i<3;i++)
      {
    	  for(j=0;j<3;j++)
    	  {
    		  a=a+1;
    		  System.out.println(a+".--->"+sehirler[i][j]);
    		 
    	  }
      
      
	}

}
}
