class Main {
  public static void main(String args[]){
       String str = "21112345966756788";
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
       }
   }
}