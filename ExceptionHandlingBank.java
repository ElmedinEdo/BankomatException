
public class ExceptionHandlingBank extends ExceptionHandlingTransakcijaTest {

	private int brojKorisnika;
	private String ime;
	private String prezime;
	private String password;
	private java.util.Date korisnikDate;

	public ExceptionHandlingBank(int brojKorisnika, String ime, String prezime, String password) {

		this.brojKorisnika = brojKorisnika;
		this.ime = ime;
		this.prezime = prezime;
		this.password = password;
		korisnikDate = new java.util.Date();
	}

	public java.util.Date getKorisnikDate() {
		return korisnikDate;
	}

	public void setKorisnikDate(java.util.Date korisnikDate) {
		this.korisnikDate = korisnikDate;
	}

	public String getPassword() {

		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getBrojKorisnika() {
		return brojKorisnika;
	}

	public void setBrojKorisnika(int brojKorisnika) {
		this.brojKorisnika = brojKorisnika;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
}
