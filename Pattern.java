/*
          * 
        * * 
      * * * 
    * * * * 
  * * * * * 
    * * * * 
      * * * 
        * * 
          * 
class Pattern{
  public static void main (String args[]){
    int n=5;
    for(int row=1;row<n;row++){
      for(int col=row;col<=n;col++){
        System.out.print("  ");
      }
      for(int k=1;k<=row;k++){
        System.out.print("* ");
      }
      System.out.println();
    }
    for(int row=1;row<=n;row++){
      for(int col=1;col<=row;col++){
        System.out.print("  ");
      }
      for(int k=row;k<=n;k++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}   */

/*
* 
**  
***   
****    
*****     
****     
***    
**   
* 
class Pattern{
  public static void main (String args[]){
    int n=5;
    for(int row=1;row<=n;row++){
      for(int k=1;k<=row;k++){
         System.out.print("*");
      }
      
      for(int col=1;col<=row;col++){
         System.out.print(" ");
      }
       System.out.println();
    }
    for(int row=1;row<=n;row++){
      for(int k=row;k<n;k++){
         System.out.print("*");
      }
      
      for(int col=row;col<=n;col++){
         System.out.print(" ");
      }
       System.out.println();
    }
  }
}   */

/*
 *********
  *******
   *****
    ***
     *
class Pattern{
  public static void main (String args[]){
    int n=5;
    for(int row=1;row<=n;row++){
      for(int col=1;col<=row;col++){
         System.out.print(" ");
      }
      for(int k=row;k<n;k++){
         System.out.print("*");
      }
      for(int m=row;m<=n;m++){
        System.out.print("*");
      }
       System.out.println();
    }
  }
}  */

/*
     *
    ***
   *****
  *******
 *********
  *******
   *****
    ***
     *
class Pattern{
  public static void main (String args[]){
    int n=5;
    for(int row=1;row<n;row++){
      for(int col=row;col<=n;col++){
        System.out.print(" ");
      }
      for(int k=1;k<row;k++){
        System.out.print("*");
      }
        for(int m=1;m<=row;m++){
         System.out.print("*");
      }
      System.out.println();
    }
    for(int row=1;row<=n;row++){
      for(int col=1;col<=row;col++){
        System.out.print(" ");
      }
      for(int k=row;k<n;k++){
        System.out.print("*");
      }
       for(int m=row;m<=n;m++){
         System.out.print("*");
      } 
      System.out.println();
    }
  }
}
*/

/*
     *
    ***
   *****
  *******
 *********

class Pattern{
  public static void main (String args[]){
    int n=5;
    for(int row=1;row<=n;row++){
      for(int col=row;col<=n;col++){
        System.out.print(" ");
      }
      for(int k=1;k<row;k++){
        System.out.print("*");
      }
      for(int m=1;m<=row;m++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}  */
/*
* * * * *
  * * * *
    * * *
      * *
        *  
class Pattern{
  public static void main (String args[]){
    int n=5;
    for(int row=1;row<=n;row++){
      for(int col=1;col<=row;col++){
        System.out.print("  ");
      }
      for(int k=row;k<=n;k++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
*/
/* 
    *
   **
  ***
 ****
*****
class Pattern{
  public static void main (String args[]){
    int n=5;
    for(int row=1;row<=n;row++){
      for(int col=row;col<=n;col++){
        System.out.print(" ");
      }
      for(int k=1;k<=row;k++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}*/


/** * * * *
* * * *
* * * 
* *
*
  
class Pattern{
  public static void main (String args[]){
    int n=5;
    for(int row=1;row<=n;row++){
      for(int col=row;col<=n;col++){
        System.out.print(row +" ");
      }
      System.out.println();
    }
  }
}
*/

/*
*
* *
* * *
* * * *   */
class Pattern{
  public static void main (String args[]){
    int n=5;
    for(int row=1;row<=n;row++){
      
      for(int col=1;col<=row;col++){
        System.out.print("* "); 
      }
      System.out.println();
    }
  }
}  