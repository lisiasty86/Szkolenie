package zadaniaRekrutacyjne;

public class CSVFileReader {

    public static void main(String[] args) {



    }

    class Information {

        private int year;
        private int quorter;
        private int month;
        private int week;
        private int dayOfWeek;
        private int day;
        private String date;
        private char holliday;
        private int productId;
        private String code;
        private String producer;
        private String manufacrutingGroup;
        private String category;
        private String city;
        private String providence;
        private String region;
        private String potential;
        private String payment;
        private String channel;
        private int amount;
        private double price;
        private double sellPrice;
        private double costZM;
        private double costST;
        private double margin;
        private double promotion;
        private int county;
        private int provinceNumber;

        public Information (int year, int quorter, int month, int week, int dayOfWeek, int day, String date, char holliday, int productId, String code, String producer,
                            String manufacrutingGroup, String category, String city, String providence, String region, String potential, String payment, String channel,
                            int amount, double price, double sellPrice, double costZM, double costST, double margin, double promotion, int county, int provinceNumber) {
            this.year = year;
        }

        public int getYear() {
            return year;
        }

        public void setYear() {
            this.year = year;
        }


    }

}
