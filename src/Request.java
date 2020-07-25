import java.util.HashMap;
import java.util.Map;

public class Request {
    private String method;//请求方法
    private String url;//请求路径
    private String version;//请求头
    private Map<String,String> headers=new HashMap<>();

    /**
     *
     * @param key
     * @param value
     */
    public void addHeaders(String key,String value){
        headers.put(key, value);
    }
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }
}
