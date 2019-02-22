package me.coldsoul.code.dp.strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import me.coldsoul.code.dp._util.LOGGER;

/**
 * 一个简单的模拟http请求的实现
 * 
 * @author xiechanglei
 *
 */
public class HttpClient {
	private IEncrypt encrypt;
	private Map<String, Object> params = new HashMap<>();

	/**
	 * 设置加密模式
	 */
	public void setEncrypt(IEncrypt encrypt) {
		this.encrypt = encrypt;
	}

	/**
	 * 添加参数
	 */
	public HttpClient addParam(String name, Object value) {
		params.put(name, value);
		return this;
	}

	/**
	 * 发送请求，这里只实现get方式
	 */
	public void get(String url) {
		LOGGER.info("请求地址:", url);
		String param = getParamString();
		LOGGER.info("请求参数:", param);
		if (encrypt != null) {
			param = encrypt.encryptStr(param);
			LOGGER.info("加密之后的数据:", param);
		}
		LOGGER.info("发送请求");
	}

	/**
	 * 获取请求参数
	 * 
	 */
	private String getParamString() {
		String message = "";
		Set<String> keySet = params.keySet();
		for (String key : keySet) {
			message += key + params.get(key).toString() + "&";
		}
		return message;
	}

	public static HttpClient createClient() {
		return new HttpClient();
	}

	public static HttpClient createClient(IEncrypt encrypt) {
		HttpClient httpClient = new HttpClient();
		httpClient.setEncrypt(encrypt);
		return httpClient;
	}
}
