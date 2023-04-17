public class bai2 {
    private int dungTich;
    private double triGia;
    private String chuXe,moTa;
 
    public bai2( int dungTich, double triGia, String chuXe, String moTa) {
        this.dungTich = dungTich;
        this.triGia = triGia;
        this.chuXe = chuXe;
        this.moTa = moTa;
    }
    public bai2(){
 
    }

    public int getDungTich() {
        return dungTich;
    }
 
    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }
 
    public double getTriGia() {
        return triGia;
    }
 
    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }
 
    public String getChuXe() {
        return chuXe;
    }
 
    public void setChuXe(String chuXe) {
        this.chuXe = chuXe;
    }
 
    public String getMoTa() {
        return moTa;
    }
 
    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
 
    public double tinhThue(){
        double thue;
        if(dungTich<100) thue=triGia*0.01;
        else if (dungTich >= 100 && dungTich<=200) thue = triGia * 0.03;
        else thue = triGia * 0.05;
        return thue;
    }
 
    @Override
    public String toString() {
        return chuXe + "-"+dungTich + "-"+triGia + "-"+moTa;
}
 
    void inThue(){
        System.out.printf("%5s %10s %15s %20s %22s \n" , chuXe ,dungTich,triGia,moTa,tinhThue());
    }
}