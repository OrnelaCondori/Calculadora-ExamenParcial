import java.util.Scanner;

public class ExamenParcialLab {
    public static void main(String[] args) throws Exception {
        Scanner number = new Scanner(System.in);

        System.out.println("-----CALCULADORA------");
        System.out.print("Ingrese el primer numero: ");
        Double num1 = number.nextDouble();
        Double resultado;
        int operacion;

        do{
            System.out.print("Ingrese el otro numero: ");
            Double num2 = number.nextDouble();

            System.out.println("--------------------------");
            System.out.println("A continuacion indique que operacion desea realzar: (1/2/3/4/5)");
            System.out.println(("1. SUMAR \n2. RESTAR\n3. MULTIPLICAR\n4. DIVIDIR\n5. SALIR"));
            System.out.print("Operacion: ");
            operacion = number.nextInt();
            System.out.println("--------------------------");
            
            while (operacion <1 && operacion >5) {
                System.out.println("El número ingresado no corresponde a ninguna de las opciones, ingreselo nuevamente: ");
                System.out.print("Operacion: ");
                operacion = number.nextInt();
            }

            if (operacion == 1){
                resultado = num1+num2;
                System.out.println(num1+" + "+num2+" = "+resultado);
            } else if(operacion == 2){
                resultado = num1-num2;
                System.out.println(num1+" - "+num2+" = "+resultado);
            } else if (operacion == 3){
                resultado = num1*num2;
                System.out.println(num1+" * "+num2+" = "+resultado);
            } else if (operacion ==4){
                if(num2 ==0){
                    System.out.println("No se puede dividir por 0, ingrese otro número: ");
                    num2 = number.nextDouble();
                }
                resultado = num1/num2;
                System.out.println(num1+" / "+num2+" = "+resultado);
            } else {
                System.out.print("Saliendo de la calculadora...");
                break;
            }
            
            num1 = resultado;

        }while(operacion != 5);

        number.close();
    }
}
