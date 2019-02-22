package me.coldsoul.code.dp.staticproxy;

import me.coldsoul.code.dp._util.LOGGER;

public class TransationProxyForTableManager implements TableManager {
	private TableManager tableManager;

	public TransationProxyForTableManager(TableManager tableManager) {
		this.tableManager = tableManager;
	}

	@Override
	public void empty() {
		beginTransation();
		tableManager.empty();
		afterTransation();

	}

	@Override
	public int count() {
		beginTransation();
		int count = tableManager.count();
		afterTransation();
		return count;
	}

	@Override
	public void executeSql(String sql) {
		beginTransation();
		tableManager.executeSql(sql);
		afterTransation();
	}

	public void beginTransation() {
		LOGGER.info("begin transation");
	}

	public void afterTransation() {
		LOGGER.info("after transation,commit data");
	}

}
