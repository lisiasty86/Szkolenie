package zadaniaRekrutacyjne;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class CSVFileReader {

    public static void main(String[] args) {

        List<Information> information = readInformationFromCSVFile("C:\\Users\\llis\\Desktop\\MOJE\\JAVA_SZKOLENIE\\SZKOLENIE\\New folder\\AGD_COMPLEX\\AGD_COMPLEX.csv");

/*        for (Information i : information) {
            System.out.println(i);
        }*/

    }

    /** readInformationFromCSVFile method is for reading data from CSV file and return it as table */
    public static List<Information> readInformationFromCSVFile(String fileName) {

        List<Information> information = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);




        try(BufferedReader bufferReader = Files.newBufferedReader(pathToFile, Charset.forName("cp1250"))){


            String headerline = bufferReader.readLine();
            String line = null;

            do {
                line = bufferReader.readLine();
                System.out.println("Next line: " + line);

                if (line == null) {
                    break;
                }
                String[] attributes = line.split(",");
                String[] attributesAfterMySplit = new String[28];
                for (int i=0, j=0, k=0; i<attributes.length; i++, j++) {

                    if (attributes[i].startsWith("\"")) {

                        attributesAfterMySplit[j] = attributes[i]+"."+attributes[i+1];
                        attributesAfterMySplit[j] = attributesAfterMySplit[j].replaceAll("\"", "").replace(" zł", "").replace(" ", "");
                        i++;
                        k++;
                    } else {
                        //System.out.println(attributesAfterMySplit[i]);
                        attributesAfterMySplit[j] = attributes[i];
                    }
                    //System.out.println(k + ": " + line);
                }

                Information info = createInformation(attributesAfterMySplit);

                information.add(info);
            } while (line != null);

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return information;

    }

/*    public static String mySplit (String lineToSplit) {
        String stringTableAfterSplit;


        String x = "";
        return stringTableAfterSplit;
    }*/

    private static Information createInformation(String[] metadata){

        for (int i=0; i<metadata.length; i++) {
            if (metadata[i].equals("")) {
                metadata[i] = "0";
            }
        }
        
        Integer year = Integer.valueOf(metadata[0]);
        Integer quorter = Integer.valueOf(metadata[1]);
        Integer month = Integer.valueOf(metadata[2]);
        Integer week = Integer.valueOf(metadata[3]);
        Integer dayOfWeek = Integer.valueOf(metadata[4]);
        Integer day = Integer.valueOf(metadata[5]);
        String date = metadata[6];
        String holliday = metadata[7];
        Integer productId = Integer.valueOf(metadata[8]);
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
        Integer amount = parseInt(metadata[19]);
        Double price = parseDouble((metadata[20]));
        Double sellPrice = parseDouble(metadata[21]);
        Double costZM = parseDouble(metadata[22]);
        Double costST = parseDouble(metadata[23]);
        Double margin = parseDouble(metadata[24]);
        Double promotion = parseDouble(metadata[25]);
        Integer county = Integer.valueOf(metadata[26]);
        Integer provinceNumber = Integer.valueOf(metadata[27]);

        return new Information(year, quorter, month, week, dayOfWeek, day, date, holliday, productId, code, producer,
                manufacrutingGroup, category, city, providence, region, potential, payment, channel,
                amount, price, sellPrice, costZM, costST, margin, promotion, county, provinceNumber);


    }

    public static Integer parseInt (String metadata1) {
        Integer parseStringToInt;

        if (metadata1.equals("")) {
            parseStringToInt = null;
        } else {
            parseStringToInt = Integer.parseInt(metadata1);
        }


        return parseStringToInt;
    }

    public static Double parseDouble (String metadata1) {
        Double parseStringToDouble;

        if (metadata1.equals("")) {
            parseStringToDouble = null;
        } else {
            //metadata1 = metadata1.replace();
            if (metadata1.contains("%")) {
                metadata1 = metadata1.replace("%", "");
                //metadata1 = metadata1/100;
                parseStringToDouble = (Double.parseDouble(metadata1))/100;
            } else {
                parseStringToDouble = Double.parseDouble(metadata1);
            }
        }

        return parseStringToDouble;
    }

}

/** Information class is a schema based on which we will created object for each record */
class Information {

    private Integer year;
    private Integer quorter;
    private Integer month;
    private Integer week;
    private Integer dayOfWeek;
    private Integer day;
    private String date;
    private String holliday;
    private Integer productId;
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
    private Integer amount;
    private Double  price;
    private Double  sellPrice;
    private Double  costZM;
    private Double  costST;
    private Double  margin;
    private Double  promotion;
    private Integer county;
    private Integer provinceNumber;


    /** Information constructior for Information class */
    public Information(Integer year, Integer quorter, Integer month, Integer week, Integer dayOfWeek, Integer day, String date, String holliday, Integer productId, String code, String producer,
                       String manufacrutingGroup, String category, String city, String providence, String region, String potential, String payment, String channel,
                       Integer amount, Double  price, Double  sellPrice, Double  costZM, Double  costST, Double  margin, Double  promotion, Integer county, Integer provinceNumber) {

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

    public Integer getYear() {
        return year;
    }

    public void setYear() {
        this.year = year;
    }

    public Integer getQuorter() {
        return quorter;
    }

    public void setQuorter() {
        this.quorter = quorter;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth() {
        this.month = month;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek() {
        this.week = week;
    }

    public Integer getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek() {
        this.dayOfWeek = dayOfWeek;
    }

    public Integer getDay() {
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

    public Integer getProductId() {
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

    public Integer getAmount() {
        return amount;
    }

    public void setAmount() {
        this.amount = amount;
    }

    public Double  getPrice() {
        return price;
    }

    public void setPrice() {
        this.price = price;
    }

    public Double  getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice() {
        this.sellPrice = sellPrice;
    }

    public Double  getCostZM() {
        return costZM;
    }

    public void setCostZM() {
        this.costZM = costZM;
    }

    public Double  getCostST() {
        return costST;
    }

    public void setCostST() {
        this.costST = costST;
    }

    public Double  getMargin() {
        return margin;
    }

    public void setMargin() {
        this.margin = margin;
    }

    public Double  getPromotion() {
        return promotion;
    }

    public void setPromotion() {
        this.promotion = promotion;
    }

    public Integer getCounty() {
        return county;
    }

    public void setCounty() {
        this.county = county;
    }

    public Integer getProvinceNumber() {
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


