
public class Main {
    public static void main(String[] args) {

        int edad = 5;

        if (edad>18){

            System.out.println("Es mayor de edad");
        }else {
            System.out.println("Es menor de edad ");
        }

        int numero = 8;
        int numero2 = 6;

        if (numero==8 && edad>18 && numero2==1){

            numero = numero+2;
        }else {

            numero = numero2-2;
        }if (numero==8 || edad>18 && numero2==1){

            numero = numero+2;
        }




    }
}