public class Main {


    public static void main(String[] args) {
        int numeros[] = {1,8,6,5,5};
        int contador = 0;
        for (int n : numeros){
            if (n<4)
                contador++;
        }
        System.out.println("Hay "+contador+" alumno/s desaprobado/s");
    }
}