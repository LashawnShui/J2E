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
			//1 ����sqlSession
			sqlSession = MyBatisUtil.createSqlSession();
			//2.���ò���
			Integer userId = 1;
			//3 ����getMapper(Mapper.class)ִ��Mapper�ӿڷ���
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
					+ ",<δ��ӳ���ֶ�>userPassword: " + user.getUserPassword()
			);
			if(user.getAddressList().size() > 0){
				for(Address address : user.getAddressList()){
					logger.debug("address ----> id: " + address.getId()
						+ ",contact: " + address.getContact()
						+ ",addressDesc: " + address.getAddressDesc()
						+ ",tel: " + address.getTel()
						+ ",postCode: " + address.getPostCode()
						+ ",<δ��ӳ���ֶ�>userId: " + address.getUserId()
					);
				}
			} else {
				logger.debug("���û����޵�ַ�б�");
			}
		} else {
			logger.debug("���޴��û��� ");
		}
	}

}
