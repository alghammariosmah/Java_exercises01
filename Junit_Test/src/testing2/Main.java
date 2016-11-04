package testing2;


public class Main {

   public static void main(String[] args){
       MyBinaryNumber x = new MyBinaryNumber();
       for (int i=0; i<20; i++){
    	   x.set(i);
    	   System.out.println(x+" "+i);
       }
       
//       x.set(20);
//	   System.out.println(x);
   }
}
