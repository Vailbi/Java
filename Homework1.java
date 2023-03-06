
import java.util.Scanner;

public class Homework1 {

    // Task 1 - Вычислить [n-ое треугольного число](сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

    // public static void main(String[] args){
    
    //     Scanner iScanner = new Scanner(System.in);
    //     System.out.printf("Введите число: ");
    //     int number = iScanner.nextInt();
    //     int res1 = 0;
    //     for (int i = 1; i < number+1; i++) {
    //         res1+=i;
    //     }
    //     System.out.printf("сумма чисел от 1 до n = %d\n", res1);
    //     int res2 = 1;
    //     for (int i = 1; i < number+1; i++) {
    //         res2*=i;
    //     }
    //     System.out.printf("n! (произведение чисел от 1 до n) = %d", res2);
    // }

    
    // Task 2 - Вывести все простые числа от 1 до 1000

    // public static void main(String[] args){

    //      for (int i = 2; i < 1001; i++) {
    //          boolean flag = true;
    //          for (int j = 2; j < i; j++) {

    //             if(i%j == 0){
    //                 flag = false;
    //                 break;
    //              }
    //          }

    //         if (flag){
    //             System.out.println(i);
    //         }
    //      }
    //      System.out.println("Простые числа от 1 до 1000");
    // }

    // Task 3 - Реализовать простой калькулятор
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1,num2,operation);
        System.out.println("Результат операции: "+result);
    }
 
    public static int getInt(){
        System.out.println("Введите число:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();
            num = getInt();
        }
        return num;
    }
 
    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }
 
    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());//рекурсия
        }
        return result;
    }
}

    


