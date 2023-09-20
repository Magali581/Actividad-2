public class Actividad2 {
    public static void main(String[] args) {
        {


            {
// En esta parte se introducen los datos de el alumno

                int[] calificaciones = new int[5];
                calificaciones[0] = 80;
                calificaciones[1] = 90;
                calificaciones[2] = 79;
                calificaciones[3] = 100;
                calificaciones[4] = 95;
         int promedio;
         String nombre = "Magali";


         // Se imprimen el nombre del alumno y las calificaciones
                System.out.println("Nombre de el alumno: " + nombre);
                System.out.println("calificacion 1: " + calificaciones[0]);
                System.out.println("calificacion 2: " + calificaciones[1]);
                System.out.println("calificacion 3: " + calificaciones[2]);
                System.out.println("calificacion 4: " + calificaciones[3]);
                System.out.println("calificacion 5: " + calificaciones[4]);

                // en esta parte se calcula el promedio

                promedio =(calificaciones[1] + calificaciones[2] + calificaciones[3] + calificaciones[4]) /5;
                System.out.println("promedio: " + promedio);

                // Se define la calificacion de el alumno (A, B, C, D, E, F)

                if (promedio<=50)
                {
                    System.out.println("calificacion = F ");
                }
                else
                {
                    if (promedio<=60)
                    {
                        System.out.println("calificacion = E ");
                    }
                    else
                    {
                        if (promedio<=70)
                        {
                            System.out.println("Calificacion = D");
                        }
                        else
                        {
                            if (promedio<=80)
                            {
                                System.out.println("calificacion = C");
                            }
                            else
                            {
                                if (promedio<=90)
                                {
                                    System.out.println("califiacion = B");
                                }
                                else
                                {
                                    System.out.println("Calificacion = A");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
