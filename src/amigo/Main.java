package amigo;


import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner lector = new Scanner(System.in);
        String nombre,identificacion,genero,fecha;
        int dato;
        float saldoInicial;
        boolean respuesta=false;

        while (!respuesta)
        {
            System.out.println("");
            System.out.println("---MENU---");
            System.out.println("1.Usuario");
            System.out.println("2.Registrate");
            System.out.println("3.Salir");

            System.out.println("Digite una de las opciones:");
            dato=lector.nextInt();
            //clear();
            switch (dato)
            {
                case 1:


                    break;
                case 2:

                    System.out.print("Digite su identificación: ");
                    identificacion=lector.nextLine();
                    System.out.println("Digite su nombre: ");
                    nombre=lector.nextLine();
                    System.out.println("digite su genero hombre(h),mujer(m),otros(o):");
                    genero=lector.nextLine();
                    System.out.println("Digite su fecha de nacimiento: ");
                    fecha=lector.nextLine();
                    System.out.println("Saldo inicial:");
                    saldoInicial=lector.nextFloat();
                    //clear();
                    break;
                case 3:
                    System.out.println("Ejecucion finalizada");
                    respuesta=true;
                    break;
                default:
                    System.out.println("El numero ingresado no esta entre las opciones...");

            }
        }
    }
    public static void clear()
    {
        try {

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        } catch (Exception e) {

            /*No hacer nada*/

        }
        /*try {
            if( System.getProperty( "os.name" ).startsWith( "Window" ) )
                Runtime.getRuntime().exec("cls");
            else
                Runtime.getRuntime().exec("clear");
        }catch (Exception e)
        {}*/

    }

}