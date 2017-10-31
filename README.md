# HttpUtils
web tool single class

## brief
HttpUtils is a class with the ability to send http, https request, etc.

HttpUtils has two major functions:
- Using apache HttpClient (org.apache) to send http, https request, get response.
- Using htmlUnit (net.sourceforge) to simulate a simple java internet browser and get a html page completely.


## How to use
- add maven dependencies, like that:
```xml
<dependencies>

    <dependency>
        <groupId>net.sourceforge.htmlunit</groupId>
        <artifactId>htmlunit</artifactId>
        <version>2.27</version>
    </dependency>

    <dependency>
        <groupId>org.jsoup</groupId>
        <artifactId>jsoup</artifactId>
        <version>1.8.3</version>
    </dependency>
    
</dependencies>
```

- copy class *HttpUtils* to your project, like that:
```
package xuyihao.util;  ------->  pakage xxx.xxx.xxx.util.HttpUtils
```

- build your project, download the dependencies, like that:
```bash
mvn compile
```
 
- finally, use the *HttpUtils* class, like that:
```
    HttpUtils httpUtils = HttpUtils.getInstance();
    httpUtils.setCharset("UTF-8");
    httpUtils.setTimeout(30000);
    try {
        Document document = httpUtils.executeGetAsDocument(TEST_URL);
        //TODO
    } catch (Exception e) {
        e.printStackTrace();
    }
```

- more use of the *HttpUtils* class, see *HttpUtilsTest* [src/test/java/xuyihao/util/HttpUtilsTest.java]:
