package com.framework.automation.framework.homePage;

import org.testng.annotations.Test;
import java.sql.SQLException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.AutomationFramework.db.DbConnection;
import com.AutomationFramework.db.Queries_Class;

public class DbTest {
	protected DbConnection dbConnections;
	protected Queries_Class queries_Class;
	@Test
	public void VerifyKagimTableInfo() throws ClassNotFoundException, SQLException  {
		
		DbConnection.oktest(Queries_Class.MultipleStudentInfo());
		

	}
}
