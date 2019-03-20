//package com.demo;
//
//public class ImTest1 {
//
//	public static void main(String[] args) {
//		DefaultHttpClient httpClient = new DefaultHttpClient();
//		String url = "https://api.netease.im/nimserver/user/create.action";
//		HttpPost httpPost = new HttpPost(url);
//
//		String appKey = "94kid09c9ig9k1loimjg012345123456";
//		String appSecret = "123456789012";
//		String nonce =  "12345";
//		String curTime = String.valueOf((new Date()).getTime() / 1000L);
//		String checkSum = CheckSumBuilder.getCheckSum(appSecret, nonce ,curTime);//参考 计算CheckSum的java代码
//
//		// 设置请求的header
//		httpPost.addHeader("AppKey", appKey);
//		httpPost.addHeader("Nonce", nonce);
//		httpPost.addHeader("CurTime", curTime);
//		httpPost.addHeader("CheckSum", checkSum);
//		httpPost.addHeader("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
//
//		// 设置请求的参数
//		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
//		nvps.add(new BasicNameValuePair("accid", "helloworld"));
//		httpPost.setEntity(new UrlEncodedFormEntity(nvps, "utf-8"));
//
//		// 执行请求
//		HttpResponse response = httpClient.execute(httpPost);
//
//		// 打印执行结果
//		System.out.println(EntityUtils.toString(response.getEntity(), "utf-8"));
//	}
//}
