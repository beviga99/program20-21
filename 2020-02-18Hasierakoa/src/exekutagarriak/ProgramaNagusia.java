package exekutagarriak;

import static java.lang.Integer.parseInt;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import model.Author;
import model.Book;
import model.Komikia;

public class ProgramaNagusia {

    private static Author[] idazleak = new Author[100];
    private static ArrayList<Book> liburutegia = new ArrayList<>();

    public static void initialize() {
        idazleak[0] = new Author("J.K.Rowling", 'h');
        idazleak[1] = new Author("Agatha Christie", 'm');
        idazleak[2] = new Author("Francisco Ibañez", 'h');
        idazleak[3] = new Author("Margaret Atwood ", 'm');
        idazleak[4] = new Author("Marjane Satrapi", 'm');
        idazleak[5] = new Author("Mariasun Landa", 'm');
        idazleak[6] = new Author("Harper Lee", 'h');
        idazleak[7] = new Author("Mary Shelley", 'm');

        liburutegia.add(new Book("Harry Potter", idazleak[0], 99.99, 2850));
        liburutegia.add(new Book("Asesinato en el Orient Express", idazleak[1], 9.95, 275));
        liburutegia.add(new Book("Muerte en el Nilo", idazleak[1], 9.95, 300));
        liburutegia.add(new Book("10 negritos", idazleak[1], 9.95, 325));
        liburutegia.add(new Komikia("Mortadelo y Filemón", idazleak[2], 19.95, 75, true));
        liburutegia.add(new Book("El cuento de la criada", idazleak[3], 24.95, 410));
        liburutegia.add(new Book("Cat’s eye", idazleak[3], 6.95, 78));
        liburutegia.add(new Komikia("Persepolis", idazleak[4], 19.95, 75, false));
        liburutegia.add(new Book("Azken balada", idazleak[5], 10.95, 225));
        liburutegia.add(new Book("Matar a un ruiseñor", idazleak[6], 15.95, 450));
        liburutegia.add(new Book("Frankenstein", idazleak[7], 19.95, 300 ));

    }
    
    public static void jaiotzeDataBete(){
        int position;
        String data;
        Scanner in = new Scanner(System.in);
        System.out.println("Zein idazlearen jaiotze data nahi duzu bete(Idatzi posizioa)? ");
        position = in.nextInt() - 1;
        System.out.println("Sartu " + idazleak[position].getName() + " idazlearen jaiotze data (uuuu-hh-ee): ");
        data = in.next();
        String[] date = data.split("-");
        if((parseInt(date[0]) > 9999) || (parseInt(date[0]) < 1000)) {
            System.out.println("Data okerra.");
            System.out.println("Hurrengo baten sartuko duzu data.");
        }
        else if((parseInt(date[1]) > 12) || (parseInt(date[1]) < 1)) {
            System.out.println("Data okerra.");
            System.out.println("Hurrengo baten sartuko duzu data.");
        }
        else if(((parseInt(date[1]) == 1) || (parseInt(date[1]) == 3) || (parseInt(date[1]) == 5) || (parseInt(date[1]) == 7) || (parseInt(date[1]) == 8) || (parseInt(date[1]) == 10) || (parseInt(date[1]) == 12)) && ((parseInt(date[2]) > 31) || (parseInt(date[2]) < 1))) {
            System.out.println("Data okerra.");
            System.out.println("Hurrengo baten sartuko duzu data.");
        }
        else if (((parseInt(date[1]) == 4) || (parseInt(date[1]) == 6) || (parseInt(date[1]) == 9) || (parseInt(date[1]) == 11)) && ((parseInt(date[2]) > 30) || (parseInt(date[2]) < 1))) {
            System.out.println("Data okerra.");
            System.out.println("Hurrengo baten sartuko duzu data.");
        } else if ((parseInt(date[1]) == 2) && ((parseInt(date[2]) > 28) || (parseInt(date[2]) < 1))) {
            System.out.println("Data okerra.");
            System.out.println("Hurrengo baten sartuko duzu data.");
        } else {
            idazleak[position].setBirthday(data);
            System.out.println("Jaitse data ondo erregistratu da.");
        }
    
    }

    public static void inprimatu(){
        System.out.println("LIBURUTEGIA");
        System.out.println("===============================");
        for (Book b:liburutegia){
            System.out.println(b);
        }
    }
    public static void main(String[] args) {

        initialize();
        jaiotzeDataBete();
        inprimatu();
       
    }


}
