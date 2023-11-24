import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mahasiswaController {
    private List<mahasiswaModel> mahasiswaList;
    private mahasiswaView mahasiswaView;
    private Scanner scanner;

    public int getInputId() {
        mahasiswaView.tampilkanPesan("Masukkan ID: ");
        return scanner.nextInt();
    }

    public mahasiswaController() {
        this.mahasiswaList = new ArrayList<>();
        this.mahasiswaView = new mahasiswaView();
        this.scanner = new Scanner(System.in);

    }

    public void tambahMahasiswa() {
        mahasiswaView.tampilkanPesan("Masukkan nama mahasiswa:");
        String nama = scanner.nextLine();
        mahasiswaView.tampilkanPesan("Masukkan NIM mahasiswa:");
        String nim = scanner.nextLine();

        int id = mahasiswaList.size() + 1;
        mahasiswaModel mahasiswa = new mahasiswaModel(id, nama, nim);
        mahasiswaList.add(mahasiswa);
        mahasiswaView.tampilkanPesan("Mahasiswa berhasil ditambahkan.");
    }

    public void tampilkanMahasiswa() {
        mahasiswaView.tampilkanMahasiswa(mahasiswaList);
    }

    public void tampilkanDetailMahasiswa(int id) {
        mahasiswaModel mahasiswa = null;
        for (mahasiswaModel m : mahasiswaList) {
            if (m.getId() == id) {
                mahasiswa = m;
                break;
            }
        }
        if (mahasiswa != null) {
            mahasiswaView.tampilkanDetailMahasiswa(mahasiswa);
        } else {
            mahasiswaView.tampilkanPesan("Mahasiswa tidak ditemukan.");
        }
    }

    public void hapusMahasiswa(int id) {
        mahasiswaModel mahasiswaToRemove = null;
        for (mahasiswaModel m : mahasiswaList) {
            if (m.getId() == id) {
                mahasiswaToRemove = m;
                break;
            }
        }
        if (mahasiswaToRemove != null) {
            mahasiswaList.remove(mahasiswaToRemove);
            mahasiswaView.tampilkanPesan("Mahasiswa berhasil dihapus.");
        } else {
            mahasiswaView.tampilkanPesan("Mahasiswa tidak ditemukan.");
        }
    }
}
