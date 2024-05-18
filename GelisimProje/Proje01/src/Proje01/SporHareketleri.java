package Proje01;

import java.util.Scanner;

public class SporHareketleri {
    public static void sporHaraketleriniGoster(Scanner tarayici) {
        System.out.println("\nSPOR HAREKETLERİ MENÜSÜ");
        System.out.println("1 - Omuz");
        System.out.println("2 - Göğüs");
        System.out.println("3 - Bacak");
        System.out.println("4 - Kol");
        System.out.print("Hangi kas grubunu çalışmak istersiniz? (1-4): ");
        int secim = tarayici.nextInt();

        switch (secim) {
            case 1:
                omuzHareketleriniGoster();
                break;
            case 2:
                gogusHareketleriniGoster();
                break;
            case 3:
                bacakHareketleriniGoster();
                break;
            case 4:
                kolHareketleriniGoster();
                break;
            default:
                System.out.println("Geçersiz seçim!");
                break;
        }
    }

    private static void omuzHareketleriniGoster() {
        System.out.println("\nOmuz Hareketleri");
        System.out.println(
                "1. Barbell Shoulder Press: Omuzlarınızı dik tutarak, barbell'i başınızın üzerine kaldırın ve ardından yavaşça indirin.");
        System.out.println(
                "2. Dumbbell Lateral Raise: Dumbbell'ları yavaşça yana doğru kaldırın, omuzlarınızı sıkın ve sonra kontrollü bir şekilde indirin.");
        System.out.println(
                "3. Front Dumbbell Raise: Dumbbell'ları önünüzde düz bir şekilde kaldırın ve sonra kontrollü bir şekilde indirin.");
    }

    private static void gogusHareketleriniGoster() {
        System.out.println("\nGöğüs Hareketleri");
        System.out.println(
                "1. Barbell Bench Press: Barbell'i göğsünüzün üstüne doğru indirin ve sonra yavaşça yukarı itin.");
        System.out.println(
                "2. Dumbbell Flyes: Dumbbell'ları yana doğru açarak göğsünüzü germek için kaldırın ve sonra kontrollü bir şekilde indirin.");
        System.out.println(
                "3. Incline Dumbbell Press: Bench'inizi eğik konuma getirin ve dumbbell'ları göğsünüzün üstüne doğru itin.");
    }

    private static void bacakHareketleriniGoster() {
        System.out.println("\nBacak Hareketleri");
        System.out.println("1. Squats: Ayaklarınızı omuz genişliğinde açarak çömelin ve sonra yavaşça yukarı kalkın.");
        System.out.println("2. Lunges: Bir ayağınızı öne atarak dizinizi kırın ve ardından başlangıç pozisyonuna dönün.");
        System.out.println("3. Leg Press: Leg press makinesine oturarak bacaklarınızı düz bir şekilde itin.");
    }

    private static void kolHareketleriniGoster() {
        System.out.println("\nKol Hareketleri");
        System.out.println(
                "1. Bicep Curls: Dumbbell'ları ellerinizle kavrayarak dirseklerinizi büküp kaldırın ve sonra yavaşça indirin.");
        System.out.println(
                "2. Tricep Dips: Ellerinizle destek alarak vücudunuzu aşağıya indirip tekrar yukarı kaldırın.");
        System.out.println(
                "3. Hammer Curls: Dumbbell'ları nötr bir pozisyonda tutarak dirseklerinizi büküp kaldırın ve yavaşça indirin.");
    }
}
       
