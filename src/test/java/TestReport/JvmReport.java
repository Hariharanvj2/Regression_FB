package TestReport;

import java.awt.List;
import java.util.ArrayList;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

import cucumber.api.java.an.E;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public static void genarateJvmReport(String json) {

		Configuration con = new Configuration(
				new java.io.File("./src/test/resources/Report"), "Fb");
		con.addClassifications("Platform Name", "Windows");
		con.addClassifications("Platform version", "10");
		con.addClassifications("Browser Name", "Chrome");
		con.addClassifications("Platform Version", "87.0");
		con.addClassifications("Sprint", "21");

		java.util.List<String> list = new ArrayList<String>();
		list.add(json);
		new ReportBuilder(list, con).generateReports();

	}
}
