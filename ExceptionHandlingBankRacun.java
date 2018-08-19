
import java.util.Date;

public class ExceptionHandlingBankRacun extends ExceptionHandlingTransakcijaTest {

	private double balans;
	public Date datum = new Date();

	public void uplata(double iznos) {
		if (iznos > 0) {
			balans = balans + iznos;
		} else {
			System.out.println("Morate unijeti iznos veæi od 0 ");

		}
	}
	public void isplata(double iznos) {
		if (iznos <= balans || iznos < 00.0d) {
			balans = balans - iznos;

		} else {
			System.out.println(
					"Nedovoljno sredstava na raèunu, ili je unešen negativan iznos, molimo pokušajte ponovo! ");
		}
	}

	public double getBalans() {
		return balans;
	}

	public void transakcija(double iznos, ExceptionHandlingBankRacun targetAccount) {

		targetAccount.uplata(iznos);
		balans = balans - iznos;

	}

}
