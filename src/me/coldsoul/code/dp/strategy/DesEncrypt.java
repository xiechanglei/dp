package me.coldsoul.code.dp.strategy;

/**
 * 加密的DES实现
 * 
 * @author xiechanglei
 *
 */
public class DesEncrypt implements IEncrypt {

	@Override
	public String encryptStr(String message) {
		return "经过DES加密过的数据";// 这里就不写具体的实现过程了
	}
}
