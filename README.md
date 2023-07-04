# Java Recursive/Recursion

### Pengertian dan kegunaan: 

Rekursif Method adalah **metode yang memanggil dirinya sendiri untuk menyelesaikan masalah**. Ini adalah salah satu teknik pemrograman yang **berguna untuk memecahkan masalahyang kompleks menjadi submasalah yang lebih sederhana**. 


### INFINITE LOOP

Infinite loop adalah suatu kondisi di mana perulangan tidak memiliki kondisi dasar yang akan menghentikan perulangan. akibatnya, perulangan tersebut akan terus berlangsung tanpa henti, dan bisa menyebabkan program menjadi tidak responsif atau menghabiskan sumber daya sistem.

Contoh infinite loop dalam pemrograman adalah:

   	public class InfiniteLoopExample {
    		public static void main(String[] args) {
        			while (true) {
            			System.out.println("This is an infinite loop");
        			}
    		}
	}
 

Di sini, perulangan dilakukan dengan kondisi true, sehingga perulangan akan terus berlangsung tanpa ada kondisi dasar yang akan menghentikan perulangan.
Oleh karena itu, program akan menjadi tidak responsif dan harus ditutup secara paksa.

Untuk menghindari **infinite loop**, penting bagi pengembang untuk memastikan bahwa setiap perulangan memiliki kondisi dasar yang akan menghentikan perulangan, 
seperti mengubah nilai variabel atau memeriksa kondisi tertentu pada setiap perulangan.
