
public class main {

	public static void main(String[] args) {
		String yeniMesaj = sehirver();
		System.out.println(yeniMesaj);
		int sayi = topla(15,7);
		System.out.println(sayi);

	}
	public static void ekle() {
		System.out.println("Eklendi");
	}
	public static void sil() {
		System.out.println("Silindi");
	}
	public static void güncelle() {
		System.out.println("Güncellendi");
	}
	public static int topla() {
		return sayi1 + sayi2;
	}
	public static String sehirVer() {
		return "Ankara" ;
	}

}
