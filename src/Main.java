public class Main {
    public static void main(String[] args) {
        mahasiswaController MahasiswaController = new mahasiswaController();
        mahasiswaView MahasiswaView = new mahasiswaView();

        MahasiswaController.tambahMahasiswa();
        MahasiswaController.tambahMahasiswa();

        MahasiswaController.tampilkanMahasiswa();

        MahasiswaView.tampilkanPesan("Masukkan ID mahasiswa untuk ditampilkan detail:");
        int idToDisplay = MahasiswaController.getInputId();
        MahasiswaController.tampilkanDetailMahasiswa(idToDisplay);

        MahasiswaView.tampilkanPesan("Masukkan ID mahasiswa untuk dihapus:");
        int idToDelete = MahasiswaController.getInputId();
        MahasiswaController.hapusMahasiswa(idToDelete);

        MahasiswaController.tampilkanMahasiswa();
    }
}