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
public class Teste2_Test_A1E8094A2FEA8A50FD8EE33930653439 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPPostDataChunk");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPAction");
    }
	private IDataCorrelationVar[] dcVars = DataCorrelationVar.getArrayDCVars(50);
	private DataVar[] vars = new DataVar[62];
	
    
    
private HTTPTestScriptHelper httpTestScriptHelper;

	private HTTPTestScriptHelper getHTTPTest() {
		return httpTestScriptHelper;
	}

	
	public Teste2_Test_A1E8094A2FEA8A50FD8EE33930653439(IContainer container, String invocationId) {
		super(container, "teste2", invocationId, "A1E8094A2FEA8A50FD8EE33930653439");
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
	this.add(confCon_2(this));
	this.add(confCon_3(this));
	this.add(confCon_4(this));
	this.add(confCon_5(this));
	this.add(confCon_6(this));
	this.add(confCon_7(this));
	this.add(confCon_8(this));
	this.add(confCon_9(this));
	this.add(confCon_10(this));
	this.add(confCon_11(this));
	this.add(confCon_12(this));
	this.add(confCon_13(this));
	this.add(confCon_14(this));
	this.add(confCon_15(this));
	this.add(confCon_16(this));
	this.add(confCon_17(this));
	this.add(confCon_18(this));
	this.add(confCon_19(this));
	this.add(confCon_20(this));
	this.add(confCon_21(this));
	this.add(confCon_22(this));
	this.add(confCon_23(this));
	this.add(confCon_24(this));
	this.add(confCon_25(this));
	this.add(confCon_26(this));
	this.add(confCon_27(this));
	this.add(confCon_28(this));
	this.add(confCon_29(this));
	this.add(confCon_30(this));
	this.add(confCon_31(this));
	this.add(page_1(this));
			this.httpTestScriptHelper.executeHelper();

	    } catch (Throwable e) {
		     log("Test Execution: Teste2_Test_A1E8094A2FEA8A50FD8EE33930653439 ",e);
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

	VariableAction vc = new VariableAction(parent, "", "A1E8094A2FEAFF93FD8EE33930653439");	
			vars[0] = new DataVar("teste2_Host", "t.tailtarget.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[1] = new DataVar("teste2_Host_1", "tt-12340-4.seg.t.tailtarget.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[2] = new DataVar("teste2_Host_2", "tt-10162-1.seg.t.tailtarget.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[3] = new DataVar("teste2_Host_3", "b.t.tailtarget.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[4] = new DataVar("teste2_Host_4", "cm.t.tailtarget.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[5] = new DataVar("teste2_Host_5", "cm.g.doubleclick.net", IDataArea.TEST, "IGNORE", false, false);

	
		vars[6] = new DataVar("teste2_Host_6", "d.tailtarget.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[7] = new DataVar("teste2_Host_7", "ping.chartbeat.net", IDataArea.TEST, "IGNORE", false, false);

	
		vars[8] = new DataVar("teste2_Host_8", "detectportal.firefox.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[9] = new DataVar("teste2_Host_9", "tracker.bt.uol.com.br", IDataArea.TEST, "IGNORE", false, false);

	
		vars[10] = new DataVar("teste2_Host_10", "static.chartbeat.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[11] = new DataVar("teste2_Host_11", "b.scorecardresearch.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[12] = new DataVar("teste2_Host_12", "me.jsuol.com.br", IDataArea.TEST, "IGNORE", false, false);

	
		vars[13] = new DataVar("teste2_Host_13", "tm.jsuol.com.br", IDataArea.TEST, "IGNORE", false, false);

	
		vars[14] = new DataVar("teste2_Host_14", "www.googletagservices.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[15] = new DataVar("teste2_Host_15", "ivccf.ivcbrasil.org.br", IDataArea.TEST, "IGNORE", false, false);

	
		vars[16] = new DataVar("teste2_Host_16", "f.i.uol.com.br", IDataArea.TEST, "IGNORE", false, false);

	
		vars[17] = new DataVar("teste2_Host_17", "paywall.folha.uol.com.br", IDataArea.TEST, "IGNORE", false, false);

	
		vars[18] = new DataVar("teste2_Host_18", "ivccftag.ivcbrasil.org.br", IDataArea.TEST, "IGNORE", false, false);

	
		vars[19] = new DataVar("teste2_Host_19", "tempo.folha.uol.com.br", IDataArea.TEST, "IGNORE", false, false);

	
		vars[20] = new DataVar("teste2_Host_20", "www1.folha.uol.com.br", IDataArea.TEST, "IGNORE", false, false);

	
		vars[21] = new DataVar("teste2_Host_21", "platform.twitter.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[22] = new DataVar("teste2_Host_22", "cdn.navdmp.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[23] = new DataVar("teste2_Host_23", "static.folha.uol.com.br", IDataArea.TEST, "IGNORE", false, false);

	
		vars[24] = new DataVar("teste2_Host_24", "mab.chartbeat.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[25] = new DataVar("teste2_Host_25", "images1.folha.com.br", IDataArea.TEST, "IGNORE", false, false);

	
		vars[26] = new DataVar("teste2_Host_26", "usr.navdmp.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[27] = new DataVar("teste2_Host_27", "jsuol.com.br", IDataArea.TEST, "IGNORE", false, false);

	
		vars[28] = new DataVar("teste2_Host_28", "tag.navdmp.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[29] = new DataVar("teste2_Host_29", "www.folha.uol.com.br", IDataArea.TEST, "IGNORE", false, false);

	
		vars[30] = new DataVar("teste2_Host_30", "folha.com.br", IDataArea.TEST, "IGNORE", false, false);

	
		vars[31] = new DataVar("teste2_Host_Port", "80", IDataArea.TEST, "IGNORE", false, false);

	
		vars[32] = new DataVar("teste2_Host_4_Port", "80", IDataArea.TEST, "IGNORE", false, false);

	
		vars[33] = new DataVar("teste2_Host_3_Port", "80", IDataArea.TEST, "IGNORE", false, false);

	
		vars[34] = new DataVar("teste2_Host_2_Port", "80", IDataArea.TEST, "IGNORE", false, false);

	
		vars[35] = new DataVar("teste2_Host_5_Port", "80", IDataArea.TEST, "IGNORE", false, false);

	
		vars[36] = new DataVar("teste2_Host_7_Port", "80", IDataArea.TEST, "IGNORE", false, false);

	
		vars[37] = new DataVar("teste2_Host_6_Port", "80", IDataArea.TEST, "IGNORE", false, false);

	
		vars[38] = new DataVar("teste2_Host_9_Port", "80", IDataArea.TEST, "IGNORE", false, false);

	
		vars[39] = new DataVar("teste2_Host_11_Port", "80", IDataArea.TEST, "IGNORE", false, false);

	
		vars[40] = new DataVar("teste2_Host_1_Port", "80", IDataArea.TEST, "IGNORE", false, false);

	
		vars[41] = new DataVar("teste2_Host_12_Port", "80", IDataArea.TEST, "IGNORE", false, false);

	
		vars[42] = new DataVar("teste2_Host_14_Port", "80", IDataArea.TEST, "IGNORE", false, false);

	
		vars[43] = new DataVar("teste2_Host_15_Port", "80", IDataArea.TEST, "IGNORE", false, false);

	
		vars[44] = new DataVar("teste2_Host_13_Port", "80", IDataArea.TEST, "IGNORE", false, false);

	
		vars[45] = new DataVar("teste2_Host_18_Port", "80", IDataArea.TEST, "IGNORE", false, false);

	
		vars[46] = new DataVar("teste2_Host_19_Port", "80", IDataArea.TEST, "IGNORE", false, false);

	
		vars[47] = new DataVar("teste2_Host_17_Port", "80", IDataArea.TEST, "IGNORE", false, false);

	
		vars[48] = new DataVar("teste2_Host_20_Port", "80", IDataArea.TEST, "IGNORE", false, false);

	
		vars[49] = new DataVar("teste2_Host_21_Port", "80", IDataArea.TEST, "IGNORE", false, false);

	
		vars[50] = new DataVar("teste2_Host_22_Port", "80", IDataArea.TEST, "IGNORE", false, false);

	
		vars[51] = new DataVar("teste2_Host_24_Port", "80", IDataArea.TEST, "IGNORE", false, false);

	
		vars[52] = new DataVar("teste2_Host_25_Port", "80", IDataArea.TEST, "IGNORE", false, false);

	
		vars[53] = new DataVar("teste2_Host_26_Port", "80", IDataArea.TEST, "IGNORE", false, false);

	
		vars[54] = new DataVar("teste2_Host_16_Port", "80", IDataArea.TEST, "IGNORE", false, false);

	
		vars[55] = new DataVar("teste2_Host_27_Port", "80", IDataArea.TEST, "IGNORE", false, false);

	
		vars[56] = new DataVar("teste2_Host_23_Port", "80", IDataArea.TEST, "IGNORE", false, false);

	
		vars[57] = new DataVar("teste2_Host_10_Port", "80", IDataArea.TEST, "IGNORE", false, false);

	
		vars[58] = new DataVar("teste2_Host_28_Port", "80", IDataArea.TEST, "IGNORE", false, false);

	
		vars[59] = new DataVar("teste2_Host_29_Port", "80", IDataArea.TEST, "IGNORE", false, false);

	
		vars[60] = new DataVar("teste2_Host_30_Port", "80", IDataArea.TEST, "IGNORE", false, false);

	
		vars[61] = new DataVar("teste2_Host_8_Port", "80", IDataArea.TEST, "IGNORE", false, false);

		
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
					(String)(vars[8].getValue()== null?"detectportal.firefox.com": (String)vars[8].getValue()),  // host name
					Integer.parseInt((String)(vars[61].getValue()== null?"80": (String)vars[61].getValue())), 
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


	private IKAction confCon_2(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_2",
					(String)(vars[30].getValue()== null?"folha.com.br": (String)vars[30].getValue()),  // host name
					Integer.parseInt((String)(vars[60].getValue()== null?"80": (String)vars[60].getValue())), 
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


	private IKAction confCon_3(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_3",
					(String)(vars[29].getValue()== null?"www.folha.uol.com.br": (String)vars[29].getValue()),  // host name
					Integer.parseInt((String)(vars[59].getValue()== null?"80": (String)vars[59].getValue())), 
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


	private IKAction confCon_4(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_4",
					(String)(vars[28].getValue()== null?"tag.navdmp.com": (String)vars[28].getValue()),  // host name
					Integer.parseInt((String)(vars[58].getValue()== null?"80": (String)vars[58].getValue())), 
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


	private IKAction confCon_5(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_5",
					(String)(vars[10].getValue()== null?"static.chartbeat.com": (String)vars[10].getValue()),  // host name
					Integer.parseInt((String)(vars[57].getValue()== null?"80": (String)vars[57].getValue())), 
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


	private IKAction confCon_6(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_6",
					(String)(vars[23].getValue()== null?"static.folha.uol.com.br": (String)vars[23].getValue()),  // host name
					Integer.parseInt((String)(vars[56].getValue()== null?"80": (String)vars[56].getValue())), 
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


	private IKAction confCon_7(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_7",
					(String)(vars[27].getValue()== null?"jsuol.com.br": (String)vars[27].getValue()),  // host name
					Integer.parseInt((String)(vars[55].getValue()== null?"80": (String)vars[55].getValue())), 
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


	private IKAction confCon_8(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_8",
					(String)(vars[16].getValue()== null?"f.i.uol.com.br": (String)vars[16].getValue()),  // host name
					Integer.parseInt((String)(vars[54].getValue()== null?"80": (String)vars[54].getValue())), 
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


	private IKAction confCon_9(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_9",
					(String)(vars[26].getValue()== null?"usr.navdmp.com": (String)vars[26].getValue()),  // host name
					Integer.parseInt((String)(vars[53].getValue()== null?"80": (String)vars[53].getValue())), 
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


	private IKAction confCon_10(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_10",
					(String)(vars[25].getValue()== null?"images1.folha.com.br": (String)vars[25].getValue()),  // host name
					Integer.parseInt((String)(vars[52].getValue()== null?"80": (String)vars[52].getValue())), 
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


	private IKAction confCon_11(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_11",
					(String)(vars[24].getValue()== null?"mab.chartbeat.com": (String)vars[24].getValue()),  // host name
					Integer.parseInt((String)(vars[51].getValue()== null?"80": (String)vars[51].getValue())), 
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


	private IKAction confCon_12(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_12",
					(String)(vars[22].getValue()== null?"cdn.navdmp.com": (String)vars[22].getValue()),  // host name
					Integer.parseInt((String)(vars[50].getValue()== null?"80": (String)vars[50].getValue())), 
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


	private IKAction confCon_13(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_13",
					(String)(vars[21].getValue()== null?"platform.twitter.com": (String)vars[21].getValue()),  // host name
					Integer.parseInt((String)(vars[49].getValue()== null?"80": (String)vars[49].getValue())), 
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


	private IKAction confCon_14(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_14",
					(String)(vars[20].getValue()== null?"www1.folha.uol.com.br": (String)vars[20].getValue()),  // host name
					Integer.parseInt((String)(vars[48].getValue()== null?"80": (String)vars[48].getValue())), 
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


	private IKAction confCon_15(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_15",
					(String)(vars[17].getValue()== null?"paywall.folha.uol.com.br": (String)vars[17].getValue()),  // host name
					Integer.parseInt((String)(vars[47].getValue()== null?"80": (String)vars[47].getValue())), 
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


	private IKAction confCon_16(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_16",
					(String)(vars[19].getValue()== null?"tempo.folha.uol.com.br": (String)vars[19].getValue()),  // host name
					Integer.parseInt((String)(vars[46].getValue()== null?"80": (String)vars[46].getValue())), 
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


	private IKAction confCon_17(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_17",
					(String)(vars[18].getValue()== null?"ivccftag.ivcbrasil.org.br": (String)vars[18].getValue()),  // host name
					Integer.parseInt((String)(vars[45].getValue()== null?"80": (String)vars[45].getValue())), 
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


	private IKAction confCon_18(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_18",
					(String)(vars[13].getValue()== null?"tm.jsuol.com.br": (String)vars[13].getValue()),  // host name
					Integer.parseInt((String)(vars[44].getValue()== null?"80": (String)vars[44].getValue())), 
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


	private IKAction confCon_19(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_19",
					(String)(vars[15].getValue()== null?"ivccf.ivcbrasil.org.br": (String)vars[15].getValue()),  // host name
					Integer.parseInt((String)(vars[43].getValue()== null?"80": (String)vars[43].getValue())), 
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


	private IKAction confCon_20(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_20",
					(String)(vars[14].getValue()== null?"www.googletagservices.com": (String)vars[14].getValue()),  // host name
					Integer.parseInt((String)(vars[42].getValue()== null?"80": (String)vars[42].getValue())), 
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


	private IKAction confCon_21(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_21",
					(String)(vars[12].getValue()== null?"me.jsuol.com.br": (String)vars[12].getValue()),  // host name
					Integer.parseInt((String)(vars[41].getValue()== null?"80": (String)vars[41].getValue())), 
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


	private IKAction confCon_22(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_22",
					(String)(vars[1].getValue()== null?"tt-12340-4.seg.t.tailtarget.com": (String)vars[1].getValue()),  // host name
					Integer.parseInt((String)(vars[40].getValue()== null?"80": (String)vars[40].getValue())), 
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


	private IKAction confCon_23(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_23",
					(String)(vars[11].getValue()== null?"b.scorecardresearch.com": (String)vars[11].getValue()),  // host name
					Integer.parseInt((String)(vars[39].getValue()== null?"80": (String)vars[39].getValue())), 
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


	private IKAction confCon_24(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_24",
					(String)(vars[9].getValue()== null?"tracker.bt.uol.com.br": (String)vars[9].getValue()),  // host name
					Integer.parseInt((String)(vars[38].getValue()== null?"80": (String)vars[38].getValue())), 
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


	private IKAction confCon_25(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_25",
					(String)(vars[6].getValue()== null?"d.tailtarget.com": (String)vars[6].getValue()),  // host name
					Integer.parseInt((String)(vars[37].getValue()== null?"80": (String)vars[37].getValue())), 
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


	private IKAction confCon_26(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_26",
					(String)(vars[7].getValue()== null?"ping.chartbeat.net": (String)vars[7].getValue()),  // host name
					Integer.parseInt((String)(vars[36].getValue()== null?"80": (String)vars[36].getValue())), 
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


	private IKAction confCon_27(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_27",
					(String)(vars[5].getValue()== null?"cm.g.doubleclick.net": (String)vars[5].getValue()),  // host name
					Integer.parseInt((String)(vars[35].getValue()== null?"80": (String)vars[35].getValue())), 
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


	private IKAction confCon_28(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_28",
					(String)(vars[2].getValue()== null?"tt-10162-1.seg.t.tailtarget.com": (String)vars[2].getValue()),  // host name
					Integer.parseInt((String)(vars[34].getValue()== null?"80": (String)vars[34].getValue())), 
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


	private IKAction confCon_29(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_29",
					(String)(vars[3].getValue()== null?"b.t.tailtarget.com": (String)vars[3].getValue()),  // host name
					Integer.parseInt((String)(vars[33].getValue()== null?"80": (String)vars[33].getValue())), 
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


	private IKAction confCon_30(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_30",
					(String)(vars[4].getValue()== null?"cm.t.tailtarget.com": (String)vars[4].getValue()),  // host name
					Integer.parseInt((String)(vars[32].getValue()== null?"80": (String)vars[32].getValue())), 
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


	private IKAction confCon_31(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_31",
					(String)(vars[0].getValue()== null?"t.tailtarget.com": (String)vars[0].getValue()),  // host name
					Integer.parseInt((String)(vars[31].getValue()== null?"80": (String)vars[31].getValue())), 
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
			HTTPThink think = new HTTPThink(24781, 1, parent, parent, "A1E8094A2FF538B3FD8EE33930653439");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "Folha de S.Paulo: Not\u00EDcias, Imagens, V\u00EDdeos e Entrevistas", "A1E8094A2FF538B3FD8EE33930653439") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(72, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_1(this, true, "A1E8094A2FEF9360FD8EE33930653439", false, false,
						"Config_1", "detectportal.firefox.com/success.txt",	"/success.txt", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_2(this, false, "A1E8094A2FEF9360FD8EE33930653439", false, false,
						"Config_1", "detectportal.firefox.com/success.txt",	"/success.txt", true, false), 1352, "A1E8094A2FF538B7FD8EE33930653439", 3);
				httpParallel.addRequest(0, request_3(this, false, "A1E8094A2FEF9360FD8EE33930653439", true, false,
						"Config_1", "detectportal.firefox.com/success.txt",	"/success.txt", true, false), 2076, "A1E8094A2FF75B90FD8EE33930653439", 3);
				httpParallel.addRequest(1, request_4(this, false, "A1E8094A3017B4D1FD8EE33930653439", true, false,
						"Config_2", "folha.com.br/",	"/", true, false), 2066, "A1E8094A2FF75B90FD8EE33930653439", 3);
				httpParallel.addRequest(2, request_5(this, false, "A1E8094A301802F0FD8EE33930653439", true, true,
						"Config_3", "www.folha.uol.com.br/",	"/", true, false), 76, "A1E8094A3017B4D9FD8EE33930653439", 3);
				httpParallel.addRequest(3, request_6(this, false, "A1E8094A301BD380FD8EE33930653439", true, false,
						"Config_4", "tag.navdmp.com/tm23947.js",	"/tm23947.js", true, false), 103, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(4, request_7(this, false, "A1E8094A301C21C8FD8EE33930653439", true, false,
						"Config_5", "static.chartbeat.com/js/chartbeat_mab.js",	"/js/chartbeat_mab.js", true, false), 123, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(5, request_8(this, false, "A1E8094A301C6FFCFD8EE33930653439", true, false,
						"Config_6", "static.folha.uol.com.br/hunting-portal/build/css/app-e52c36f6aa341947aa8f.css",	"/hunting-portal/build/css/app-e52c36f6aa341947aa8f.css", true, false), 98, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(6, request_9(this, false, "A1E8094A302FD0B0FD8EE33930653439", true, false,
						"Config_6", "static.folha.uol.com.br/hunting-portal/build/js/app-e52c36f6aa341947aa8f.js",	"/hunting-portal/build/js/app-e52c36f6aa341947aa8f.js", true, false), 123, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(7, request_10(this, false, "A1E8094A30337A33FD8EE33930653439", true, false,
						"Config_7", "jsuol.com.br/barra/parceiro.js?parceiro=folha",	"/barra/parceiro.js?parceiro=folha", true, false), 147, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(8, request_11(this, false, "A1E8094A306A68B0FD8EE33930653439", true, false,
						"Config_8", "f.i.uol.com.br/estudiofolha/images/1802993.jpeg",	"/estudiofolha/images/1802993.jpeg", true, false), 408, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(9, request_12(this, false, "A1E8094A306B2C01FD8EE33930653439", true, false,
						"Config_8", "f.i.uol.com.br/fotografia/images/1803434.jpeg",	"/fotografia/images/1803434.jpeg", true, false), 408, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(10, request_13(this, false, "A1E8094A306D00C3FD8EE33930653439", true, false,
						"Config_8", "f.i.uol.com.br/estudiofolha/images/1803084.jpeg",	"/estudiofolha/images/1803084.jpeg", true, false), 408, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(11, request_14(this, false, "A1E8094A306D4EEBFD8EE33930653439", true, false,
						"Config_8", "f.i.uol.com.br/estudiofolha/images/1803083.jpeg",	"/estudiofolha/images/1803083.jpeg", true, false), 407, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(12, request_15(this, false, "A1E8094A306FE6F0FD8EE33930653439", true, false,
						"Config_9", "usr.navdmp.com/usr?v=7&acc=23947&upd=1&new=1&wst=0&wct=1&dsy=0",	"/usr?v=7&acc=23947&upd=1&new=1&wst=0&wct=1&dsy=0", true, false), 431, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(13, request_16(this, false, "A1E8094A30700E37FD8EE33930653439", true, false,
						"Config_8", "f.i.uol.com.br/livraria/promocoes/images/18031275.jpeg",	"/livraria/promocoes/images/18031275.jpeg", true, false), 407, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(14, request_17(this, false, "A1E8094A30708333FD8EE33930653439", true, false,
						"Config_8", "f.i.uol.com.br/estudiofolha/images/1802990.jpeg",	"/estudiofolha/images/1802990.jpeg", true, false), 408, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(15, request_18(this, false, "A1E8094A3070AA8BFD8EE33930653439", true, false,
						"Config_8", "f.i.uol.com.br/fotografia/images/1803433.jpeg",	"/fotografia/images/1803433.jpeg", true, false), 407, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(16, request_19(this, false, "A1E8094A307257F0FD8EE33930653439", true, false,
						"Config_8", "f.i.uol.com.br/folha/furniture/6/images/folha-digital.jpg",	"/folha/furniture/6/images/folha-digital.jpg", true, false), 408, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(17, request_20(this, false, "A1E8094A3072F430FD8EE33930653439", true, false,
						"Config_10", "images1.folha.com.br/livraria/images/8/6/1154842-160x160.png",	"/livraria/images/8/6/1154842-160x160.png", true, false), 462, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(18, request_21(this, false, "A1E8094A30731B7FFD8EE33930653439", true, false,
						"Config_10", "images1.folha.com.br/livraria/images/6/c/1380784-160x160.png",	"/livraria/images/6/c/1380784-160x160.png", true, false), 467, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(19, request_22(this, false, "A1E8094A3073699FFD8EE33930653439", true, false,
						"Config_10", "images1.folha.com.br/livraria/images/0/c/1380619-160x160.png",	"/livraria/images/0/c/1380619-160x160.png", true, false), 468, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(20, request_23(this, false, "A1E8094A3073B7BFFD8EE33930653439", true, false,
						"Config_10", "images1.folha.com.br/livraria/images/1/5/1380771-160x160.png",	"/livraria/images/1/5/1380771-160x160.png", true, false), 468, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(21, request_24(this, false, "A1E8094A307405DFFD8EE33930653439", true, false,
						"Config_10", "images1.folha.com.br/livraria/images/5/7/1379727-160x160.png",	"/livraria/images/5/7/1379727-160x160.png", true, false), 469, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(22, request_25(this, false, "A1E8094A3075DA60FD8EE33930653439", true, false,
						"Config_10", "images1.folha.com.br/livraria/images/4/f/1378646-160x160.png",	"/livraria/images/4/f/1378646-160x160.png", true, false), 469, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(23, request_26(this, false, "A1E8094A307601AFFD8EE33930653439", true, false,
						"Config_10", "images1.folha.com.br/livraria/images/b/4/1378511-160x160.png",	"/livraria/images/b/4/1378511-160x160.png", true, false), 469, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(24, request_27(this, false, "A1E8094A30764FCDFD8EE33930653439", true, false,
						"Config_10", "images1.folha.com.br/livraria/images/e/c/1379355-160x160.png",	"/livraria/images/e/c/1379355-160x160.png", true, false), 469, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(25, request_28(this, false, "A1E8094A30769DEEFD8EE33930653439", true, false,
						"Config_10", "images1.folha.com.br/livraria/images/2/7/1379725-160x160.png",	"/livraria/images/2/7/1379725-160x160.png", true, false), 469, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(26, request_29(this, false, "A1E8094A3076EC03FD8EE33930653439", true, false,
						"Config_10", "images1.folha.com.br/livraria/images/b/1/1379471-160x160.png",	"/livraria/images/b/1/1379471-160x160.png", true, false), 469, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(27, request_30(this, false, "A1E8094A30773A25FD8EE33930653439", true, false,
						"Config_11", "mab.chartbeat.com/mab_strategy/headline_testing/get_strategy/?host=folha.com.br&domain=folha.uol.com.br&path=%2F",	"/mab_strategy/headline_testing/get_strategy/?host=folha.com.br&domain=folha.uol.com.br&path=%2F", true, false), 815, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(28, request_31(this, false, "A1E8094A30776157FD8EE33930653439", true, false,
						"Config_6", "static.folha.uol.com.br/fonts/hunting/folha-grafico/Folha_Grafico-Medium.woff2",	"/fonts/hunting/folha-grafico/Folha_Grafico-Medium.woff2", true, false), 741, "A1E8094A301C7004FD8EE33930653439", 2);
				httpParallel.addRequest(29, request_32(this, false, "A1E8094A307BF4E7FD8EE33930653439", true, false,
						"Config_6", "static.folha.uol.com.br/fonts/hunting/folha-texto/Folha_Texto-Light_Italic.woff2",	"/fonts/hunting/folha-texto/Folha_Texto-Light_Italic.woff2", true, false), 741, "A1E8094A301C7004FD8EE33930653439", 2);
				httpParallel.addRequest(30, request_33(this, false, "A1E8094A307D7B87FD8EE33930653439", true, false,
						"Config_6", "static.folha.uol.com.br/fonts/folhaii-semibold/folhaii-semibold-webfont.woff",	"/fonts/folhaii-semibold/folhaii-semibold-webfont.woff", true, false), 741, "A1E8094A301C7004FD8EE33930653439", 2);
				httpParallel.addRequest(31, request_34(this, false, "A1E8094A307E17C2FD8EE33930653439", true, false,
						"Config_6", "static.folha.uol.com.br/fonts/hunting/folha-texto/Folha_Texto-Bold.woff2",	"/fonts/hunting/folha-texto/Folha_Texto-Bold.woff2", true, false), 740, "A1E8094A301C7004FD8EE33930653439", 2);
				httpParallel.addRequest(32, request_35(this, false, "A1E8094A307F9E67FD8EE33930653439", true, false,
						"Config_6", "static.folha.uol.com.br/fonts/hunting/folha-grafico/Folha_Grafico-Regular.woff2",	"/fonts/hunting/folha-grafico/Folha_Grafico-Regular.woff2", true, false), 740, "A1E8094A301C7004FD8EE33930653439", 2);
				httpParallel.addRequest(33, request_36(this, false, "A1E8094A3080FDF7FD8EE33930653439", true, false,
						"Config_6", "static.folha.uol.com.br/fonts/hunting/folha-texto/Folha_Texto-Light.woff2",	"/fonts/hunting/folha-texto/Folha_Texto-Light.woff2", true, false), 740, "A1E8094A301C7004FD8EE33930653439", 2);
				httpParallel.addRequest(34, request_37(this, false, "A1E8094A30825D87FD8EE33930653439", true, false,
						"Config_6", "static.folha.uol.com.br/fonts/folhaii-bold/FolhaIIBold.woff2",	"/fonts/folhaii-bold/FolhaIIBold.woff2", true, false), 743, "A1E8094A301C7004FD8EE33930653439", 2);
				httpParallel.addRequest(35, request_38(this, false, "A1E8094A30839603FD8EE33930653439", true, false,
						"Config_1", "detectportal.firefox.com/success.txt",	"/success.txt", true, false), 186, "A1E8094A30764FD5FD8EE33930653439", 3);
				httpParallel.addRequest(36, request_39(this, false, "A1E8094A3083BD23FD8EE33930653439", true, false,
						"Config_6", "static.folha.uol.com.br/fonts/hunting/folha-grafico/Folha_Grafico-Regular_Italic.woff2",	"/fonts/hunting/folha-grafico/Folha_Grafico-Regular_Italic.woff2", true, false), 807, "A1E8094A301C7004FD8EE33930653439", 2);
				httpParallel.addRequest(37, request_40(this, false, "A1E8094A3084F598FD8EE33930653439", true, false,
						"Config_1", "detectportal.firefox.com/success.txt",	"/success.txt", true, false), 35, "A1E8094A3083BD2BFD8EE33930653439", 3);
				httpParallel.addRequest(38, request_41(this, false, "A1E8094A30851CD6FD8EE33930653439", true, false,
						"Config_12", "cdn.navdmp.com/req?v=7&upd=1&new=1&id=7bc9d9b54d05d3182079c24b809&acc=23947&tit=Folha%20de%20S.Paulo%3A%20Not%EDcias%2C%20Imagens%2C%20V%EDdeos%20e%20Entrevistas",	"/req?v=7&upd=1&new=1&id=7bc9d9b54d05d3182079c24b809&acc=23947&tit=Folha%20de%20S.Paulo%3A%20Not%EDcias%2C%20Imagens%2C%20V%EDdeos%20e%20Entrevistas", true, false), 1511, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(39, request_42(this, false, "A1E8094A30856AC1FD8EE33930653439", false, false,
						"Config_1", "detectportal.firefox.com/success.txt",	"/success.txt", true, false), 32, "A1E8094A3084F5A0FD8EE33930653439", 3);
				httpParallel.addRequest(39, request_43(this, false, "A1E8094A30856AC1FD8EE33930653439", false, false,
						"Config_1", "detectportal.firefox.com/success.txt",	"/success.txt", true, false), 57, "A1E8094A30856AC9FD8EE33930653439", 3);
				httpParallel.addRequest(39, request_44(this, false, "A1E8094A30856AC1FD8EE33930653439", false, false,
						"Config_1", "detectportal.firefox.com/success.txt",	"/success.txt", true, false), 60, "A1E8094A3085B90DFD8EE33930653439", 3);
				httpParallel.addRequest(40, request_45(this, false, "A1E8094A30860741FD8EE33930653439", true, false,
						"Config_13", "platform.twitter.com/widgets.js",	"/widgets.js", true, false), 1921, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(39, request_46(this, false, "A1E8094A30856AC1FD8EE33930653439", false, false,
						"Config_1", "detectportal.firefox.com/success.txt",	"/success.txt", true, false), 71, "A1E8094A3085E020FD8EE33930653439", 3);
				httpParallel.addRequest(41, request_47(this, false, "A1E8094A3086A343FD8EE33930653439", true, false,
						"Config_14", "www1.folha.uol.com.br/virtual/cotacoes/indicators.jsonp",	"/virtual/cotacoes/indicators.jsonp", true, false), 1984, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(42, request_48(this, false, "A1E8094A3086CA97FD8EE33930653439", true, false,
						"Config_14", "www1.folha.uol.com.br/horoscopo/previsoes/2018/02/03/horoscopo.json?callback=jQuery32105538410105795413_1517707451344&_=1517707451345",	"/horoscopo/previsoes/2018/02/03/horoscopo.json?callback=jQuery32105538410105795413_1517707451344&_=1517707451345", true, false), 1984, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(43, request_49(this, false, "A1E8094A30871877FD8EE33930653439", true, false,
						"Config_14", "www1.folha.uol.com.br/virtual/hunting/columns/featured.jsonp?callback=getColumns&_=1517707451343",	"/virtual/hunting/columns/featured.jsonp?callback=getColumns&_=1517707451343", true, false), 1983, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(44, request_50(this, false, "A1E8094A30873FC7FD8EE33930653439", true, false,
						"Config_14", "www1.folha.uol.com.br/folha/virtual/common/livraria/output/reforma-folha-home.json?_=1517707451346",	"/folha/virtual/common/livraria/output/reforma-folha-home.json?_=1517707451346", true, false), 1984, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(39, request_51(this, false, "A1E8094A30856AC1FD8EE33930653439", false, false,
						"Config_1", "detectportal.firefox.com/success.txt",	"/success.txt", true, false), 0, "null", 3);
				httpParallel.addRequest(39, request_52(this, false, "A1E8094A30856AC1FD8EE33930653439", false, false,
						"Config_1", "detectportal.firefox.com/success.txt",	"/success.txt", true, false), 0, "null", 3);
				httpParallel.addRequest(39, request_53(this, false, "A1E8094A30856AC1FD8EE33930653439", false, false,
						"Config_1", "detectportal.firefox.com/success.txt",	"/success.txt", true, false), 63, "A1E8094A3087B4B0FD8EE33930653439", 3);
				httpParallel.addRequest(39, request_54(this, false, "A1E8094A30856AC1FD8EE33930653439", false, false,
						"Config_1", "detectportal.firefox.com/success.txt",	"/success.txt", true, false), 0, "null", 3);
				httpParallel.addRequest(45, request_55(this, false, "A1E8094A3088511FFD8EE33930653439", true, false,
						"Config_15", "paywall.folha.uol.com.br/wall.jsonp?callback=paywall.inicio&url=http://www.folha.uol.com.br/",	"/wall.jsonp?callback=paywall.inicio&url=http://www.folha.uol.com.br/", true, false), 2270, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(39, request_56(this, false, "A1E8094A30856AC1FD8EE33930653439", false, false,
						"Config_1", "detectportal.firefox.com/success.txt",	"/success.txt", true, false), 0, "null", 3);
				httpParallel.addRequest(46, request_57(this, false, "A1E8094A30889F77FD8EE33930653439", true, false,
						"Config_16", "tempo.folha.uol.com.br/weather-portal.jsonp?callback=getWeather&_=1517707451347",	"/weather-portal.jsonp?callback=getWeather&_=1517707451347", true, false), 2320, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(39, request_58(this, false, "A1E8094A30856AC1FD8EE33930653439", false, false,
						"Config_1", "detectportal.firefox.com/success.txt",	"/success.txt", true, false), 0, "null", 3);
				httpParallel.addRequest(39, request_59(this, false, "A1E8094A30856AC1FD8EE33930653439", false, false,
						"Config_1", "detectportal.firefox.com/success.txt",	"/success.txt", true, false), 54, "A1E8094A3088ED30FD8EE33930653439", 3);
				httpParallel.addRequest(47, request_60(this, false, "A1E8094A30893B53FD8EE33930653439", true, false,
						"Config_17", "ivccftag.ivcbrasil.org.br/ivc.js",	"/ivc.js", true, false), 2316, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(39, request_61(this, false, "A1E8094A30856AC1FD8EE33930653439", false, false,
						"Config_1", "detectportal.firefox.com/success.txt",	"/success.txt", true, false), 64, "A1E8094A30891440FD8EE33930653439", 3);
				httpParallel.addRequest(39, request_62(this, false, "A1E8094A30856AC1FD8EE33930653439", false, false,
						"Config_1", "detectportal.firefox.com/success.txt",	"/success.txt", true, false), 0, "null", 3);
				httpParallel.addRequest(39, request_63(this, false, "A1E8094A30856AC1FD8EE33930653439", false, false,
						"Config_1", "detectportal.firefox.com/success.txt",	"/success.txt", true, false), 84, "A1E8094A3089D7BFFD8EE33930653439", 3);
				httpParallel.addRequest(48, request_64(this, false, "A1E8094A308A4CC0FD8EE33930653439", true, false,
						"Config_15", "paywall.folha.uol.com.br/esta-logado.jsonp?callback=userfolstatus&callback=jQuery32105538410105795413_1517707451348&_=1517707451349",	"/esta-logado.jsonp?callback=userfolstatus&callback=jQuery32105538410105795413_1517707451348&_=1517707451349", true, false), 2697, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(39, request_65(this, false, "A1E8094A30856AC1FD8EE33930653439", false, false,
						"Config_1", "detectportal.firefox.com/success.txt",	"/success.txt", true, false), 0, "null", 3);
				httpParallel.addRequest(39, request_66(this, false, "A1E8094A30856AC1FD8EE33930653439", false, false,
						"Config_1", "detectportal.firefox.com/success.txt",	"/success.txt", true, false), 0, "null", 3);
				httpParallel.addRequest(39, request_67(this, false, "A1E8094A30856AC1FD8EE33930653439", false, false,
						"Config_1", "detectportal.firefox.com/success.txt",	"/success.txt", true, false), 147, "A1E8094A308A9AF7FD8EE33930653439", 3);
				httpParallel.addRequest(39, request_68(this, false, "A1E8094A30856AC1FD8EE33930653439", false, false,
						"Config_1", "detectportal.firefox.com/success.txt",	"/success.txt", true, false), 0, "null", 3);
				httpParallel.addRequest(39, request_69(this, false, "A1E8094A30856AC1FD8EE33930653439", false, false,
						"Config_1", "detectportal.firefox.com/success.txt",	"/success.txt", true, false), 0, "null", 3);
				httpParallel.addRequest(39, request_70(this, false, "A1E8094A30856AC1FD8EE33930653439", false, false,
						"Config_1", "detectportal.firefox.com/success.txt",	"/success.txt", true, false), 0, "null", 3);
				httpParallel.addRequest(39, request_71(this, false, "A1E8094A30856AC1FD8EE33930653439", false, false,
						"Config_1", "detectportal.firefox.com/success.txt",	"/success.txt", true, false), 0, "null", 3);
				httpParallel.addRequest(39, request_72(this, false, "A1E8094A30856AC1FD8EE33930653439", false, false,
						"Config_1", "detectportal.firefox.com/success.txt",	"/success.txt", true, false), 75, "A1E8094A308B5E30FD8EE33930653439", 3);
				httpParallel.addRequest(39, request_73(this, false, "A1E8094A30856AC1FD8EE33930653439", false, false,
						"Config_1", "detectportal.firefox.com/success.txt",	"/success.txt", true, false), 64, "A1E8094A308B8550FD8EE33930653439", 3);
				httpParallel.addRequest(39, request_74(this, false, "A1E8094A30856AC1FD8EE33930653439", false, false,
						"Config_1", "detectportal.firefox.com/success.txt",	"/success.txt", true, false), 0, "null", 3);
				httpParallel.addRequest(49, request_75(this, false, "A1E8094A308BFA72FD8EE33930653439", true, false,
						"Config_8", "f.i.uol.com.br/hunting/icons/favicon-192.png",	"/hunting/icons/favicon-192.png", true, false), 3, "A1E8094A308BD363FD8EE33930653439", 3);
				httpParallel.addRequest(50, request_76(this, false, "A1E8094A308C2183FD8EE33930653439", true, false,
						"Config_8", "f.i.uol.com.br/hunting/icons/favicon.ico",	"/hunting/icons/favicon.ico", true, false), 3, "A1E8094A308BD363FD8EE33930653439", 3);
				httpParallel.addRequest(51, request_77(this, false, "A1E8094A308C6FA5FD8EE33930653439", false, false,
						"Config_18", "tm.jsuol.com.br/uoltm.js?id=1p0oxf",	"/uoltm.js?id=1p0oxf", true, false), 3652, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(51, request_78(this, false, "A1E8094A308C6FA5FD8EE33930653439", true, false,
						"Config_18", "tm.jsuol.com.br/modules/external/tailtarget/profiles.js",	"/modules/external/tailtarget/profiles.js", true, false), 3964, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(52, request_79(this, false, "A1E8094A308D5A04FD8EE33930653439", true, false,
						"Config_19", "ivccf.ivcbrasil.org.br/i?e=pv&page=Folha%20de%20S.Paulo%3A%20Not%C3%ADcias%2C%20Imagens%2C%20V%C3%ADdeos%20e%20Entrevistas&dtm=1517707453159&tid=967545&vp=1440x762&ds=1461x7361&vid=1&duid=0961069747d722ec&p=web&tv=js-2.0.7&fp=1579432281&aid=125&lang=pt-BR&cs=UTF-8&tna=cf&f_inpriv=0&f_abd=0&res=1440x900&cd=24&cookie=1&url=http%3A%2F%2Fwww.folha.uol.com.br%2F",	"/i?e=pv&page=Folha%20de%20S.Paulo%3A%20Not%C3%ADcias%2C%20Imagens%2C%20V%C3%ADdeos%20e%20Entrevistas&dtm=1517707453159&tid=967545&vp=1440x762&ds=1461x7361&vid=1&duid=0961069747d722ec&p=web&tv=js-2.0.7&fp=1579432281&aid=125&lang=pt-BR&cs=UTF-8&tna=cf&f_inpriv=0&f_abd=0&res=1440x900&cd=24&cookie=1&url=http%3A%2F%2Fwww.folha.uol.com.br%2F", true, false), 3730, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(53, request_80(this, false, "A1E8094A308D8140FD8EE33930653439", true, false,
						"Config_20", "www.googletagservices.com/tag/js/gpt.js",	"/tag/js/gpt.js", true, false), 3947, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(54, request_81(this, false, "A1E8094A308DCF45FD8EE33930653439", true, false,
						"Config_18", "tm.jsuol.com.br/modules/external/tailtarget/t3m/TT-12340-4/CT-929.js",	"/modules/external/tailtarget/t3m/TT-12340-4/CT-929.js", true, false), 3966, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(55, request_82(this, false, "A1E8094A308DF644FD8EE33930653439", true, false,
						"Config_18", "tm.jsuol.com.br/modules/external/tailtarget/t3m/TT-10162-1/CT-10.js",	"/modules/external/tailtarget/t3m/TT-10162-1/CT-10.js", true, false), 3969, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(56, request_83(this, false, "A1E8094A308E4463FD8EE33930653439", true, false,
						"Config_21", "me.jsuol.com.br/aud/folha.js",	"/aud/folha.js", true, false), 3990, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(39, request_84(this, false, "A1E8094A30856AC1FD8EE33930653439", false, false,
						"Config_1", "detectportal.firefox.com/success.txt",	"/success.txt", true, false), 31, "A1E8094A308DF64CFD8EE33930653439", 3);
				httpParallel.addRequest(57, request_85(this, false, "A1E8094A308EE0BDFD8EE33930653439", true, false,
						"Config_22", "tt-12340-4.seg.t.tailtarget.com/profile",	"/profile", true, false), 4074, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(39, request_86(this, false, "A1E8094A30856AC1FD8EE33930653439", false, false,
						"Config_1", "detectportal.firefox.com/success.txt",	"/success.txt", true, false), 133, "A1E8094A308EB990FD8EE33930653439", 3);
				httpParallel.addRequest(58, request_87(this, false, "A1E8094A308F55D2FD8EE33930653439", true, false,
						"Config_23", "b.scorecardresearch.com/b?c1=2&c2=6036356&c3=&c4=&c5=&c6=&c15=&ns__t=1517707453820&ns_c=UTF-8&cv=3.1&c8=Folha%20de%20S.Paulo%3A%20Not%C3%ADcias%2C%20Imagens%2C%20V%C3%ADdeos%20e%20Entrevistas&c7=http%3A%2F%2Fwww.folha.uol.com.br%2F&c9=",	"/b?c1=2&c2=6036356&c3=&c4=&c5=&c6=&c15=&ns__t=1517707453820&ns_c=UTF-8&cv=3.1&c8=Folha%20de%20S.Paulo%3A%20Not%C3%ADcias%2C%20Imagens%2C%20V%C3%ADdeos%20e%20Entrevistas&c7=http%3A%2F%2Fwww.folha.uol.com.br%2F&c9=", true, false), 4290, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(39, request_88(this, false, "A1E8094A30856AC1FD8EE33930653439", false, false,
						"Config_1", "detectportal.firefox.com/success.txt",	"/success.txt", true, false), 56, "A1E8094A308F55DAFD8EE33930653439", 3);
				httpParallel.addRequest(39, request_89(this, false, "A1E8094A30856AC1FD8EE33930653439", false, false,
						"Config_1", "detectportal.firefox.com/success.txt",	"/success.txt", true, false), 0, "null", 3);
				httpParallel.addRequest(39, request_90(this, false, "A1E8094A30856AC1FD8EE33930653439", false, false,
						"Config_1", "detectportal.firefox.com/success.txt",	"/success.txt", true, false), 91, "A1E8094A308FA41FFD8EE33930653439", 3);
				httpParallel.addRequest(59, request_91(this, false, "A1E8094A308FF248FD8EE33930653439", true, false,
						"Config_5", "static.chartbeat.com/js/chartbeat.js",	"/js/chartbeat.js", true, false), 4616, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(60, request_92(this, false, "A1E8094A30904073FD8EE33930653439", true, false,
						"Config_24", "tracker.bt.uol.com.br/partner?source=tagmanager",	"/partner?source=tagmanager", true, false), 4618, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(61, request_93(this, false, "A1E8094A30908E52FD8EE33930653439", false, false,
						"Config_25", "d.tailtarget.com/conversion.js",	"/conversion.js", true, false), 4640, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(39, request_94(this, false, "A1E8094A30856AC1FD8EE33930653439", true, false,
						"Config_1", "detectportal.firefox.com/success.txt",	"/success.txt", true, false), 121, "A1E8094A3090407BFD8EE33930653439", 3);
				httpParallel.addRequest(62, request_95(this, false, "A1E8094A3090DCCBFD8EE33930653439", true, false,
						"Config_26", "ping.chartbeat.net/ping?h=folha.com.br&p=%2F&u=BRmjQQCVoMAXCY7WFy&d=folha.uol.com.br&g=50059&g0=home&g1=Folha&n=1&f=00001&c=0&x=0&m=0&y=7361&o=1461&w=762&j=45&R=1&W=0&I=0&E=0&e=0&r=&b=5108&t=CVAkTeBCDcHTZ7IyVBeGxiSDbpKfz&V=99&i=Folha%20de%20S.Paulo%3A%20Not%C3%ADcias%2C%20Imagens%2C%20V%C3%ADdeos%20e%20Entrevistas&tz=120&sn=1&EE=0&sv=pQzfgB5qhMpDBP34uDJNeQmB9AgRS&_",	"/ping?h=folha.com.br&p=%2F&u=BRmjQQCVoMAXCY7WFy&d=folha.uol.com.br&g=50059&g0=home&g1=Folha&n=1&f=00001&c=0&x=0&m=0&y=7361&o=1461&w=762&j=45&R=1&W=0&I=0&E=0&e=0&r=&b=5108&t=CVAkTeBCDcHTZ7IyVBeGxiSDbpKfz&V=99&i=Folha%20de%20S.Paulo%3A%20Not%C3%ADcias%2C%20Imagens%2C%20V%C3%ADdeos%20e%20Entrevistas&tz=120&sn=1&EE=0&sv=pQzfgB5qhMpDBP34uDJNeQmB9AgRS&_", true, false), 4758, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(61, request_96(this, false, "A1E8094A30908E52FD8EE33930653439", true, false,
						"Config_25", "d.tailtarget.com/base.js",	"/base.js", true, false), 0, "null", 3);
				httpParallel.addRequest(63, request_97(this, false, "A1E8094A309151E1FD8EE33930653439", true, false,
						"Config_27", "cm.g.doubleclick.net/pixel?google_nid=tailtarget_ddp&google_cm&google_ula=484121137",	"/pixel?google_nid=tailtarget_ddp&google_cm&google_ula=484121137", true, false), 5174, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(64, request_98(this, false, "A1E8094A30917907FD8EE33930653439", true, false,
						"Config_28", "tt-10162-1.seg.t.tailtarget.com/trk?tA=TT-10162-1&tJ=_channel:parcfolha-home:1&tK=1517707455&tM=direct&tL=direct&tN=direct&tY=3&tZ=194824376",	"/trk?tA=TT-10162-1&tJ=_channel:parcfolha-home:1&tK=1517707455&tM=direct&tL=direct&tN=direct&tY=3&tZ=194824376", true, false), 5044, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(65, request_99(this, false, "A1E8094A3091A00BFD8EE33930653439", true, false,
						"Config_29", "b.t.tailtarget.com/u?",	"/u?", true, false), 5169, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(66, request_100(this, false, "A1E8094A3091C738FD8EE33930653439", false, false,
						"Config_29", "b.t.tailtarget.com/u?env=_ttq_tt_uol",	"/u?env=_ttq_tt_uol", true, false), 5169, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(67, request_101(this, false, "A1E8094A309214F0FD8EE33930653439", true, false,
						"Config_30", "cm.t.tailtarget.com/doubleclick?google_gid=CAESEM6IhNKTL5FBBbHTRQNnpRo&google_cver=1&google_ula=484121137,0",	"/doubleclick?google_gid=CAESEM6IhNKTL5FBBbHTRQNnpRo&google_cver=1&google_ula=484121137,0", true, false), 5447, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(66, request_102(this, false, "A1E8094A3091C738FD8EE33930653439", true, false,
						"Config_29", "b.t.tailtarget.com/b?tA=TT-10162-1&tY=1&tS=4&tU=730A000AF4C88059CB0D6F7202159347&tX=b.45&tZ=976368932&env=_ttq_tt_uol",	"/b?tA=TT-10162-1&tY=1&tS=4&tU=730A000AF4C88059CB0D6F7202159347&tX=b.45&tZ=976368932&env=_ttq_tt_uol", true, false), 5649, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(68, request_103(this, false, "A1E8094A30928A57FD8EE33930653439", true, false,
						"Config_29", "b.t.tailtarget.com/b?tA=TT-12340-4&tY=1&tS=4&tU=730A000AF4C88059CB0D6F7202159347&tX=b.45&tZ=83682810",	"/b?tA=TT-12340-4&tY=1&tS=4&tU=730A000AF4C88059CB0D6F7202159347&tX=b.45&tZ=83682810", true, false), 5645, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(69, request_104(this, false, "A1E8094A3092B189FD8EE33930653439", true, false,
						"Config_28", "tt-10162-1.seg.t.tailtarget.com/ca?tZ=335550571&env=_ttq_tt_uol",	"/ca?tZ=335550571&env=_ttq_tt_uol", true, false), 6107, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(70, request_105(this, false, "A1E8094A3092FF52FD8EE33930653439", true, false,
						"Config_22", "tt-12340-4.seg.t.tailtarget.com/ca?tZ=833766710",	"/ca?tZ=833766710", true, false), 6252, "A1E8094A30182A06FD8EE33930653439", 2);
				httpParallel.addRequest(71, request_106(this, false, "A1E8094A30932664FD8EE33930653439", true, false,
						"Config_31", "t.tailtarget.com/__tt.gif?tA=TT-10162-1&tE=1&tF=&tI=_florianopolis_santa%20catarina_br_1517707456685_3134755718&tJ=&tQ=parcfolha-home&tU=730A000AF4C88059CB0D6F7202159347&tX=b.45&tY=1&tZ=569162769",	"/__tt.gif?tA=TT-10162-1&tE=1&tF=&tI=_florianopolis_santa%20catarina_br_1517707456685_3134755718&tJ=&tQ=parcfolha-home&tU=730A000AF4C88059CB0D6F7202159347&tX=b.45&tY=1&tZ=569162769", true, false), 6506, "A1E8094A30182A06FD8EE33930653439", 2);
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A2FF538B7FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "detectportal.firefox.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Pragma", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_1 = new DataSub();
	reqAction.addDataSub(subContainer_1);

		ISubRule sub_0 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[8], false, "Host_106", null, 0, false);
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
			"A1E8094A2FF538BAFD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_2(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A2FF75B90FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "detectportal.firefox.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Pragma", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_2 = new DataSub();
	reqAction.addDataSub(subContainer_2);

		ISubRule sub_1 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[8], false, "Host_105", null, 0, false);
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
			"A1E8094A2FF75B93FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_3(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A301766B0FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "detectportal.firefox.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Pragma", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_3 = new DataSub();
	reqAction.addDataSub(subContainer_3);

		ISubRule sub_2 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[8], false, "Host_104", null, 0, false);
	subContainer_3.addSubInstruction(sub_2);
	


		
				
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
			"A1E8094A301766B3FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_4(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A3017B4D9FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "folha.com.br", "UTF-8", 1));			
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
	IDataSub subContainer_4 = new DataSub();
	reqAction.addDataSub(subContainer_4);

		ISubRule sub_3 = new SubRule("req_hdr_Host_1", 0, 12, false, (IDCCoreVar)vars[30], false, "Host_103", null, 0, false);
	subContainer_4.addSubInstruction(sub_3);
	


		
				
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
			"A1E8094A3017B4DCFD8EE33930653439",
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

	public HTTPAction request_5(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A30182A06FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www.folha.uol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "__gads=ID=24d070a6150dcf8e:T=1501612272:S=ALNI_MYf74FuCKRki3VA0G6dcXoEBEBskg;_ga=GA1.3.2068662744.1501612270;BTCTL=df;DNA=df13c0be965346baa247145e4a77ebca|null|true", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_2 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_2);

	harvestContainer_2.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[1], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[2], " lang=\"(.*?)\"", 1, 1, 0, 0, false, "lang_2", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[3], "/static\\.folha\\.uol\\.com\\.br(.*?)\"", 1, 1, 0, 0, false, "static.folha.uol.com.br_2", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[4], "/tag\\.navdmp\\.com(.*?)\"", 1, 1, 0, 0, false, "tag.navdmp.com", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[5], "\\?parceiro=(.*?)\"", 1, 1, 0, 0, false, "parceiro_2", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[6], "/f\\.i\\.uol\\.com\\.br(.*?)\"", 46, 37, 0, 0, false, "f.i.uol.com.br_4", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[7], "/f\\.i\\.uol\\.com\\.br(.*?)\"", 47, 1, 0, 0, false, "f.i.uol.com.br_5", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[8], "/f\\.i\\.uol\\.com\\.br(.*?)\"", 48, 1, 0, 0, false, "f.i.uol.com.br_7", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[9], "/f\\.i\\.uol\\.com\\.br(.*?)\"", 49, 1, 0, 0, false, "f.i.uol.com.br_2", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[10], "/f\\.i\\.uol\\.com\\.br(.*?)\"", 54, 5, 0, 0, false, "f.i.uol.com.br_6", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[11], "/f\\.i\\.uol\\.com\\.br(.*?)\"", 55, 1, 0, 0, false, "f.i.uol.com.br", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[12], "/images1\\.folha\\.com\\.br(.*?)\"", 1, 1, 0, 0, false, "images1.folha.com.br_4", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[13], "/images1\\.folha\\.com\\.br(.*?)\"", 2, 1, 0, 0, false, "images1.folha.com.br_10", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[14], "/images1\\.folha\\.com\\.br(.*?)\"", 3, 1, 0, 0, false, "images1.folha.com.br_3", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[15], "/images1\\.folha\\.com\\.br(.*?)\"", 4, 1, 0, 0, false, "images1.folha.com.br_6", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[16], "/images1\\.folha\\.com\\.br(.*?)\"", 5, 1, 0, 0, false, "images1.folha.com.br", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[17], "/images1\\.folha\\.com\\.br(.*?)\"", 6, 1, 0, 0, false, "images1.folha.com.br_7", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[18], "/images1\\.folha\\.com\\.br(.*?)\"", 7, 1, 0, 0, false, "images1.folha.com.br_2", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[19], "/images1\\.folha\\.com\\.br(.*?)\"", 8, 1, 0, 0, false, "images1.folha.com.br_5", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[20], "/images1\\.folha\\.com\\.br(.*?)\"", 9, 1, 0, 0, false, "images1.folha.com.br_8", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[21], "/images1\\.folha\\.com\\.br(.*?)\"", 10, 1, 0, 0, false, "images1.folha.com.br_9", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[22], "/f\\.i\\.uol\\.com\\.br(.*?)\"", 56, 1, 0, 0, false, "f.i.uol.com.br_3", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[23], "/static\\.folha\\.uol\\.com\\.br(.*?)\"", 2, 1, 0, 0, false, "static.folha.uol.com.br", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[24], "\\?callback=(.*?)&", 1, 1, 0, 0, false, "callback_7", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[25], "\\?id=(.*?)\"", 1, 1, 0, 0, false, "id_3", null, 0, false);
	IDataSub subContainer_5 = new DataSub();
	reqAction.addDataSub(subContainer_5);

		ISubRule sub_4 = new SubRule("req_uri", 0, 1, false, (IDCCoreVar)dcVars[0], false, "Folha de S.Paulo: No_url_23", null, 0, false);
	subContainer_5.addSubInstruction(sub_4);
		ISubRule sub_5 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[29], false, "Host_102", null, 0, false);
	subContainer_5.addSubInstruction(sub_5);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A3017B4D9FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A3017B4D9FD8EE33930653439"), 3);		
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
			"A1E8094A30182A09FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_6(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A301BD388FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "tag.navdmp.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "__cfduid=dbecad2bec36879a08d8ab20fbe6372121500324187;nid=7bc9d9b54d99d1acdb17aaeab09|2|347;ac3=1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_3 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_3);

	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[26], "&upd=(.*?)'", 1, 1, 0, 0, false, "upd_3", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[27], "&new=(.*?)'", 1, 1, 0, 0, false, "new_3", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[28], "&wst=(.*?)'", 1, 1, 0, 0, false, "wst_2", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[29], "&wct=(.*?)'", 1, 1, 0, 0, false, "wct_2", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[30], "&dsy=(.*?)'", 1, 1, 0, 0, false, "dsy_2", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[31], ";path=(.*?)\"", 1, 1, 0, 0, false, "path_2", null, 0, false);
	IDataSub subContainer_6 = new DataSub();
	reqAction.addDataSub(subContainer_6);

		ISubRule sub_6 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_67", null, 0, false);
	subContainer_6.addSubInstruction(sub_6);
		ISubRule sub_7 = new SubRule("req_uri", 0, 11, false, (IDCCoreVar)dcVars[4], false, "Folha de S.Paulo: No_url_22", null, 0, false);
	subContainer_6.addSubInstruction(sub_7);
		ISubRule sub_8 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[28], false, "Host_101", null, 0, false);
	subContainer_6.addSubInstruction(sub_8);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A301BD38BFD8EE33930653439",
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

	public HTTPAction request_7(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A301C21D0FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "static.chartbeat.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_7 = new DataSub();
	reqAction.addDataSub(subContainer_7);

		ISubRule sub_9 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_66", null, 0, false);
	subContainer_7.addSubInstruction(sub_9);
		ISubRule sub_10 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[10], false, "Host_100", null, 0, false);
	subContainer_7.addSubInstruction(sub_10);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A301C21D3FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_8(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A301C7004FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "static.folha.uol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "__gads=ID=24d070a6150dcf8e:T=1501612272:S=ALNI_MYf74FuCKRki3VA0G6dcXoEBEBskg;_ga=GA1.3.2068662744.1501612270;BTCTL=df;DNA=df13c0be965346baa247145e4a77ebca|null|true", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_4 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_4);

	harvestContainer_4.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[32], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_2", null, 0, false);
	IDataSub subContainer_8 = new DataSub();
	reqAction.addDataSub(subContainer_8);

		ISubRule sub_11 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_65", null, 0, false);
	subContainer_8.addSubInstruction(sub_11);
		ISubRule sub_12 = new SubRule("req_uri", 0, 54, false, (IDCCoreVar)dcVars[3], false, "Folha de S.Paulo: No_url_21", null, 0, false);
	subContainer_8.addSubInstruction(sub_12);
		ISubRule sub_13 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[23], false, "Host_99", null, 0, false);
	subContainer_8.addSubInstruction(sub_13);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A301C7007FD8EE33930653439",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A302FD0B8FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "static.folha.uol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "__gads=ID=24d070a6150dcf8e:T=1501612272:S=ALNI_MYf74FuCKRki3VA0G6dcXoEBEBskg;_ga=GA1.3.2068662744.1501612270;BTCTL=df;DNA=df13c0be965346baa247145e4a77ebca|null|true", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_5 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_5);

	harvestContainer_5.addHarvestInstruction ("resp_content", dcVars[33], "\\?callback=(.*?)\"", 1, 1, 0, 0, false, "callback_8", null, 0, false);
	IDataSub subContainer_9 = new DataSub();
	reqAction.addDataSub(subContainer_9);

		ISubRule sub_14 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_64", null, 0, false);
	subContainer_9.addSubInstruction(sub_14);
		ISubRule sub_15 = new SubRule("req_uri", 0, 52, false, (IDCCoreVar)dcVars[23], false, "Folha de S.Paulo: No_url_20", null, 0, false);
	subContainer_9.addSubInstruction(sub_15);
		ISubRule sub_16 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[23], false, "Host_98", null, 0, false);
	subContainer_9.addSubInstruction(sub_16);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A302FD0BBFD8EE33930653439",
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

	public HTTPAction request_10(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A30337A3BFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "jsuol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_10 = new DataSub();
	reqAction.addDataSub(subContainer_10);

		ISubRule sub_17 = new SubRule("req_uri", 28, 5, true, (IDCCoreVar)dcVars[5], false, "parceiro", null, 0, false);
	subContainer_10.addSubInstruction(sub_17);
		ISubRule sub_18 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_63", null, 0, false);
	subContainer_10.addSubInstruction(sub_18);
		ISubRule sub_19 = new SubRule("req_hdr_Host_1", 0, 12, false, (IDCCoreVar)vars[27], false, "Host_97", null, 0, false);
	subContainer_10.addSubInstruction(sub_19);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A30337A3EFD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_11(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A306A8FC0FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "f.i.uol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "__gads=ID=24d070a6150dcf8e:T=1501612272:S=ALNI_MYf74FuCKRki3VA0G6dcXoEBEBskg;_ga=GA1.3.2068662744.1501612270;BTCTL=df;DNA=df13c0be965346baa247145e4a77ebca|null|true", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_11 = new DataSub();
	reqAction.addDataSub(subContainer_11);

		ISubRule sub_20 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_62", null, 0, false);
	subContainer_11.addSubInstruction(sub_20);
		ISubRule sub_21 = new SubRule("req_uri", 0, 33, false, (IDCCoreVar)dcVars[8], false, "Folha de S.Paulo: No_url_19", null, 0, false);
	subContainer_11.addSubInstruction(sub_21);
		ISubRule sub_22 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[16], false, "Host_96", null, 0, false);
	subContainer_11.addSubInstruction(sub_22);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A306A8FC3FD8EE33930653439",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A306B2C09FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "f.i.uol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "__gads=ID=24d070a6150dcf8e:T=1501612272:S=ALNI_MYf74FuCKRki3VA0G6dcXoEBEBskg;_ga=GA1.3.2068662744.1501612270;BTCTL=df;DNA=df13c0be965346baa247145e4a77ebca|null|true", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_12 = new DataSub();
	reqAction.addDataSub(subContainer_12);

		ISubRule sub_23 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_61", null, 0, false);
	subContainer_12.addSubInstruction(sub_23);
		ISubRule sub_24 = new SubRule("req_uri", 0, 31, false, (IDCCoreVar)dcVars[10], false, "Folha de S.Paulo: No_url_18", null, 0, false);
	subContainer_12.addSubInstruction(sub_24);
		ISubRule sub_25 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[16], false, "Host_95", null, 0, false);
	subContainer_12.addSubInstruction(sub_25);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A306B2C0CFD8EE33930653439",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A306D00CBFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "f.i.uol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "__gads=ID=24d070a6150dcf8e:T=1501612272:S=ALNI_MYf74FuCKRki3VA0G6dcXoEBEBskg;_ga=GA1.3.2068662744.1501612270;BTCTL=df;DNA=df13c0be965346baa247145e4a77ebca|null|true", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_13 = new DataSub();
	reqAction.addDataSub(subContainer_13);

		ISubRule sub_26 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_60", null, 0, false);
	subContainer_13.addSubInstruction(sub_26);
		ISubRule sub_27 = new SubRule("req_uri", 0, 33, false, (IDCCoreVar)dcVars[7], false, "Folha de S.Paulo: No_url_17", null, 0, false);
	subContainer_13.addSubInstruction(sub_27);
		ISubRule sub_28 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[16], false, "Host_94", null, 0, false);
	subContainer_13.addSubInstruction(sub_28);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A306D00CEFD8EE33930653439",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A306D4EF3FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "f.i.uol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "__gads=ID=24d070a6150dcf8e:T=1501612272:S=ALNI_MYf74FuCKRki3VA0G6dcXoEBEBskg;_ga=GA1.3.2068662744.1501612270;BTCTL=df;DNA=df13c0be965346baa247145e4a77ebca|null|true", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_14 = new DataSub();
	reqAction.addDataSub(subContainer_14);

		ISubRule sub_29 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_59", null, 0, false);
	subContainer_14.addSubInstruction(sub_29);
		ISubRule sub_30 = new SubRule("req_uri", 0, 33, false, (IDCCoreVar)dcVars[6], false, "Folha de S.Paulo: No_url_16", null, 0, false);
	subContainer_14.addSubInstruction(sub_30);
		ISubRule sub_31 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[16], false, "Host_93", null, 0, false);
	subContainer_14.addSubInstruction(sub_31);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A306D4EF6FD8EE33930653439",
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

	public HTTPAction request_15(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A306FE6F8FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "usr.navdmp.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "__cfduid=dbecad2bec36879a08d8ab20fbe6372121500324187;nid=7bc9d9b54d99d1acdb17aaeab09|2|347;ac3=1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_15 = new DataSub();
	reqAction.addDataSub(subContainer_15);

		ISubRule sub_32 = new SubRule("req_uri", 47, 1, true, (IDCCoreVar)dcVars[30], false, "dsy", null, 0, false);
	subContainer_15.addSubInstruction(sub_32);
		ISubRule sub_33 = new SubRule("req_uri", 41, 1, true, (IDCCoreVar)dcVars[29], false, "wct", null, 0, false);
	subContainer_15.addSubInstruction(sub_33);
		ISubRule sub_34 = new SubRule("req_uri", 35, 1, true, (IDCCoreVar)dcVars[28], false, "wst", null, 0, false);
	subContainer_15.addSubInstruction(sub_34);
		ISubRule sub_35 = new SubRule("req_uri", 29, 1, true, (IDCCoreVar)dcVars[27], false, "new", null, 0, false);
	subContainer_15.addSubInstruction(sub_35);
		ISubRule sub_36 = new SubRule("req_uri", 23, 1, true, (IDCCoreVar)dcVars[26], false, "upd", null, 0, false);
	subContainer_15.addSubInstruction(sub_36);
		ISubRule sub_37 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_58", null, 0, false);
	subContainer_15.addSubInstruction(sub_37);
		ISubRule sub_38 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[26], false, "Host_92", null, 0, false);
	subContainer_15.addSubInstruction(sub_38);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A301BD388FD8EE33930653439"), 3);		
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
			"A1E8094A306FE6FBFD8EE33930653439",
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

	public HTTPAction request_16(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A30700E3FFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "f.i.uol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "__gads=ID=24d070a6150dcf8e:T=1501612272:S=ALNI_MYf74FuCKRki3VA0G6dcXoEBEBskg;_ga=GA1.3.2068662744.1501612270;BTCTL=df;DNA=df13c0be965346baa247145e4a77ebca|null|true", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_16 = new DataSub();
	reqAction.addDataSub(subContainer_16);

		ISubRule sub_39 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_57", null, 0, false);
	subContainer_16.addSubInstruction(sub_39);
		ISubRule sub_40 = new SubRule("req_uri", 0, 40, false, (IDCCoreVar)dcVars[22], false, "Folha de S.Paulo: No_url_15", null, 0, false);
	subContainer_16.addSubInstruction(sub_40);
		ISubRule sub_41 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[16], false, "Host_91", null, 0, false);
	subContainer_16.addSubInstruction(sub_41);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A30700E42FD8EE33930653439",
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

	public HTTPAction request_17(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A3070833BFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "f.i.uol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "__gads=ID=24d070a6150dcf8e:T=1501612272:S=ALNI_MYf74FuCKRki3VA0G6dcXoEBEBskg;_ga=GA1.3.2068662744.1501612270;BTCTL=df;DNA=df13c0be965346baa247145e4a77ebca|null|true", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_17 = new DataSub();
	reqAction.addDataSub(subContainer_17);

		ISubRule sub_42 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_56", null, 0, false);
	subContainer_17.addSubInstruction(sub_42);
		ISubRule sub_43 = new SubRule("req_uri", 0, 33, false, (IDCCoreVar)dcVars[9], false, "Folha de S.Paulo: No_url_14", null, 0, false);
	subContainer_17.addSubInstruction(sub_43);
		ISubRule sub_44 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[16], false, "Host_90", null, 0, false);
	subContainer_17.addSubInstruction(sub_44);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A3070833EFD8EE33930653439",
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

	public HTTPAction request_18(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A3070AA93FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "f.i.uol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "__gads=ID=24d070a6150dcf8e:T=1501612272:S=ALNI_MYf74FuCKRki3VA0G6dcXoEBEBskg;_ga=GA1.3.2068662744.1501612270;BTCTL=df;DNA=df13c0be965346baa247145e4a77ebca|null|true", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_18 = new DataSub();
	reqAction.addDataSub(subContainer_18);

		ISubRule sub_45 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_55", null, 0, false);
	subContainer_18.addSubInstruction(sub_45);
		ISubRule sub_46 = new SubRule("req_uri", 0, 31, false, (IDCCoreVar)dcVars[11], false, "Folha de S.Paulo: No_url_13", null, 0, false);
	subContainer_18.addSubInstruction(sub_46);
		ISubRule sub_47 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[16], false, "Host_89", null, 0, false);
	subContainer_18.addSubInstruction(sub_47);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A3070AA96FD8EE33930653439",
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

	public HTTPAction request_19(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A307257F8FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "f.i.uol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "__gads=ID=24d070a6150dcf8e:T=1501612272:S=ALNI_MYf74FuCKRki3VA0G6dcXoEBEBskg;_ga=GA1.3.2068662744.1501612270;BTCTL=df;DNA=df13c0be965346baa247145e4a77ebca|null|true", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_19 = new DataSub();
	reqAction.addDataSub(subContainer_19);

		ISubRule sub_48 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_54", null, 0, false);
	subContainer_19.addSubInstruction(sub_48);
		ISubRule sub_49 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[16], false, "Host_88", null, 0, false);
	subContainer_19.addSubInstruction(sub_49);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A307257FBFD8EE33930653439",
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

	public HTTPAction request_20(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A3072F438FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "images1.folha.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_20 = new DataSub();
	reqAction.addDataSub(subContainer_20);

		ISubRule sub_50 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_53", null, 0, false);
	subContainer_20.addSubInstruction(sub_50);
		ISubRule sub_51 = new SubRule("req_uri", 0, 40, false, (IDCCoreVar)dcVars[13], false, "Folha de S.Paulo: No_url_12", null, 0, false);
	subContainer_20.addSubInstruction(sub_51);
		ISubRule sub_52 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[25], false, "Host_87", null, 0, false);
	subContainer_20.addSubInstruction(sub_52);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A3072F43BFD8EE33930653439",
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

	public HTTPAction request_21(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A30731B87FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "images1.folha.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_21 = new DataSub();
	reqAction.addDataSub(subContainer_21);

		ISubRule sub_53 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_52", null, 0, false);
	subContainer_21.addSubInstruction(sub_53);
		ISubRule sub_54 = new SubRule("req_uri", 0, 40, false, (IDCCoreVar)dcVars[21], false, "Folha de S.Paulo: No_url_11", null, 0, false);
	subContainer_21.addSubInstruction(sub_54);
		ISubRule sub_55 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[25], false, "Host_86", null, 0, false);
	subContainer_21.addSubInstruction(sub_55);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A30731B8AFD8EE33930653439",
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

	public HTTPAction request_22(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A307369A7FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "images1.folha.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_22 = new DataSub();
	reqAction.addDataSub(subContainer_22);

		ISubRule sub_56 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_51", null, 0, false);
	subContainer_22.addSubInstruction(sub_56);
		ISubRule sub_57 = new SubRule("req_uri", 0, 40, false, (IDCCoreVar)dcVars[20], false, "Folha de S.Paulo: No_url_10", null, 0, false);
	subContainer_22.addSubInstruction(sub_57);
		ISubRule sub_58 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[25], false, "Host_85", null, 0, false);
	subContainer_22.addSubInstruction(sub_58);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A307369AAFD8EE33930653439",
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

	public HTTPAction request_23(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A3073B7C7FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "images1.folha.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_23 = new DataSub();
	reqAction.addDataSub(subContainer_23);

		ISubRule sub_59 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_50", null, 0, false);
	subContainer_23.addSubInstruction(sub_59);
		ISubRule sub_60 = new SubRule("req_uri", 0, 40, false, (IDCCoreVar)dcVars[17], false, "Folha de S.Paulo: No_url_9", null, 0, false);
	subContainer_23.addSubInstruction(sub_60);
		ISubRule sub_61 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[25], false, "Host_84", null, 0, false);
	subContainer_23.addSubInstruction(sub_61);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A3073DE90FD8EE33930653439",
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

	public HTTPAction request_24(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A307405E7FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "images1.folha.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_24 = new DataSub();
	reqAction.addDataSub(subContainer_24);

		ISubRule sub_62 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_49", null, 0, false);
	subContainer_24.addSubInstruction(sub_62);
		ISubRule sub_63 = new SubRule("req_uri", 0, 40, false, (IDCCoreVar)dcVars[15], false, "Folha de S.Paulo: No_url_8", null, 0, false);
	subContainer_24.addSubInstruction(sub_63);
		ISubRule sub_64 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[25], false, "Host_83", null, 0, false);
	subContainer_24.addSubInstruction(sub_64);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A307405EAFD8EE33930653439",
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

	public HTTPAction request_25(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A3075DA68FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "images1.folha.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_25 = new DataSub();
	reqAction.addDataSub(subContainer_25);

		ISubRule sub_65 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_48", null, 0, false);
	subContainer_25.addSubInstruction(sub_65);
		ISubRule sub_66 = new SubRule("req_uri", 0, 40, false, (IDCCoreVar)dcVars[19], false, "Folha de S.Paulo: No_url_7", null, 0, false);
	subContainer_25.addSubInstruction(sub_66);
		ISubRule sub_67 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[25], false, "Host_82", null, 0, false);
	subContainer_25.addSubInstruction(sub_67);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A3075DA6BFD8EE33930653439",
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

	public HTTPAction request_26(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A307601B7FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "images1.folha.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_26 = new DataSub();
	reqAction.addDataSub(subContainer_26);

		ISubRule sub_68 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_47", null, 0, false);
	subContainer_26.addSubInstruction(sub_68);
		ISubRule sub_69 = new SubRule("req_uri", 0, 40, false, (IDCCoreVar)dcVars[12], false, "Folha de S.Paulo: No_url_6", null, 0, false);
	subContainer_26.addSubInstruction(sub_69);
		ISubRule sub_70 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[25], false, "Host_81", null, 0, false);
	subContainer_26.addSubInstruction(sub_70);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A30762880FD8EE33930653439",
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

	public HTTPAction request_27(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A30764FD5FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "images1.folha.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_27 = new DataSub();
	reqAction.addDataSub(subContainer_27);

		ISubRule sub_71 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_46", null, 0, false);
	subContainer_27.addSubInstruction(sub_71);
		ISubRule sub_72 = new SubRule("req_uri", 0, 40, false, (IDCCoreVar)dcVars[14], false, "Folha de S.Paulo: No_url_5", null, 0, false);
	subContainer_27.addSubInstruction(sub_72);
		ISubRule sub_73 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[25], false, "Host_80", null, 0, false);
	subContainer_27.addSubInstruction(sub_73);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A30764FD8FD8EE33930653439",
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

	public HTTPAction request_28(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A30769DF6FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "images1.folha.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_28 = new DataSub();
	reqAction.addDataSub(subContainer_28);

		ISubRule sub_74 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_45", null, 0, false);
	subContainer_28.addSubInstruction(sub_74);
		ISubRule sub_75 = new SubRule("req_uri", 0, 40, false, (IDCCoreVar)dcVars[18], false, "Folha de S.Paulo: No_url_4", null, 0, false);
	subContainer_28.addSubInstruction(sub_75);
		ISubRule sub_76 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[25], false, "Host_79", null, 0, false);
	subContainer_28.addSubInstruction(sub_76);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A30769DF9FD8EE33930653439",
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

	public HTTPAction request_29(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A3076EC0BFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "images1.folha.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_29 = new DataSub();
	reqAction.addDataSub(subContainer_29);

		ISubRule sub_77 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_44", null, 0, false);
	subContainer_29.addSubInstruction(sub_77);
		ISubRule sub_78 = new SubRule("req_uri", 0, 40, false, (IDCCoreVar)dcVars[16], false, "Folha de S.Paulo: No_url_3", null, 0, false);
	subContainer_29.addSubInstruction(sub_78);
		ISubRule sub_79 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[25], false, "Host_78", null, 0, false);
	subContainer_29.addSubInstruction(sub_79);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A3076EC0EFD8EE33930653439",
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

	public HTTPAction request_30(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A30773A2DFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "mab.chartbeat.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "http://www.folha.uol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_30 = new DataSub();
	reqAction.addDataSub(subContainer_30);

		ISubRule sub_80 = new SubRule("req_uri", 92, 3, true, (IDCCoreVar)dcVars[31], false, "path", null, 0, false);
	subContainer_30.addSubInstruction(sub_80);
		ISubRule sub_81 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_43", null, 0, false);
	subContainer_30.addSubInstruction(sub_81);
		ISubRule sub_82 = new SubRule("req_hdr_Host_1", 0, 17, false, (IDCCoreVar)vars[24], false, "Host_77", null, 0, false);
	subContainer_30.addSubInstruction(sub_82);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A301BD388FD8EE33930653439"), 3);		
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
			"A1E8094A30773A30FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_31(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A3077615FFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "static.folha.uol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "identity", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://static.folha.uol.com.br/hunting-portal/build/css/app-e52c36f6aa341947aa8f.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "http://www.folha.uol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_31 = new DataSub();
	reqAction.addDataSub(subContainer_31);

		ISubRule sub_83 = new SubRule("req_hdr_Referer_1", 0, 84, false, (IDCCoreVar)dcVars[32], false, "Referer_42", null, 0, false);
	subContainer_31.addSubInstruction(sub_83);
		ISubRule sub_84 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[23], false, "Host_76", null, 0, false);
	subContainer_31.addSubInstruction(sub_84);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A301C7004FD8EE33930653439"), 3);		
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
			"A1E8094A30776162FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_32(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A307BF4EFFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "static.folha.uol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "identity", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://static.folha.uol.com.br/hunting-portal/build/css/app-e52c36f6aa341947aa8f.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "http://www.folha.uol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_32 = new DataSub();
	reqAction.addDataSub(subContainer_32);

		ISubRule sub_85 = new SubRule("req_hdr_Referer_1", 0, 84, false, (IDCCoreVar)dcVars[32], false, "Referer_41", null, 0, false);
	subContainer_32.addSubInstruction(sub_85);
		ISubRule sub_86 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[23], false, "Host_75", null, 0, false);
	subContainer_32.addSubInstruction(sub_86);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A301C7004FD8EE33930653439"), 3);		
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
			"A1E8094A307BF4F2FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_33(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A307D7B8FFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "static.folha.uol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "identity", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://static.folha.uol.com.br/hunting-portal/build/css/app-e52c36f6aa341947aa8f.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "http://www.folha.uol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_33 = new DataSub();
	reqAction.addDataSub(subContainer_33);

		ISubRule sub_87 = new SubRule("req_hdr_Referer_1", 0, 84, false, (IDCCoreVar)dcVars[32], false, "Referer_40", null, 0, false);
	subContainer_33.addSubInstruction(sub_87);
		ISubRule sub_88 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[23], false, "Host_74", null, 0, false);
	subContainer_33.addSubInstruction(sub_88);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A301C7004FD8EE33930653439"), 3);		
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
			"A1E8094A307D7B92FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-font-woff");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_34(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A307E17CAFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "static.folha.uol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "identity", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://static.folha.uol.com.br/hunting-portal/build/css/app-e52c36f6aa341947aa8f.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "http://www.folha.uol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_34 = new DataSub();
	reqAction.addDataSub(subContainer_34);

		ISubRule sub_89 = new SubRule("req_hdr_Referer_1", 0, 84, false, (IDCCoreVar)dcVars[32], false, "Referer_39", null, 0, false);
	subContainer_34.addSubInstruction(sub_89);
		ISubRule sub_90 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[23], false, "Host_73", null, 0, false);
	subContainer_34.addSubInstruction(sub_90);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A301C7004FD8EE33930653439"), 3);		
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
			"A1E8094A307E17CDFD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_35(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A307F9E6FFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "static.folha.uol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "identity", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://static.folha.uol.com.br/hunting-portal/build/css/app-e52c36f6aa341947aa8f.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "http://www.folha.uol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_35 = new DataSub();
	reqAction.addDataSub(subContainer_35);

		ISubRule sub_91 = new SubRule("req_hdr_Referer_1", 0, 84, false, (IDCCoreVar)dcVars[32], false, "Referer_38", null, 0, false);
	subContainer_35.addSubInstruction(sub_91);
		ISubRule sub_92 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[23], false, "Host_72", null, 0, false);
	subContainer_35.addSubInstruction(sub_92);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A301C7004FD8EE33930653439"), 3);		
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
			"A1E8094A307F9E72FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_36(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A30812503FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "static.folha.uol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "identity", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://static.folha.uol.com.br/hunting-portal/build/css/app-e52c36f6aa341947aa8f.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "http://www.folha.uol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_36 = new DataSub();
	reqAction.addDataSub(subContainer_36);

		ISubRule sub_93 = new SubRule("req_hdr_Referer_1", 0, 84, false, (IDCCoreVar)dcVars[32], false, "Referer_37", null, 0, false);
	subContainer_36.addSubInstruction(sub_93);
		ISubRule sub_94 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[23], false, "Host_71", null, 0, false);
	subContainer_36.addSubInstruction(sub_94);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A301C7004FD8EE33930653439"), 3);		
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
			"A1E8094A30812506FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_37(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A30825D8FFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "static.folha.uol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "identity", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://static.folha.uol.com.br/hunting-portal/build/css/app-e52c36f6aa341947aa8f.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "http://www.folha.uol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_37 = new DataSub();
	reqAction.addDataSub(subContainer_37);

		ISubRule sub_95 = new SubRule("req_hdr_Referer_1", 0, 84, false, (IDCCoreVar)dcVars[32], false, "Referer_36", null, 0, false);
	subContainer_37.addSubInstruction(sub_95);
		ISubRule sub_96 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[23], false, "Host_70", null, 0, false);
	subContainer_37.addSubInstruction(sub_96);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A301C7004FD8EE33930653439"), 3);		
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
			"A1E8094A30825D92FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_38(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A3083960BFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "detectportal.firefox.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Pragma", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_38 = new DataSub();
	reqAction.addDataSub(subContainer_38);

		ISubRule sub_97 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[8], false, "Host_69", null, 0, false);
	subContainer_38.addSubInstruction(sub_97);
	


		
				
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
			"A1E8094A3083960EFD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_39(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A3083BD2BFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "static.folha.uol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "identity", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://static.folha.uol.com.br/hunting-portal/build/css/app-e52c36f6aa341947aa8f.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "http://www.folha.uol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_39 = new DataSub();
	reqAction.addDataSub(subContainer_39);

		ISubRule sub_98 = new SubRule("req_hdr_Referer_1", 0, 84, false, (IDCCoreVar)dcVars[32], false, "Referer_35", null, 0, false);
	subContainer_39.addSubInstruction(sub_98);
		ISubRule sub_99 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[23], false, "Host_68", null, 0, false);
	subContainer_39.addSubInstruction(sub_99);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A301C7004FD8EE33930653439"), 3);		
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
			"A1E8094A3083BD2EFD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_40(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A3084F5A0FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "detectportal.firefox.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Pragma", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_40 = new DataSub();
	reqAction.addDataSub(subContainer_40);

		ISubRule sub_100 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[8], false, "Host_67", null, 0, false);
	subContainer_40.addSubInstruction(sub_100);
	


		
				
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
			"A1E8094A3084F5A3FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_41(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A30851CDEFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "cdn.navdmp.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "__cfduid=dbecad2bec36879a08d8ab20fbe6372121500324187;nid=7bc9d9b54d99d1acdb17aaeab09|2|347;ac3=1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_41 = new DataSub();
	reqAction.addDataSub(subContainer_41);

		ISubRule sub_101 = new SubRule("req_uri", 19, 1, true, (IDCCoreVar)dcVars[27], false, "new", null, 0, false);
	subContainer_41.addSubInstruction(sub_101);
		ISubRule sub_102 = new SubRule("req_uri", 13, 1, true, (IDCCoreVar)dcVars[26], false, "upd", null, 0, false);
	subContainer_41.addSubInstruction(sub_102);
		ISubRule sub_103 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_34", null, 0, false);
	subContainer_41.addSubInstruction(sub_103);
		ISubRule sub_104 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[22], false, "Host_66", null, 0, false);
	subContainer_41.addSubInstruction(sub_104);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A301BD388FD8EE33930653439"), 3);		
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
			"A1E8094A308543B0FD8EE33930653439",
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

	public HTTPAction request_42(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A30856AC9FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "detectportal.firefox.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Pragma", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_42 = new DataSub();
	reqAction.addDataSub(subContainer_42);

		ISubRule sub_105 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[8], false, "Host_65", null, 0, false);
	subContainer_42.addSubInstruction(sub_105);
	


		
				
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
			"A1E8094A30856ACCFD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_43(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A3085B90DFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "detectportal.firefox.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Pragma", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_43 = new DataSub();
	reqAction.addDataSub(subContainer_43);

		ISubRule sub_106 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[8], false, "Host_64", null, 0, false);
	subContainer_43.addSubInstruction(sub_106);
	


		
				
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
			"A1E8094A3085B910FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_44(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A3085E020FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "detectportal.firefox.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Pragma", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_44 = new DataSub();
	reqAction.addDataSub(subContainer_44);

		ISubRule sub_107 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[8], false, "Host_63", null, 0, false);
	subContainer_44.addSubInstruction(sub_107);
	


		
				
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
			"A1E8094A3085E023FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_45(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A30860749FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "platform.twitter.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "personalization_id=\"v1_m4cGGwOXwk0vKFt+/PjfJA==\";guest_id=v1%3A149824200786529890", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_45 = new DataSub();
	reqAction.addDataSub(subContainer_45);

		ISubRule sub_108 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_33", null, 0, false);
	subContainer_45.addSubInstruction(sub_108);
		ISubRule sub_109 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[21], false, "Host_62", null, 0, false);
	subContainer_45.addSubInstruction(sub_109);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A30862E10FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_46(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A30867C33FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "detectportal.firefox.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Pragma", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_46 = new DataSub();
	reqAction.addDataSub(subContainer_46);

		ISubRule sub_110 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[8], false, "Host_61", null, 0, false);
	subContainer_46.addSubInstruction(sub_110);
	


		
				
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
			"A1E8094A30867C36FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_47(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A3086A34BFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www1.folha.uol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "__gads=ID=24d070a6150dcf8e:T=1501612272:S=ALNI_MYf74FuCKRki3VA0G6dcXoEBEBskg;_ga=GA1.3.2068662744.1501612270;BTCTL=df;DNA=df13c0be965346baa247145e4a77ebca|null|true;nav23947=7bc9d9b54d05d3182079c24b809|2_13", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_47 = new DataSub();
	reqAction.addDataSub(subContainer_47);

		ISubRule sub_111 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_32", null, 0, false);
	subContainer_47.addSubInstruction(sub_111);
		ISubRule sub_112 = new SubRule("req_hdr_Host_1", 0, 21, false, (IDCCoreVar)vars[20], false, "Host_60", null, 0, false);
	subContainer_47.addSubInstruction(sub_112);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A3086A34EFD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_48(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A3086CA9FFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www1.folha.uol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "__gads=ID=24d070a6150dcf8e:T=1501612272:S=ALNI_MYf74FuCKRki3VA0G6dcXoEBEBskg;_ga=GA1.3.2068662744.1501612270;BTCTL=df;DNA=df13c0be965346baa247145e4a77ebca|null|true;nav23947=7bc9d9b54d05d3182079c24b809|2_13", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_48 = new DataSub();
	reqAction.addDataSub(subContainer_48);

		ISubRule sub_113 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_31", null, 0, false);
	subContainer_48.addSubInstruction(sub_113);
		ISubRule sub_114 = new SubRule("req_hdr_Host_1", 0, 21, false, (IDCCoreVar)vars[20], false, "Host_59", null, 0, false);
	subContainer_48.addSubInstruction(sub_114);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A3086CAA2FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_49(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A3087187FFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www1.folha.uol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "__gads=ID=24d070a6150dcf8e:T=1501612272:S=ALNI_MYf74FuCKRki3VA0G6dcXoEBEBskg;_ga=GA1.3.2068662744.1501612270;BTCTL=df;DNA=df13c0be965346baa247145e4a77ebca|null|true;nav23947=7bc9d9b54d05d3182079c24b809|2_13", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_49 = new DataSub();
	reqAction.addDataSub(subContainer_49);

		ISubRule sub_115 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_30", null, 0, false);
	subContainer_49.addSubInstruction(sub_115);
		ISubRule sub_116 = new SubRule("req_hdr_Host_1", 0, 21, false, (IDCCoreVar)vars[20], false, "Host_58", null, 0, false);
	subContainer_49.addSubInstruction(sub_116);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A30871882FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_50(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A30873FCFFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www1.folha.uol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "__gads=ID=24d070a6150dcf8e:T=1501612272:S=ALNI_MYf74FuCKRki3VA0G6dcXoEBEBskg;_ga=GA1.3.2068662744.1501612270;BTCTL=df;DNA=df13c0be965346baa247145e4a77ebca|null|true;nav23947=7bc9d9b54d05d3182079c24b809|2_13", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_50 = new DataSub();
	reqAction.addDataSub(subContainer_50);

		ISubRule sub_117 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_29", null, 0, false);
	subContainer_50.addSubInstruction(sub_117);
		ISubRule sub_118 = new SubRule("req_hdr_Host_1", 0, 21, false, (IDCCoreVar)vars[20], false, "Host_57", null, 0, false);
	subContainer_50.addSubInstruction(sub_118);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A30873FD2FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_51(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A30878DA0FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "detectportal.firefox.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Pragma", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_51 = new DataSub();
	reqAction.addDataSub(subContainer_51);

		ISubRule sub_119 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[8], false, "Host_56", null, 0, false);
	subContainer_51.addSubInstruction(sub_119);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A30878DA3FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_52(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A3087B4B0FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "detectportal.firefox.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Pragma", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_52 = new DataSub();
	reqAction.addDataSub(subContainer_52);

		ISubRule sub_120 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[8], false, "Host_55", null, 0, false);
	subContainer_52.addSubInstruction(sub_120);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A3087B4B3FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_53(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A308802D1FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "detectportal.firefox.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Pragma", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_53 = new DataSub();
	reqAction.addDataSub(subContainer_53);

		ISubRule sub_121 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[8], false, "Host_54", null, 0, false);
	subContainer_53.addSubInstruction(sub_121);
	


		
				
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
			"A1E8094A308802D4FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_54(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A308829F5FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "detectportal.firefox.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Pragma", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_54 = new DataSub();
	reqAction.addDataSub(subContainer_54);

		ISubRule sub_122 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[8], false, "Host_53", null, 0, false);
	subContainer_54.addSubInstruction(sub_122);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A308829F8FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_55(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A30885127FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "paywall.folha.uol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "__gads=ID=24d070a6150dcf8e:T=1501612272:S=ALNI_MYf74FuCKRki3VA0G6dcXoEBEBskg;_ga=GA1.3.2068662744.1501612270;BTCTL=df;DNA=df13c0be965346baa247145e4a77ebca|null|true;nav23947=7bc9d9b54d05d3182079c24b809|2_13", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_55 = new DataSub();
	reqAction.addDataSub(subContainer_55);

		ISubRule sub_123 = new SubRule("req_uri", 21, 14, true, (IDCCoreVar)dcVars[24], false, "callback", null, 0, false);
	subContainer_55.addSubInstruction(sub_123);
		ISubRule sub_124 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_28", null, 0, false);
	subContainer_55.addSubInstruction(sub_124);
		ISubRule sub_125 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[17], false, "Host_52", null, 0, false);
	subContainer_55.addSubInstruction(sub_125);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A3088512AFD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript; charset=UTF-8;");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_56(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A30889F10FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "detectportal.firefox.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Pragma", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_56 = new DataSub();
	reqAction.addDataSub(subContainer_56);

		ISubRule sub_126 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[8], false, "Host_51", null, 0, false);
	subContainer_56.addSubInstruction(sub_126);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A30889F13FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_57(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A3088C625FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "tempo.folha.uol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "__gads=ID=24d070a6150dcf8e:T=1501612272:S=ALNI_MYf74FuCKRki3VA0G6dcXoEBEBskg;_ga=GA1.3.2068662744.1501612270;BTCTL=df;DNA=df13c0be965346baa247145e4a77ebca|null|true;nav23947=7bc9d9b54d05d3182079c24b809|2_13", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_57 = new DataSub();
	reqAction.addDataSub(subContainer_57);

		ISubRule sub_127 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_27", null, 0, false);
	subContainer_57.addSubInstruction(sub_127);
		ISubRule sub_128 = new SubRule("req_hdr_Host_1", 0, 22, false, (IDCCoreVar)vars[19], false, "Host_50", null, 0, false);
	subContainer_57.addSubInstruction(sub_128);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A3088C628FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_58(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A3088ED30FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "detectportal.firefox.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Pragma", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_58 = new DataSub();
	reqAction.addDataSub(subContainer_58);

		ISubRule sub_129 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[8], false, "Host_49", null, 0, false);
	subContainer_58.addSubInstruction(sub_129);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A3088ED33FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_59(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A30891440FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "detectportal.firefox.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Pragma", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_59 = new DataSub();
	reqAction.addDataSub(subContainer_59);

		ISubRule sub_130 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[8], false, "Host_48", null, 0, false);
	subContainer_59.addSubInstruction(sub_130);
	


		
				
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
			"A1E8094A30891443FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_60(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A30893B5BFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "ivccftag.ivcbrasil.org.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_6 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_6);

	harvestContainer_6.addHarvestInstruction ("resp_content", dcVars[34], "/g,\015\np=(.*?)\\[", 1, 1, 0, 0, false, "g,..p", null, 0, false);
	harvestContainer_6.addHarvestInstruction ("resp_content", dcVars[35], ":this\\)\\.Tracker=(.*?)\015", 1, 1, 0, 0, false, "this).Tracker", null, 0, false);
	IDataSub subContainer_60 = new DataSub();
	reqAction.addDataSub(subContainer_60);

		ISubRule sub_131 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_26", null, 0, false);
	subContainer_60.addSubInstruction(sub_131);
		ISubRule sub_132 = new SubRule("req_hdr_Host_1", 0, 25, false, (IDCCoreVar)vars[18], false, "Host_47", null, 0, false);
	subContainer_60.addSubInstruction(sub_132);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A30893B5EFD8EE33930653439",
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

	public HTTPAction request_61(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A3089B080FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "detectportal.firefox.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Pragma", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_61 = new DataSub();
	reqAction.addDataSub(subContainer_61);

		ISubRule sub_133 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[8], false, "Host_46", null, 0, false);
	subContainer_61.addSubInstruction(sub_133);
	


		
				
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
			"A1E8094A3089B083FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_62(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A3089D7BFFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "detectportal.firefox.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Pragma", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_62 = new DataSub();
	reqAction.addDataSub(subContainer_62);

		ISubRule sub_134 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[8], false, "Host_45", null, 0, false);
	subContainer_62.addSubInstruction(sub_134);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A3089D7C2FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_63(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A3089FEF8FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "detectportal.firefox.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Pragma", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_63 = new DataSub();
	reqAction.addDataSub(subContainer_63);

		ISubRule sub_135 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[8], false, "Host_44", null, 0, false);
	subContainer_63.addSubInstruction(sub_135);
	


		
				
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
			"A1E8094A3089FEFBFD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_64(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A308A4CC8FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "paywall.folha.uol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "__gads=ID=24d070a6150dcf8e:T=1501612272:S=ALNI_MYf74FuCKRki3VA0G6dcXoEBEBskg;_ga=GA1.3.2068662744.1501612270;BTCTL=df;DNA=df13c0be965346baa247145e4a77ebca|null|true;nav23947=7bc9d9b54d05d3182079c24b809|2_13", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_64 = new DataSub();
	reqAction.addDataSub(subContainer_64);

		ISubRule sub_136 = new SubRule("req_uri", 28, 13, true, (IDCCoreVar)dcVars[33], false, "callback", null, 0, false);
	subContainer_64.addSubInstruction(sub_136);
		ISubRule sub_137 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_25", null, 0, false);
	subContainer_64.addSubInstruction(sub_137);
		ISubRule sub_138 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[17], false, "Host_43", null, 0, false);
	subContainer_64.addSubInstruction(sub_138);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A302FD0B8FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30885127FD8EE33930653439"), 3);		
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
			"A1E8094A308A4CCBFD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript; charset=UTF-8;");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_65(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A308A73D7FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "detectportal.firefox.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Pragma", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_65 = new DataSub();
	reqAction.addDataSub(subContainer_65);

		ISubRule sub_139 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[8], false, "Host_42", null, 0, false);
	subContainer_65.addSubInstruction(sub_139);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A308A73DAFD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_66(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A308A9AF7FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "detectportal.firefox.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Pragma", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_66 = new DataSub();
	reqAction.addDataSub(subContainer_66);

		ISubRule sub_140 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[8], false, "Host_41", null, 0, false);
	subContainer_66.addSubInstruction(sub_140);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A308A9AFAFD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_67(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A308AE900FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "detectportal.firefox.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Pragma", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_67 = new DataSub();
	reqAction.addDataSub(subContainer_67);

		ISubRule sub_141 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[8], false, "Host_40", null, 0, false);
	subContainer_67.addSubInstruction(sub_141);
	


		
				
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
			"A1E8094A308AE903FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_68(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A308B1010FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "detectportal.firefox.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Pragma", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_68 = new DataSub();
	reqAction.addDataSub(subContainer_68);

		ISubRule sub_142 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[8], false, "Host_39", null, 0, false);
	subContainer_68.addSubInstruction(sub_142);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A308B1013FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_69(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A308B1077FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "detectportal.firefox.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Pragma", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_69 = new DataSub();
	reqAction.addDataSub(subContainer_69);

		ISubRule sub_143 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[8], false, "Host_38", null, 0, false);
	subContainer_69.addSubInstruction(sub_143);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A308B107AFD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_70(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A308B374FFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "detectportal.firefox.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Pragma", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_70 = new DataSub();
	reqAction.addDataSub(subContainer_70);

		ISubRule sub_144 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[8], false, "Host_37", null, 0, false);
	subContainer_70.addSubInstruction(sub_144);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A308B3752FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_71(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A308B5E30FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "detectportal.firefox.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Pragma", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_71 = new DataSub();
	reqAction.addDataSub(subContainer_71);

		ISubRule sub_145 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[8], false, "Host_36", null, 0, false);
	subContainer_71.addSubInstruction(sub_145);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A308B5E33FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_72(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A308B8550FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "detectportal.firefox.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Pragma", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_72 = new DataSub();
	reqAction.addDataSub(subContainer_72);

		ISubRule sub_146 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[8], false, "Host_35", null, 0, false);
	subContainer_72.addSubInstruction(sub_146);
	


		
				
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
			"A1E8094A308B8553FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_73(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A308BAC7FFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "detectportal.firefox.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Pragma", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_73 = new DataSub();
	reqAction.addDataSub(subContainer_73);

		ISubRule sub_147 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[8], false, "Host_34", null, 0, false);
	subContainer_73.addSubInstruction(sub_147);
	


		
				
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
			"A1E8094A308BAC82FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_74(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A308BD363FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "detectportal.firefox.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Pragma", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_74 = new DataSub();
	reqAction.addDataSub(subContainer_74);

		ISubRule sub_148 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[8], false, "Host_33", null, 0, false);
	subContainer_74.addSubInstruction(sub_148);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A308BD366FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_75(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A308BFA7AFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "f.i.uol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "__gads=ID=24d070a6150dcf8e:T=1501612272:S=ALNI_MYf74FuCKRki3VA0G6dcXoEBEBskg;_ga=GA1.3.2068662744.1501612270;BTCTL=df;DNA=df13c0be965346baa247145e4a77ebca|null|true;nav23947=7bc9d9b54d05d3182079c24b809|2_13", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_75 = new DataSub();
	reqAction.addDataSub(subContainer_75);

		ISubRule sub_149 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[16], false, "Host_32", null, 0, false);
	subContainer_75.addSubInstruction(sub_149);
	


		
				
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
			"A1E8094A308BFA7DFD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(404);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html;charset=ISO-8859-1");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_76(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A308C218BFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "f.i.uol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "__gads=ID=24d070a6150dcf8e:T=1501612272:S=ALNI_MYf74FuCKRki3VA0G6dcXoEBEBskg;_ga=GA1.3.2068662744.1501612270;BTCTL=df;DNA=df13c0be965346baa247145e4a77ebca|null|true;nav23947=7bc9d9b54d05d3182079c24b809|2_13", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_76 = new DataSub();
	reqAction.addDataSub(subContainer_76);

		ISubRule sub_150 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[16], false, "Host_31", null, 0, false);
	subContainer_76.addSubInstruction(sub_150);
	


		
				
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
			"A1E8094A308C218EFD8EE33930653439",
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

	public HTTPAction request_77(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A308C6FADFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "tm.jsuol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_7 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_7);

	harvestContainer_7.addHarvestInstruction ("resp_content", dcVars[36], "\\?source=(.*?)'", 1, 1, 0, 0, false, "source_2", null, 0, false);
	IDataSub subContainer_77 = new DataSub();
	reqAction.addDataSub(subContainer_77);

		ISubRule sub_151 = new SubRule("req_uri", 13, 6, true, (IDCCoreVar)dcVars[25], false, "id", null, 0, false);
	subContainer_77.addSubInstruction(sub_151);
		ISubRule sub_152 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_24", null, 0, false);
	subContainer_77.addSubInstruction(sub_152);
		ISubRule sub_153 = new SubRule("req_hdr_Host_1", 0, 15, false, (IDCCoreVar)vars[13], false, "Host_30", null, 0, false);
	subContainer_77.addSubInstruction(sub_153);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A308C6FB0FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_78(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A308D0BE4FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "tm.jsuol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_78 = new DataSub();
	reqAction.addDataSub(subContainer_78);

		ISubRule sub_154 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_23", null, 0, false);
	subContainer_78.addSubInstruction(sub_154);
		ISubRule sub_155 = new SubRule("req_hdr_Host_1", 0, 15, false, (IDCCoreVar)vars[13], false, "Host_29", null, 0, false);
	subContainer_78.addSubInstruction(sub_155);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A308D0BE7FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_79(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A308D5A0CFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "ivccf.ivcbrasil.org.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_79 = new DataSub();
	reqAction.addDataSub(subContainer_79);

		ISubRule sub_156 = new SubRule("req_uri", 228, 5, true, (IDCCoreVar)dcVars[2], false, "lang", null, 0, false);
	subContainer_79.addSubInstruction(sub_156);
		ISubRule sub_157 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_22", null, 0, false);
	subContainer_79.addSubInstruction(sub_157);
		ISubRule sub_158 = new SubRule("req_hdr_Host_1", 0, 22, false, (IDCCoreVar)vars[15], false, "Host_28", null, 0, false);
	subContainer_79.addSubInstruction(sub_158);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A308D5A0FFD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_80(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A308D8148FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.googletagservices.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_80 = new DataSub();
	reqAction.addDataSub(subContainer_80);

		ISubRule sub_159 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_21", null, 0, false);
	subContainer_80.addSubInstruction(sub_159);
		ISubRule sub_160 = new SubRule("req_hdr_Host_1", 0, 25, false, (IDCCoreVar)vars[14], false, "Host_27", null, 0, false);
	subContainer_80.addSubInstruction(sub_160);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A308D814BFD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_81(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A308DCF4DFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "tm.jsuol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_81 = new DataSub();
	reqAction.addDataSub(subContainer_81);

		ISubRule sub_161 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_20", null, 0, false);
	subContainer_81.addSubInstruction(sub_161);
		ISubRule sub_162 = new SubRule("req_hdr_Host_1", 0, 15, false, (IDCCoreVar)vars[13], false, "Host_26", null, 0, false);
	subContainer_81.addSubInstruction(sub_162);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A308DCF50FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_82(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A308DF64CFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "tm.jsuol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_82 = new DataSub();
	reqAction.addDataSub(subContainer_82);

		ISubRule sub_163 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_19", null, 0, false);
	subContainer_82.addSubInstruction(sub_163);
		ISubRule sub_164 = new SubRule("req_hdr_Host_1", 0, 15, false, (IDCCoreVar)vars[13], false, "Host_25", null, 0, false);
	subContainer_82.addSubInstruction(sub_164);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A308DF64FFD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_83(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A308E446BFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "me.jsuol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_8 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_8);

	harvestContainer_8.addHarvestInstruction ("resp_content", dcVars[37], " e,n=(.*?);", 1, 1, 0, 0, false, "e,n", null, 0, false);
	harvestContainer_8.addHarvestInstruction ("resp_content", dcVars[38], "&cv=(.*?)&", 1, 1, 0, 0, false, "cv_2", null, 0, false);
	harvestContainer_8.addHarvestInstruction ("resp_content", dcVars[39], "\"c1=(.*?)&", 1, 1, 0, 0, false, "c1_2", null, 0, false);
	IDataSub subContainer_83 = new DataSub();
	reqAction.addDataSub(subContainer_83);

		ISubRule sub_165 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_18", null, 0, false);
	subContainer_83.addSubInstruction(sub_165);
		ISubRule sub_166 = new SubRule("req_hdr_Host_1", 0, 15, false, (IDCCoreVar)vars[12], false, "Host_24", null, 0, false);
	subContainer_83.addSubInstruction(sub_166);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A308E446EFD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_84(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A308EB990FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "detectportal.firefox.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Pragma", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_84 = new DataSub();
	reqAction.addDataSub(subContainer_84);

		ISubRule sub_167 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[8], false, "Host_23", null, 0, false);
	subContainer_84.addSubInstruction(sub_167);
	


		
				
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
			"A1E8094A308EB993FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_85(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A308EE0C5FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "tt-12340-4.seg.t.tailtarget.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "u=CgAKc1mAyPRybw3LR5MVAg9=", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_85 = new DataSub();
	reqAction.addDataSub(subContainer_85);

		ISubRule sub_168 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_17", null, 0, false);
	subContainer_85.addSubInstruction(sub_168);
		ISubRule sub_169 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[1], false, "Host_22", null, 0, false);
	subContainer_85.addSubInstruction(sub_169);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A308EE0C8FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_86(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A308F07CCFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "detectportal.firefox.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Pragma", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_86 = new DataSub();
	reqAction.addDataSub(subContainer_86);

		ISubRule sub_170 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[8], false, "Host_21", null, 0, false);
	subContainer_86.addSubInstruction(sub_170);
	


		
				
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
			"A1E8094A308F07CFFD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_87(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A308F55DAFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "b.scorecardresearch.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "UID=1F520115915815932f7017e1498241998;UIDR=1498241998", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_87 = new DataSub();
	reqAction.addDataSub(subContainer_87);

		ISubRule sub_171 = new SubRule("req_uri", 74, 3, true, (IDCCoreVar)dcVars[38], false, "cv", null, 0, false);
	subContainer_87.addSubInstruction(sub_171);
		ISubRule sub_172 = new SubRule("req_uri", 6, 1, true, (IDCCoreVar)dcVars[39], false, "c1", null, 0, false);
	subContainer_87.addSubInstruction(sub_172);
		ISubRule sub_173 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_16", null, 0, false);
	subContainer_87.addSubInstruction(sub_173);
		ISubRule sub_174 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[11], false, "Host_20", null, 0, false);
	subContainer_87.addSubInstruction(sub_174);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A308E446BFD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A308F55DDFD8EE33930653439",
			true,
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

	public HTTPAction request_88(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A308F7CFFFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "detectportal.firefox.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Pragma", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_88 = new DataSub();
	reqAction.addDataSub(subContainer_88);

		ISubRule sub_175 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[8], false, "Host_19", null, 0, false);
	subContainer_88.addSubInstruction(sub_175);
	


		
				
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
			"A1E8094A308F7D02FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_89(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A308FA41FFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "detectportal.firefox.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Pragma", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_89 = new DataSub();
	reqAction.addDataSub(subContainer_89);

		ISubRule sub_176 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[8], false, "Host_18", null, 0, false);
	subContainer_89.addSubInstruction(sub_176);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A308FA422FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_90(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A308FCB27FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "detectportal.firefox.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Pragma", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_90 = new DataSub();
	reqAction.addDataSub(subContainer_90);

		ISubRule sub_177 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[8], false, "Host_17", null, 0, false);
	subContainer_90.addSubInstruction(sub_177);
	


		
				
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
			"A1E8094A308FCB2AFD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_91(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A30901920FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "static.chartbeat.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_9 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_9);

	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[40], "=k\\)break\\}else\\{c=(.*?);", 1, 1, 0, 0, false, "k)break}else{c", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[41], "=a\\.ownerDocument\\.documentElement,e=(.*?),", 1, 1, 0, 0, false, "a.ownerDocument.documentElement,e", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[42], ";b\\.V=(.*?);", 1, 1, 0, 0, false, "b.V", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[43], ";b\\.W=(.*?);", 1, 1, 0, 0, false, "b.W", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[44], ";b\\.I=(.*?);", 1, 1, 0, 0, false, "b.I", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[45], "\\?b\\.R=(.*?):", 1, 1, 0, 0, false, "b.R", null, 0, false);
	IDataSub subContainer_91 = new DataSub();
	reqAction.addDataSub(subContainer_91);

		ISubRule sub_178 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_15", null, 0, false);
	subContainer_91.addSubInstruction(sub_178);
		ISubRule sub_179 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[10], false, "Host_16", null, 0, false);
	subContainer_91.addSubInstruction(sub_179);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A30901923FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_92(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A3090407BFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "tracker.bt.uol.com.br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "__gads=ID=24d070a6150dcf8e:T=1501612272:S=ALNI_MYf74FuCKRki3VA0G6dcXoEBEBskg;_ga=GA1.3.2068662744.1501612270;BTCTL=df;BTTRK=df13c0be965346baa247145e4a77ebca|154147010817;DNA=df13c0be965346baa247145e4a77ebca|null|true;nav23947=7bc9d9b54d05d3182079c24b809|2_13;_gid=GA1.3.957352252.1517707454;_gat_uolMain=1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_92 = new DataSub();
	reqAction.addDataSub(subContainer_92);

		ISubRule sub_180 = new SubRule("req_uri", 16, 10, true, (IDCCoreVar)dcVars[36], false, "source", null, 0, false);
	subContainer_92.addSubInstruction(sub_180);
		ISubRule sub_181 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_14", null, 0, false);
	subContainer_92.addSubInstruction(sub_181);
		ISubRule sub_182 = new SubRule("req_hdr_Host_1", 0, 21, false, (IDCCoreVar)vars[9], false, "Host_15", null, 0, false);
	subContainer_92.addSubInstruction(sub_182);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A308C6FADFD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A3090407EFD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript;charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_93(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A30908E5AFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "d.tailtarget.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_10 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_10);

	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[46], " x=(.*?);", 1, 1, 0, 0, false, "x_2", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[47], " em=(.*?);", 1, 1, 0, 0, false, "em", null, 0, false);
	IDataSub subContainer_93 = new DataSub();
	reqAction.addDataSub(subContainer_93);

		ISubRule sub_183 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_13", null, 0, false);
	subContainer_93.addSubInstruction(sub_183);
		ISubRule sub_184 = new SubRule("req_hdr_Host_1", 0, 16, false, (IDCCoreVar)vars[6], false, "Host_14", null, 0, false);
	subContainer_93.addSubInstruction(sub_184);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A30908E5DFD8EE33930653439",
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

	public HTTPAction request_94(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A3090B59FFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "detectportal.firefox.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Pragma", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_94 = new DataSub();
	reqAction.addDataSub(subContainer_94);

		ISubRule sub_185 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[8], false, "Host_13", null, 0, false);
	subContainer_94.addSubInstruction(sub_185);
	


		
				
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
			"A1E8094A3090B5A2FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
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

	public HTTPAction request_95(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A3090DCD3FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "ping.chartbeat.net", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_95 = new DataSub();
	reqAction.addDataSub(subContainer_95);

		ISubRule sub_186 = new SubRule("req_uri", 205, 2, true, (IDCCoreVar)dcVars[42], false, "V", null, 0, false);
	subContainer_95.addSubInstruction(sub_186);
		ISubRule sub_187 = new SubRule("req_uri", 163, 0, true, (IDCCoreVar)dcVars[35], false, "r", null, 0, false);
	subContainer_95.addSubInstruction(sub_187);
		ISubRule sub_188 = new SubRule("req_uri", 159, 1, true, (IDCCoreVar)dcVars[41], false, "e", null, 0, false);
	subContainer_95.addSubInstruction(sub_188);
		ISubRule sub_189 = new SubRule("req_uri", 151, 1, true, (IDCCoreVar)dcVars[44], false, "I", null, 0, false);
	subContainer_95.addSubInstruction(sub_189);
		ISubRule sub_190 = new SubRule("req_uri", 147, 1, true, (IDCCoreVar)dcVars[43], false, "W", null, 0, false);
	subContainer_95.addSubInstruction(sub_190);
		ISubRule sub_191 = new SubRule("req_uri", 143, 1, true, (IDCCoreVar)dcVars[45], false, "R", null, 0, false);
	subContainer_95.addSubInstruction(sub_191);
		ISubRule sub_192 = new SubRule("req_uri", 114, 1, true, (IDCCoreVar)dcVars[47], false, "m", null, 0, false);
	subContainer_95.addSubInstruction(sub_192);
		ISubRule sub_193 = new SubRule("req_uri", 110, 1, true, (IDCCoreVar)dcVars[46], false, "x", null, 0, false);
	subContainer_95.addSubInstruction(sub_193);
		ISubRule sub_194 = new SubRule("req_uri", 106, 1, true, (IDCCoreVar)dcVars[40], false, "c", null, 0, false);
	subContainer_95.addSubInstruction(sub_194);
		ISubRule sub_195 = new SubRule("req_uri", 94, 1, true, (IDCCoreVar)dcVars[37], false, "n", null, 0, false);
	subContainer_95.addSubInstruction(sub_195);
		ISubRule sub_196 = new SubRule("req_uri", 23, 3, true, (IDCCoreVar)dcVars[34], false, "p", null, 0, false);
	subContainer_95.addSubInstruction(sub_196);
		ISubRule sub_197 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_12", null, 0, false);
	subContainer_95.addSubInstruction(sub_197);
		ISubRule sub_198 = new SubRule("req_hdr_Host_1", 0, 18, false, (IDCCoreVar)vars[7], false, "Host_12", null, 0, false);
	subContainer_95.addSubInstruction(sub_198);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30893B5BFD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A308E446BFD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30908E5AFD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30901920FD8EE33930653439"), 3);		
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
			"A1E8094A3090DCD6FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_96(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A309103C4FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "d.tailtarget.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_11 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_11);

	harvestContainer_11.addHarvestInstruction ("resp_content", dcVars[48], "/cm\\.g\\.doubleclick\\.net(.*?)\"", 1, 1, 0, 0, false, "cm.g.doubleclick.net", null, 0, false);
	IDataSub subContainer_96 = new DataSub();
	reqAction.addDataSub(subContainer_96);

		ISubRule sub_199 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_11", null, 0, false);
	subContainer_96.addSubInstruction(sub_199);
		ISubRule sub_200 = new SubRule("req_hdr_Host_1", 0, 16, false, (IDCCoreVar)vars[6], false, "Host_11", null, 0, false);
	subContainer_96.addSubInstruction(sub_200);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);		
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
			"A1E8094A309103C7FD8EE33930653439",
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

	public HTTPAction request_97(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A309151E9FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "cm.g.doubleclick.net", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "IDE=AHWqTUme7Yva9DH57Hgwzqbr6yQAl2aHDUW_sBZmzMDVndnpPAXyVo-yf0N9fIzK;DSID=ADyxuktV2pPsmoQlnNBY4EqY1VoOFT9KZ572FkqvYBZb4GIBKtHSeeRSlPzEBHFxp4iISr6IQNwt_BvbC0FO3wcs1NcN7NzgbUew2McpWF9IVELqPuPh6kM", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_12 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_12);

	harvestContainer_12.addHarvestInstruction ("resp_hdr_Location_1", dcVars[49], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location_2", null, 0, false);
	IDataSub subContainer_97 = new DataSub();
	reqAction.addDataSub(subContainer_97);

		ISubRule sub_201 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_10", null, 0, false);
	subContainer_97.addSubInstruction(sub_201);
		ISubRule sub_202 = new SubRule("req_uri", 0, 63, false, (IDCCoreVar)dcVars[48], false, "Folha de S.Paulo: No_url_2", null, 0, false);
	subContainer_97.addSubInstruction(sub_202);
		ISubRule sub_203 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[5], false, "Host_10", null, 0, false);
	subContainer_97.addSubInstruction(sub_203);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A309103C4FD8EE33930653439"), 3);		
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
			"A1E8094A309151ECFD8EE33930653439",
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

	public HTTPAction request_98(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A3091790FFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "tt-10162-1.seg.t.tailtarget.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "u=CgAKc1mAyPRybw3LR5MVAg9=", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_98 = new DataSub();
	reqAction.addDataSub(subContainer_98);

		ISubRule sub_204 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_9", null, 0, false);
	subContainer_98.addSubInstruction(sub_204);
		ISubRule sub_205 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[2], false, "Host_9", null, 0, false);
	subContainer_98.addSubInstruction(sub_205);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A308EE0C5FD8EE33930653439"), 3);		
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
			"A1E8094A30917912FD8EE33930653439",
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

	public HTTPAction request_99(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A3091C6D0FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "b.t.tailtarget.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "u=CgAKc1mAyPRybw3LR5MVAg9=", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_99 = new DataSub();
	reqAction.addDataSub(subContainer_99);

		ISubRule sub_206 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_8", null, 0, false);
	subContainer_99.addSubInstruction(sub_206);
		ISubRule sub_207 = new SubRule("req_hdr_Host_1", 0, 18, false, (IDCCoreVar)vars[3], false, "Host_8", null, 0, false);
	subContainer_99.addSubInstruction(sub_207);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A308EE0C5FD8EE33930653439"), 3);		
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
			"A1E8094A3091C6D3FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_100(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A3091C740FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "b.t.tailtarget.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "u=CgAKc1mAyPRybw3LR5MVAg9=", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_100 = new DataSub();
	reqAction.addDataSub(subContainer_100);

		ISubRule sub_208 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_7", null, 0, false);
	subContainer_100.addSubInstruction(sub_208);
		ISubRule sub_209 = new SubRule("req_hdr_Host_1", 0, 18, false, (IDCCoreVar)vars[3], false, "Host_7", null, 0, false);
	subContainer_100.addSubInstruction(sub_209);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A308EE0C5FD8EE33930653439"), 3);		
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
			"A1E8094A3091EDE0FD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_101(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A309214F8FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "cm.t.tailtarget.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "u=CgAKc1mAyPRybw3LR5MVAg9=", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_101 = new DataSub();
	reqAction.addDataSub(subContainer_101);

		ISubRule sub_210 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_6", null, 0, false);
	subContainer_101.addSubInstruction(sub_210);
		ISubRule sub_211 = new SubRule("req_uri", 0, 88, false, (IDCCoreVar)dcVars[49], false, "Folha de S.Paulo: No_url", null, 0, false);
	subContainer_101.addSubInstruction(sub_211);
		ISubRule sub_212 = new SubRule("req_hdr_Host_1", 0, 19, false, (IDCCoreVar)vars[4], false, "Host_6", null, 0, false);
	subContainer_101.addSubInstruction(sub_212);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A309151E9FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A309151E9FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A308EE0C5FD8EE33930653439"), 3);		
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
			"A1E8094A309214FBFD8EE33930653439",
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

	public HTTPAction request_102(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A30926310FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "b.t.tailtarget.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "u=CgAKc1mAyPRybw3LR5MVAg9=", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_102 = new DataSub();
	reqAction.addDataSub(subContainer_102);

		ISubRule sub_213 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_5", null, 0, false);
	subContainer_102.addSubInstruction(sub_213);
		ISubRule sub_214 = new SubRule("req_hdr_Host_1", 0, 18, false, (IDCCoreVar)vars[3], false, "Host_5", null, 0, false);
	subContainer_102.addSubInstruction(sub_214);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A308EE0C5FD8EE33930653439"), 3);		
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
			"A1E8094A30926313FD8EE33930653439",
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

	public HTTPAction request_103(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A30928A5FFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "b.t.tailtarget.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "u=CgAKc1mAyPRybw3LR5MVAg9=", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_103 = new DataSub();
	reqAction.addDataSub(subContainer_103);

		ISubRule sub_215 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_4", null, 0, false);
	subContainer_103.addSubInstruction(sub_215);
		ISubRule sub_216 = new SubRule("req_hdr_Host_1", 0, 18, false, (IDCCoreVar)vars[3], false, "Host_4", null, 0, false);
	subContainer_103.addSubInstruction(sub_216);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A308EE0C5FD8EE33930653439"), 3);		
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
			"A1E8094A30928A62FD8EE33930653439",
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

	public HTTPAction request_104(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A3092D840FD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "tt-10162-1.seg.t.tailtarget.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "u=CgAKc1mAyPRybw3LR5MVAg9=", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_104 = new DataSub();
	reqAction.addDataSub(subContainer_104);

		ISubRule sub_217 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_3", null, 0, false);
	subContainer_104.addSubInstruction(sub_217);
		ISubRule sub_218 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[2], false, "Host_3", null, 0, false);
	subContainer_104.addSubInstruction(sub_218);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30928A5FFD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30926310FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A3091790FFD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A308EE0C5FD8EE33930653439"), 3);		
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
			"A1E8094A3092D843FD8EE33930653439",
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

	public HTTPAction request_105(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A3092FF5AFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "tt-12340-4.seg.t.tailtarget.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "u=CgAKc1mAyPRybw3LR5MVAg9=", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_105 = new DataSub();
	reqAction.addDataSub(subContainer_105);

		ISubRule sub_219 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer_2", null, 0, false);
	subContainer_105.addSubInstruction(sub_219);
		ISubRule sub_220 = new SubRule("req_hdr_Host_1", 0, 31, false, (IDCCoreVar)vars[1], false, "Host_2", null, 0, false);
	subContainer_105.addSubInstruction(sub_220);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30928A5FFD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A308EE0C5FD8EE33930653439"), 3);		
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
			"A1E8094A3092FF5DFD8EE33930653439",
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

	public HTTPAction request_106(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E8094A3093266CFD8EE33930653439", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "t.tailtarget.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:58.0) Gecko/20100101 Firefox/58.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "http://www.folha.uol.com.br/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "u=CgAKc1mAyPRybw3LR5MVAg9=", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_106 = new DataSub();
	reqAction.addDataSub(subContainer_106);

		ISubRule sub_221 = new SubRule("req_hdr_Referer_1", 0, 28, false, (IDCCoreVar)dcVars[1], false, "Referer", null, 0, false);
	subContainer_106.addSubInstruction(sub_221);
		ISubRule sub_222 = new SubRule("req_hdr_Host_1", 0, 16, false, (IDCCoreVar)vars[0], false, "Host", null, 0, false);
	subContainer_106.addSubInstruction(sub_222);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30928A5FFD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A30182A06FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A309214F8FD8EE33930653439"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E8094A308EE0C5FD8EE33930653439"), 3);		
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
			"A1E8094A3093266FFD8EE33930653439",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
}
