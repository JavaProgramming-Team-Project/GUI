package api;

import entity.Item;
import entity.Member;
import ip.Host;
import login.LoginMember;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class ItemApi {
    private final static String HOST = Host.getHost();

    /**
     * 카테고리 별 상품 리스트
     * @param category String형 카테고리
     * @return 해당 카테고리의 상품 리스트
     */
    public static List<Item> itemListByCategory(String category) {

        List<Item> result = new ArrayList<>();
        try {
            String hostUrl = HOST + "/item/category/"+ URLEncoder.encode(category, StandardCharsets.UTF_8);
            HttpURLConnection conn = null;

            URL url = new URL(hostUrl);
            conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("GET");
            conn.setConnectTimeout(3000);
            conn.setRequestProperty("Accept", "application/json; utf-8");

            int responseCode = conn.getResponseCode();

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuffer response = new StringBuffer();
            String inputLine;

            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine);
            }
            br.close();

            JSONParser jp = new JSONParser();
            JSONArray jsonArray = (JSONArray) jp.parse(response.toString());

            System.out.println(responseCode);

            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject data = (JSONObject) jsonArray.get(i);

                result.add(new Item((String) data.get("itemName"), (String) data.get("itemBody"), Integer.parseInt(String.valueOf(data.get("itemPrice"))), (String) data.get("itemAddress")
                        , (String) data.get("itemCategory"), (String) data.get("itemPhone"), (String) data.get("itemImage")));
            }

        } catch (ProtocolException e) {
            throw new RuntimeException(e);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}