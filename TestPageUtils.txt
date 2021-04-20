package com.dcjet.cs.controller;

import com.alibaba.fastjson.JSON;
import com.dcjet.cs.service.base.DataExchangeService;
import com.dcjet.cs.utils.PageUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestPageUtils {
	private static final Logger logger = LoggerFactory.getLogger(DataExchangeService.class);

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		/**
		 * @author Sam_Hung
		 * @since 2021-04-19
		 */

		// 假資料
		List<TestDataModel> demoList = new ArrayList<TestDataModel>();
		TestDataModel erp1 = new TestDataModel();
		erp1.setErpId("KXX2140013");
		erp1.setErpName("1");
		TestDataModel erp2 = new TestDataModel();
		erp2.setErpId("KS12140132");
		erp2.setErpName("2");
		TestDataModel erp3 = new TestDataModel();
		erp3.setErpId("2K22140140");
		erp3.setErpName("1");
		TestDataModel erp4 = new TestDataModel();
		erp4.setErpId("KXX2140013");
		erp4.setErpName("2");
		TestDataModel erp5 = new TestDataModel();
		erp5.setErpId("KS12140132");
		erp5.setErpName("1");
		TestDataModel erp6 = new TestDataModel();
		erp6.setErpId("2K22140140");
		erp6.setErpName("2");

		// 存入假資料
		demoList.add(erp1);
		demoList.add(erp2);
		demoList.add(erp3);
		demoList.add(erp4);
		demoList.add(erp5);
		demoList.add(erp6);

		// 打包資料的陣列
		List<List<TestDataModel>> packDataList = new ArrayList<List<TestDataModel>>();
		// 索引資料的陣列
		List<String> indexList = new ArrayList<String>();

		/*
		 * 資料來源 : demoList 排序區塊 輸出資料 : List<TestDemoModel> demoList
		 */

		// 排序
		Collections.sort(demoList, new Comparator<TestDataModel>() {
			public int compare(TestDataModel tdm1, TestDataModel tdm2) {
				return tdm1.getErpId().compareTo(tdm2.getErpId());
			}
		});

		// 製作索引
		for (TestDataModel tdm : demoList) {
			String s = tdm.getErpId();
			indexList.add(s);
		}

		// 取得打包資料
		for (int i = 0; i < demoList.size(); i++) {
			String s = demoList.get(i).getErpId();
			int first = indexList.indexOf(s);
			int last = indexList.lastIndexOf(s);
			List<TestDataModel> classList = new ArrayList<TestDataModel>();
			classList.addAll(demoList.subList(first, last + 1));
			Collections.sort(classList, new Comparator<TestDataModel>() {
				public int compare(TestDataModel tdm1, TestDataModel tdm2) {
					return tdm1.getErpName().compareTo(tdm2.getErpName());
				}
			});
			packDataList.add(classList);
			i = last;
		}

		// 分頁測試
		int p = 2;
		PageUtils<List<TestDataModel>> pageUtils = new PageUtils<List<TestDataModel>>(p, packDataList); // 變數p

		int totalPage = pageUtils.getTotalPage();
		System.out.println("總頁數 = " + totalPage);

		for (int i = 1; i <= totalPage; i++) {
			/*
			 * * 來源資料 : indexList1 判斷分頁資料量 int p = 0 for(int i = 0;i<=indexList1.size;i++){
			 * int s += i.size if s >100{ 判斷 } }
			 * 
			 * 
			 * a.size + b.size + c.size >100 p =3 輸出 : int 變數p
			 * 
			 */

			// pageUtils.setPageRecords(p);

			String json = null;
			System.out.println();
			List<TestDataModel> showList1 = new ArrayList<TestDataModel>();
			List<List<TestDataModel>> testList = pageUtils.getPage(i);
			if (testList.size() == 0) {
				break;
			}
			System.out.println("第" + i + "頁");
			System.out.println("原始資料列");
			System.out.println(testList);
			System.out.println("解包資料列");
			for (List<TestDataModel> li : testList) {
				for (TestDataModel tdm : li) {
					showList1.add(tdm);
				}
			}
			List<TestDataModel> pageList = showList1;
			for (TestDataModel tdm : pageList) {
				System.out.println(tdm);
			}

			json = JSON.toJSONString(pageList);
			System.out.println("JSON檔 : \n" + json);
		}
	}

	public static int totalSum() {
		int x = 0;
		return x;
	}
	
	// 真實接口需要處理的範圍

	public static void pushExgIeData(List<TestDataModel> demoList) {
		logger.info("=========================執行獲取成品出入库視圖數據任務開始=========================");
		System.out.println("-----------------------------------------------");
		for (int z = 0; z < 1; z++) {
//			try {
			// 測試接口連接是否正常
			// if (!checkUrlVisit(token))
			// return;
			// 記錄開始時間
			// Date beginTime = new Date();
			// int totalCount = 0, successCount = 0, errorCount = 0;
			// ErpCollectLog erpCollectLog = erpCollectLogMapper.selectMaxTimeStamp(5);
			// SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd
			// HH:mm:ss");
			// String maxTime = simpleDateFormat.format(erpCollectLog.getMaxTimeStamp());
			// 根據時間戳查詢增量數據
			List<TestDataModel> testList = demoList;
			if (testList.size() == 0) {
				System.out.println("-----------------------------------------------");
				logger.info("未查詢到需要匹配的成品出入库數據，任務結束。");
				return;
			}
			logger.info("成品出入库數據正在采集中，本次數量：" + testList.size());
			System.out.println("-----------------------------------------------");
			// 獲取List中最後一條數據
			// TestDataModel lastData = testList.get(testList.size() - 1);
			// Date endDataTime = lastData.getLastModifyDate();
			// totalCount = testList.size();

			// ---------------------------------------------------------------------------

			// 打包資料的陣列
			List<List<TestDataModel>> packDataList = new ArrayList<List<TestDataModel>>();
			// 索引資料的陣列
			List<String> indexList = new ArrayList<String>();

			/*
			 * 資料來源 : demoList 排序區塊 輸出資料 : List<TestDemoModel> demoList
			 */

			// 排序
			Collections.sort(testList, new Comparator<TestDataModel>() {
				public int compare(TestDataModel tdm1, TestDataModel tdm2) {
					return tdm1.getErpId().compareTo(tdm2.getErpId());
				}
			});
			// 製作索引
			for (TestDataModel tdm : testList) {
				String s = tdm.getErpId();
				indexList.add(s);
			}

			// 取得打包資料
			for (int i = 0; i < testList.size(); i++) {
				String s = testList.get(i).getErpId();
				int first = indexList.indexOf(s);
				int last = indexList.lastIndexOf(s);
				List<TestDataModel> classList = new ArrayList<TestDataModel>();
				classList.addAll(testList.subList(first, last + 1));
				Collections.sort(classList, new Comparator<TestDataModel>() {
					public int compare(TestDataModel tdm1, TestDataModel tdm2) {
						return tdm1.getErpName().compareTo(tdm2.getErpName());
					}
				});
				packDataList.add(classList);
				i = last;
			}

			// -------------------------------------------------------------------------------------
			
			int p = 1;

			// 分頁處理
			PageUtils<List<TestDataModel>> pageUtils = new PageUtils<>(p, packDataList);
			
			int totalPage = pageUtils.getTotalPage();
			int index = 0;
			System.out.println("總頁數 : " + totalPage);
			int first = pageUtils.getStartIndex();
			int last = pageUtils.getEndIndex();
			for (int i = 1; i <= totalPage; i++) {
				List<TestDataModel> showList = new ArrayList<TestDataModel>();
				int pageDataCount = 7;				
				int sum = 0;
				p =1;
				for (int x = index; x < packDataList.size(); x++) {					
					sum += packDataList.get(x).size();
					System.out.println( "第" + (x+1)+ "區資料共"+packDataList.get(x).size() +"筆 ， 當頁總計 = " + sum);
					System.out.println("當前區域資料為 : " + packDataList.get(x));
					if (sum > pageDataCount) {
					System.out.println("當頁資料數 > 設定資料數，目前資料包數 : "+ p +" ，目前資料數 : " + sum);
						pageUtils.setPageRecords(p);	
						index = x+1;
						sum = 0;
						break;
					}else if(sum ==  pageDataCount){
						System.out.println("當頁資料數 = 設定資料數，目前資料包數 : "+ p +" ，目前資料數 : " + sum);
						pageUtils.setPageRecords(p);	
						index = x+1;
						sum = 0;
						break;
					}
					else if(sum < pageDataCount ){	
						System.out.println("當頁資料數量不足" +pageDataCount +  " 個 ， 繼續抓資料填充");
						++p;					
					}
					
				}

				/*
				 * * 來源資料 : indexList1 判斷分頁資料量 輸出 : int 變數p
				 */
				
				List<List<TestDataModel>> pageList = pageUtils.getPage(i);
				System.out.println("Start : "+ pageUtils.getStartIndex() + "End : " + pageUtils.getEndIndex());
				//String json = null;
//					String url = serviceBaseUrl + erpExgIeHttpUrl;
				if (pageList.size() == 0) {
					System.out.println("此頁無資料");
					break;
				}
				System.out.println("-----------------------------------------------");
				System.out.println("第" + i + "頁");
				// System.out.println("原始資料列");
				// System.out.println(pageList);
				System.out.println("每筆資料");
				for (List<TestDataModel> li : pageList) {
					for (TestDataModel tdm : li) {
						showList.add(tdm);
					}
				}
				List<TestDataModel> packPageList = showList;
				for (TestDataModel tdm : packPageList) {
					System.out.println(tdm);
				}
				System.out.println("-----------------------------------------------");
				//json = JSON.toJSONString(packPageList);
				//System.out.println(json);
//						OkHttpResult okHttpResult = OkHttpUtils.sendPostInvoke(url, token, json);
//						/* 獲取錯誤數據開始 */
//						if (okHttpResult.getData() != null) {
//							String dataString = JSON.toJSONString(okHttpResult.getData());
//							JSONArray array = JSONArray.parseArray(dataString);
//							List<TestDataModel> errorDataList = JSONObject.parseArray(array.toJSONString(),
//									TestDataModel.class);
//							errorDataList.stream()
//									.forEach(s -> logger.error("ExgIe-成品出入庫 異常數據 單據號(linkedNo): " + s.getErpId()
//											+ " , 序號(lineNo): " + s.getErpName() + " , API回傳Data" + okHttpResult.getData() + ";"));
//						}
//						/* 獲取錯誤數據結束 */
//						if (okHttpResult != null && okHttpResult.isSuccess()) {
//							successCount += pageList.size();
//							logger.info(serviceBaseUrl + erpExgIeHttpUrl + "成品出入库接口調用成功!");
//						} else {
//							logger.info("調用成品出入库接口失敗，數據為：" + json);
//							FileUtils.writeToFile(filePath, "exgie", json);
//							errorCount += pageList.size();
//						}
//					} catch (Exception ex) {
//						FileUtils.writeToFile(filePath, "exgie", json);
//						logger.info("調用成品出入库接口失敗，數據為：" + json);
//						logger.error("調用成品出入库接口失敗，數據為：" + json + ",錯誤為：" + ex.getMessage());
//						errorCount += pageList.size();
//						continue;
//					}
			}
			// 插入采集日志
//				ErpCollectLog collectLog = new ErpCollectLog(new Date());
//				String sid = UUID.randomUUID().toString();
//				collectLog.setSid(sid);
//				//collectLog.setMaxTimeStamp(endDataTime);
//				collectLog.setDataType(5);
//				//collectLog.setBeginTime(beginTime);
//				collectLog.setEndTime(new Date());
//				collectLog.setAmount(totalCount);
//				collectLog.setSuccessCount(successCount);
//				collectLog.setErrorCount(errorCount);
//				//erpCollectLogMapper.insert(collectLog);
//			} catch (Exception ex) {
//				z--;
//				ex.printStackTrace();
//				logger.error("執行獲取成品出入库視圖數據任務執行異常：" + ex);
//			}
			logger.info("=========================執行獲取成品出入库視圖數據任務結束=========================");
		}
	}

}
