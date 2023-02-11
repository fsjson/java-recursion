# Java Recursive/Recursion

### Pengertian dan kegunaan: 

Rekursif Method adalah **metode yang memanggil dirinya sendiri untuk menyelesaikan masalah**. Ini adalah salah satu teknik pemrograman yang **berguna untuk memecahkan masalahyang kompleks menjadi submasalah yang lebih sederhana**. 
Rekursif method sangat berguna untuk memecahkan masalah yang kompleks dan membuat kode lebih mudah dibaca. Namun, 
penting untuk memastikan bahwa Anda memiliki base case dan untuk **memastikan** bahwa setiap pemanggilan rekursif tidak akan menyebabkan **infinite loop**.

Infinite loop adalah suatu kondisi di mana perulangan tidak memiliki kondisi dasar yang akan menghentikan perulangan. Konsekuensinya, perulangan tersebut akan terus berlangsung tanpa henti, dan bisa menyebabkan program menjadi tidak responsif atau menghabiskan sumber daya sistem.

Contoh infinite loop dalam pemrograman adalah:

// dalam bahasa java

public class InfiniteLoopExample {

    public static void main(String[] args) {
        while (true) {
            System.out.println("This is an infinite loop");
        }
    }

}
 

Di sini, perulangan dilakukan dengan kondisi true, sehingga perulangan akan terus berlangsung tanpa ada kondisi dasar yang akan menghentikan perulangan.
Oleh karena itu, program akan menjadi tidak responsif dan harus ditutup secara paksa.

Untuk menghindari infinite loop, penting bagi pengembang untuk memastikan bahwa setiap perulangan memiliki kondisi dasar yang akan menghentikan perulangan, 
seperti mengubah nilai variabel atau memeriksa kondisi tertentu pada setiap iterasi perulangan.
