/**@generated
 * WARNING  Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
/******************************************************************
* Licensed Materials - Property of IBM
* IBM Rational Test Workbench
* Copyright IBM Corporation 2013. All Rights Reserved.
* 
* U.S. Government Users Restricted Rights - Use, duplication or 
* disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
******************************************************************/
/* TestScript.template - Suitable for collaborative code generation */
package test;

import com.ibm.rational.test.lt.datacorrelation.execution.action.VariableAction;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataHarvester;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCArray;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCCoreVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataHarvester;
import com.ibm.rational.test.lt.datacorrelation.execution.proto.ProtoAdapterHandler;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.DataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.IDataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.ISubRule;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.SubRule;
import com.ibm.rational.test.lt.execution.core.impl.LTTestScript;
import com.ibm.rational.test.lt.execution.http.IBasicAuthentication;
import com.ibm.rational.test.lt.execution.http.IConnectionRecord;
import com.ibm.rational.test.lt.execution.http.IHTTPRequest;
import com.ibm.rational.test.lt.execution.http.IHTTPSessionTypes;
import com.ibm.rational.test.lt.execution.http.INtlmAuthenticationContext;
import com.ibm.rational.test.lt.execution.http.ISSLInfo;
import com.ibm.rational.test.lt.execution.http.connection.IConnectionLimitsAlgorithm;
import com.ibm.rational.test.lt.execution.http.impl.ConfigConnection;
import com.ibm.rational.test.lt.execution.http.impl.DynamicHTTPRequestsContainer;
import com.ibm.rational.test.lt.execution.http.impl.HTTPAction;
import com.ibm.rational.test.lt.execution.http.impl.HTTPPage;
import com.ibm.rational.test.lt.execution.http.impl.HTTPParallel;
import com.ibm.rational.test.lt.execution.http.impl.HTTPPostData;
import com.ibm.rational.test.lt.execution.http.impl.HTTPPostDataChunk;
import com.ibm.rational.test.lt.execution.http.impl.HTTPRequest;
import com.ibm.rational.test.lt.execution.http.impl.HTTPThink;
import com.ibm.rational.test.lt.execution.http.impl.INextActionGenerator;
import com.ibm.rational.test.lt.execution.http.impl.PerHostPortConnectionAlgorithm;
import com.ibm.rational.test.lt.execution.http.impl.RequestHeaderData;
import com.ibm.rational.test.lt.execution.http.tes.*;
import com.ibm.rational.test.lt.execution.http.util.ConnectionRecordFactory;
import com.ibm.rational.test.lt.execution.http.util.CookieCacheUtil;
import com.ibm.rational.test.lt.execution.http.util.HTTPDataArea;
import com.ibm.rational.test.lt.execution.http.util.PageCacheUtil;
import com.ibm.rational.test.lt.execution.protocol.IProxyServerInfo;
import com.ibm.rational.test.lt.execution.protocol.impl.HTTPTestScriptHelper;
import com.ibm.rational.test.lt.kernel.IDataArea;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.IKAction;
import com.ibm.rational.test.lt.kernel.action.IKTimeoutControl;
import com.ibm.rational.test.lt.kernel.action.impl.KAction;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.ITestExecutionServices;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
public class Novoteste_Test_A1E81F49F6E274F0CAE1B43930643466 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPPostDataChunk");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPAction");
    }
	private IDataCorrelationVar[] dcVars = DataCorrelationVar.getArrayDCVars(6);
	private DataVar[] vars = new DataVar[2];
	
    
    
private HTTPTestScriptHelper httpTestScriptHelper;

	private HTTPTestScriptHelper getHTTPTest() {
		return httpTestScriptHelper;
	}

	
	public Novoteste_Test_A1E81F49F6E274F0CAE1B43930643466(IContainer container, String invocationId) {
		super(container, "novoteste", invocationId, "A1E81F49F6E274F0CAE1B43930643466");
		setArmEnabled(false);
		stopAtYourConvenience=false;
		this.httpTestScriptHelper = new HTTPTestScriptHelper(this);
        setTimeoutDuration(240000);
        setTimeoutScheme(IKTimeoutControl.CONTINUE);

	}

    public void execute() {
    	try {
				CookieCacheUtil.clearCookieCache((ITestExecutionServices)this);
	PageCacheUtil.clearPageCache((ITestExecutionServices)this);
	PageCacheUtil.setCacheEmulation((ITestExecutionServices)this, true);

	    		if (!isScheduleRun()) setThinkMax(2000);
	
	if (!isScheduleRun()){
this.addEventBehavior(new RPTEventStructure(new HTTPPageTitleVPEvent(), new RPTContinueEvent("Falha de verifica\u00E7\u00E3o do t\u00EDtulo da p\u00E1gina"), 1, "Falha de verifica\u00E7\u00E3o do t\u00EDtulo da p\u00E1gina"));
	this.addEventBehavior(new RPTEventStructure(new HTTPResponseCodeVPEvent(), new RPTContinueEvent("Falha de verifica\u00E7\u00E3o do c\u00F3digo de resposta"), 1, "Falha de verifica\u00E7\u00E3o do c\u00F3digo de resposta"));
	this.addEventBehavior(new RPTEventStructure(new HTTPResponseSizeVPEvent(), new RPTContinueEvent("Falha de verifica\u00E7\u00E3o do tamanho da resposta"), 1, "Falha de verifica\u00E7\u00E3o do tamanho da resposta"));
	this.addEventBehavior(new RPTEventStructure(new RPTFailVPEvent(), new RPTContinueEvent("Falha do Ponto de Verifica\u00E7\u00E3o de Conte\u00FAdo"), 1, "Falha do Ponto de Verifica\u00E7\u00E3o de Conte\u00FAdo"));
	this.addEventBehavior(new RPTEventStructure(new RPTConnectEvent(), new RPTContinueEvent("Conex\u00E3o com falha"), 1, "Conex\u00E3o com falha"));
	this.addEventBehavior(new RPTEventStructure(new RPTAuthenticationEvent(), new RPTContinueEvent("Autentica\u00E7\u00E3o com falha"), 1, "Autentica\u00E7\u00E3o com falha"));
	this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(), new RPTStopUserEvent("Fim do datapool atingido"), 1, "Fim do datapool atingido"));
	this.addEventBehavior(new RPTEventStructure(new RPTReferenceEvent(), new RPTContinueEvent("Falha ao extrair refer\u00EAncia"), 1, "Falha ao extrair refer\u00EAncia"));
	this.addEventBehavior(new RPTEventStructure(new RPTSubstitutionEvent(), new RPTContinueEvent("Falha na substitui\u00E7\u00E3o"), 1, "Falha na substitui\u00E7\u00E3o"));
	this.addEventBehavior(new RPTEventStructure(new RPTServerTimeoutEvent(), new RPTContinueEvent("Tempo Limite"), 1, "Tempo Limite"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeVPFailureEvent(), new RPTContinueEvent("Falha do Ponto de Verifica\u00E7\u00E3o Customizado"), 1, "Falha do Ponto de Verifica\u00E7\u00E3o Customizado"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeAlertEvent(), new RPTContinueEvent("C\u00F3digo Customizado relatou um Alerta"), 0, "C\u00F3digo Customizado relatou um Alerta"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(), new RPTStopUserEvent("O C\u00F3digo Customizado relatou uma exce\u00E7\u00E3o n\u00E3o manipulada"), 1, "O C\u00F3digo Customizado relatou uma exce\u00E7\u00E3o n\u00E3o manipulada"));
	}
	
	
	        	this.add(varAction_1(this));
	this.add(confCon_1(this));
	this.add(page_1(this));
	this.add(page_2(this));
			this.httpTestScriptHelper.executeHelper();

	    } catch (Throwable e) {
		     log("Test Execution: Novoteste_Test_A1E81F49F6E274F0CAE1B43930643466 ",e);
	    } finally {
	        super.execute();
		}	    
    }
    
	public void preFinish() {
		this.httpTestScriptHelper.preFinishHelper();

		super.preFinish();
	}
	
	public void stop() {
		
		super.stop();
	}	
	
	private VariableAction varAction_1(final IContainer parent) {

	VariableAction vc = new VariableAction(parent, "", "A1E81F49F6EC6000CAE1B43930643466");	
			vars[0] = new DataVar("novoteste_Host", "victorbathke.eti.br", IDataArea.TEST, "IGNORE", false, false);

	
		vars[1] = new DataVar("novoteste_Host_Port", "80", IDataArea.TEST, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}

	private IKAction confCon_1(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_1",
					(String)(vars[0].getValue()== null?"victorbathke.eti.br": (String)vars[0].getValue()),  // host name
					Integer.parseInt((String)(vars[1].getValue()== null?"80": (String)vars[1].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo  // proxy server info
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}

private HTTPPage page_1(final IContainer parent) {
			HTTPThink think = new HTTPThink(0, 1, parent, parent, "A1E81F49F7162F27CAE1B43930643466");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "victorbathke.eti.br", "A1E81F49F7162F27CAE1B43930643466") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(5, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_1(this, true, "A1E81F49F71544C0CAE1B43930643466", false, false,
						"Config_1", "victorbathke.eti.br/",	"/", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_2(this, false, "A1E81F49F71544C0CAE1B43930643466", false, true,
						"Config_1", "victorbathke.eti.br/institucional/",	"/institucional/", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_3(this, false, "A1E81F49F71544C0CAE1B43930643466", false, false,
						"Config_1", "victorbathke.eti.br/institucional/wp-content/themes/hoffman/genericons/A.genericons.css,qver=4.3.15.pagespeed.cf.2qEsp1_SKx.css",	"/institucional/wp-content/themes/hoffman/genericons/A.genericons.css,qver=4.3.15.pagespeed.cf.2qEsp1_SKx.css", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_4(this, false, "A1E81F49F7291AE0CAE1B43930643466", false, false,
						"Config_1", "victorbathke.eti.br/institucional/wp-content/themes/hoffman/js/flexslider.min.js,qver==4.3.15+global.js,qver==4.3.15.pagespeed.jc.cuiXH7xqVu.js",	"/institucional/wp-content/themes/hoffman/js/flexslider.min.js,qver==4.3.15+global.js,qver==4.3.15.pagespeed.jc.cuiXH7xqVu.js", true, false), 66, "A1E81F49F71DF750CAE1B43930643466", 3);
				httpParallel.addRequest(2, request_5(this, false, "A1E81F49F73F8910CAE1B43930643466", false, false,
						"Config_1", "victorbathke.eti.br/institucional/wp-includes/js/jquery/jquery-migrate.min.js,qver=1.2.1.pagespeed.jm.mhpNjdU8Wl.js",	"/institucional/wp-includes/js/jquery/jquery-migrate.min.js,qver=1.2.1.pagespeed.jm.mhpNjdU8Wl.js", true, false), 30, "A1E81F49F71DF750CAE1B43930643466", 3);
				httpParallel.addRequest(3, request_6(this, false, "A1E81F49F741ABF0CAE1B43930643466", true, false,
						"Config_1", "victorbathke.eti.br/institucional/wp-includes/js/jquery/jquery.js,qver=1.11.3.pagespeed.jm.zixJPNMRNN.js",	"/institucional/wp-includes/js/jquery/jquery.js,qver=1.11.3.pagespeed.jm.zixJPNMRNN.js", true, false), 1, "A1E81F49F71DF750CAE1B43930643466", 3);
				httpParallel.addRequest(4, request_7(this, false, "A1E81F49F743F5E2CAE1B43930643466", false, false,
						"Config_1", "victorbathke.eti.br/institucional/wp-content/themes/hoffman/A.style.css,qver=4.3.15.pagespeed.cf.Rno2ujUqqw.css",	"/institucional/wp-content/themes/hoffman/A.style.css,qver=4.3.15.pagespeed.cf.Rno2ujUqqw.css", true, false), 1, "A1E81F49F71DF750CAE1B43930643466", 3);
				httpParallel.addRequest(0, request_8(this, false, "A1E81F49F71544C0CAE1B43930643466", false, false,
						"Config_1", "victorbathke.eti.br/institucional/wp-content/uploads/2015/09/700x464x15945819523_c848f98657_k-1024x679.jpg.pagespeed.ic.DoMtOjzMKA.jpg",	"/institucional/wp-content/uploads/2015/09/700x464x15945819523_c848f98657_k-1024x679.jpg.pagespeed.ic.DoMtOjzMKA.jpg", true, false), 0, "null", 3);
				httpParallel.addRequest(4, request_9(this, false, "A1E81F49F743F5E2CAE1B43930643466", false, false,
						"Config_1", "victorbathke.eti.br/institucional/wp-content/uploads/2009/11/365x499x6944013_1GG.png.pagespeed.ic.tfgzOVAdZA.jpg",	"/institucional/wp-content/uploads/2009/11/365x499x6944013_1GG.png.pagespeed.ic.tfgzOVAdZA.jpg", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_10(this, false, "A1E81F49F7291AE0CAE1B43930643466", true, false,
						"Config_1", "victorbathke.eti.br/institucional/wp-content/uploads/2015/09/309x550xlivro-a-terceira-onda-alvin-toffler-22964-MLB20238643883_022015-F-576x1024.jpg.pagespeed.ic.yUfevSI1me.jpg",	"/institucional/wp-content/uploads/2015/09/309x550xlivro-a-terceira-onda-alvin-toffler-22964-MLB20238643883_022015-F-576x1024.jpg.pagespeed.ic.yUfevSI1me.jpg", true, false), 0, "null", 3);
				httpParallel.addRequest(2, request_11(this, false, "A1E81F49F73F8910CAE1B43930643466", true, false,
						"Config_1", "victorbathke.eti.br/institucional/wp-content/uploads/2015/09/314x440xfotoAmpliada_2410.jpg.pagespeed.ic.Kb0mH4XfYt.jpg",	"/institucional/wp-content/uploads/2015/09/314x440xfotoAmpliada_2410.jpg.pagespeed.ic.Kb0mH4XfYt.jpg", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_12(this, false, "A1E81F49F71544C0CAE1B43930643466", false, false,
						"Config_1", "victorbathke.eti.br/mod_pagespeed_beacon?ets=load:929&rload=1636&nav=417&dns=0&connect=0&req_start=425&ttfb=266&dwld=9&dom_c=1340&nt=0&ifr=0&url=http%3A%2F%2Fvictorbathke.eti.br%2Finstitucional%2F",	"/mod_pagespeed_beacon?ets=load:929&rload=1636&nav=417&dns=0&connect=0&req_start=425&ttfb=266&dwld=9&dom_c=1340&nt=0&ifr=0&url=http%3A%2F%2Fvictorbathke.eti.br%2Finstitucional%2F", true, false), 0, "null", 3);
				httpParallel.addRequest(4, request_13(this, false, "A1E81F49F743F5E2CAE1B43930643466", true, false,
						"Config_1", "victorbathke.eti.br/mod_pagespeed_beacon?url=http%3A%2F%2Fvictorbathke.eti.br%2Finstitucional%2F",	"/mod_pagespeed_beacon?url=http%3A%2F%2Fvictorbathke.eti.br%2Finstitucional%2F", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_14(this, false, "A1E81F49F71544C0CAE1B43930643466", true, false,
						"Config_1", "victorbathke.eti.br/favicon.ico",	"/favicon.ico", true, false), 0, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_1(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E81F49F7187917CAE1B43930643466", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "victorbathke.eti.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_1 = new DataSub();
	reqAction.addDataSub(subContainer_1);

		ISubRule sub_0 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_17", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E81F49F718EE40CAE1B43930643466",
			false,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_2(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E81F49F71DF750CAE1B43930643466", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "victorbathke.eti.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_1 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_1);

	harvestContainer_1.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[0], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[1], "&ifr=(.*?)\"", 2, 2, 0, 0, false, "ifr_3", null, 0, false);
	IDataSub subContainer_2 = new DataSub();
	reqAction.addDataSub(subContainer_2);

		ISubRule sub_1 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_16", null, 0, false);
	subContainer_2.addSubInstruction(sub_1);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E81F49F71DF753CAE1B43930643466",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html;charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_3(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E81F49F726D0F0CAE1B43930643466", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "victorbathke.eti.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://victorbathke.eti.br/institucional/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_3 = new DataSub();
	reqAction.addDataSub(subContainer_3);

		ISubRule sub_2 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_14", null, 0, false);
	subContainer_3.addSubInstruction(sub_2);
		ISubRule sub_3 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_15", null, 0, false);
	subContainer_3.addSubInstruction(sub_3);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E81F49F71DF750CAE1B43930643466"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E81F49F71DF750CAE1B43930643466"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E81F49F726F800CAE1B43930643466",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_4(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E81F49F72941F5CAE1B43930643466", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "victorbathke.eti.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://victorbathke.eti.br/institucional/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_4 = new DataSub();
	reqAction.addDataSub(subContainer_4);

		ISubRule sub_4 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_13", null, 0, false);
	subContainer_4.addSubInstruction(sub_4);
		ISubRule sub_5 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_14", null, 0, false);
	subContainer_4.addSubInstruction(sub_5);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E81F49F71DF750CAE1B43930643466"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E81F49F72941F8CAE1B43930643466",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_5(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E81F49F73FB025CAE1B43930643466", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "victorbathke.eti.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://victorbathke.eti.br/institucional/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_5 = new DataSub();
	reqAction.addDataSub(subContainer_5);

		ISubRule sub_6 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_12", null, 0, false);
	subContainer_5.addSubInstruction(sub_6);
		ISubRule sub_7 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_13", null, 0, false);
	subContainer_5.addSubInstruction(sub_7);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E81F49F71DF750CAE1B43930643466"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E81F49F73FB028CAE1B43930643466",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_6(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E81F49F741ABF8CAE1B43930643466", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "victorbathke.eti.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://victorbathke.eti.br/institucional/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_2 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_2);

	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[2], "=\\[\\],n\\.delegateCount=(.*?),", 1, 1, 0, 0, false, "[],n.delegateCount", null, 0, false);
	IDataSub subContainer_6 = new DataSub();
	reqAction.addDataSub(subContainer_6);

		ISubRule sub_8 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_11", null, 0, false);
	subContainer_6.addSubInstruction(sub_8);
		ISubRule sub_9 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_12", null, 0, false);
	subContainer_6.addSubInstruction(sub_9);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E81F49F71DF750CAE1B43930643466"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E81F49F741ABFBCAE1B43930643466",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_7(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E81F49F743F5EACAE1B43930643466", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "victorbathke.eti.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://victorbathke.eti.br/institucional/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_7 = new DataSub();
	reqAction.addDataSub(subContainer_7);

		ISubRule sub_10 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_10", null, 0, false);
	subContainer_7.addSubInstruction(sub_10);
		ISubRule sub_11 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_11", null, 0, false);
	subContainer_7.addSubInstruction(sub_11);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E81F49F71DF750CAE1B43930643466"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E81F49F743F5EDCAE1B43930643466",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_8(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E81F49F744924FCAE1B43930643466", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "victorbathke.eti.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://victorbathke.eti.br/institucional/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_8 = new DataSub();
	reqAction.addDataSub(subContainer_8);

		ISubRule sub_12 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_9", null, 0, false);
	subContainer_8.addSubInstruction(sub_12);
		ISubRule sub_13 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_10", null, 0, false);
	subContainer_8.addSubInstruction(sub_13);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E81F49F71DF750CAE1B43930643466"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E81F49F7449252CAE1B43930643466",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_9(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E81F49F74B48E0CAE1B43930643466", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "victorbathke.eti.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://victorbathke.eti.br/institucional/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_9 = new DataSub();
	reqAction.addDataSub(subContainer_9);

		ISubRule sub_14 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_8", null, 0, false);
	subContainer_9.addSubInstruction(sub_14);
		ISubRule sub_15 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_9", null, 0, false);
	subContainer_9.addSubInstruction(sub_15);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E81F49F71DF750CAE1B43930643466"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E81F49F74B48E3CAE1B43930643466",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_10(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E81F49F74D6BC0CAE1B43930643466", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "victorbathke.eti.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://victorbathke.eti.br/institucional/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_10 = new DataSub();
	reqAction.addDataSub(subContainer_10);

		ISubRule sub_16 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_7", null, 0, false);
	subContainer_10.addSubInstruction(sub_16);
		ISubRule sub_17 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_8", null, 0, false);
	subContainer_10.addSubInstruction(sub_17);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E81F49F71DF750CAE1B43930643466"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E81F49F74D6BC3CAE1B43930643466",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_11(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E81F49F74ECB53CAE1B43930643466", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "victorbathke.eti.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://victorbathke.eti.br/institucional/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_11 = new DataSub();
	reqAction.addDataSub(subContainer_11);

		ISubRule sub_18 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_6", null, 0, false);
	subContainer_11.addSubInstruction(sub_18);
		ISubRule sub_19 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_7", null, 0, false);
	subContainer_11.addSubInstruction(sub_19);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E81F49F71DF750CAE1B43930643466"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E81F49F74ECB56CAE1B43930643466",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_12(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E81F49F74F6793CAE1B43930643466", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "victorbathke.eti.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://victorbathke.eti.br/institucional/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_12 = new DataSub();
	reqAction.addDataSub(subContainer_12);

		ISubRule sub_20 = new SubRule("req_uri", 120, 1, true, (IDCCoreVar)dcVars[1], false, "ifr", null, 0, false);
	subContainer_12.addSubInstruction(sub_20);
		ISubRule sub_21 = new SubRule("req_uri", 114, 1, true, (IDCCoreVar)dcVars[2], false, "nt", null, 0, false);
	subContainer_12.addSubInstruction(sub_21);
		ISubRule sub_22 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_5", null, 0, false);
	subContainer_12.addSubInstruction(sub_22);
		ISubRule sub_23 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_6", null, 0, false);
	subContainer_12.addSubInstruction(sub_23);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E81F49F71DF750CAE1B43930643466"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E81F49F741ABF8CAE1B43930643466"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E81F49F71DF750CAE1B43930643466"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E81F49F74F6796CAE1B43930643466",
			false,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_13(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E81F49F74FDCC0CAE1B43930643466", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(9);
					
		headers.add(new RequestHeaderData("Host", "victorbathke.eti.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://victorbathke.eti.br/institucional/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/x-www-form-urlencoded", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "41", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_1(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_13 = new DataSub();
	reqAction.addDataSub(subContainer_13);

		ISubRule sub_24 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_4", null, 0, false);
	subContainer_13.addSubInstruction(sub_24);
		ISubRule sub_25 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_5", null, 0, false);
	subContainer_13.addSubInstruction(sub_25);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E81F49F71DF750CAE1B43930643466"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E81F49F74FDCC3CAE1B43930643466",
			false,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_1(HTTPPostData postData) {
				StringBuffer strBuf_1 = new StringBuffer();
strBuf_1.append("oh=Tu9mQqS46b&n=6IYYGvbk1rY&ci=1195944464");
String requestData_1 = strBuf_1.toString();
			
	HTTPPostDataChunk pdc_0 = new HTTPPostDataChunk("A1E81F49F750A010CAE1B43930643466", postData, requestData_1, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_0);

	}

	public HTTPAction request_14(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E81F49F750EE34CAE1B43930643466", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "victorbathke.eti.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Sat, 05 Jan 2013 18:15:35 GMT", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "\"d4172c-47e-4d28e9511bfc0\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_14 = new DataSub();
	reqAction.addDataSub(subContainer_14);

		ISubRule sub_26 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_4", null, 0, false);
	subContainer_14.addSubInstruction(sub_26);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E81F49F750EE37CAE1B43930643466",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/x-icon");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
private HTTPPage page_2(final IContainer parent) {
			HTTPThink think = new HTTPThink(5, 1000, parent, parent, "A1E81F49F753FB78CAE1B43930643466");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "Sobre Victor | victorbathke.eti.br", "A1E81F49F753FB78CAE1B43930643466") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_15(this, true, "A1E81F49F753FB70CAE1B43930643466", false, true,
						"Config_1", "victorbathke.eti.br/institucional/sobre/",	"/institucional/sobre/", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_16(this, false, "A1E81F49F753FB70CAE1B43930643466", false, false,
						"Config_1", "victorbathke.eti.br/institucional/wp-includes,_js,_jquery,_jquery-migrate.min.js,qver==1.2.1+wp-content,_themes,_hoffman,_js,_flexslider.min.js,qver==4.3.15+wp-content,_themes,_hoffman,_js,_global.js,qver==4.3.15+wp-includes,_js,_comment-reply.min.js,qver==4.3.15.pagespeed.jc.U0v000dl7c.js",	"/institucional/wp-includes,_js,_jquery,_jquery-migrate.min.js,qver==1.2.1+wp-content,_themes,_hoffman,_js,_flexslider.min.js,qver==4.3.15+wp-content,_themes,_hoffman,_js,_global.js,qver==4.3.15+wp-includes,_js,_comment-reply.min.js,qver==4.3.15.pagespeed.jc.U0v000dl7c.js", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_17(this, false, "A1E81F49F753FB70CAE1B43930643466", true, false,
						"Config_1", "victorbathke.eti.br/mod_pagespeed_beacon?ets=load:245&rload=717&nav=0&dns=0&connect=0&req_start=10&ttfb=450&dwld=0&dom_c=577&nt=0&ifr=0&ref=http%3A%2F%2Fvictorbathke.eti.br%2Finstitucional%2F&url=http%3A%2F%2Fvictorbathke.eti.br%2Finstitucional%2Fsobre%2F",	"/mod_pagespeed_beacon?ets=load:245&rload=717&nav=0&dns=0&connect=0&req_start=10&ttfb=450&dwld=0&dom_c=577&nt=0&ifr=0&ref=http%3A%2F%2Fvictorbathke.eti.br%2Finstitucional%2F&url=http%3A%2F%2Fvictorbathke.eti.br%2Finstitucional%2Fsobre%2F", true, false), 0, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_15(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E81F49F753FB7CCAE1B43930643466", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "victorbathke.eti.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://victorbathke.eti.br/institucional/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_3 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_3);

	harvestContainer_3.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[3], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_2", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[4], "&ifr=(.*?)\"", 2, 2, 0, 0, false, "ifr_4", null, 0, false);
	IDataSub subContainer_15 = new DataSub();
	reqAction.addDataSub(subContainer_15);

		ISubRule sub_27 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[0], false, "Referer_3", null, 0, false);
	subContainer_15.addSubInstruction(sub_27);
		ISubRule sub_28 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_3", null, 0, false);
	subContainer_15.addSubInstruction(sub_28);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E81F49F753FB7FCAE1B43930643466",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html;charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_16(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E81F49F75952A0CAE1B43930643466", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "victorbathke.eti.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://victorbathke.eti.br/institucional/sobre/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_4 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_4);

	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[5], "\"\\}\\)\\.appendTo\\(a\\)\\.append\\(a\\.container\\),a\\.cloneCount=(.*?),", 1, 1, 0, 0, false, "}).appendTo(a).append(a.container),a.cloneCount", null, 0, false);
	IDataSub subContainer_16 = new DataSub();
	reqAction.addDataSub(subContainer_16);

		ISubRule sub_29 = new SubRule("req_hdr_Referer_1", 0, 47, false, (IDCCoreVar)dcVars[3], false, "Referer_2", null, 0, false);
	subContainer_16.addSubInstruction(sub_29);
		ISubRule sub_30 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_2", null, 0, false);
	subContainer_16.addSubInstruction(sub_30);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E81F49F753FB7CCAE1B43930643466"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E81F49F753FB7CCAE1B43930643466"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E81F49F75979B0CAE1B43930643466",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_17(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E81F49F759EEE0CAE1B43930643466", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "victorbathke.eti.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://victorbathke.eti.br/institucional/sobre/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_17 = new DataSub();
	reqAction.addDataSub(subContainer_17);

		ISubRule sub_31 = new SubRule("req_uri", 115, 1, true, (IDCCoreVar)dcVars[4], false, "ifr", null, 0, false);
	subContainer_17.addSubInstruction(sub_31);
		ISubRule sub_32 = new SubRule("req_uri", 109, 1, true, (IDCCoreVar)dcVars[5], false, "nt", null, 0, false);
	subContainer_17.addSubInstruction(sub_32);
		ISubRule sub_33 = new SubRule("req_hdr_Referer_1", 0, 47, false, (IDCCoreVar)dcVars[3], false, "Referer", null, 0, false);
	subContainer_17.addSubInstruction(sub_33);
		ISubRule sub_34 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host", null, 0, false);
	subContainer_17.addSubInstruction(sub_34);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E81F49F753FB7CCAE1B43930643466"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E81F49F753FB7CCAE1B43930643466"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E81F49F75952A0CAE1B43930643466"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E81F49F759EEE3CAE1B43930643466",
			false,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
}
