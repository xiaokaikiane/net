import java.util.HashMap;
import java.util.Map;

public class Request2 {
    private String method;//请求方法
    private String url;//请求路径
    private String version;//请求版本号
    private Map<String,String> headers=new HashMap<>(); //请求头
    private Map<String,String> parameters=new HashMap<>();//请求参数
    //添加请求头
    public void addHeader(String key,String value){
        headers.put(key,value);
    }
    //获取某个请求头
    public String getHeader(String key){
        return headers.get(key);
    }
    //解析请求参数
    public void parseparameters(String parameters){
        String[] ps=parameters.split("&");
        for(String p:ps){
            String[] array=p.split("=");
            addParameter(array[0],array[1]);
        }
    }
    //添加请求参数
    public void addParameter(String key,String value){
        parameters.put(key,value);
    }
    //获取某个参数
    public String getParameter(String key){
        return parameters.get(key);
    }

    @Override
    public String toString() {
        return "Request2{" +
                "\nmethod='" + method + '\'' +
                ",\n url='" + url + '\'' +
                ",\nversion='" + version + '\'' +
                ",\n headers=" + headers +
                ",\n parameters=" + parameters +
                '}';
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

    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }
}
