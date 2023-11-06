package singleton;

import Adapter.Converter;
import Adapter.ConverterAdapter;
import Decorator.BIGroupDecorator;
import Decorator.BazisADecorator;
import Decorator.GEDGDecorator;
import Decorator.IApartment;
import Factoryv2.*;
import Observer.EmailMsgObserver;
import Observer.PropertyAgency;
import strategy.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class CLIrunner {
    private static volatile CLIrunner instance;

    static IApartment tempApartment;
    private static Buyer buyer = new Buyer();
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private CLIrunner() {}

    public static CLIrunner getInstance() {
        CLIrunner result = instance;
        if (result == null) {
            synchronized (CLIrunner.class) {
                result = instance;
                if (result == null) {
                    instance = result = new CLIrunner();
                }
            }
        }
        return result;
    }

    public static void clirunner(String[] args) throws IOException, SQLException {
        PropertyAgency agency = new PropertyAgency();

        EmailMsgObserver customer1 = new EmailMsgObserver("Alice@gmail.com", agency);

        agency.registerObserver(customer1);


        System.out.println("Please, select a district:" + "\n" +
                "1 - Esil" + "\n" +
                "2 - Nura" + "\n" +
                "3 - Almaty");
        String district = reader.readLine();

        if(district.equals("1")){
            DistrictFactory factory = new EsilDistFactory();
            IDistricts esilDistrict = factory.choose();
            esilDistrict.district();
        } else if (district.equals("2")) {
            DistrictFactory factory = new NuraDistFactory();
            IDistricts nuraDistrict = factory.choose();
            nuraDistrict.district();
        } else if (district.equals("3")) {
            DistrictFactory factory = new AlmatyDistFactory();
            IDistricts almatyDistrict = factory.choose();
            almatyDistrict.district();
        }


        System.out.println("Please, select a group:" + "\n" +
                "1 - BIGroup" + "\n" +
                "2 - BazisA" + "\n" +
                "3 - Global Expert Development Group");
        String group = reader.readLine();


        if (group.equals("1")) {
            tempApartment = new BIGroupDecorator(new BazisADecorator.Apartment(""));
            tempApartment.advantages("");
            System.out.println("Please, select a class:" + "\n" +
                    "1 - Econom" + "\n" +
                    "2 - Comfort" + "\n" +
                    "3 - Business");
            String selected = reader.readLine();
            if(selected.equals("1")){
                buyer.setArea(new EconomBIGroup());


            } else if (selected.equals("2")) {
                buyer.setArea(new ComfortBIGroup());
            }
            else if(selected.equals("3")){
                buyer.setArea(new BusinessBIGroup());

            }
        } else if (group.equals("2")) {
            tempApartment = new BazisADecorator(new BazisADecorator.Apartment(""));
            tempApartment.advantages("");
            System.out.println("Please, select a class:" + "\n" +
                    "1 - Econom" + "\n" +
                    "2 - Comfort" + "\n" +
                    "3 - Business");
            String selected = reader.readLine();
            if(selected.equals("1")){
                buyer.setArea(new EconomBazisA());

            } else if (selected.equals("2")) {
                buyer.setArea(new ComfortBazisA());

            }
            else if(selected.equals("3")){
                buyer.setArea(new BusinessBazisA());

            }
        } else if (group.equals("3")) {
            tempApartment = new GEDGDecorator(new BazisADecorator.Apartment(""));
            tempApartment.advantages("");
            System.out.println("Please, select a class:" + "\n" +
                    "1 - Econom" + "\n" +
                    "2 - Comfort" + "\n" +
                    "3 - Business");
            String selected = reader.readLine();
            if(selected.equals("1")){
                buyer.setArea(new EconomGEDG());

            } else if (selected.equals("2")) {
                buyer.setArea(new ComfortGEDG());

            }
            else if(selected.equals("3")){
                buyer.setArea(new BusinessGEDG());
            }
        }
        System.out.println("Select currency for display:" + "\n" +
                "1 - Dollar" + "\n" +
                "2 - Euro" + "\n" +
                "3 - Ruble");
        String currencyChoice = reader.readLine();
        double calculatedAmount = buyer.askingArea();

        Converter converter = null;
        String toCurrency = "";

        if (currencyChoice.equals("1")) {
            converter = new ConverterAdapter("Dollar");
            toCurrency = "Dollar";
        } else if (currencyChoice.equals("2")) {
            converter = new ConverterAdapter("Euro");
            toCurrency = "Euro";
        } else if (currencyChoice.equals("3")) {
            converter = new ConverterAdapter("Ruble");
            toCurrency = "Ruble";
        }

        if (converter != null) {
            double convertedAmount = converter.convert(calculatedAmount, "Tenge", toCurrency);
            agency.setNewsAgency("price of wanted apartment " + calculatedAmount);
            System.out.println("Amount in selected currency: " + convertedAmount);
        } else {
            System.out.println("Invalid currency choice");
        }

    }
}
