public class exam1 {
    public static boolean exam(int n){    
        int i,m=0;
        boolean flag=true;        
        m=oneHalf(n);      
        if(n==0||n==1){  
           flag=false;      
        }else{  
         for(i=2;i<=m;i++){      
          if(getRestZero(n,i)){          
           flag=false;      
           break;      
          }      
         }      

        }
        return flag;
      }  
  
  static boolean getRestZero(int a, int b) {
      return a % b == 0;
  }
  
  public static int oneHalf (int n) {
      return n/2;
  }
}
