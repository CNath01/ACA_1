package main;

import aca1.Estudiante;
import java.io.*; //importar

import java.util.Scanner;

public class Main {

    //Declaracion de Arreglo
    static Estudiante alumnos[] = null;
    static Estudiante arr[][] = null;

    //Contador
    static int cont = 0;

    //Lectura y captura del teclado reemplaza a la funcion Scanner
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader lector = new BufferedReader(isr);

    public static void main(String args[]) throws IOException {
        Scanner teclado = new Scanner(System.in);

        //Inicializar arreglo
        alumnos = new Estudiante[5];

        //inicializar opcion
        int opcion = 0;

        //Menu
        do {
            System.out.println("-----------|MENÚ |-----------");
            System.out.println("");
            System.out.println("1.-Inrgesar alumno");
            System.out.println("2.-Listar alumnos");
            System.out.println("3.-Salir");
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(lector.readLine());//capturamos lo ingresado

            switch (opcion) {
                case 1:
                    if (cont < 5) {
                        agregarAlumno();
                    } else {
                        System.out.println("\nNo hay cupos");
                    }
                    break;
                case 2:
                    listarAlumno();
                    break;
                case 3:
                    System.out.println("\nSaliendo...");
            }
        } while (opcion != 3);
        System.exit(0);
    }

    //Metodo crear alumno
    private static void agregarAlumno() throws IOException {

        //variables locales
        String rut = "";
        String nombre = "";
        String asignatura = "";
        String estado = "";
        double n1 = 0, n2=0, n3=0, n4=0, n5=5;
         double acum=1;
        
        
        double promedio = 0, prom1=0, prom2=0, prom3=0, prom4=0, prom5=0;
        double definitiva = 0;
        double s = 0, x=0, y=0, z=0, a=0, f=0, so=0, so1=0, so2=0, so3=0, so4=0, so5=0;

        arr = new Estudiante[5][3];

        //Lectura de datos:
        System.out.println("\n\n\n");
        System.out.println("---------------------------------");
        System.out.println("         DATOS DE ALUMNO");
        System.out.println("---------------------------------");

       

        System.out.print("Nombre: ");

        nombre = lector.readLine();
        
        

       

            System.out.println("\nCALCULO DIFERENCIAL: ");
            for (int j = 1; j < 4; j++) {
                
                

                System.out.print("Nota " + j + ": ");
                n1 = Double.parseDouble(lector.readLine());

                s = s + n1;
            }
            prom1 = s /3;
            System.out.println("promedio: " + prom1);
            so1=so1+prom1;
           
            
        
        System.out.println("\nFUNDAMENTOS DE PROGRAMACIÓN: ");
        for (int k = 1; k < 4; k++) {

            System.out.print("Nota " + k + ": ");
            n2 = Double.parseDouble(lector.readLine());

            x = x + n2;
        }
        prom2 = x / 3;
        System.out.println("promedio: " + prom2);
        so2=so2+prom2;
        
        
        System.out.println("\nPOO: ");
        for (int l = 1; l < 4; l++) {
            
            System.out.print("Nota " + l + ": ");
            n3 = Double.parseDouble(lector.readLine());

            y = y + n3;

        }
         prom3 = y / 3;
            System.out.println("promedio: " + prom3);
            so3=so3+prom3;
            
            System.out.println("\nINGLES II: ");
        for (int m = 1; m < 4; m++) {
            
            System.out.print("Nota " + m + ": ");
            n4 = Double.parseDouble(lector.readLine());

            z = z + n4;
        }
         prom4 = z / 3;
            System.out.println("promedio: " + prom4);
            so4=so4+prom4;
            
            
            System.out.println("\nDESARROLLO DE SOFTWARE: ");
        for (int o = 1; o < 4; o++) {
            
            System.out.print("Nota " + o + ": ");
            n5 = Double.parseDouble(lector.readLine());

            a = a + n5;
        }
        prom5 = a / 3;
            System.out.println("promedio: " + prom5);
        

        promedio = (s+x+y+z+a) / 15;
        so=so+promedio;
        
        //MUESTRA DE DATOS:
        System.out.print("\nPromedio de notas: " + promedio);
        //CONDICIONES:
        if (promedio >= 3.95) {
            estado = "\nAprobado";
            System.out.println(estado);
        } else {
            estado = "\nReprobado";
            System.out.println(estado);
        }
        
      

        //Agregar elementos a la coleccion:
        alumnos[cont] = new Estudiante( nombre,  asignatura,  estado,  n1,  n2,  n3,  n4,  n5,  promedio,  prom1,  prom2,  prom3,  prom4);
        cont++;
        System.out.println("\nAlumno agregado!: " + cont);
        if (cont==5) {
          
        
        System.out.println("\n---------------------------------------------------");
        System.out.println("                 PROMEDIO GENERAL                    ");
        System.out.println("---------------------------------------------------");
        
        System.out.println("- CALCULO DIFERENCIAL: " +(so1));
        System.out.println("- FUNDAMENTOS DE PROGRAMACIÓN: " + (so2));
        System.out.println("- POO: " + (so3));
        System.out.println("- INGLES II: " +(so4));
        System.out.println("- DESARROLLO DE SOFTWARE: " + (so5/cont));
            System.out.println("Promedio general: " + so/cont);
            System.out.println(s+ " - "+ x +" - " +y +" - " + z +" - " + a +"");
            System.out.println(" ");
       
        }
    }

    

    //Metodo listar alumno
    private static void listarAlumno() {
        for (int i = 0; i < cont; i++) {
            System.out.println("\n\n--ALUMNOS REGISTRADOS--");
            System.out.println("" + alumnos[i].toString());
            
            
        }
    }
}
