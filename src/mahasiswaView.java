import java.util.List;

public class mahasiswaView {
    public void tampilkanMahasiswa(List<mahasiswaModel> mahasiswaList) {
        for (mahasiswaModel mahasiswa : mahasiswaList) {
            System.out.println(mahasiswa);
        }
    }

    public void tampilkanDetailMahasiswa(mahasiswaModel mahasiswa) {
        System.out.println("Detail Mahasiswa:");
        System.out.println("ID: " + mahasiswa.getId());
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNim());
    }

    public void tampilkanPesan(String pesan) {
        System.out.println(pesan);
    }
}
