package com.exam.junit.junittest;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class BeanAppManagerTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		BeanAppManager manager = mock(BeanAppManager.class);
		BeanApp beanApp = new BeanApp();
		beanApp.setAppid("333");
		beanApp.setAppname("My Appname");
		List<String> strList = new ArrayList<String>();
		strList.add("role1");
		strList.add("role2");
		strList.add("role3");
		beanApp.setApproles(strList);
		beanApp.setAppsecret("secret");
		beanApp.setDescription("Description");
		when(manager.objectWithId("333")).thenReturn(beanApp);
		when(manager.validate(beanApp.getAppid(), beanApp.getAppsecret())).thenCallRealMethod();
		boolean result = manager.validate("333", "secret");
		assertEquals(true, result);
		
	}

}
