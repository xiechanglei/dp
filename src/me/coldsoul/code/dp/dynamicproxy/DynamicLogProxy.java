package me.coldsoul.code.dp.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import me.coldsoul.code.dp._util.LOGGER;

/**
 * 使用动态代理，无论接口那边的代码怎么修改，这里都是不需要修改的
 * 
 * @author xiechanglei
 *
 */
public class DynamicLogProxy implements InvocationHandler {
	private Object object;

	public DynamicLogProxy(Object object) {
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		LOGGER.info("here is log ......");
		Object result = method.invoke(object, args);
		return result;
	}

	@SuppressWarnings("unchecked")
	public static <T> T create(Object instance, Class<T> ie) throws InstantiationException, IllegalAccessException {
		DynamicLogProxy proxy = new DynamicLogProxy(instance);
		return (T) Proxy.newProxyInstance(ie.getClassLoader(), new Class[] { ie }, proxy);
	}
}
