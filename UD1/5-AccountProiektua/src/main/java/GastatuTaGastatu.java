
public class GastatuTaGastatu {
    public static void main(String[] args) {
        
        Account ac1 = new Account("1111", "Beñat", 1000);
        int count = 0;
        int dirua = 150;
        
        while(ac1.getBalance() > 150){
            ac1.Debit(dirua);
            count++;
        }
        
        System.out.println("Triste nago; "+ dirua + " euro atera dut "+ count + " aldiz eta orain "+ ac1.getBalance() + " euro besterik ez zait geratzen kontuan.");
    }
}
