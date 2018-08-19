
import java.util.Date;

public class ExceptionHandlingBankRacun extends ExceptionHandlingTransakcijaTest {

	private double balans;
	public Date datum = new Date();

	public void uplata(double iznos) {
		if (iznos > 0) {
			balans = balans + iznos;
		} else {
			System.out.println("Morate unijeti iznos ve�i od 0 ");

		}
	}
	public void isplata(double iznos) {
		if (iznos <= balans || iznos < 00.0d) {
			balans = balans - iznos;

		} else {
			System.out.println(
					"Nedovoljno sredstava na ra�unu, ili je une�en negativan iznos, molimo poku�ajte ponovo! ");
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
