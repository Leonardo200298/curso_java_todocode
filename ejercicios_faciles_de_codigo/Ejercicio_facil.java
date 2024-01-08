package ejercicios_faciles_de_codigo;

public class Ejercicio_facil{
    public static void main(String[] args) {
        int a = 34;
        int b = 22;
        int c;

        System.out.println("------------ANTES------------");
        System.out.println("variable a: " + a);
        System.out.println("variable a: " + b);

        c = a;
        a = b;
        b = c;

        System.out.println("------------DESPUES------------");
        System.out.println("variable a: " + a);
        System.out.println("variable a: " + b);
    }
}