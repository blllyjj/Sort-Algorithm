public class Recursion_Factorial {
    public static void main(String[] args) {
        //main method executing the course
        int a = iterativeFactorial(4);
        int b = recursionFactorial(4);

        System.out.println("iterative: "+a+" factorial: "+b);
    }

    //factorial with recursion method
    public static int iterativeFactorial(int num){
        if(num == 0){
            return 1;
        }

        return num*iterativeFactorial(num-1);
    }

    //factorial with iterative method
    public static int recursionFactorial(int num){
        int factorial=1;
        if(num==0){
            return 1;
        }else{
            for(int i=1; i<=num; i++){
            factorial=i*factorial;
        }

    }
        return factorial;
    }
}