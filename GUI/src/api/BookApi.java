package api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import entity.Book;
import entity.Item;
import entity.Member;
import ip.Host;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class BookApi {

    private final static String HOST = Host.getHost();
    private static ObjectMapper mapper = new ObjectMapper();

    /** ---------------------------------------------------------------------------------------------------
     * 예약 추가
     * @param book 예약 정보 book
     */
    public static void booking(Book book) {
        try {
            String hostUrl = HOST + "/book";
            HttpURLConnection conn = null;

            URL url = new URL(hostUrl);
            conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("POST");
            conn.setConnectTimeout(3000);
            conn.setRequestProperty("Content-Type", "application/json; utf-8");

            conn.setDoOutput(true); //POST

            String jsonType = mapper.writeValueAsString(book);
            System.out.println(jsonType);

            OutputStream os = conn.getOutputStream();
            os.write(jsonType.getBytes(StandardCharsets.UTF_8));
            os.flush();

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String response = br.readLine();
            System.out.println("응답 메시지 : " + response);

            br.close();

            int responseCode = conn.getResponseCode();
            if (responseCode == 400) {
                System.out.println("400 : 명령 실행 오류");
            } else if (responseCode == 500) {
                System.out.println("500 : 서버 에러");
            } else {
                System.out.println(responseCode + " : 응답 코드");
            }

        } catch (ProtocolException e) {
            System.out.println("ProtocolException");
            throw new RuntimeException(e);
        } catch (MalformedURLException e) {
            System.out.println("MalformedURLException");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("IOException");
            throw new RuntimeException(e);
        }
    }

    /** ---------------------------------------------------------------------------------------------------
     * 회원의 예약 리스트
     * @param memberId 예약 리스트를 조회할 회원의 memberId
     * @return memberId를 가진 회원의 예약 리스트
     */
    public List<Book> bookList(Long memberId) {
        List<Book> list = new ArrayList<>();

        try {
            String hostUrl = HOST + "/book/list/"+ URLEncoder.encode(String.valueOf(memberId), StandardCharsets.UTF_8);
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

            list = mapper.readValue(br.readLine(), new TypeReference<>() {});
            br.close();

        } catch (ProtocolException e) {
            throw new RuntimeException(e);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
