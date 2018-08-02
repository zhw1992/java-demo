package com.personal.study.dubbo.api.impl;

import com.personal.study.dubbo.api.GetWeatherService;


public class GetWeatherServiceImpl implements GetWeatherService {

	public String getWeatherByCityCode(String cityCode) {
		StringBuilder stringBuilder = new StringBuilder();
		switch (cityCode) {
		case "SZX":
			stringBuilder.append("深圳天气晴朗");
			break;
		case "WH":
			stringBuilder.append("武汉天气炎热");
			break;
		default:
			break;
		}
		return stringBuilder.toString();
	}

}
