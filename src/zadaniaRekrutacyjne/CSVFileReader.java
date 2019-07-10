package zadaniaRekrutacyjne;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVFileReader {

    public static void main(String[] args) {

        List<Information> information = readInformationFromCSVFile("C:\\Users\\llis\\Desktop\\MOJE\\JAVA_SZKOLENIE\\SZKOLENIE\\New folder\\AGD_COMPLEX\\AGD_COMPLEX.csv");

        for (Information i : information) {
            System.out.println(i);
        }

    }

    /** readInformationFromCSVFile method is for reading data from CSV file and return it as table */
    public static List<Information> readInformationFromCSVFile(String fileName) {

        List<Information> information = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);




        try(BufferedReader bufferReader = Files.newBufferedReader(pathToFile, StandardCharsets.ISO_8859_1)){


            String headerline = bufferReader.readLine();

            String line = null;

            do {
                line = bufferReader.readLine();
                System.out.println(line);

                if (line == null) {
                    break;
                }
                String[] attributes = line.split(",");

                try {
                    Information info = createInformation(attributes);
                    information.add(info);
                } catch (NumberFormatException nfe){
                    //information.add(null);
                    //nfe.printStackTrace();

                }

                //Information info = createInformation(attributes);

                //information.add(info);
            }
            while (line == null);

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return information;

    }

    private static Information createInformation(String[] metadata){
        int year = Integer.parseInt(metadata[0]);
        int quorter = Integer.parseInt(metadata[1]);
        int month = Integer.parseInt(metadata[2]);
        int week = Integer.parseInt(metadata[3]);
        int dayOfWeek = Integer.parseInt(metadata[4]);
        int day = Integer.parseInt(metadata[5]);
        String date = metadata[6];
        String holliday = metadata[7];
        int productId = Integer.parseInt(metadata[8]);
        String code = metadata[9];
        String producer = metadata[10];
        String manufacrutingGroup = metadata[11];
        String category = metadata[12];
        String city = metadata[13];
        String providence = metadata[14];
        String region = metadata[15];
        String potential = metadata[16];
        String payment = metadata[17];
        String channel = metadata[18];
        int amount = Integer.parseInt(metadata[19]);
        double price = Double.valueOf(metadata[20]);
        double sellPrice = Double.valueOf(metadata[21]);
        double costZM = Double.valueOf(metadata[22]);
        double costST = Double.valueOf(metadata[23]);
        double margin = Double.valueOf(metadata[24]);
        double promotion = Double.valueOf(metadata[25]);
        int county = Integer.parseInt(metadata[26]);
        int provinceNumber = Integer.parseInt(metadata[27]);

        return new Information(year, quorter, month, week, dayOfWeek, day, date, holliday, productId, code, producer,
                manufacrutingGroup, category, city, providence, region, potential, payment, channel,
                amount, price, sellPrice, costZM, costST, margin, promotion, county, provinceNumber);
    }

}

/** Information class is a schema based on which we will created object for each record */
class Information {

    private int year;
    private int quorter;
    private int month;
    private int week;
    private int dayOfWeek;
    private int day;
    private String date;
    private String holliday;
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


    /** Information constructior for Information class */
    public Information(int year, int quorter, int month, int week, int dayOfWeek, int day, String date, String holliday, int productId, String code, String producer,
                       String manufacrutingGroup, String category, String city, String providence, String region, String potential, String payment, String channel,
                       int amount, double price, double sellPrice, double costZM, double costST, double margin, double promotion, int county, int provinceNumber) {

        this.year = year;
        this.quorter = quorter;
        this.month = month;
        this.week = week;
        this.dayOfWeek = dayOfWeek;
        this.day = day;
        this.date = date;
        this.holliday = holliday;
        this.productId = productId;
        this.code = code;
        this.producer = producer;
        this.manufacrutingGroup = manufacrutingGroup;
        this.category = category;
        this.city = city;
        this.providence = providence;
        this.region = region;
        this.potential = potential;
        this.payment = payment;
        this.channel = channel;
        this.amount = amount;
        this.price = price;
        this.sellPrice = sellPrice;
        this.costZM = costZM;
        this.costST = costST;
        this.margin = margin;
        this.promotion = promotion;
        this.county = county;
        this.provinceNumber = provinceNumber;
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

    public String getHolliday() {
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

    public String getManufacrutingGroup() {
        return manufacrutingGroup;
    }

    public void setManufacrutingGroup() {
        this.manufacrutingGroup = manufacrutingGroup;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory() {
        this.category = category;
    }

    public String getCity() {
        return city;
    }

    public void setCity() {
        this.city = city;
    }

    public String getProvidence() {
        return providence;
    }

    public void setProvidence() {
        this.providence = providence;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion() {
        this.region = region;
    }

    public String getPotential() {
        return potential;
    }

    public void setPotential() {
        this.potential = potential;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment() {
        this.payment = payment;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel() {
        this.channel = channel;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount() {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice() {
        this.price = price;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice() {
        this.sellPrice = sellPrice;
    }

    public double getCostZM() {
        return costZM;
    }

    public void setCostZM() {
        this.costZM = costZM;
    }

    public double getCostST() {
        return costST;
    }

    public void setCostST() {
        this.costST = costST;
    }

    public double getMargin() {
        return margin;
    }

    public void setMargin() {
        this.margin = margin;
    }

    public double getPromotion() {
        return promotion;
    }

    public void setPromotion() {
        this.promotion = promotion;
    }

    public int getCounty() {
        return county;
    }

    public void setCounty() {
        this.county = county;
    }

    public int getProvinceNumber() {
        return provinceNumber;
    }

    public void setProvinceNumber() {
        this.provinceNumber = provinceNumber;
    }

    /** returnRecord method is used to just display records readed from csv file */
    public String returnRecord() {
        return year + "; " + quorter + "; " + month + "; " + week + "; " + dayOfWeek + "; " + day + "; "
                + date + "; " + holliday + "; " + productId + "; " + code + "; " + producer + "; "
                + manufacrutingGroup + "; " + category + "; " + city + "; " + providence + "; "
                + region + "; " + potential + "; " + payment + "; " + channel + "; " + amount + "; "
                + price + "; " + sellPrice + "; " + costZM + "; " + costST + "; " + margin + "; "
                + promotion + "; " + county + "; " + provinceNumber;
    }

}


