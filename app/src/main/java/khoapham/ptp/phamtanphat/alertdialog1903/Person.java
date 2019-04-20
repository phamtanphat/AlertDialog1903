package khoapham.ptp.phamtanphat.alertdialog1903;

public class Person {
    private String ten;
    private String tuoi;
    static String a = "10";

    private Person(Builder builder) {
        this.ten = builder.ten;
        this.tuoi = builder.tuoi;
    }

    static class Builder{
        public String ten;
        public String tuoi;


        public String getTen() {
            return ten;
        }

        public Builder setTen(String ten) {
            this.ten = ten;
            return this;
        }

        public String getTuoi() {
            return tuoi;
        }

        public Builder setTuoi(String tuoi) {
            this.tuoi = tuoi;
            return this;
        }
        public Builder create(){
            return new Builder();
        }
    }
}
