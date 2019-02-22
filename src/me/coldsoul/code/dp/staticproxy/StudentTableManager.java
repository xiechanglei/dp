package me.coldsoul.code.dp.staticproxy;

import me.coldsoul.code.dp._util.LOGGER;

public class StudentTableManager implements TableManager {

	@Override
	public void empty() {
		LOGGER.info("delete from student");
	}

	@Override
	public int count() {
		LOGGER.info("selecy count(*) from student");
		return 0;
	}

	@Override
	public void executeSql(String sql) {
		LOGGER.info(sql);

	}

}
