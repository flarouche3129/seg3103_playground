public class FizzBuzz {
    
    
    private static void fizzBuzz(int num){

        for (int i = 0; i < num; i++) {
            
            if(((i % 3) == 0) && ((i % 5) == 0)){
                System.out.println("Fizzbuzz");
            }
            else if((i % 3) == 0){
                System.out.println("Fizz");
            }
            else if((i % 5) == 0){
                System.out.println("buzz");
            }
            else{
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        fizzBuzz(100);
    }
}
