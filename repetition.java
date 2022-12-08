import java.util.Scanner;

public class Repetition { 
	public static void main(String[] args) {  			

		Scanner sc = new Scanner(System.in); 		
 		String nama, nim; 		
		int n, add = 0, i = 0, init = 2;  		
		System.out.print("Masukkan Nama Anda [1..25] : "); 		
		nama = sc.nextLine(); 		
		
		if (nama.length() < 1 || nama.length() > 25) { 			
			System.out.println("Masukan Tidak Valid!"); 			
			System.out.println("Program Dihentikan!"); 			
			System.exit(0); 		
		}  		
		
		System.out.print("Masukkan NIM Anda [harus 10 karakter] : "); 		
		nim = sc.next(); 		
		
		if (nim.length() != 10) { 			
			System.out.println("Masukan Tidak Valid!"); 		
			System.out.println("Program Dihentikan!"); 			
			System.exit(0); 		
		}  		
	 		
		System.out.println(); 		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"); 		
		System.out.println();  		
		
		System.out.println("Registrasi Sukses.."); 		
		System.out.println("Selamat Datang " + nama + " [NIM : " + nim + "].. ^^v"); 		
		System.out.println(); 		
		System.out.println("Mari belajar macam-macam deret bilangan..");  	
		
		do { 			
			
			System.out.println(); 			
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"); 			
			System.out.println();  			
		
			System.out.print("Masukkan Sembarang Angka [5..20] : "); 			
			n = sc.nextInt(); 			
			
			if (n < 5 || n > 20) { 				
				System.out.println("Masukan Tidak Valid!"); 				
				System.out.println("Program Dihentikan!"); 				
				System.exit(0); 			
			}  			
	 			
			System.out.println(); 			
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"); 			
			System.out.println();  			
			
			System.out.println("Deret Bilangan"); 			
			System.out.println("##############");  			
	
			System.out.println(" " + n + " Bilangan Genap:"); 			
			init = 2; 			
			add = 0; 			
			while (i < n) { 			
				System.out.print(init + " "); 				
				add += init; 				
				init += 2; 				
				i++; 			
			} 			
			System.out.println("\nHasil Penjumlahan = " + add);  			
			
			System.out.println(" " + n + " Bilangan Ganjil:"); 			
			init = 1; 			
			add = 0; 			
			i = 0; 			
			while (i < n) { 				
				System.out.print(init + " "); 				
				add += init; 				
				init += 2; 				
				i++; 			
			} 			
			System.out.println("\nHasil Penjumlahan = " + add);  			
			
			System.out.println(" " + n + " Bilangan Fibonacci:"); 			
			init = 1; 			
			int temp = 0; 			
			add = 0; 			
			i = 0; 			
			while (i < n) { 				
				System.out.print(init + " "); 				
				add += init; 				
				init += temp; 				
				temp = init - temp; 				
				i++; 			
			} 			
			System.out.println("\nHasil Penjumlahan = " + add);  			
			
			System.out.print("\nAnda ingin mengulang [y/t] : "); 			
			String ch = sc.next(); 			
			
			if (ch.equalsIgnoreCase("y")) { 			
					
				continue; 			
			} 			
	 			
			sc.close(); 			
			break; 		
		} while (true); 	
	} 
} 
