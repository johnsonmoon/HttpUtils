package xuyihao.util;

import org.jsoup.nodes.Document;
import org.junit.Test;

import java.util.HashMap;

public class HttpUtilsTest {
	private static final String TEST_URL = "http://www.google.com/";

	@Test
	public void testExecuteGetAsDocument() {
		HttpUtils httpUtils = HttpUtils.getInstance();
		httpUtils.setCharset("UTF-8");
		httpUtils.setTimeout(30000);
		try {
			Document document = httpUtils.executeGetAsDocument(TEST_URL);
			//TODO
			System.out.println(document);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testExecuteGet() {
		HttpUtils httpUtils = HttpUtils.getInstance();
		httpUtils.setCharset("UTF-8");
		httpUtils.setTimeout(30000);
		try {
			String responseStr = httpUtils.executeGet(TEST_URL);
			//TODO
			System.out.println(responseStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testExecuteGetWithSSLAsDocument() {
		HttpUtils httpUtils = HttpUtils.getInstance();
		httpUtils.setCharset("UTF-8");
		httpUtils.setTimeout(30000);
		try {
			Document document = httpUtils.executeGetWithSSLAsDocument(TEST_URL);
			//TODO
			System.out.println(document);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testExecuteGetWithSSL() {
		HttpUtils httpUtils = HttpUtils.getInstance();
		httpUtils.setCharset("UTF-8");
		httpUtils.setTimeout(30000);
		try {
			String responseStr = httpUtils.executeGetWithSSL(TEST_URL);
			//TODO
			System.out.println(responseStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testExecutePostAsDocument() {
		HttpUtils httpUtils = HttpUtils.getInstance();
		httpUtils.setCharset("UTF-8");
		httpUtils.setTimeout(30000);
		try {
			Document document = httpUtils.executePostAsDocument(TEST_URL, new HashMap<>());
			//TODO
			System.out.println(document);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testExecutePost() {
		HttpUtils httpUtils = HttpUtils.getInstance();
		httpUtils.setCharset("UTF-8");
		httpUtils.setTimeout(30000);
		try {
			String responseStr = httpUtils.executePost(TEST_URL, new HashMap<>());
			//TODO
			System.out.println(responseStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testExecutePostWithSSLAsDocument() {
		HttpUtils httpUtils = HttpUtils.getInstance();
		httpUtils.setCharset("UTF-8");
		httpUtils.setTimeout(30000);
		try {
			Document document = httpUtils.executePostWithSSLAsDocument(TEST_URL, new HashMap<>());
			//TODO
			System.out.println(document);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testExecutePostWithSSL() {
		HttpUtils httpUtils = HttpUtils.getInstance();
		httpUtils.setCharset("UTF-8");
		httpUtils.setTimeout(30000);
		try {
			String responseStr = httpUtils.executePostWithSSL(TEST_URL, new HashMap<>());
			//TODO
			System.out.println(responseStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testExecutePostWithJson() {
		HttpUtils httpUtils = HttpUtils.getInstance();
		httpUtils.setCharset("UTF-8");
		httpUtils.setTimeout(30000);
		try {
			String responseStr = httpUtils.executePostWithJson(TEST_URL, "{\"name\":\"testName001\"}");
			//TODO
			System.out.println(responseStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testExecutePostWithJsonAndSSL() {
		HttpUtils httpUtils = HttpUtils.getInstance();
		httpUtils.setCharset("UTF-8");
		httpUtils.setTimeout(30000);
		try {
			String responseStr = httpUtils.executePostWithJsonAndSSL(TEST_URL, "{\"name\":\"testName001\"}");
			//TODO
			System.out.println(responseStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetHtmlPageResponse() {
		HttpUtils httpUtils = HttpUtils.getInstance();
		httpUtils.setCharset("UTF-8");
		httpUtils.setTimeout(30000);
		httpUtils.setWaitForBackgroundJavaScript(30000);
		try {
			String htmlPageStr = httpUtils.getHtmlPageResponse(TEST_URL);
			//TODO
			System.out.println(htmlPageStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetHtmlPageResponseAsDocument() {
		HttpUtils httpUtils = HttpUtils.getInstance();
		httpUtils.setCharset("UTF-8");
		httpUtils.setTimeout(30000);
		httpUtils.setWaitForBackgroundJavaScript(30000);
		try {
			Document document = httpUtils.getHtmlPageResponseAsDocument(TEST_URL);
			//TODO
			System.out.println(document);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
