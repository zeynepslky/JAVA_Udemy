package udemy;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		//veri tipleri
		
		/*
		
		double sayi1 = 70.25;
		float sayi2 = 70.75f;
		int sayi3 = 70;
		
		System.out.println(sayi1);
		System.out.println(sayi2);
		System.out.println(sayi3);

		char a = 'A';
		char b = '?';
		char c = 2000;
		char d = '\u0152';
		char e = '\u063C';
		//unicode table dan kodu bul
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		boolean a1 = true;
		boolean a2 = false;
		
		System.out.println(a1);
		System.out.println(a2);
		
		String b1 = "Merhaba";
		String b2 = "Hello World!";
		String b3 = "Java\nProgramlama\tDili";
		
		System.out.println(b1+b2);
		System.out.println(b2);
		System.out.println(b3);
		*/
		
		
		
		
		
		//scanner - kullanıcıdan veri alma
		
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen yaşınızı giriniz:");
		int yas = scanner.nextInt();
		System.out.println("Yaşınız: " + yas);
		
		System.out.println("Lütfen bir sayı giriniz:");
		double sayi = scanner.nextDouble();
		System.out.println("Sayı: " + sayi);
		
		System.out.println("Lütfen yazı giriniz:");
		String yazi = scanner.next();
		System.out.println("Yazı: " + yazi);
		
		if (scanner.hasNextInt())
		{
			int sayi1 = scanner.nextInt();
			System.out.println("Sayı: " + sayi1);
		}
		else 
		{
			System.out.println("Lütfen bir sayı giriniz.");
		}
		*/
		
		
		
		
		//Scanner scanner = new Scanner(System.in);
		
		/*
		int yas = scanner.nextInt();
		scanner.nextLine(); //Dummy input 
		//sayı den sonra string alamıyoruz dummy eklememiz gerekiyor
		String isim = scanner.nextLine();
		
		System.out.println("Yaş: " + yas);
		System.out.println("İsim: " + isim);
		
		
		int yas1 = scanner.nextInt();
		int yas2 = scanner.nextInt();
		int yas3 = scanner.nextInt();
		
		System.out.println("Yaş1: "+ yas1 + " Yaş2: "+ yas2 + " Yaş3: " + yas3);
		//ardarda int alırken ister entera bas ister boşluk bırakarak yaz
		*/
		
		
		
		
		
		//Kullanıcıdan aldığımız boy ve kilo ile beden kitle indexi hesaplama
		// BKİ = kilo / (boy * boy)
		
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Kilonuzu giriniz:");
		int kilo = scanner.nextInt();
		
		System.out.println("Boyunuzu giriniz (Örnek:1,72):");
		double boy = scanner.nextDouble();
		
		double bki = kilo / (boy * boy);
		
		System.out.println("Beden Kitle İndexiniz: " + bki);
		*/
		
		
		
		
		
		/*
		Bir aracın kilometrede ne kadar yaktığı ve kaç km yol yaptığı bilgilerini alarak 
		ne kadar ödeme yapması gerektiğini hesapla
		 */
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Aracınız kilometrede kaç kuruş yakıyor: (Örnek:0,32)");
		double kurus = scanner.nextDouble();
		
		System.out.print("Aracınız ile kaç km gittiniz:");
		int km = scanner.nextInt();
		
		System.out.println("Toplam ödemeniz gereken tutar: " + (kurus*km) + " tl dir.");
		*/
		
		
		
		
		
		// Kullanıcıdan alınan iki sayının değerlerini değiştirme
		
		/*
		Scanner scanner = new Scanner(System.in);
		
		int birinci_sayi, ikinci_sayi;
		
		System.out.print("Birinci sayı: ");
		birinci_sayi = scanner.nextInt();
		
		System.out.print("İkinci sayı: ");
		ikinci_sayi = scanner.nextInt();
		
		System.out.println("Değiştirilmeden Önce.....");
		
		System.out.println("Birinci sayı: " + birinci_sayi + " İkinci sayı: " + ikinci_sayi);
		
		int gecici = birinci_sayi;
		birinci_sayi = ikinci_sayi;
		ikinci_sayi = gecici;
		
		System.out.println("Değiştirildikten Sonra.....");
		
		System.out.println("Birinci sayı: " + birinci_sayi + " İkinci sayi: " + ikinci_sayi);
		*/
		
		
		
		
		
		// Dik üçgenin hipotenüsünü bulma
		
		/*
		Scanner scanner = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Birinci kenar: ");
		a =scanner.nextInt();
		
		System.out.println("İkinci kenar: ");
		b = scanner.nextInt();
		
		double h = Math.sqrt(a*a+b*b);
		
		System.out.println("Hipotenüs: " + h);
		*/
		
		
		
		
		
		// if-else koşullu durumlar
		
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen yaşınızı giriniz: ");
		int yas = scanner.nextInt();
		
		if (yas < 18)
		{
			System.out.println("Bu mekana giremezsiniz.");
		}
		else
		{
			System.out.println("Hoşgeldiniz.");
		}
		*/
		
		
		
		
		
		// Switch-case 
		/*
		Scanner scanner = new Scanner(System.in);
		
		int islem = scanner.nextInt();
		
		switch(islem)
		{
		
		case 1:
			System.out.println("1. işlem");
			break;
		case 2:
			System.out.println("2. işlem");
			break;
		case 3:
			System.out.println("3. işlem");
			break;
		default:
			System.out.println("Geçersiz işlem");
			break;
		}
		*/
		
		
		
		
		
		//Kullanıcıdan alınan 3 sayıdan en büyüğünü bulma
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Birinci sayı:");
		int a = scanner.nextInt();
		
		System.out.println("İkinci sayı:");
		int b = scanner.nextInt();
		
		System.out.println("Üçüncü sayı:");
		int c = scanner.nextInt();
		
		int max = -1;
		
		if (( a >= b ) && (a >= c))
		{
			max = a;
		}
		else if ((b >= a) && (b >=c))
		{
			max = b;
		}
		else
		{
			max = c;
		}
		
		System.out.println("Girilen sayıların en büyüğü: " + max);
		*/
		
		
		
		
		
		// Koşullarla beden kitle indexi hesaplama  - BKİ = kilo/(boy*boy)
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Kilonuzu giriniz: ");
		int kilo = scanner.nextInt();
		
		System.out.println("Boyunuzu giriniz (Örnek:1,72):");
		double boy = scanner.nextDouble();
		
		double bki = kilo / (boy * boy);
		
		if ( bki < 18.5)
		{
			System.out.println("Zayıf");
		}
		else if ( bki >= 18.5 && bki < 25 )
		{
			System.out.println("Normal");
		}
		else if ( bki >= 25 && bki < 30 )
		{
			System.out.println("Fazla kilolu");
		}
		else 
		{
			System.out.println("Obez");
		}
		*/
		
		
		
		
		
		
		// Hesap Makinesi
		
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*******************************");
		String islemler = "1. Toplama İşlemi \n"
				+ "2. Çıkarma İşlemi \n"
				+"3. Çarpma İşlemi \n"
				+"4. Bölme İşlemi";
		System.out.println(islemler);
		System.out.println("*******************************");
		
		System.out.println("İşlemi seçiniz:");
		
		String islem = scanner.nextLine();
		int a,b;
		
		switch(islem)
		{
		case "1":
			System.out.print("Birinci sayı:");
			a = scanner.nextInt();
			System.out.print("İkinci sayı:");
			b = scanner.nextInt();
			
			System.out.print("Toplam: " + (a+b));
			break;
			
		case "2":
			System.out.print("Birinci sayı:");
			a = scanner.nextInt();
			System.out.print("İkinci sayı:");
			b = scanner.nextInt();
			
			System.out.print("Fark: " + (a-b));
			break;
			
		case "3":
			System.out.print("Birinci sayı:");
			a = scanner.nextInt();
			System.out.print("İkinci sayı:");
			b = scanner.nextInt();
			
			System.out.print("Çarpım: " + (a*b));
			break;
			
		case "4":
			System.out.print("Birinci sayı:");
			a = scanner.nextInt();
			System.out.print("İkinci sayı:");
			b = scanner.nextInt();
			
			System.out.print("Bölüm: " + ((double)a/b));
			break;
		default:
			System.out.println("Geçersiz işlem yaptınız.");
				
		}
		*/
		
		
		
		
		
		// Gelişmiş not hesaplama
		//  Kullanıcıdan vize1, vize2 ve final notları alınacak ve hesaplanacak
		 
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Vize 1:");
		int vize1 = scanner.nextInt();
		
		System.out.print("Vize 2:");
		int vize2 = scanner.nextInt();
		
		System.out.print("Final:");
		int finalnot = scanner.nextInt();
		
		System.out.print("Okul ortalamanız: ");
		double ortalama = scanner.nextDouble();
			
		double toplamnot = (vize1 * 3 / 10.0) + (vize2 * 3 / 10.0) + (finalnot * 4 / 10.0);
		
		if ( toplamnot >= 90)
		{
			System.out.println("AA aldınız...");
		}
		else if ( toplamnot >= 85)
		{
			System.out.println("BA aldınız...");
		}
		else if ( toplamnot >= 80)
		{
			System.out.println("BB aldınız...");
		}
		else if ( toplamnot >= 75)
		{
			System.out.println("CB aldınız...");
		}
		else if ( toplamnot >= 70)
		{
			System.out.println("CC aldınız...");
		}
		else if ( toplamnot >= 65)
		{
			System.out.println("DC aldınız...");
		}
		else if ( toplamnot >= 60)
		{	
			if(ortalama < 2.5)
			{
				System.out.println("DD aldınız ve not ortalamanız düşük. Bu dersi tekrar almayı düşünebilirsiniz.");
			}
			else
			{
				System.out.println("DD aldınız...");
			}
		}
		else if ( toplamnot >= 55)
		{
			System.out.println("FD aldınız ve kaldınız...");
		}
		else
		{
			System.out.println("Kaldınız...");
		}
		
		*/
		
		
		
		
		
		// Döngü yapıları
		
		// for döngüsü
		
		/*
		int i;
		for (i = 0; i < 50; i *= 2)
		{
			System.out.println("i = " + i);
		}
		
		for (int i = 10; i >= 0; i--)
		{
			System.out.println("i = " + i);
		}
		
		int i = 0;
		for (; i < 5; i++)
		{
			System.out.println("Java Öğreniyorum...");
		}
		
		for ( int i = 0, j = 10; i < 10 && j > 0; i++, j--)
		{
			System.out.println("i = " + i);
			System.out.println("j = " + j);
		}
		*/
		
		
		
		// Faktöriyel
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Bir sayı giriniz: ");
		
		int faktoriyel = 1;
		
		int sayi = scanner.nextInt();
		
		for (int i = 1; i <= sayi; i++)
		{
			faktoriyel *= i;
		}
		System.out.println("Faktöriyel = " + faktoriyel);
		*/
		
		
		
		
		
		
		// While döngüleri
		/*
		int i = 10;
		while(i < 100)
		{
			System.out.println("i = " + i);
			i += 3;
		}
		*/
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir sayı giriniz:");
		int sayi = scanner.nextInt();
		
		int faktoriyel = 1;
		
		while ( sayi > 0)
		{
			faktoriyel *= sayi;
			sayi--;
		}
		System.out.println("Faktöriyel = "+ faktoriyel);
		*/
		
		//Sonsuz döngü
		/*
		int i = 0;
		while(i < 10)
		{
			System.out.println("i = " + i);
		}
		*/
		
		
		
		
		
		// Do - While döngüleri
		
		/*
		int i = 0;
		do
		{
			System.out.println("i = " + i);
			i++;
		}
		while(i < 5);
		*/
		
		
		// girilen sayının rakamları toplamını bulma
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		
		int sayi = scanner.nextInt();
		int toplam = 0;
		
		do {
			toplam += sayi %10;
			sayi /= 10;
		}
		while ( sayi > 0);
		System.out.println("Rakamları toplamı = " + toplam);
		*/
		
		
		
		
		// break - continue
		/*
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			int islem = scanner.nextInt();
			if( islem == -1)
			{
				System.out.print("Döngüden çıkılıyor.");
				break;
			}
			System.out.println("İşlem = "+ islem);
		}
		*/
		
		/*
		for ( int i = 0; i < 10; i++)
		{
			if ( i == 3 || i == 5)
				continue;
			
			System.out.println("i = " + i);
		}
		*/
		
		/*
		int i = 0 ;
		while ( i < 10)
		{
			if ( i == 3 || i == 5)
			{
				i++;
				continue;
			}
				
			System.out.println("i = " +i);
			i++;
		}
		*/
		
		
		
		
		
		
		// While döngüsü ile basit ATM programı yapımı
		
		/*
		Scanner scanner = new Scanner(System.in);
		
		int bakiye = 1000;
		
		String islemler = "1. İşlem: Bakiye Öğrenme\n"
				+ "2. İşlem: Para Çekme\n"
				+ "3. İşlem: Para Yatırma\n"
				+ "Çıkmak için q'a basınız.";
		
		System.out.println("**************************************");
		System.out.println(islemler);
		System.out.println("**************************************");
		
		while(true)
		{
			System.out.print("İşlem seçiniz: ");
			String islem = scanner.nextLine();
			
			if (islem.equals("q"))
			{
				System.out.println("Programdan çıkılıyor...");
				break;
			}
			else if ( islem.equals("1"))
			{
				System.out.println("Bakiyeniz : " + bakiye);
			}
			else if ( islem.equals("2"))
			{
				System.out.println("Çekmek istediğiniz tutar: ");
				int tutar = scanner.nextInt();
				scanner.nextLine();
				
				if ( bakiye - tutar < 0)
				{
					System.out.println("Yeterli bakiye yok. Bakiyeniz: " + bakiye);
				}
				else
				{
					bakiye -= tutar;
					System.out.println("Yeni Bakiyeniz: "+ bakiye);
				}
			}
			else if ( islem.equals("3"))
			{
				System.out.println("Yatırmak istediğiniz tutar: ");
				int tutar = scanner.nextInt();
				scanner.nextLine();
				
				bakiye += tutar;
				System.out.println("Yeni bakiyeniz: " + bakiye);
			}
			else 
			{
				System.out.println("Geçersiz İşlem...");
			}
		}
		*/
		
		
		
		
		
		
		
		// Girilen sayının Armstrong sayısı olup olmadığını kontrol etme
		// ör: 1634 = 1^4+6^4+3^4+4^4 veya 371 = 3^3+7^3+1^3
		
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayıyı giriniz: ");
		int sayi = scanner.nextInt();
		
		System.out.println("Basamak sayısı: ");
		int basamak_sayisi = scanner.nextInt();
	
		int gecici = sayi;
		int toplam = 0;
		
		do
		{
			int basamak_degeri = gecici % 10;
			gecici /= 10;
			toplam += Math.pow(basamak_degeri, basamak_sayisi);			
		}
		while(gecici > 0);
		
		if ( sayi == toplam)
		{
			System.out.println("Bu sayı bir Armstrong sayıdır.");
		}
		else
		{
			System.out.println("Bu sayı bir Armstrong sayı değildir.");
		}
		*/
		
		
		
		
		
		
		// Çarpım tablosu
		
		/*
		for ( int i = 1; i <= 10; i++)
		{
			System.out.println("************************************");
			for ( int j = 1; j <= 10; j++)
			{
				System.out.println(i + " x " + j + " = " + (i*j));
			}
			System.out.println("************************************");
		}
		*/
		
		
		
		
		
		
		// while döngüsü ile kullanıcı girişi
		
		/*
		Scanner scanner = new Scanner(System.in);
		
		int giris_hakki = 3;
		
		String sys_kullanici_adi = "Zeynep";
		String sys_parola = "12345";
		
		System.out.println("*******************************");
		System.out.println("Kullanıcı Girişine Hoşgeldiniz...");
		System.out.println("*******************************");
		
		while(true)
		{
			System.out.println("Kullanıcı Adı:");
			String kullanici_adi = scanner.nextLine();
			
			System.out.println("Parola:");
			String parola = scanner.nextLine();
			
			if ( kullanici_adi.equals(sys_kullanici_adi) && parola.equals(sys_parola))
			{
				System.out.println("Hoşgeldiniz " + kullanici_adi);
				break;
			}
			else if (kullanici_adi.equals(sys_kullanici_adi) && !parola.equals(sys_parola))
			{
				System.out.println("Parolanız Yanlış...");
				giris_hakki--;
			}
			else if (!kullanici_adi.equals(sys_kullanici_adi) && parola.equals(sys_parola))
			{
				System.out.println("Kullanıcı Adı Yanlış...");
				giris_hakki--;
			}
			else
			{
				System.out.println("Kullanıcı Adı ve Parolanız Yanlış...");
				giris_hakki--;
			}
			
			if(giris_hakki == 0)
			{
				System.out.println("Giriş hakkınız bitti...");
				break;
			}
		}
		*/
		
		
		
		
		
		// Faiz Uygulaması
		
		/*
		Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza hoşgeldiniz. Faiz Oranı %6");
        
        int anapara,vade;
        System.out.print("Yatırmak istediğiniz tutar : ");
        anapara = scanner.nextInt();
        System.out.print("Paranızı kaç yıl vadeli yatırmak istiyorsunuz ? ");
        vade = scanner.nextInt();
        
        double toplampara = anapara;
        double faizOrani = 0.06;
        
        for (int i =  1 ;  i<= vade ; i++) {
            
            toplampara = (toplampara * faizOrani) + toplampara;
            
            System.out.println(i + ".yılın sonunda toplam para : " + (int)toplampara);
        }
        */
		
		
		
		// Metodlar 
		
		
		// 1'den 1000'e kadar olan asal sayıları bulma
		
		/*
		for (int i = 2; i < 1000; i++)
		{
			if (asalMi(i))
			{
				System.out.println(i);
			}
		}
		*/
		
		
		
		
		// Girilen iki sayının ebobunu bulma 
		
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Birinci Sayı: ");
		int a = scanner.nextInt();
		
		System.out.print("İkinci Sayı: ");
		int b = scanner.nextInt();
		
		System.out.println("İki sayının ebobu : " + ebob(a,b));
		*/		
		
		
	
		
		// Method Overloading kullanarak Hesap Makinesi
		
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*******************************");
		String islemler = "1. Toplama İşlemi \n"
				+ "2. Çıkarma İşlemi \n"
				+"3. Çarpma İşlemi \n"
				+"4. Bölme İşlemi";
		System.out.println(islemler);
		System.out.println("*******************************");
		
		while (true) {
            System.out.print("İşlemi Seçiniz : ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")){
                
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            else if (islem.equals("1")) {
                System.out.print("Kaç değer toplayacaksınız ? (2 veya 3): ");
                int kacsayi = scanner.nextInt();
                
                if (kacsayi == 2) {
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b:");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Girilen sayıların toplamları : " + (toplama(a, b)));  
                }
                else if (kacsayi == 3) {
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b:");
                    int b = scanner.nextInt();
                    System.out.print("c:");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Girilen sayıların toplamları : " + (toplama(a, b,c)));                    
                }
                else {
                    
                    System.out.println("Bunun için uygun metod bulunmuyor...");
                }   
            }
            else if (islem.equals("2")) {
                System.out.print("a:");
                int a = scanner.nextInt();
                System.out.print("b:");
                int b = scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("Girilen Sayıları Farkları : " + cikarma(a, b));
                
            }
            else if (islem.equals("3")){
                System.out.print("Kaç değer çarpacaksınız ? (2 veya 3): ");
                
                int kacsayi = scanner.nextInt();
                
                if (kacsayi == 2) {
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b:");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Girilen sayıların çarpımları : " + (carpma(a, b)));
                }
                else if (kacsayi == 3) {
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b:");
                    int b = scanner.nextInt();
                    System.out.print("c:");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Girilen sayıların çarpımları : " + (carpma(a, b,c)));                 
                }
                else {
                    
                    System.out.println("Bunun için uygun metod bulunmuyor...");
                }               
            }
            else if (islem.equals("4")) {
                System.out.print("a:");
                int a = scanner.nextInt();
                System.out.print("b:");
                int b = scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("Girilen Sayıların Bölümü : " + bolme(a, b));                
            }
            else {
                System.out.println("Geçersiz İşlem...");
            }      
        }
		*/	
		
		
	}
	
	public static boolean asalMi(int sayi)
	{
		for (int i = 2; i < sayi; i++)
		{
			if (sayi % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	
	
	public static int ebob(int sayi1, int sayi2)
	{
		int ebob = 1;
		for ( int i = 1; i <= sayi1 && i <= sayi2; i++ )
		{
			if (( sayi1 % i == 0) && ( sayi2 % i == 0))
			{
				ebob = i;
			}
		}
		return ebob;
	}
	
	
	
	public static int cikarma(int a, int b)
	{
		return (a-b);
	}
	
	public static double bolme(int a, int b)
	{
		return ((double)a / b);
	}
	
	public static int toplama(int a, int b)
	{
		return (a+b);
	}
	
	public static int toplama(int a, int b, int c)
	{
		return (a+b+c);
	}
	
	public static int carpma(int a, int b)
	{
		return (a*b);
	}
	
	public static int carpma(int a, int b, int c)
	{
		return (a*b*c);
	}
	
}
