package cn.smbms.dao.record;

import java.util.List;

import cn.smbms.pojo.Record;

public interface RecordMapper {
	public int count();
	public List<Record> selectRecordsAfter2015();
}
