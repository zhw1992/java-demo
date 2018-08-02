package com.personal.study.dubbo.api;

public interface GetWeatherService {
	
	/**
	 * 城市编码
	 * @param cityCode
	 * @return
	 */
	public String getWeatherByCityCode(String cityCode);

}
