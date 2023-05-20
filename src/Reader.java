import java.util.Scanner;
public class Reader {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Введите ФИО: ");
        String fio = in.nextLine();

        System.out.print("Введите номер читательского билета: ");
        int number = in.nextInt();

        System.out.print("Введите факультет: ");
        String facul = in.next();

        System.out.print("Введите дату рождения: ");
        String data = in.next();

        System.out.print("Введите номер телефона: ");
        int phone = in.nextInt();

        System.out.print("Введите количество книг: ");
        int kol = in.nextInt();

        takeBook(fio);
        takeBook(fio, kol);
        returnBook(fio);
        returnBook(fio, kol);
    }
    public static void takeBook(String f, int k){
        int kol = k;
        System.out.println(f + " взял " + k + " книги.");
    }
    public static void takeBook(String f){
        System.out.println(f + " взял книги: Приключения, Словарь, Энциклопедия");
    }
    public static void returnBook(String f){
        System.out.println(f + " вернул книги: Приключения, Словарь, Энциклопедия");
    }
    public static void returnBook(String f, int k ){
        int kol = k;
        System.out.println(f + " вернул " + k + " книги.");
    }
}
