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
public class Teste2_Test_A1E80948E68E2250FD8EE33930653439 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPPostDataChunk");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPAction");
    }
	private IDataCorrelationVar[] dcVars = DataCorrelationVar.getArrayDCVars(8);
	private DataVar[] vars = new DataVar[2];
	
    
    
private HTTPTestScriptHelper httpTestScriptHelper;

	private HTTPTestScriptHelper getHTTPTest() {
		return httpTestScriptHelper;
	}

	
	public Teste2_Test_A1E80948E68E2250FD8EE33930653439(IContainer container, String invocationId) {
		super(container, "teste2", invocationId, "A1E80948E68E2250FD8EE33930653439");
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
			this.httpTestScriptHelper.executeHelper();

	    } catch (Throwable e) {
		     log("Test Execution: Teste2_Test_A1E80948E68E2250FD8EE33930653439 ",e);
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

	VariableAction vc = new VariableAction(parent, "", "A1E80948E68E9793FD8EE33930653439");	
			vars[0] = new DataVar("teste2_Host", "victorbathke.eti.br", IDataArea.TEST, "IGNORE", false, false);

	
		vars[1] = new DataVar("teste2_Host_Port", "80", IDataArea.TEST, "IGNORE", false, false);

		
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
			HTTPThink think = new HTTPThink(0, 1, parent, parent, "A1E80948E699BB18FD8EE33930653439");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "victorbathke.eti.br", "A1E80948E699BB18FD8EE33930653439") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(6, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_1(this, true, "A1E80948E699BB10FD8EE33930653439", false, false,
						"Config_1", "victorbathke.eti.br/",	"/", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_2(this, false, "A1E80948E699BB10FD8EE33930653439", false, false,
						"Config_1", "victorbathke.eti.br/institucional",	"/institucional", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_3(this, false, "A1E80948E699BB10FD8EE33930653439", false, true,
						"Config_1", "victorbathke.eti.br/institucional/",	"/institucional/", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_4(this, false, "A1E80948E699BB10FD8EE33930653439", false, false,
						"Config_1", "victorbathke.eti.br/institucional/wp-content/themes/hoffman/genericons/A.genericons.css,qver=4.3.15.pagespeed.cf.uKvhMWO4BX.css",	"/institucional/wp-content/themes/hoffman/genericons/A.genericons.css,qver=4.3.15.pagespeed.cf.uKvhMWO4BX.css", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_5(this, false, "A1E80948E6B30F70FD8EE33930653439", false, false,
						"Config_1", "victorbathke.eti.br/institucional/wp-content/themes/hoffman/js/flexslider.min.js?ver=4.3.15",	"/institucional/wp-content/themes/hoffman/js/flexslider.min.js?ver=4.3.15", true, false), 47, "A1E80948E69D3D80FD8EE33930653439", 2);
				httpParallel.addRequest(2, request_6(this, false, "A1E80948E6B4E430FD8EE33930653439", true, false,
						"Config_1", "victorbathke.eti.br/institucional/wp-includes/js/jquery/jquery-migrate.min.js?ver=1.2.1",	"/institucional/wp-includes/js/jquery/jquery-migrate.min.js?ver=1.2.1", true, false), 47, "A1E80948E69D3D80FD8EE33930653439", 2);
				httpParallel.addRequest(3, request_7(this, false, "A1E80948E6B580AFFD8EE33930653439", false, false,
						"Config_1", "victorbathke.eti.br/institucional/wp-includes/js/jquery/jquery.js?ver=1.11.3",	"/institucional/wp-includes/js/jquery/jquery.js?ver=1.11.3", true, false), 47, "A1E80948E69D3D80FD8EE33930653439", 2);
				httpParallel.addRequest(4, request_8(this, false, "A1E80948E6B77C63FD8EE33930653439", false, false,
						"Config_1", "victorbathke.eti.br/institucional/wp-content/themes/hoffman/style.css?ver=4.3.15",	"/institucional/wp-content/themes/hoffman/style.css?ver=4.3.15", true, false), 46, "A1E80948E69D3D80FD8EE33930653439", 2);
				httpParallel.addRequest(5, request_9(this, false, "A1E80948E6B83FC3FD8EE33930653439", true, false,
						"Config_1", "victorbathke.eti.br/institucional/wp-content/themes/hoffman/js/global.js?ver=4.3.15",	"/institucional/wp-content/themes/hoffman/js/global.js?ver=4.3.15", true, false), 47, "A1E80948E69D3D80FD8EE33930653439", 2);
				httpParallel.addRequest(0, request_10(this, false, "A1E80948E699BB10FD8EE33930653439", false, false,
						"Config_1", "victorbathke.eti.br/institucional/wp-content/uploads/2009/11/6944013_1GG.png",	"/institucional/wp-content/uploads/2009/11/6944013_1GG.png", true, false), 214, "A1E80948E69D3D80FD8EE33930653439", 2);
				httpParallel.addRequest(3, request_11(this, false, "A1E80948E6B580AFFD8EE33930653439", false, false,
						"Config_1", "victorbathke.eti.br/institucional/wp-content/uploads/2015/09/15945819523_c848f98657_k-1024x679.jpg",	"/institucional/wp-content/uploads/2015/09/15945819523_c848f98657_k-1024x679.jpg", true, false), 0, "null", 3);
				httpParallel.addRequest(4, request_12(this, false, "A1E80948E6B77C63FD8EE33930653439", true, false,
						"Config_1", "victorbathke.eti.br/institucional/wp-content/uploads/2015/09/livro-a-terceira-onda-alvin-toffler-22964-MLB20238643883_022015-F-576x1024.jpg",	"/institucional/wp-content/uploads/2015/09/livro-a-terceira-onda-alvin-toffler-22964-MLB20238643883_022015-F-576x1024.jpg", true, false), 215, "A1E80948E69D3D80FD8EE33930653439", 2);
				httpParallel.addRequest(1, request_13(this, false, "A1E80948E6B30F70FD8EE33930653439", true, false,
						"Config_1", "victorbathke.eti.br/institucional/wp-content/uploads/2015/09/fotoAmpliada_2410.jpg",	"/institucional/wp-content/uploads/2015/09/fotoAmpliada_2410.jpg", true, false), 216, "A1E80948E69D3D80FD8EE33930653439", 2);
				httpParallel.addRequest(3, request_14(this, false, "A1E80948E6B580AFFD8EE33930653439", false, false,
						"Config_1", "victorbathke.eti.br/mod_pagespeed_beacon?ets=load:933&rload=1803&nav=572&dns=0&connect=0&req_start=575&ttfb=273&dwld=12&dom_c=1531&nt=0&ifr=0&dpr=2&url=http%3A%2F%2Fvictorbathke.eti.br%2Finstitucional%2F",	"/mod_pagespeed_beacon?ets=load:933&rload=1803&nav=572&dns=0&connect=0&req_start=575&ttfb=273&dwld=12&dom_c=1531&nt=0&ifr=0&dpr=2&url=http%3A%2F%2Fvictorbathke.eti.br%2Finstitucional%2F", true, false), 962, "A1E80948E69D3D80FD8EE33930653439", 2);
				httpParallel.addRequest(0, request_15(this, false, "A1E80948E699BB10FD8EE33930653439", true, false,
						"Config_1", "victorbathke.eti.br/mod_pagespeed_beacon?url=http%3A%2F%2Fvictorbathke.eti.br%2Finstitucional%2F",	"/mod_pagespeed_beacon?url=http%3A%2F%2Fvictorbathke.eti.br%2Finstitucional%2F", true, false), 974, "A1E80948E69D3D80FD8EE33930653439", 2);
				httpParallel.addRequest(3, request_16(this, false, "A1E80948E6B580AFFD8EE33930653439", true, false,
						"Config_1", "victorbathke.eti.br/favicon.ico",	"/favicon.ico", true, false), 4, "A1E80948E6C31529FD8EE33930653439", 3);
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E80948E699E22AFD8EE33930653439", getHTTPTest());
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

	harvestContainer_1.addHarvestInstruction ("resp_hdr_Location_1", dcVars[0], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location", null, 0, false);
	IDataSub subContainer_1 = new DataSub();
	reqAction.addDataSub(subContainer_1);

		ISubRule sub_0 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_16", null, 0, false);
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
			"A1E80948E699E22DFD8EE33930653439",
			true,
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E80948E69CC850FD8EE33930653439", getHTTPTest());
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
			IDataHarvester harvestContainer_2 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_2);

	harvestContainer_2.addHarvestInstruction ("resp_hdr_Location_1", dcVars[1], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location_2", null, 0, false);
	IDataSub subContainer_2 = new DataSub();
	reqAction.addDataSub(subContainer_2);

		ISubRule sub_1 = new SubRule("req_uri", 0, 14, false, (IDCCoreVar)dcVars[0], false, "victorbathke.eti.br_url_2", null, 0, false);
	subContainer_2.addSubInstruction(sub_1);
		ISubRule sub_2 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_15", null, 0, false);
	subContainer_2.addSubInstruction(sub_2);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E80948E699E22AFD8EE33930653439"), 3);		
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
			"ISO-8859-1",
			"A1E80948E69CC853FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(301);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=iso-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_3(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E80948E69D3D80FD8EE33930653439", getHTTPTest());
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
			IDataHarvester harvestContainer_3 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_3);

	harvestContainer_3.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[2], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[3], "\\?ver=(.*?)\"", 1, 1, 0, 0, false, "ver_6", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[4], "\\?ver=(.*?)'", 2, 2, 0, 0, false, "ver_7", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[5], "\\?ver=(.*?)'", 3, 1, 0, 0, false, "ver_8", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[6], "&ifr=(.*?)\"", 2, 2, 0, 0, false, "ifr_2", null, 0, false);
	IDataSub subContainer_3 = new DataSub();
	reqAction.addDataSub(subContainer_3);

		ISubRule sub_3 = new SubRule("req_uri", 0, 15, false, (IDCCoreVar)dcVars[1], false, "victorbathke.eti.br_url", null, 0, false);
	subContainer_3.addSubInstruction(sub_3);
		ISubRule sub_4 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_14", null, 0, false);
	subContainer_3.addSubInstruction(sub_4);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E80948E69CC850FD8EE33930653439"), 3);		
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
			"A1E80948E69D3D83FD8EE33930653439",
			true,
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

	public HTTPAction request_4(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E80948E6A49080FD8EE33930653439", getHTTPTest());
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
			IDataSub subContainer_4 = new DataSub();
	reqAction.addDataSub(subContainer_4);

		ISubRule sub_5 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[2], false, "Referer_12", null, 0, false);
	subContainer_4.addSubInstruction(sub_5);
		ISubRule sub_6 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_13", null, 0, false);
	subContainer_4.addSubInstruction(sub_6);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E80948E69D3D80FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E80948E69D3D80FD8EE33930653439"), 3);		
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
			"A1E80948E6A49083FD8EE33930653439",
			true,
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

	public HTTPAction request_5(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E80948E6B30F78FD8EE33930653439", getHTTPTest());
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

		ISubRule sub_7 = new SubRule("req_uri", 66, 6, true, (IDCCoreVar)dcVars[3], false, "ver", null, 0, false);
	subContainer_5.addSubInstruction(sub_7);
		ISubRule sub_8 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[2], false, "Referer_11", null, 0, false);
	subContainer_5.addSubInstruction(sub_8);
		ISubRule sub_9 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_12", null, 0, false);
	subContainer_5.addSubInstruction(sub_9);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E80948E69D3D80FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E80948E69D3D80FD8EE33930653439"), 3);		
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
			"A1E80948E6B30F7BFD8EE33930653439",
			true,
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E80948E6B4E438FD8EE33930653439", getHTTPTest());
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
			IDataSub subContainer_6 = new DataSub();
	reqAction.addDataSub(subContainer_6);

		ISubRule sub_10 = new SubRule("req_uri", 63, 5, true, (IDCCoreVar)dcVars[5], false, "ver", null, 0, false);
	subContainer_6.addSubInstruction(sub_10);
		ISubRule sub_11 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[2], false, "Referer_10", null, 0, false);
	subContainer_6.addSubInstruction(sub_11);
		ISubRule sub_12 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_11", null, 0, false);
	subContainer_6.addSubInstruction(sub_12);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E80948E69D3D80FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E80948E69D3D80FD8EE33930653439"), 3);		
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
			"A1E80948E6B4E43BFD8EE33930653439",
			true,
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

	public HTTPAction request_7(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E80948E6B580B7FD8EE33930653439", getHTTPTest());
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
			IDataHarvester harvestContainer_4 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_4);

	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[7], "=\\[\\],n\\.delegateCount=(.*?),", 1, 1, 0, 0, false, "[],n.delegateCount", null, 0, false);
	IDataSub subContainer_7 = new DataSub();
	reqAction.addDataSub(subContainer_7);

		ISubRule sub_13 = new SubRule("req_uri", 51, 6, true, (IDCCoreVar)dcVars[4], false, "ver", null, 0, false);
	subContainer_7.addSubInstruction(sub_13);
		ISubRule sub_14 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[2], false, "Referer_9", null, 0, false);
	subContainer_7.addSubInstruction(sub_14);
		ISubRule sub_15 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_10", null, 0, false);
	subContainer_7.addSubInstruction(sub_15);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E80948E69D3D80FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E80948E69D3D80FD8EE33930653439"), 3);		
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
			"A1E80948E6B580BAFD8EE33930653439",
			true,
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

	public HTTPAction request_8(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E80948E6B7A352FD8EE33930653439", getHTTPTest());
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
			IDataSub subContainer_8 = new DataSub();
	reqAction.addDataSub(subContainer_8);

		ISubRule sub_16 = new SubRule("req_uri", 55, 6, true, (IDCCoreVar)dcVars[3], false, "ver", null, 0, false);
	subContainer_8.addSubInstruction(sub_16);
		ISubRule sub_17 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[2], false, "Referer_8", null, 0, false);
	subContainer_8.addSubInstruction(sub_17);
		ISubRule sub_18 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_9", null, 0, false);
	subContainer_8.addSubInstruction(sub_18);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E80948E69D3D80FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E80948E69D3D80FD8EE33930653439"), 3);		
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
			"A1E80948E6B7A355FD8EE33930653439",
			true,
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

	public HTTPAction request_9(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E80948E6B866A0FD8EE33930653439", getHTTPTest());
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

		ISubRule sub_19 = new SubRule("req_uri", 58, 6, true, (IDCCoreVar)dcVars[3], false, "ver", null, 0, false);
	subContainer_9.addSubInstruction(sub_19);
		ISubRule sub_20 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[2], false, "Referer_7", null, 0, false);
	subContainer_9.addSubInstruction(sub_20);
		ISubRule sub_21 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_8", null, 0, false);
	subContainer_9.addSubInstruction(sub_21);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E80948E69D3D80FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E80948E69D3D80FD8EE33930653439"), 3);		
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
			"A1E80948E6B866A3FD8EE33930653439",
			true,
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

	public HTTPAction request_10(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E80948E6B8B4C1FD8EE33930653439", getHTTPTest());
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

		ISubRule sub_22 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[2], false, "Referer_6", null, 0, false);
	subContainer_10.addSubInstruction(sub_22);
		ISubRule sub_23 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_7", null, 0, false);
	subContainer_10.addSubInstruction(sub_23);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E80948E69D3D80FD8EE33930653439"), 3);		
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
			"A1E80948E6B8B4C4FD8EE33930653439",
			true,
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

	public HTTPAction request_11(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E80948E6BA6290FD8EE33930653439", getHTTPTest());
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

		ISubRule sub_24 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[2], false, "Referer_5", null, 0, false);
	subContainer_11.addSubInstruction(sub_24);
		ISubRule sub_25 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_6", null, 0, false);
	subContainer_11.addSubInstruction(sub_25);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E80948E69D3D80FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E80948E69D3D80FD8EE33930653439"), 3);		
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
			"A1E80948E6BA6293FD8EE33930653439",
			true,
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E80948E6C11930FD8EE33930653439", getHTTPTest());
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

		ISubRule sub_26 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[2], false, "Referer_4", null, 0, false);
	subContainer_12.addSubInstruction(sub_26);
		ISubRule sub_27 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_5", null, 0, false);
	subContainer_12.addSubInstruction(sub_27);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E80948E69D3D80FD8EE33930653439"), 3);		
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
			"A1E80948E6C11933FD8EE33930653439",
			true,
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

	public HTTPAction request_13(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E80948E6C278C3FD8EE33930653439", getHTTPTest());
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
			IDataSub subContainer_13 = new DataSub();
	reqAction.addDataSub(subContainer_13);

		ISubRule sub_28 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[2], false, "Referer_3", null, 0, false);
	subContainer_13.addSubInstruction(sub_28);
		ISubRule sub_29 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_4", null, 0, false);
	subContainer_13.addSubInstruction(sub_29);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E80948E69D3D80FD8EE33930653439"), 3);		
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
			"A1E80948E6C278C6FD8EE33930653439",
			true,
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

	public HTTPAction request_14(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E80948E6C2EDF3FD8EE33930653439", getHTTPTest());
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
			IDataSub subContainer_14 = new DataSub();
	reqAction.addDataSub(subContainer_14);

		ISubRule sub_30 = new SubRule("req_uri", 121, 1, true, (IDCCoreVar)dcVars[6], false, "ifr", null, 0, false);
	subContainer_14.addSubInstruction(sub_30);
		ISubRule sub_31 = new SubRule("req_uri", 115, 1, true, (IDCCoreVar)dcVars[7], false, "nt", null, 0, false);
	subContainer_14.addSubInstruction(sub_31);
		ISubRule sub_32 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[2], false, "Referer_2", null, 0, false);
	subContainer_14.addSubInstruction(sub_32);
		ISubRule sub_33 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_3", null, 0, false);
	subContainer_14.addSubInstruction(sub_33);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E80948E69D3D80FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E80948E69D3D80FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E80948E6B580B7FD8EE33930653439"), 3);		
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
			"A1E80948E6C2EDF6FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_15(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E80948E6C31529FD8EE33930653439", getHTTPTest());
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
			IDataSub subContainer_15 = new DataSub();
	reqAction.addDataSub(subContainer_15);

		ISubRule sub_34 = new SubRule("req_hdr_Referer_1", 0, 41, false, (IDCCoreVar)dcVars[2], false, "Referer", null, 0, false);
	subContainer_15.addSubInstruction(sub_34);
		ISubRule sub_35 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host_2", null, 0, false);
	subContainer_15.addSubInstruction(sub_35);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E80948E69D3D80FD8EE33930653439"), 3);		
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
			"A1E80948E6C3152CFD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_1(HTTPPostData postData) {
				StringBuffer strBuf_1 = new StringBuffer();
strBuf_1.append("oh=V8OcMkNZcR&n=FrmlyZM9XIM&ci=1195944464");
String requestData_1 = strBuf_1.toString();
			
	HTTPPostDataChunk pdc_0 = new HTTPPostDataChunk("A1E80948E6C3D850FD8EE33930653439", postData, requestData_1, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_0);

	}

	public HTTPAction request_16(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E80948E6C3FF81FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(6);
					
		headers.add(new RequestHeaderData("Host", "victorbathke.eti.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_16 = new DataSub();
	reqAction.addDataSub(subContainer_16);

		ISubRule sub_36 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[0], false, "Host", null, 0, false);
	subContainer_16.addSubInstruction(sub_36);
	


		
				
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
			"A1E80948E6C3FF84FD8EE33930653439",
			true,
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
}
