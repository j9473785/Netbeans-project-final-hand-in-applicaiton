
package NmapTutor;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;




public class API  {

    public static void main(String[] args) {

        
     
         

        try {
            
            URL url = new URL("https://cve.circl.lu/api/cve/CVE-1999-0351");
            
           // https://cve.circl.lu/api/browse/microsoft
           
       
           
 
            HttpURLConnection connapi = (HttpURLConnection) url.openConnection();
            connapi.setRequestMethod("GET");
            connapi.connect();

            //Check if connect is made
            int responseCode = connapi.getResponseCode();

            // 200 OK
            if (responseCode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responseCode);
            } else {

                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext()) {
                    informationString.append(scanner.nextLine());
                }
                //Close the scanner
                scanner.close();

                System.out.println(informationString);


               

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}