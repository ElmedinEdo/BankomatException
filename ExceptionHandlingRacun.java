import java.time.LocalDate;
import java.util.Scanner;

public class ExceptionHandlingRacun extends ExceptionHandlingTransakcijaTest {
	Scanner input = new Scanner(System.in);
	static int Id;
	static double balans;

	static double isplata;
	static double uplata;
	static double iznos;

	public ExceptionHandlingRacun() {
	}

	public ExceptionHandlingRacun(int Id, double balans) {
		ExceptionHandlingRacun.Id = Id;
		ExceptionHandlingRacun.balans = balans;
	}

	public int getId() {
		return Id;
	}

	public void setId(int Id) {
		ExceptionHandlingRacun.Id = Id;
	}

	public double getBalans() {
		return balans;
	}

	public double setBalans(double balans) {
		return balans;
	}

	public double getIsplata() {
		return isplata;
	}

	public void setIsplata(double isplata) {
		ExceptionHandlingRacun.isplata = isplata;
	}

	public double getUplata() {
		return uplata;
	}

	public void setUplata(double uplata) {
		ExceptionHandlingRacun.uplata = uplata;
	}

	public double getIznos() {
		return iznos;
	}

	public void setIznos(double iznos) {
		ExceptionHandlingRacun.iznos = iznos;
	}

	public void Isplati(double iznos) {
		if (balans < iznos || iznos < 00.0d) {
			System.out.println(" Nemate dovoljno sredstava na ra�unu, ili je une�en negativan iznos, molimo poku�ajte ponovo! ");
		} else {
			balans = balans - iznos;
		}
	}

	public void Uplati(double iznos) {
		if (iznos > 0) {
			balans = balans + iznos;
		} else {
			System.out.println("Morate unijeti iznos ve�i od 0 ");
			iznos = input.nextDouble();
		}
	}

	public void Balans() {
		System.out.println("Stanje va�eg ra�una je : " + balans);
	}

	public void ShowMenu() {

		int izbor = 0;

		System.out.println("...............................................");
		System.out.println("Dobrodo�li: ");
		System.out.println("Va� User ID je: " + Id);
		System.out.println("...............................................");
		System.out.println("1. Provjeri stanje na ra�unu: ");
		System.out.println("2. Uplati novac na ra�un: ");
		System.out.println("3. Isplati novac sa ra�una: ");
		System.out.println("4. Izlaz ");

		do {
			System.out.println("...............................................");
			System.out.println("Izaberite jednu od opcija ");
			System.out.println("...............................................");
			izbor = input.nextInt();
			System.out.println("\n");

			switch (izbor) {

			case 1:
				System.out.println("...............................................");
				System.out.println("Stanje va�eg ra�una je : " + balans + " KM");
				System.out.println("...............................................");
				System.out.println("\n");
				break;

			case 2:
				System.out.println("...............................................");
				System.out.println("Unesite iznos koji �elite uplatiti " + " KM");
				System.out.println("...............................................");
				int iznos = input.nextInt();
				Uplati(iznos);
				System.out.println("\n");
				break;

			case 3:
				System.out.println("...............................................");
				System.out.println("Unesite iznos koji �elite za isplatu " + " KM");
				System.out.println("...............................................");
				int iznos1 = input.nextInt();
				Isplati(iznos1);
				System.out.println("\n");
				break;

			case 4:
				System.out.println("...............................................");
				break;

			default:
				System.out.println("Pogre�an unos! Molimo poku�ajte ponovo! ");
				break;
			}
		} while (izbor != 4);

		System.out.println("--------------------------------------------------");

		System.out.println("--------------------------------------------------");

		System.out.println("--------------------------------------------------");
		LocalDate localDate = LocalDate.of(2018, 8, 12);
		LocalDate newDate = localDate.plusDays(0);
		System.out.println("Datum:  " + newDate);
		System.out.println("HVALA VAM �TO STE KORISTILI NA�E USLUGE BANKOMATA   ");

	}

}
