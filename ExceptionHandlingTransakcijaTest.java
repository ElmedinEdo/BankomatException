import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingTransakcijaTest {

	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);
		boolean continueInput = true;
		do {
			try {

				System.out.println("Unesite password: ");
				int password = input.nextInt();

				System.out.println("Broj koji ste unijeli je: " + password);

				continueInput = false;
			} catch (InputMismatchException ex) {
				System.out.println("Pogre�an unos: unesite bilo koji broj: ");
				input.nextLine();
			}
		} while (continueInput);
		System.out.println("");
		System.out.println("Izaberite jednu od ponu�enih opcija: ");
		System.out.println("1. Ra�un Mark  ");
		System.out.println("2. Stanje na bankovnom ra�unu Mark  ");
		System.out.println("3. Ra�un John: ");
		System.out.println("4. Stanje na bankovnom ra�unu John: ");
		System.out.println("5. Transfer novca sa ra�una: ");
		System.out.println("6. Izlaz ");
		int izbor = input.nextInt();

		if (izbor == 1) {
			ExceptionHandlingTransakcijaTest Mark = new ExceptionHandlingTransakcijaTest();
			ExceptionHandlingRacun RacunMark = new ExceptionHandlingRacun(19, 5000);
			LocalDate localDate = LocalDate.of(2018, 8, 17);
			LocalDate newDate = localDate.plusDays(0);
			System.out.println("Datum transakcije:   " + newDate);
			RacunMark.ShowMenu();
			izbor = input.nextInt();
		}
		if (izbor == 2) {

			FileReader file = new FileReader("C:\\Users\\edd\\Desktop\\BankovniRa�un\\Ra�unMark.txt");
			BufferedReader reader = new BufferedReader(file);
			String text = "";
			String line = reader.readLine();
			while (line != null) {
				text += line;
				line = reader.readLine();
			}
			System.out.println(text);
			izbor = input.nextInt();
		}

		if (izbor == 3) {
			ExceptionHandlingTransakcijaTest John = new ExceptionHandlingTransakcijaTest();
			ExceptionHandlingRacun RacunJohn = new ExceptionHandlingRacun(20, 2000);
			LocalDate localDate = LocalDate.of(2018, 8, 17);
			LocalDate newDate = localDate.plusDays(0);
			System.out.println("Datum transakcije:   " + newDate);
			RacunJohn.ShowMenu();
			izbor = input.nextInt();

		}
		if (izbor == 4) {
			FileReader file = new FileReader("C:\\Users\\edd\\Desktop\\BankovniRa�un\\Ra�unJohn.txt ");
			BufferedReader reader = new BufferedReader(file);
			String text = "";
			String line = reader.readLine();
			while (line != null) {
				text += line;
				line = reader.readLine();
			}
			System.out.println(text);
			izbor = input.nextInt();
		}
		if (izbor == 5) {
			ExceptionHandlingBankRacun John = new ExceptionHandlingBankRacun();
			John.uplata(5000);
			ExceptionHandlingBankRacun Mark = new ExceptionHandlingBankRacun();
			Mark.uplata(2000);

			System.out.println("Stanje na bankovnom ra�unu Johna iznosi: " + John.getBalans() + " $");
			System.out.println("Stanje na bankovnom ra�unu Marka iznosi: " + Mark.getBalans() + "  $");
			System.out.println("Unesite vrijednost transakcije koju �elite da prebacite sa jednog bankovnog "
					+ "ra�una na drugi bankovni ra�un:");
			double iznos = input.nextDouble();

			System.out.println("Broj *1 za transfer novca sa John - bankovnog ra�una.");
			System.out.println("Broj *2 za transfer novca sa Mark - bankovnog ra�una.");
			int opcija = input.nextInt();

			if (opcija == 1) {
				John.transakcija(iznos, Mark);
			}
			if (opcija == 2) {
				Mark.transakcija(iznos, John);
			}
			System.out.println("--------------------------------------------------");
			LocalDate localDate = LocalDate.of(2018, 8, 17);
			LocalDate newDate = localDate.plusDays(0);
			System.out.println("Datum transakcije:   " + newDate);
			System.out.println(".......................................................");
			System.out.println("Vrijednost transakcije koja se prebacuje: " + iznos + " $ ");
			System.out.println("--------------------------------------------------");
			System.out.println("Stanje na ra�unu nakon transakcije John: " + John.getBalans() + " $ ");
			System.out.println("Stanje na ra�unu nakon transakcije Mark: " + Mark.getBalans() + " $ ");
			System.out.println("--------------------------------------------------");
			System.out.println("Stanje na bankovnom ra�unu ne smije biti negativan iznos: ");
			izbor = input.nextInt();
		}
		if (izbor == 6) {
			System.out.println("<<<<Izlaz>>>>");
		}
	}
}
