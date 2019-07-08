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
        }

        public int getYear() {
            return year;
        }

        public void setYear() {
            this.year = year;
        }

        public int getQuorter() {
            return quorter;
        }

        public void setQuorter() {
            this.quorter = quorter;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth() {
            this.month = month;
        }

        public int getWeek() {
            return week;
        }

        public void setWeek() {
            this.week = week;
        }

        public int getDayOfWeek() {
            return dayOfWeek;
        }

        public void setDayOfWeek() {
            this.dayOfWeek = dayOfWeek;
        }

        public int getDay() {
            return day;
        }

        public void setDay() {
            this.day = day;
        }

        public String getDate() {
            return date;
        }

        public void setDate() {
            this.date = date;
        }

        public char getHolliday() {
            return holliday;
        }

        public void setHolliday() {
            this.holliday = holliday;
        }

        public int getProductId() {
            return productId;
        }

        public void setProductId() {
            this.productId = productId;
        }

        public String getCode() {
            return code;
        }

        public void setCode() {
            this.code = code;
        }

        public String getProducer() {
            return producer;
        }

        public void setProducer() {
            this.producer = producer;
        }



    }

}
