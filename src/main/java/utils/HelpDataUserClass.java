package utils;


import com.google.gson.Gson;
import com.sun.source.tree.WhileLoopTree;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class HelpDataUserClass {
    static String urlAPI = "https://random-data-api.com/api/v2/users";

    public HelpDataUserClass(){


    }

    public static UserClass getUser () throws Exception {

        try {
            URL newUrl = new URL(urlAPI);
            HttpsURLConnection connection = (HttpsURLConnection) newUrl.openConnection();
            if(connection.getResponseCode() != 200)
                throw new RuntimeException("HTTPS error code: " + connection.getResponseCode());
            BufferedReader response = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String jsonString = convertJsoninString(response);
            Gson gson = new Gson();
            UserClass usuario = gson.fromJson(jsonString, UserClass.class);
            return usuario;
        }  catch (Exception e){
            throw new Exception ("Error: " + e);
        }
    }

    private static String convertJsoninString(BufferedReader response) throws IOException {
        String resposta, jsonString = "";
        while((resposta = response.readLine()) != null){
            jsonString += resposta;
        }

        return jsonString;
    }


}
