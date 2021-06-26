package minh.project.FixJobSpyder.Service;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContextBuilder;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

@Service
@Slf4j
@NoArgsConstructor
public class SpyderUnitState {

    void GetSpyderUnitState() throws IOException, KeyStoreException, NoSuchAlgorithmException, KeyManagementException {
//        String url="https://d61-v2.c4i.vn/ew/unit-states";
//
//        SSLContextBuilder builder = new SSLContextBuilder();
//        builder.loadTrustMaterial(null, new TrustSelfSignedStrategy());
//        SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(
//                builder.build());
//
//        CloseableHttpClient client= HttpClients.custom().setSSLSocketFactory(sslsf)
//                .build();
//
//        HttpGet httpGet= new HttpGet("https://192.168.205.46:32523");
//        httpGet.setHeader(HttpHeaders.CONTENT_TYPE,"ew/unit-states");
//        httpGet.setHeader(HttpHeaders.AUTHORIZATION,"Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJkNjFtaW5oZGI0IiwiZXhwIjoxNjU1NTE4NzUxLCJpYXQiOjE2MjM5ODI3NTF9.4iM6AWMkv4wX8h_djQpMt_vLkZKuD9nkfofKyyhyEBelXHMoCOT4Q6iaZufzchTEMM2LBdgHaUzMXT7OeJXtBQ");
//        CloseableHttpResponse response=client.execute(httpGet);
//        System.out.println(response.toString());
    }
}
