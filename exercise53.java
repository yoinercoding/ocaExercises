public class exercise53 {
    /*
     *       Java Programacion orientada a objetos OOP
     */
    public static void main(String[] args) {
        // Escribir una app que pase un periodo dado en segundos a dias, horas, minutos y segundos.

        int segundos = 83237;
        int[] resultado = convertirTiempo(segundos);

        System.out.println("Horas: " + resultado[0]);
        System.out.println("Minutos: " + resultado[1]);
        System.out.println("Segundos: " + resultado[2]);
        System.out.println("Dias: " + resultado[3]);
    }

    public static int[] convertirTiempo(int segundos) {
        int horas = segundos / 3600;
        segundos %= 3600;
        int minutos = segundos /60;
        segundos %= 60;
        int dias = segundos / 86400;
        segundos %= 86400;

        int[] tiempo = {horas, minutos, segundos, dias};
            return tiempo;
    }
}
