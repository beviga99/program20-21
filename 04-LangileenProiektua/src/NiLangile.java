
public class NiLangile {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        langilea l1 = new langilea(1,"Alex","Moreno",700);
        System.out.println(l1.toString());
        l1.soldataIgo(50);
        System.out.println(l1.toString());       
        
    }
}
