package llm.samples.lambdas;

        import org.junit.Test;

public class LambdasTest {

    @Test
    public void lambdaTest(){
        System.out.println("Lambda Test");

        MonInterface monInterface = (morceau,duree)  -> {
            System.out.println(duree + " min du morceau " + morceau + "SAX SAX SAX ...");
            return "BRAVO ! Excellente interpretation";
                                             };
        String resultat = monInterface.jouer("Vive le vent ", 3);
        System.out.println(resultat);
    }
}
