package enumExercise;

public class exampleEnum {
    /*
    *       Un enumerado (o Enum) es una clase "especial" (tanto en Java como en otros lenguajes) que limitan la
    *       creación de objetos  a los especificados explícitamente en la implementación de la clase.
    *       La única limitación que tienen los enumerados respecto a una clase normal es que si tiene constructor,
    *       este debe de ser privado para que no se puedan crear nuevos objetos.
     */
    public static void main(String[] args) {
        DiaDeLaSemana hoy = DiaDeLaSemana.DOMINGO;

                //nos trae todos los valores
//        for(DiaDeLaSemana value : DiaDeLaSemana.values()) {
//            System.out.println("Hoy es = " + value);
//        }

        switch (hoy) {
            case LUNES:
                System.out.println("Hoy es lunes");
                break;
            case MARTES:
                System.out.println("Hoy es martes");
                break;
            case MIERCOLES:
                System.out.println("Hoy es miercoles");
                break;
            case JUEVES:
                System.out.println("Hoy es jueves");
                break;
            case VIERNES:
                System.out.println("Hoy es viernes");
                break;
            case SABADO:
                System.out.println("Hoy es sabado");
                break;
            case DOMINGO:
                System.out.println("Hoy es domingo");
                break;
        }
    }
}
