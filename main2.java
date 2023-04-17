import java.util.Scanner;
public class main2 {
    static Scanner sc = new Scanner(System.in);

    static void nhapXe(bai2 xe){
            sc.nextLine();
            System.out.print("Nhap ten chu xe : ");
            xe.setChuXe(sc.nextLine());
            System.out.print("Nhap dung tich : ");
            xe.setDungTich(sc.nextInt());
            System.out.print("Nhap tri gia : ");
            xe.setTriGia(sc.nextDouble());;sc.nextLine();
            System.out.print("Loai xe: ");
            xe.setMoTa(sc.nextLine());
        }
     
    public static void main(String[] args) {
        bai2 v[]= null;
        int a,n=0;
        boolean flag = true;
     
        do{
            System.out.println("Ban chon lam gi!!!");
            System.out.println("1.Tao cac doi tuong xe va nhap thong tin \n"+
                    "2.Xuat bang ke khai tinh thue cac loai xe.\n"+
                    "Nhap so khac de thoat");
            a =sc.nextInt();
            switch (a){
                case 1:
                    System.out.print("Nhap so luong xe ban muon khai bao thue: ");
                    n=sc.nextInt();
                  
                    v= new bai2[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Xe thu " + (i+1));
                        v[i] = new bai2();
                        nhapXe(v[i]);
                    }
                    break;
                case 2:
                    System.out.printf("%5s %10s %15s %20s %22s \n","Chu xe","Dung tich","Tri gia","mo ta","Thue");
                    for (int i = 0; i < n; i++) {
                        v[i].inThue();
                    }
                    break;
                default:
                    System.out.println("bye");
                    flag=false;
                    break;
            }
        }while (flag);
    }
}