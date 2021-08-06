package sample.recursion;

public class BalancedParentheses {
    static void findSequence(char array[], int index,int N,int openBracket,int closeBracket){
        if (closeBracket == N){
            for(int i =0; i< array.length;i++)
                System.out.print(array[i]);
            System.out.println();
            return;
        }else{
            if(openBracket > closeBracket){
                array[index] = '}';
                findSequence(array,index+1,N,openBracket,closeBracket+1);
            }if(openBracket < N){
                array[index] = '{';
                findSequence(array,index+1,N,openBracket+1,closeBracket);

            }
    }

    }
    public static void main (String args[]){
        char array[] = new char[10];
        findSequence(array,0,2,0,0);
    }

}
