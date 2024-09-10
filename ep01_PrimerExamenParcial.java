// pe01_PrimerExamenParcial - Programa que lleva a cabo un control de la inscripción de los participantes y dinero recaudado

import java.util.Scanner;

public class ep01_PrimerExamenParcial {
    public static void main(String[] args) {
        int totalAlumnos = 0, totalDocentes = 0, totalTrabajadores = 0, rechazados = 0, totalHombres = 0, totalMujeres = 0, sumEdad = 0, totalParticipantes=0, dineroA = 0, dineroD = 0, dineroT=0;
        Scanner obj = new Scanner(System.in);
        char resp = 'S';
        String ganancias;

        // Limpiar la consola
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        do {
            // Pedir datos
            System.out.print("¿Cuál es tu nombre completo? "); 
            String nombre = obj.nextLine();
            System.out.print("¿Cuál es tu edad? "); 
            int edad = obj.nextInt(); 
            obj.nextLine();
            System.out.print("¿Cuál es tu sexo? "); 
            String sexo = obj.nextLine();
            System.out.print("¿Eres Alumno, Docente o Trabajador? "); 
            String tipo = obj.nextLine();

            if //Verifica la edad
                (edad >= 23) {
                int costo = 0;
                switch (tipo.toLowerCase()) { 
                    case "alumno":
                        costo = 40;
                        totalAlumnos++;
                        dineroA += costo;
                        break;
                    case "docente":
                        costo = 60;
                        totalDocentes++;
                        dineroD += costo;
                        break;
                    case "trabajador":
                        costo = 80;
                        totalTrabajadores++;
                        dineroT += costo;
                        break;
                    default:
                        System.out.println("No se reconoce ese tipo. Intenta nuevamente");
                        continue;
                }
                //Verifica el sexo
                if (sexo.equalsIgnoreCase("hombre")) {
                    totalHombres++;
                } else if (sexo.equalsIgnoreCase("mujer")) {
                    totalMujeres++;
                }

                totalParticipantes++;
                sumEdad += edad;

                //Dar la bienvenida al curso
                System.out.println("Hola " + nombre + ", tienes " + edad + " años, eres " + sexo + " y tienes el puesto de " + tipo);
                System.out.println("El costo de inscripción es de $" + costo);
                System.out.println("\nBienvenido a este curso de técnicas avanzadas de programación");
            } else {
                System.out.println("Lo siento " + nombre + ", no tienes la edad suficiente para asistir al curso");
                rechazados++;
            }
            //Pregunta si quiere repetir el proceso
            System.out.print("¿Quieres repetir el proceso (S/N)? "); 
            resp = obj.next().toUpperCase().charAt(0); 
            obj.nextLine();
        } while (resp == 'S');

        //Calcula el promedio de la edad de los participantes
        int promEdad = (totalParticipantes > 0 ) ? sumEdad / totalParticipantes : 0;

        //Calcula el dinero total
        int dineroTotal = dineroA + dineroD + dineroT;

        //Verifica las ganancias y muestra si fué baja, moderada o buena
        if (dineroTotal < 50) {
            ganancias = "bajas";
        } else if (dineroTotal > 50 & dineroTotal>1000) {
            ganancias = "moderadas";
        } else {
            ganancias = "buenas";
        }

        //Da el resumen de todo
        System.out.println("-----------------------");
        System.out.println("Resumen");
        System.out.println("-----------------------");
        System.out.println("Total de alumnos inscritos: " + totalAlumnos);
        System.out.println("Total de docentes inscritos: " + totalDocentes);
        System.out.println("Total de trabajadores inscritos: " + totalTrabajadores);
        System.out.println("Total de hombres inscritos: " + totalHombres);
        System.out.println("Total de mujeres inscritas: " + totalMujeres);
        System.out.println("Total de participantes inscritos: " + totalParticipantes);
        System.out.println("Promedio de edad de los participantes: " + promEdad);
        System.out.println("Total de personas rechazadas: " + rechazados);
        System.out.println("Dinero total recaudado por alumnos: $" + dineroA);
        System.out.println("Dinero total recaudado por docentes: $" + dineroD);
        System.out.println("Dinero total recaudado por trabajadores: $" + dineroT);
        System.out.println("Total de dinero recaudado: $" + dineroTotal);
        System.out.println("El evento concluye con ganancias " + ganancias);
        
        obj.close();
    }
}