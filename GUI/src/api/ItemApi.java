package api;

import entity.Item;
import ip.Host;
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

    public static void main(String[] args) {
        List<Item> list = findItemByName("신라");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getItemName());
        }
    }

    private final static String HOST = Host.getHost();

    /**---------------------------------------------------------------------------------------------------
     * 카테고리 별 상품 리스트
     * @param itemCategory String형 카테고리
     * @return 해당 카테고리의 상품 리스트
     */
    public static List<Item> itemListByCategory(String itemCategory) {

        List<Item> list = new ArrayList<>();
        try {
            String hostUrl = HOST + "/item/category/"+ URLEncoder.encode(itemCategory, StandardCharsets.UTF_8);
            HttpURLConnection conn = null;

            URL url = new URL(hostUrl);
            conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("GET");
            conn.setConnectTimeout(3000);
            conn.setRequestProperty("Accept", "application/json; utf-8");

            int responseCode = conn.getResponseCode();
            if (responseCode == 400) {
                System.out.println("400 : 명령 실행 오류");
            } else if (responseCode == 500) {
                System.out.println("500 : 서버 에러");
            } else {
                System.out.println(responseCode + " : 응답 코드");
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuffer response = new StringBuffer();
            String inputLine;

            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine);
            }
            br.close();

            JSONParser jp = new JSONParser();
            JSONArray jsonArray = (JSONArray) jp.parse(response.toString());

            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject data = (JSONObject) jsonArray.get(i);

                list.add(new Item((Long) data.get("itemKey"), (String) data.get("itemName"), (String) data.get("itemBody"), Integer.parseInt(String.valueOf(data.get("itemPrice"))), (String) data.get("itemAddress")
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
        return list;
    }

    public static Item findItemByKey(Long itemKey) {
        Item item;

        try {
            String hostUrl = HOST + "/item/id/"+itemKey;
            HttpURLConnection conn = null;

            URL url = new URL(hostUrl);
            conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("GET");
            conn.setConnectTimeout(3000);
            conn.setRequestProperty("Accept", "application/json; utf-8");

            int responseCode = conn.getResponseCode();
            if (responseCode == 400) {
                System.out.println("400 : 명령 실행 오류");
            } else if (responseCode == 500) {
                System.out.println("500 : 서버 에러");
            } else {
                System.out.println(responseCode + " : 응답 코드");
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuffer response = new StringBuffer();
            String inputLine;

            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine);
            }
            br.close();

            JSONParser jp = new JSONParser();
            JSONObject data = (JSONObject) jp.parse(response.toString());

            item = new Item((Long) data.get("itemKey"), (String) data.get("itemName"), (String) data.get("itemBody"), Integer.parseInt(String.valueOf(data.get("itemPrice"))),
                    (String) data.get("itemAddress"), (String) data.get("itemCategory"), (String) data.get("itemPhone"), (String) data.get("itemImage"));

        } catch (ProtocolException e) {
            throw new RuntimeException(e);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return item;
    }

    public static List<Item> findItemByName(String itemName) {
        List<Item> list = new ArrayList<>();

        try {
            String hostUrl = HOST + "/item/name/"+URLEncoder.encode(itemName, StandardCharsets.UTF_8);
            HttpURLConnection conn = null;

            URL url = new URL(hostUrl);
            conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("GET");
            conn.setConnectTimeout(3000);
            conn.setRequestProperty("Accept", "application/json; utf-8");

            int responseCode = conn.getResponseCode();
            if (responseCode == 400) {
                System.out.println("400 : 명령 실행 오류");
            } else if (responseCode == 500) {
                System.out.println("500 : 서버 에러");
            } else {
                System.out.println(responseCode + " : 응답 코드");
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuffer response = new StringBuffer();
            String inputLine;

            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine);
            }
            br.close();

            JSONParser jp = new JSONParser();
            JSONArray jsonArray = (JSONArray) jp.parse(response.toString());

            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject data = (JSONObject) jsonArray.get(i);

                list.add(new Item((Long) data.get("itemKey"), (String) data.get("itemName"), (String) data.get("itemBody"), Integer.parseInt(String.valueOf(data.get("itemPrice"))), (String) data.get("itemAddress")
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
        return list;
    }
}
