package com.xh.xmlPars;

/**
 * @version 创建时间：2017-12-20 下午6:33:38 项目：repair 包名：com.xh.paras
 *          文件名：ParasFactory.java 作者：lhl 说明:
 */

public class ParasFactory {
	/**
	 * 
	 * lhl 2017-12-20 下午6:37:48 说明：获取dom解析器
	 * 
	 * @return Paras
	 */
	public static Paras dom() {
		return init(DOMParas.class);
	}

	/**
	 * 
	 * lhl 2017-12-20 下午6:38:07 说明：获取pull解析器
	 * 
	 * @return Paras
	 */
	public static Paras pull() {
		return init(PullParas.class);
	}

	/**
	 * 
	 * lhl 2017-12-20 下午6:38:21 说明：获取sax解析器
	 * 
	 * @return Paras
	 */
	public static Paras sax() {
		return init(SAXParas.class);
	}

	private static Paras init(Class cl) {
		try {
			return (Paras) cl.newInstance();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
}
