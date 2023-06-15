package javaProject;
import java.util.Scanner;
import java.time.LocalDateTime;

public class project {
	
    public static void main(String[] args) {
    		Scanner input = new Scanner(System.in);
			LocalDateTime tarihSaat1 = LocalDateTime.of(2023, 10, 5, 10, 30, 0);
			
			UcakBilgileri ucak = new UcakBilgileri();
			ucak.model = "Kargo Uçağı";
			ucak.seriNo = 202043989;
			ucak.yolcuKapasitesi = 4;
			ucak.tasimaKapasitesi = 200000;
			ucak.bakimTarihi = "01, 10, 2023";
			ucak.ucakRengi = "koyu yeşil";

			KargoBilgileri kargo = new KargoBilgileri();
			System.out.println("Gonderenin Ismi Soyismi:");
			kargo.gonderenAdSoyad = input.nextLine();
			System.out.println("Kargo Turu Giriniz: (Tehlikeli, Acil Teslimat, Kuru Yuk...)");
			kargo.tur = input.nextLine();
			System.out.println("Kilogram Cinsinden Agirligini Giriniz:");
			kargo.agırlıkKiloCinsinden = input.nextInt();
			System.out.println("Gonderici Numaranizi Giriniz:");
			kargo.gondericiNo = input.nextInt();
			System.out.println("Alici Numaranizi Giriniz:");
			kargo.aliciNo = input.nextInt();
			System.out.println("Iletisim Bilgilerinizi Giriniz (Telefon Numarasi) +90");
			input.nextLine();
			kargo.iletisimBilgileri = input.nextLine();

			LokasyonBilgileri lokasyon = new LokasyonBilgileri();
			System.out.println("Kargonun Gidecegi Ulkeyi Giriniz:");
			lokasyon.ulke = input.nextLine();
			System.out.println("Kargonun Gidecegi Sehri Giriniz:");
			lokasyon.sehir = input.nextLine();
			System.out.println("Kargonun Gonderilmek Istendigi Havaalanini Giriniz:");
			lokasyon.havaalani = input.nextLine();
			System.out.println("Doluluk Sebebiyle " + kargo.gondericiNo + " Numarali " + kargo.tur + " Kargonuz En Yakin Tarih Olan " + tarihSaat1 + " Tarihine " +
			lokasyon.ulke + "/" + lokasyon.sehir + "/" + lokasyon.havaalani + " Konumunda Kaydiniz Olusturulmustur.");
		}
    }
