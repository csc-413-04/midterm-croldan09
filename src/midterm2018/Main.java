package midterm2018;
import java.util.*;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Main{
    static Map<String, String> parameters = new HashMap<>();

    public static void main(String[] args) {
        String question1and2 = "GET /add?a=3&b=4 HTTP/1.1\n"
            + "Host: localhost:1298\n"
            + "Connection: keep-alive\n"
            + "User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.106 Safari/537.36\n"
            + "Accept: image/webp,image/apng,image/*,*/*;q=0.8\n"
            + "Referer: http://localhost:1298/\n"
            + "Accept-Encoding: gzip, deflate, br\n"
            + "Accept-Language: en-US,en;q=0.9,es;q=0.8\n";

        String question3 = "{\n"
            + "    “task” : “inc”,\n"
            + "    “num” : 3\n"
            + "}\n";

        String question4and5 = "To opt out, you’ll need to enter the Settings menu by clicking the three vertical dots, all the way in the upper right corner of the browser. From there, you’ll need to enter the Advanced settings at the very bottom and find the “Allow Chrome sign in” toggle, then turn it to off. Doing so lets you sign into Google services like Gmail and Maps without signing into the Chrome browser itself.";


        System.out.println(question1and2);
        System.out.println(question3);
        System.out.println(question4and5);

        // print each answer at the end


        String[] temp = question1and2.split("\n");
        String endPoint;

        for(int i =0 ; i <temp.length-1; i++){
            if (temp[i].indexOf("?") == -1) {
            }
            else
            {
                    int endpointIndex = temp[i].indexOf("?");
                    endPoint = temp[i].substring(endpointIndex+1, temp[i].lastIndexOf(" ")); // string endpoint  "a=3&a=4
                    System.out.println(endPoint);
                    String parametersStr = temp[i].substring(endpointIndex + 1);
                    String[] parametersArr = endPoint.split("&");
                    //for (String parameter : parametersArr) {
                        String[] pari = endPoint.split("=");
                        String key = pari[0];
                        String value = pari[1];
                        parameters.put(key, value);
                        System.out.println(key);
                        System.out.println(value);
                    }
                }

        // Question 1
        // Return the Host
        System.out.println(temp[1]);

        // Question 2
        // return sum of a and b

        // Question 3
        // convert to java object, increment num, convert back to json and return
        Gson gson = new Gson();
        gson.toJson(question3);

        // Question 4
        // return unique words

        // Question 5
        // return 2nd most common word
    }

}
