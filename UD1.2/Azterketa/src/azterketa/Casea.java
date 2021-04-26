package Azterketa;

public class Casea {

    public static void main(String[] args) {

        System.out.println("BAT: " + caseaAldatu("EIBAR", 'm'));
        System.out.println("BI: " + caseaAldatu("ermua", 'M'));
        System.out.println("HIRU: " + caseaAldatu("Elgoibar", 'G'));
        System.out.println("LAU: " + caseaAldatu("Gaindituko dut", 'M'));

    }

    public static String caseaAldatu(String hitza, char modua) {

        String hitzAldatua = "";
        char karak;
        if (modua == 'm') {
            hitzAldatua = hitza.toLowerCase();

        } else if (modua == 'M') {
            hitzAldatua = hitza.toUpperCase();
            
        } else if (modua == 'G') {
            for (int i = 0; i < hitza.length(); i++) {
                karak = hitza.charAt(i);
                if (karak >= 65 && karak <= 90) {
                    hitzAldatua = Character.toString(karak + 32);

                } else if (karak >= 97 && karak < 122) {
                    hitzAldatua = hitzAldatua + Character.toString(karak - 32);
                }
            }
        }
        return hitzAldatua;
    }
}
