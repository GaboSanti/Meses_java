import java.util.Scanner;

public class MesesSwitch{
    private static final Scanner scanner= new Scanner(System.in);
    public static int obtenerNumero(String mensaje){
        int numeroTemporal;
        System.out.println(mensaje);
        numeroTemporal = scanner.nextInt();
        return numeroTemporal;
    }
    public static void main(String[] args){

        int mes = obtenerNumero("Ingrese un numero para conocer el mes: ");

        switch(mes){
            case 1:
            System.out.println("El mes correspondiente es January");
            break;
            case 2:
            System.out.println("El mes correspondiente es February");
            break;
            case 3
            System.out.println("El mes correspondiente es March");
            case 4:
            System.out.println("El mes correspondiente es April");
            break;
            case 5:
            System.out.println("El mes correspondiente es May");
            break;
            case 6:
            System.out.println("El mes correspondiente es June");
            break;
            case 7:
            System.out.println("El mes correspondiente es July");
            break;
            case 8:
            System.out.println("El mes correspondiente es August");
            break;
            case 9:
            System.out.println("El mes correspondiente es September");
            break;
            case 10:
            System.out.println("El mes correspondiente es October");
            break;
            case 11:
            System.out.println("El mes correspondiente es Nvember");
            break;
            case 12:
            System.out.println("El mes correspondiente es Decembre");
            break;
            default:
            System.out.println("Numero para mes invalido");
        }
    }
}