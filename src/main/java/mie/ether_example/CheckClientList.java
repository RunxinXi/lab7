package mie.ether_example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.AbstractMap.SimpleEntry;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

import edu.toronto.dbservice.config.MIE354DBHelper;

public class CheckClientList implements JavaDelegate {
	Connection conn = null;
	
	public CheckClientList() {
		conn = MIE354DBHelper.getDBConnection();
	}
	
	@Override
	public void execute(DelegateExecution execution) {
		System.out.println("CheckClientList: IMPLEMENT ME");
	}
}
