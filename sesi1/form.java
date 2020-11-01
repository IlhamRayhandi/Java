public class form {

public static void main(String[] args) {

	String nama = "Ilham Rayhandi";
	String status = "Mahasiswa/Pekerja Serabutan";
	int umur = 16;
	int penghasilan = 100000;
	int pengeluaran = 50000;
	int totalHarian = penghasilan - pengeluaran;

	
	String formBiodata = "Nama : "+nama+", Status : "+status+", Umur : "+umur+" (tahun),  "+" Pendapatan : Rp."+totalHarian;
        System.out.println(formBiodata);
	}
}