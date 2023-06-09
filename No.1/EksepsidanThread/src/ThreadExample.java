/*
 Eksepsi

 adalah ketika kondisi yang tidak kita harapkan terjadi. Skenario terburuknya adalah program akan diterminasi/diakhiri
sehingga keseluruhan proses(termasuk yang tidak bermasalah) ikut berhenti.
Untuk menanganinya kita dapat gunakan Exception handling seperti try-catch, dimana eksepsi akan dilempar lalu ditangkap untuk
ditampilkan sebagai pesan
Keyword : try, catch, finally

Thread

dapat dianggap sebagai pengontrol aliran program, artinya dengan thread kita 
bisa membuat beberapa proses dieksekusi bersamaan secara paralel(multithreading) atau diubah urutan eksekusinya.
Konsep sederhananya dapat kita lihat dalam penggunaan program di desktop dan aplikasi-aplikasi di perangkat mobile  secara bersamaan 
tanpa mengganggu antar satu proses dengan proses yang lain
Keyword : Thread, run, start
 */

class ContohThread extends Thread {
    String namaThread;
    int mulai;
    int akhir;

    public ContohThread(String namaThread, int mulai, int akhir) {
        this.namaThread = namaThread;
        this.mulai = mulai;
        this.akhir = akhir;
    }

    @Override
    public void run() {
        System.out.println("Thread " + namaThread + " dimulai.");
        for (int i = mulai; i <= akhir; i++) {
            System.out.println("Thread " + namaThread + ": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread " + namaThread + " Selesai !!!.");
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        ContohThread thread1 = new ContohThread("Thread 1", 1, 5);
        ContohThread thread2 = new ContohThread("Thread 2", 6, 10);

        thread1.start();
        thread2.start();
    }
}
