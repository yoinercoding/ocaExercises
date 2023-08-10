import java.util.Scanner;
public class exercise69 {
    /*
    *       Diseñar e implementar la clase rectangulo, con atributos base y altura y los metodos para modificar y obtener
    *       sus valores, obtener el perimetro y el area
     */
    public static void main(String[] args) {

        double perimetro, area;
        double base;
        double altura;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese la base del rectangulo = \n ");
        base = sc.nextDouble();
        System.out.println("Por favor ingrese la altura del rectangulo = \n ");
        altura = sc.nextDouble();

        area = base * altura;
        perimetro = 2 * (base + altura);

        System.out.println("El area del rectangulo es = " + area);
        System.out.println("El perimetro del rectangulo es = " + perimetro);
    }
}