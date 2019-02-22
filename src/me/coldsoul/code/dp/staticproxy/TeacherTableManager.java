package me.coldsoul.code.dp.staticproxy;

import me.coldsoul.code.dp._util.LOGGER;

public class TeacherTableManager implements TableManager {

	@Override
	public void empty() {
		LOGGER.info("delete from teacher");
	}

	@Override
	public int count() {
		LOGGER.info("selecy count(*) from teacher");
		return 20;
	}

	@Override
	public void executeSql(String sql) {
		LOGGER.info(sql);

	}

}
