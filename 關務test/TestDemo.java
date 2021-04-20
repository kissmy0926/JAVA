package com.dcjet.cs.controller;
import java.util.ArrayList;
import java.util.List;

public class TestDemo {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		List<TestDataModel> demoList = new ArrayList<TestDataModel>();
		TestDataModel erp1 = new TestDataModel();
		erp1.setErpId("KXX2140013");
		erp1.setErpName("2");
		TestDataModel erp2 = new TestDataModel();
		erp2.setErpId("KS12140132");
		erp2.setErpName("2");
		TestDataModel erp3 = new TestDataModel();
		erp3.setErpId("2K22140140");
		erp3.setErpName("4");
		TestDataModel erp4 = new TestDataModel();
		erp4.setErpId("KXX2140013");
		erp4.setErpName("1");
		TestDataModel erp5 = new TestDataModel();
		erp5.setErpId("KS12140132");
		erp5.setErpName("1");
		TestDataModel erp6 = new TestDataModel();
		erp6.setErpId("2K22140140");
		erp6.setErpName("3");
		TestDataModel erp7 = new TestDataModel();
		erp7.setErpId("2K22140139");
		erp7.setErpName("1");
		TestDataModel erp8 = new TestDataModel();
		erp8.setErpId("2K22140140");
		erp8.setErpName("5");
		TestDataModel erp9 = new TestDataModel();
		erp9.setErpId("2K22140140");
		erp9.setErpName("1");
		TestDataModel erp10 = new TestDataModel();
		erp10.setErpId("2K22140140");
		erp10.setErpName("2");
		TestDataModel erp11 = new TestDataModel();
		erp11.setErpId("2K22140139");
		erp11.setErpName("2");
		TestDataModel erp12 = new TestDataModel();
		erp12.setErpId("2K22140145");
		erp12.setErpName("2");
		TestDataModel erp13 = new TestDataModel();
		erp13.setErpId("2K22140145");
		erp13.setErpName("1");
		TestDataModel erp14 = new TestDataModel();
		erp14.setErpId("2K22140139");
		erp14.setErpName("3");
		TestDataModel erp15 = new TestDataModel();
		erp15.setErpId("2K22140147");
		erp15.setErpName("1");
		TestDataModel erp16 = new TestDataModel();
		erp16.setErpId("KXX2140013");
		erp16.setErpName("4");
		TestDataModel erp17 = new TestDataModel();
		erp17.setErpId("KXX2140013");
		erp17.setErpName("3");
		
		//存入假資料
		demoList.add(erp1);
		demoList.add(erp2);
		demoList.add(erp3);
		demoList.add(erp4);
		demoList.add(erp5);
		demoList.add(erp6);
		demoList.add(erp7);
		demoList.add(erp8);
		demoList.add(erp9);
		demoList.add(erp10);
		demoList.add(erp11);
		demoList.add(erp12);
		demoList.add(erp13);
		demoList.add(erp14);
		demoList.add(erp15);
		demoList.add(erp16);
		demoList.add(erp17);
		
		TestPageUtils.pushExgIeData(demoList);
	}

}
