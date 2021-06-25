package tugas.crud;

import java.io.IOException;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        try {
            // Double
            double diskon = 0;
            double total = 0;
            double harga[] = new double[100];
            double sub_total[] = new double[100];
            double tot_sementara[] = new double[100];
            double total_diskon[] = new double[100];
            double diskon_jumlah[] = new double[100];

            // int
            int bayar;
            int type;
            int jumlah[] = new int[100];
            int x = 0;

            // String
            String jenis_menu[] = new String[100];
            String nama_product[] = new String[100];
            String bonus[] = new String[100];
            String isLanjut;
            String ukuran[] = new String[100];

            do {
                clearScreen();
                System.out.println("============================");
                System.out.println("Selamat Datang di Toko Kami");
                System.out.println("============================");
                boolean isSalah = false;
                do {
                    System.out.println("1.Makanan");
                    System.out.println("2.Minuman");
                    System.out.print("Pilih [ 1 - 2 ] : ");
                    type = input.nextInt();

                    if (type == 1) {
                        clearScreen();
                        System.out.println("===============");
                        System.out.println("--Makanan--");
                        System.out.println("===============");
                        isSalah = false;
                        do {
                            System.out.println("1.PopCorn");
                            System.out.println("2.Bola Ubi");
                            System.out.print("Pilih [ 1 - 2 ]");
                            type = input.nextInt();
                            if (type == 1) {
                                isSalah = false;
                                System.out.println(" Nama Makanan : PopCorn");
                                jenis_menu[x] = "Makanan";
                                nama_product[x] = "PopCorn";
                                harga[x] = 5000;
                                System.out.print("Pesan Berapa : ");
                                jumlah[x] = input.nextInt();
                                if (jumlah[x] >= 3) {
                                    bonus[x] = "Boba";
                                    sub_total[x] = jumlah[x] * harga[x];
                                    diskon_jumlah[x] = 0.2;
                                    total_diskon[x] = sub_total[x] * diskon_jumlah[x];
                                    tot_sementara[x] = sub_total[x] - total_diskon[x];
                                } else {
                                    bonus[x] = "Tidak Ada";
                                    sub_total[x] = jumlah[x] * harga[x];
                                    diskon_jumlah[x] = 0;
                                    total_diskon[x] = sub_total[x] * diskon_jumlah[x];
                                    tot_sementara[x] = sub_total[x] - total_diskon[x];
                                }
                            } else if (type == 2) {
                                isSalah = false;
                                System.out.println("Nama Makanan : Bola Ubi");
                                jenis_menu[x] = "Makanan";
                                nama_product[x] = "Bola Ubi";
                                harga[x] = 2000;
                                System.out.print("Pesan Berapa : ");
                                jumlah[x] = input.nextInt();
                                if (jumlah[x] >= 2) {
                                    bonus[x] = "Thai Tea";
                                    sub_total[x] = jumlah[x] * harga[x];
                                    diskon_jumlah[x] = 0.3;
                                    total_diskon[x] = sub_total[x] * diskon_jumlah[x];
                                    tot_sementara[x] = sub_total[x] - total_diskon[x];
                                } else {
                                    bonus[x] = "Tidak Ada";
                                    sub_total[x] = jumlah[x] * harga[x];
                                    diskon_jumlah[x] = 0.1;
                                    total_diskon[x] = sub_total[x] * diskon_jumlah[x];
                                    tot_sementara[x] = sub_total[x] - total_diskon[x];
                                }
                            } else {
                                isSalah = true;
                                clearScreen();
                                System.out.println("===============");
                                System.out.println("--Makanan--");
                                System.out.println("===============");
                            }
                        } while (isSalah);

                    } else if (type == 2) {
                        isSalah = false;
                        clearScreen();
                        System.out.println("===============");
                        System.out.println("--Minuman--");
                        System.out.println("===============");
                        boolean isSalah2 = false;
                        do {
                            System.out.println("1.Boba");
                            System.out.println("2.Thai Tea");
                            System.out.print("Pilih [ 1 - 2 ]");
                            type = input.nextInt();
                            if (type == 1) {
                                isSalah2 = false;
                                jenis_menu[x] = "Minuman";
                                nama_product[x] = "Boba";
                                boolean isSize = false;
                                do {
                                    System.out.println("==========");
                                    System.out.println("Ukuran");
                                    System.out.println("1.Large");
                                    System.out.println("2.Medium");
                                    System.out.println("3.Small");
                                    System.out.println("==========");
                                    System.out.print("Pilih [ 1 / 2 / 3 ]");
                                    type = input.nextInt();
                                    if (type == 1) {
                                        isSize = false;
                                        ukuran[x] = "Large";
                                        harga[x] = 20000;
                                    } else if (type == 2) {
                                        isSize = false;
                                        ukuran[x] = "Medium";
                                        harga[x] = 15000;
                                    } else if (type == 3) {
                                        isSize = false;
                                        ukuran[x] = "Small";
                                        harga[x] = 10000;
                                    } else {
                                        isSize = true;
                                        clearScreen();
                                    }
                                } while (isSize);
                                System.out.print("Pesan Berapa : ");
                                jumlah[x] = input.nextInt();
                                if (jumlah[x] >= 3) {
                                    bonus[x] = "PopCorn";
                                    sub_total[x] = jumlah[x] * harga[x];
                                    diskon_jumlah[x] = 0.3;
                                    total_diskon[x] = sub_total[x] * diskon_jumlah[x];
                                    tot_sementara[x] = sub_total[x] - total_diskon[x];
                                } else {
                                    bonus[x] = "Tidak Ada";
                                    sub_total[x] = jumlah[x] * harga[x];
                                    diskon_jumlah[x] = 0;
                                    total_diskon[x] = sub_total[x] * diskon_jumlah[x];
                                    tot_sementara[x] = sub_total[x] - total_diskon[x];
                                }
                            } else if (type == 2) {
                                jenis_menu[x] = "Minuman";
                                nama_product[x] = "Thai Tea";
                                boolean isSize = false;
                                do {
                                    System.out.println("==========");
                                    System.out.println("Ukuran");
                                    System.out.println("1.Large");
                                    System.out.println("2.Medium");
                                    System.out.println("3.Small");
                                    System.out.println("==========");
                                    System.out.print("Pilih [ 1 / 2 / 3 ]");
                                    type = input.nextInt();
                                    if (type == 1) {
                                        isSize = false;
                                        ukuran[x] = "Large";
                                        harga[x] = 15000;
                                    } else if (type == 2) {
                                        isSize = false;
                                        ukuran[x] = "Medium";
                                        harga[x] = 10000;
                                    } else if (type == 3) {
                                        isSize = false;
                                        ukuran[x] = "Small";
                                        harga[x] = 5000;
                                    } else {
                                        isSize = true;
                                        clearScreen();
                                    }
                                } while (isSize);
                                System.out.print("Pesan Berapa : ");
                                jumlah[x] = input.nextInt();
                                if (jumlah[x] >= 3) {
                                    bonus[x] = "Bola Ubi";
                                    sub_total[x] = jumlah[x] * harga[x];
                                    diskon_jumlah[x] = 0.5;
                                    total_diskon[x] = sub_total[x] * diskon_jumlah[x];
                                    tot_sementara[x] = sub_total[x] - total_diskon[x];
                                } else {
                                    bonus[x] = "Tidak Ada";
                                    sub_total[x] = jumlah[x] * harga[x];
                                    diskon_jumlah[x] = 0;
                                    total_diskon[x] = sub_total[x] * diskon_jumlah[x];
                                    tot_sementara[x] = sub_total[x] - total_diskon[x];
                                }
                            } else {
                                isSalah2 = true;
                                clearScreen();
                                System.out.println("===============");
                                System.out.println("--Minuman--");
                                System.out.println("===============");
                            }
                        } while (isSalah2);
                    } else {
                        isSalah = true;
                        clearScreen();
                        System.out.println("============================");
                        System.out.println("Selamat Datang di Toko Kami");
                        System.out.println("============================");
                    }
                } while (isSalah);
                x++;
                System.out.print("Mau Beli Lagi [ Y / N ] : ");
                isLanjut = input.next();
            } while (isLanjut.equalsIgnoreCase("y"));

            clearScreen();

            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy");

            String formattedDate = myDateObj.format(myFormatObj);
            System.out.println("\nWaktu Transaksi: " + formattedDate);

            for (int i = 0; i < x; i++) {
                System.out.println("\n================================");
                System.out.println("Jenis : " + jenis_menu[i]);
                System.out.println("Nama Product : " + nama_product[i]);
                System.out.println("Bonus : " + bonus[i]);
                System.out.println("Harga : " + harga[i]);
                if (ukuran[i] != null) {
                    System.out.println("Ukuran : " + ukuran[i]);
                }
                System.out.println("Jumlah Barang : " + jumlah[i]);
                System.out.println("Jumlah Harga : " + sub_total[i]);
                System.out.println("Diskon : " + total_diskon[i]);
                System.out.println("Total Sementara : " + tot_sementara[i]);
                System.out.println("================================\n");

                diskon += total_diskon[i];
                total += tot_sementara[i];
            }

            // Proccess
            System.out.println("Total Harga Diskon : " + diskon);
            System.out.println("Total : " + total);

            boolean isTrue = false;

            do {
                System.out.println("\n====================");
                System.out.println("1.Debit");
                System.out.println("2.Cash");
                System.out.println("====================");

                System.out.print("Pilih Metode : ");
                int type2;
                type2 = input.nextInt();
                if (type2 == 1) {
                    clearScreen();
                    isTrue = false;
                    boolean isTrue1 = false;
                    do {
                        System.out.println("\n====================");
                        System.out.println("Debit");
                        System.out.println("====================");

                        System.out.println("\nWaktu Transaksi: " + formattedDate);
                        System.out.println("Total : " + total);
                        System.out.print("Bayar : ");
                        bayar = input.nextInt();

                        if (bayar - total == 0) {
                            isTrue1 = false;
                            System.out.println("Sukses , Datang Kembali");
                            break;
                        } else {
                            isTrue1 = true;
                            clearScreen();
                            System.out.println("Masukan Dengan Benar");
                            System.out.println("Total : " + total);
                        }
                    } while (isTrue1 == true);

                } else if (type2 == 2) {
                    clearScreen();
                    isTrue = false;
                    boolean isTrue2 = false;
                    do {
                        System.out.println("\n====================");
                        System.out.println("Cash");
                        System.out.println("====================\n");
                        System.out.println("\nWaktu Transaksi: " + formattedDate);
                        System.out.println("Total : " + total);
                        System.out.print("Bayar : ");
                        bayar = input.nextInt();
                        if (bayar >= total) {
                            isTrue2 = false;
                            if (bayar - total == 0) {
                                System.out.println("Sukses ,Selamat Datang Kembali");
                                break;
                            } else if (bayar - total != 0) {
                                double kembalian;
                                kembalian = bayar - total;
                                System.out.println("Kembalian : " + kembalian);
                                System.out.println("Selamat Datang Kembali");
                                break;
                            }
                        } else {
                            isTrue2 = true;
                            clearScreen();
                        }

                    } while (isTrue2 == true);
                } else {
                    isTrue = true;
                    clearScreen();
                }
            } while (isTrue == true);

        } finally {
            input.close();
        }
    }

    private static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch (Exception ex) {
            System.err.println("tidak bisa clear screen");
        }
    }
}