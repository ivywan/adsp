package cn.com.softvan.cxf.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "WebXml", targetNamespace = "http://cxf.softvan.com.cn/")
public interface WebXml {

	/**
	 * 
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "http://cxf.softvan.com.cn/")
	@RequestWrapper(localName = "saveInfo", targetNamespace = "http://cxf.softvan.com.cn/", className = "cn.com.softvan.cxf.client.SaveInfo")
	@ResponseWrapper(localName = "saveInfoResponse", targetNamespace = "http://cxf.softvan.com.cn/", className = "cn.com.softvan.cxf.client.SaveInfoResponse")
	public String saveInfo(
			@WebParam(name = "arg0", targetNamespace = "http://cxf.softvan.com.cn/") String arg0);

	/**
	 * 
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "http://cxf.softvan.com.cn/")
	@RequestWrapper(localName = "getInfo", targetNamespace = "http://cxf.softvan.com.cn/", className = "cn.com.softvan.cxf.client.GetInfo")
	@ResponseWrapper(localName = "getInfoResponse", targetNamespace = "http://cxf.softvan.com.cn/", className = "cn.com.softvan.cxf.client.GetInfoResponse")
	public String getInfo(
			@WebParam(name = "arg0", targetNamespace = "http://cxf.softvan.com.cn/") String arg0);

	/**
	 * 
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "http://cxf.softvan.com.cn/")
	@RequestWrapper(localName = "modifyInfo", targetNamespace = "http://cxf.softvan.com.cn/", className = "cn.com.softvan.cxf.client.ModifyInfo")
	@ResponseWrapper(localName = "modifyInfoResponse", targetNamespace = "http://cxf.softvan.com.cn/", className = "cn.com.softvan.cxf.client.ModifyInfoResponse")
	public String modifyInfo(
			@WebParam(name = "arg0", targetNamespace = "http://cxf.softvan.com.cn/") String arg0);

	/**
	 * 
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "http://cxf.softvan.com.cn/")
	@RequestWrapper(localName = "delInfo", targetNamespace = "http://cxf.softvan.com.cn/", className = "cn.com.softvan.cxf.client.DelInfo")
	@ResponseWrapper(localName = "delInfoResponse", targetNamespace = "http://cxf.softvan.com.cn/", className = "cn.com.softvan.cxf.client.DelInfoResponse")
	public String delInfo(
			@WebParam(name = "arg0", targetNamespace = "http://cxf.softvan.com.cn/") String arg0);

	/**
	 * 
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "http://cxf.softvan.com.cn/")
	@RequestWrapper(localName = "test", targetNamespace = "http://cxf.softvan.com.cn/", className = "cn.com.softvan.cxf.client.Test")
	@ResponseWrapper(localName = "testResponse", targetNamespace = "http://cxf.softvan.com.cn/", className = "cn.com.softvan.cxf.client.TestResponse")
	public String test();

}