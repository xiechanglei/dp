package me.coldsoul.code.dp.strategy;

/**
 * 加密的AES实现
 * 
 * @author xiechanglei
 *
 */
public class AesEncrypt implements IEncrypt {

	@Override
	public String encryptStr(String message) {
		return "经过AES加密过的数据";// 这里就不写具体的实现过程了
	}
}
