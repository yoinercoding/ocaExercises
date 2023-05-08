public class exercise12 {
    public static void main(String[] args) {

        /*      Tipos de datos que acepta Switch
        *  int, byte, short, char, String, enum values
        */

        int dayOfWeek = 0;
        switch (dayOfWeek) {
            default:
                System.out.println("weekday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
    }
}
