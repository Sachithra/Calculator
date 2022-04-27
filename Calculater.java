import java.util.Scanner;

public class Calculater {

public static int Cal(int x,int y,char operator){
    int val=0;
    switch (operator){
        case '+':
           val=x+y;
           break;
        case '-':
            val=x-y;
            break;
        case '*':
            val=x*y;
            break;
        case '/':
            val=x/y;
            break;
        case '%':
            val=x%y;
            break;
    }
    return val;
}

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("ENTER THE FIRST NUMBER=");
        int n1=scan.nextInt();

        System.out.println("ENTER THE SECOND NUMBER");
        int n2=scan.nextInt();

        System.out.println("ENTER OPERATION[+,*,-,/,%]");
        char operator=scan.next().charAt(0);

        if (operator=='+'||operator=='-'||operator=='*'||operator=='/'||operator=='%'){

            int val = Cal(n1, n2, operator);
            System.out.println(val);

        }else {
            System.out.println("NOT VALID OPERATOR ");
        }
    }
}
