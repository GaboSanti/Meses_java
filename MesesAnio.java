import java.util.Scanner;

public class MesesAnio{
    private static final Scanner scanner= new Scanner(System.in);
    public static int obtenerNumero(String mensaje){
        int numeroTemporal;
        System.out.println(mensaje);
        numeroTemporal = scanner.nextInt();
        return numeroTemporal;
    }
    public static void main(String[] args){

        int mes = obtenerNumero("Ingrese un numero para conocer el mes: ");

        if (mes == 1){
            System.out.println("El mes correspondiente es enero");
        }else if (mes == 2){
            System.out.println("El mes correspondiente es febrero");
        }else if (mes == 3){
            System.out.println("El mes correspondiente es marzo");
        }else if (mes == 4){
            System.out.println("El mes correspondiente es abril");
        }else if (mes == 5){
            System.out.println("El mes correspondiente es mayo");
        }else if (mes == 6){
            System.out.println("El mes correspondiente es junio");
        }else if (mes == 7){
            System.out.println("El mes correspondiente es julio");
        }else if (mes == 8){
            System.out.println("El mes correspondiente es agosto");
        }else if (mes == 9){
            System.out.println("El mes correspondiente es septiembre");
        }else if (mes == 10){
            System.out.println("El mes correspondiente es octubre");
        }else if (mes == 11){
            System.out.println("El mes correspondiente es noviembre");
        }else if (mes == 12){
            System.out.println("El mes correspondiente es diciembre");
        }else{
            System.out.println("Numero para mes invalido");
        }
    }
}