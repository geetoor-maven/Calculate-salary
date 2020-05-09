
package Tugas3;

public class Gaji_pegawai {
    
    private String nama;
    private String golongan;
    private int jamkerja;
    private  int jamkerjanormal = 48;
    private int upahjamkerja;
    private int jamlembur;
    private double upahlembur;
    private double totalgajilembur;
    private double totallembur;
    private double gajipokok;
    private double totalgaji;
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGolongan() {
        return golongan;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }

    public int getJamkerja() {
        return jamkerja;
    }

    public void setJamkerja(int jamkerja) {
        this.jamkerja = jamkerja;
    }
    
    public int getUpahjamkerja(){
        return this.upahjamkerja;
    }
    
    public int getJamlembur(){
        return this.jamlembur;
    }
    
    public double getUpahlembur(){
        return this.upahlembur;
    }
    
    public double getTotallembur(){
        return this.totallembur;
    }
    
    public double getTotalgajilembur(){
        return this.totalgajilembur;
    }
    
    public double getGajipokok(){
        return this.gajipokok;
    }
    
    public double getTotalgaji(){
        return this.totalgaji;
    }
    
    public void TentukanUpah(){
        switch(this.golongan){
            case "A":
                this.upahjamkerja = 5000;
                break;
            
            case "B":
                this.upahjamkerja = 6000;
                break;
                
            case "C":
                this.upahjamkerja = 7500;
                break;
                
            case "D":
                this.upahjamkerja = 9000;
                break;
        }
    }
    
    public void MenghitungGaji (){
        if(this.jamkerja > this.jamkerjanormal){
            this.upahjamkerja = this.upahjamkerja * this.jamkerjanormal;
            this.jamlembur = this.jamkerja - this.jamkerjanormal;
            this.upahlembur = this.upahjamkerja * 0.15 ;
            this.totalgajilembur = this.upahjamkerja * this.upahlembur;
            this.totallembur = this.totalgajilembur * this.jamlembur;
            this.gajipokok = this.upahjamkerja + this.jamkerjanormal;
            this.totalgaji = this.gajipokok;
        }else{
            this.gajipokok = this.upahjamkerja * this.jamkerjanormal;
            this.totalgaji = this.gajipokok;
        }
    }
    
}
