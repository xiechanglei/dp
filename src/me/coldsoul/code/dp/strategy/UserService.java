package me.coldsoul.code.dp.strategy;

/**
 * 用户API
 * 
 * @author xiechanglei
 *
 */
public class UserService {
	/**
	 * 用户的登录接口 ，采用AES加密数据
	 */
	public void login(String username, String password) {
		HttpClient client = HttpClient.createClient(new AesEncrypt());
		client.addParam("username", username).addParam("password", password).get("http://coldsoule.me/api/user/login");
	}

	/**
	 * 发送消息接口，采用DES加密
	 */
	public void sendMessage(String message) {
		HttpClient client = HttpClient.createClient(new DesEncrypt());
		client.addParam("message", message).get("http://coldsoul.me/api/message");
	}

	/**
	 * 测试
	 */
	public static void main(String[] args) {
		UserService userService = new UserService();
		userService.login("zhangsan", "123456");
		userService.sendMessage("nihao");
	}
}
