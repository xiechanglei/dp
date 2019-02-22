package me.coldsoul.code.dp.dynamicproxy;

public class DynamicProxyTest {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		CacheClient client = DynamicLogProxy.create(new RedisClient(), CacheClient.class);
		client.putCache("name", "zhangsan");
		System.out.println(client.getCache("name"));
	}
}
