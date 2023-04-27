package main.java.org.example;

import java.io.IOException;
import java.util.Scanner;

public class App {
    static int choice;
    public static void main(String[] args) throws IOException {

        CrudOperations crud = CrudOperations.getInstance();


        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("DATABASE OPERASYONLARI");
            System.out.println("----------------------");
            System.out.println("1.Ekle     ");
            System.out.println("2.Listele  ");
            System.out.println("3.Sil      ");
            System.out.println("4.Güncelle ");
            System.out.println("5.Çıkış    ");

            System.out.print("\n");
            System.out.print("Lütfen işlemlerden birini seçiniz: ");

            choice = scan.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Veritabanına kaydetmek için id giriniz : ");
                    int id = scan.nextInt();
                    System.out.println("Veritabanına kaydetmek için isim giriniz : ");
                    String name = scan.next();

                    try {
                        String insert = crud.insert(id,name);
                        System.out.println(insert);
                    }catch (Exception e) {
                        System.out.println(e.getMessage());
                        System.err.println("Eklenmedi!!");
                    }
                    System.out.println("Devam etmek için enter tuşuna basınız");
                    System.in.read();
                    break;
                case 2:
                    System.out.print("Liste : ");
                    try {
                        crud.view();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        System.err.println("Listelenmedi!!");
                    }
                    System.out.println("Devam etmek için enter tuşuna basınız");
                    System.in.read();
                    break;
                case 3:
                    System.out.print("Veritabanından silmek istediğiniz verinin id değerini giriniz");
                    int deleteId = scan.nextInt();

                    try {
                        crud.delete(deleteId);
                        System.out.println(deleteId + " id başarıyla silindi");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        System.err.println("Silinmedi!!");
                    }
                    System.out.println("Devam etmek için enter tuşuna basınız");
                    System.in.read();
                    break;
                case 4:
                    System.out.print("Veritabanından güncellemek istediğiniz verinin id değerini giriniz");
                    int updateId = scan.nextInt();

                    try {
                        crud.update(updateId);
                        System.out.println(updateId + " id başarıyla güncellendi");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        System.err.println("Güncellenmedi!!");
                    }
                    System.out.println("Devam etmek için enter tuşuna basınız");
                    System.in.read();
                    break;
                default:
                    return;
            }

        }while (choice !=4);
    }
}
