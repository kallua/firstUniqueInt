class Main {
      /*static int fib(int n){ //fibonacci
        if(n<=1)
          return n;
        else
          return fib(n-1)+fib(n-2);
      }*/
  public static void main(String args[]){
      /* String str = "21112345966756788";
       int counter[]= new int[str.length()];
       for(int i=0;i<str.length();i++){
         counter[i]=0;
         for(int j=0;j<str.length();j++){
           if((str.charAt(j)==str.charAt(i)) && i!=j){
             counter[i]++;
           }
         }
         if(counter[i]==0){
           System.out.println(str.charAt(i));
           break;
         }
       }//Done with main
      int num=12445;
      int sum=0;
      while(num>0){
        sum=sum+num%10;
        num=num/10;
      }
      System.out.println(sum);*/
      int num=67876;
      int sum=0, r;
      int n=num;
      while(num>0){
        r=num%10;
        sum=(sum*10)+r;
        num=num/10;
      }
      if(n==sum)
      System.out.println(n+" is a palindrome");
      //fibonacci
      //System.out.println(fib(0));
    }
}
