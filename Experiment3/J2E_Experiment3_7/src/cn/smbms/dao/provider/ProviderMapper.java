package cn.smbms.dao.provider;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.smbms.pojo.Provider;

public interface ProviderMapper {
	public List<Provider> getProviderList_choose(@Param("proCode")String proCode,
												@Param("proName")String proName,
												@Param("proContact")String proContact,
												@Param("creationDate")Date creationDate
	);
}
