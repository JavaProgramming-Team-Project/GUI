package api;

import dto.LoginDto;
import entity.Member;
import ip.Host;
import login.LoginMember;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class MemberApi {
    private final static String HOST = Host.getHost();

    /**
     * 회원가입
     */
    public static void signUp(Member member) {
        JSONObject data = new JSONObject();

        data.put("memberId", member.getId());
        data.put("password", member.getPassword());
        data.put("name", member.getName());
        data.put("phone", member.getPhone());
        data.put("age", member.getAge());

        String jsonType = JSONValue.toJSONString(data);
        System.out.println(jsonType);

        try {
            String hostUrl = HOST + "/member/signup";
            HttpURLConnection conn = null;

            URL url = new URL(hostUrl);
            conn = (HttpURLConnection)url.openConnection();

            conn.setRequestMethod("POST");
            conn.setConnectTimeout(3000);
            conn.setRequestProperty("Content-Type", "application/json; utf-8");

            conn.setDoOutput(true); //POST

            OutputStream os = conn.getOutputStream();
            os.write(jsonType.getBytes(StandardCharsets.UTF_8));
            os.flush();

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String returnMsg = br.readLine();
            System.out.println("응답 메시지 : " + returnMsg);

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

    /**
     * 로그인
     */
    public static void login(LoginDto loginDto) {
        try{
            String hostUrl = HOST + "/user/" + loginDto.getMemberId() + "?" + "password=" + loginDto.getPassword();
            System.out.println(hostUrl);
            HttpURLConnection conn = null;

            URL url = new URL(hostUrl);
            conn = (HttpURLConnection)url.openConnection();

            conn.setRequestMethod("GET");
            conn.setConnectTimeout(3000);
            conn.setRequestProperty("Accept", "application/json; utf-8");

            int responseCode = conn.getResponseCode();

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuffer sb = new StringBuffer();
            String inputLine;

            while ((inputLine = br.readLine()) != null) {
                sb.append(inputLine);
            }
            br.close();

            String response = sb.toString();
            System.out.println(response);

            JSONParser jp = new JSONParser();

            Object result = jp.parse(response);

            if (result instanceof JSONObject) {
                JSONObject data = (JSONObject) result;
                Member member = new Member((Long) data.get("memberId"), (String) data.get("id"), (String) data.get("password")
                        , (String) data.get("name"), (String) data.get("phone"), (Integer) data.get("age"));

                LoginMember.setLoginMember(member);
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
        } catch (ParseException e) {
            System.out.println("ParseException");
            throw new RuntimeException(e);
        }
    }
}
