package sk.itsovy.strausz.projectregularexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import sk.itsovy.data.DataIP;

public class Regex {


    public void getIp() {
        DataIP dataIP = new DataIP();


        List<String> lines = new ArrayList<>();
        lines.addAll(dataIP.get());
        System.out.println(lines);

        String pattern = "^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";

        Pattern r = Pattern.compile(pattern, Pattern.MULTILINE);


        for (int i = 0; i < lines.size(); i++) {
            Matcher m = r.matcher(lines.toString());
            if (lines.get(i) != null)


                if (m.find()) {

                    System.out.println(m.group());


                }
        }

    }
}

