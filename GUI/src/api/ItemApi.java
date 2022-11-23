package api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import entity.Item;
import ip.Host;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class ItemApi {

    private final static String HOST = Host.getHost();
    private static ObjectMapper mapper = new ObjectMapper();

    /** ---------------------------------------------------------------------------------------------------
     * 카테고리 별 상품 리스트
     * @param itemCategory String형 카테고리
     * @return 해당 카테고리의 상품 리스트
     */
    public static List<Item> itemListByCategory(String itemCategory) {

        List<Item> list;
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

            list = mapper.readValue(response.toString(), new TypeReference<List<Item>>() {});

        } catch (ProtocolException e) {
            throw new RuntimeException(e);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    /** ---------------------------------------------------------------------------------------------------
     * 검색어가 이름에 포함된 item 리스트 검색
     * @param itemName String 형 itemName
     * @return 검색어가 이름에 포함된 Item 객체들의 리스트
     */
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

            list = mapper.readValue(response.toString(), new TypeReference<>() {
            });

        } catch (ProtocolException e) {
            throw new RuntimeException(e);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    /** ---------------------------------------------------------------------------------------------------
     * primaryKey로 item 검색
     * @param itemKey Long형 item key
     * @return itemKey값이 primaryKey 값인 item
     */
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

            item = mapper.readValue(response.toString(), new TypeReference<>() {});


        } catch (ProtocolException e) {
            throw new RuntimeException(e);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return item;
    }
}