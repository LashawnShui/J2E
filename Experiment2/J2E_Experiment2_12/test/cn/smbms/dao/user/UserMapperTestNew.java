package cn.smbms.dao.user;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import cn.smbms.dao.user.UserMapper;
import cn.smbms.pojo.Address;
import cn.smbms.pojo.User;
import cn.smbms.utils.MyBatisUtil;

public class UserMapperTestNew {
	
	private Logger logger = Logger.getLogger(UserMapperTestNew.class);
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		SqlSession sqlSession = null;
		User user = null;
		try {
			//1 创建sqlSession
			sqlSession = MyBatisUtil.createSqlSession();
			//2.配置参数
			Integer userId = 1;
			//3 调用getMapper(Mapper.class)执行Mapper接口方法
			user = sqlSession.getMapper(UserMapper.class).getAddressListByUserId(userId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		if(null != user){
			logger.debug("userList(include:addressList) =====> userCode: "
					+ user.getUserCode() + ",userName: " + user.getUserName()
					+ ",<未做映射字段>userPassword: " + user.getUserPassword()
			);
			if(user.getAddressList().size() > 0){
				for(Address address : user.getAddressList()){
					logger.debug("address ----> id: " + address.getId()
						+ ",contact: " + address.getContact()
						+ ",addressDesc: " + address.getAddressDesc()
						+ ",tel: " + address.getTel()
						+ ",postCode: " + address.getPostCode()
						+ ",<未做映射字段>userId: " + address.getUserId()
					);
				}
			} else {
				logger.debug("该用户下无地址列表");
			}
		} else {
			logger.debug("查无此用户！ ");
		}
	}

}
