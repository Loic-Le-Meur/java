import java.math.BigDecimal;

public class MaCalculette {

    /**
     * Methode d'addition de a et b
     * @param a
     * @param b
     * @return a + b
     */
    public static int addition (int a, int b){
        return a+b;
    }

    /**
     * Methode de soustraction de a par b
     * @param a
     * @param b
     * @return a - b
     */
    public static int soustraction (int a, int b){
        return a-b;
    }

    /**
     * Methode de division de a par b
     * Warning b doit être différent de 0
     * @param a
     * @param b
     * @return a / b
     */
    public static float division (float a, float b){
        if(b !=0){
            return a/b;
        }
        else{
            System.out.println("Attention B = zéro !!!");
            return 0;
        }
    }

}
