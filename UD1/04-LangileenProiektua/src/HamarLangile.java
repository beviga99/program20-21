
public class HamarLangile {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        langilea[] lagun = langilea.nireHamarLagunLangile();
        for(int i = 0; i < 10; i++){
            System.out.println(lagun[i].toString());
        }
    }
}
