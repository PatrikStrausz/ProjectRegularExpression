package sk.itsovy.strausz.projectregularexpression;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import sk.itsovy.data.DataIP;
import sk.itsovy.data.PersonalID;
import sk.itsovy.data.MacAddress;
import sk.itsovy.data.Date;

public class Regex {


    public void getIp() {
        DataIP dataIP = new DataIP();
        ArrayList<String> lines = new ArrayList<>(dataIP.get());
        System.out.println(lines);
        String pattern = "^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";
        int count =0;
        Pattern r = Pattern.compile(pattern);

        System.out.println("Correct ip addresses: ");
        for (int i = 0; i < lines.size(); i++) {

            if (lines.get(i) != null) {
                Matcher m = r.matcher(lines.get(i));

                while (m.find()) {

                    System.out.println(m.group());
                    count++;

                }
            }

        }
        System.out.println("Total count: "+count);
    }

    public void getPersonalId() {

        PersonalID personalID = new PersonalID();
        ArrayList<String> lines = new ArrayList<>(personalID.get());
        System.out.println();
        System.out.println(lines);
        String pattern = "^[0-9]{2}[0156][0-9]{3}/?[0-9]{3,4}$";
        Pattern r = Pattern.compile(pattern);
        int count =0;
        System.out.println("Correct ID: ");
        for (int i = 0; i < lines.size(); i++) {

            if (lines.get(i) != null) {
                Matcher m = r.matcher(lines.get(i));

                while (m.find()) {

                    System.out.println(m.group());

count++;
                }

            }

        }
        System.out.println("Total count: "+count);
    }

    public void getMacAddress() {

        MacAddress macAddress = new MacAddress();
        ArrayList<String> lines = new ArrayList<>(macAddress.get());
        System.out.println();
        System.out.println(lines);
        String pattern = "^([0-9 A-F a-f]{2}:){5}([0-9 A-F a-f]{2})$";
        Pattern r = Pattern.compile(pattern);
        int count =0;
        System.out.println("Correct Mac addresses: ");
        for (int i = 0; i < lines.size(); i++) {

            if (lines.get(i) != null) {
                Matcher m = r.matcher(lines.get(i));

                while (m.find()) {

                    System.out.println(m.group());
                    count++;

                }
            }

        }
        System.out.println("Total count: "+count);
    }

    public void getDate() {
        Date date = new Date();

        ArrayList<String> lines = new ArrayList<>(date.get());
        System.out.println();
        System.out.println(lines);
        Pattern p = Pattern.compile("^((([1-9]|[12][0-9]|3[0-1])\\.(1|3|5|7|8|10|12))|(([1-9]|[12][0-9]|30)\\.(4|6|9|11))" +
                "|(([1-9]|[12][0-9])\\.2))\\.(19|20)[0-9]{2}$");
        int count =0;
        System.out.println("Correct dates:");
        for (int i = 0; i < lines.size(); i++) {

            if (lines.get(i) != null) {
                Matcher m = p.matcher(lines.get(i));

                while (m.find()) {
                    System.out.println(m.group());
                    count++;
                }
            }

        }
        System.out.println("Total count: "+count);
    }
}

