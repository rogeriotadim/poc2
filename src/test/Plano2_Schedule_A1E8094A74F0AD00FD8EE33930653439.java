/**@generated
 * WARNING  Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
package test;

import com.ibm.rational.test.lt.execution.http.tes.*;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.IKThinkControl;
import com.ibm.rational.test.lt.kernel.action.impl.Container;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.action.impl.UserGroup;
import com.ibm.rational.test.lt.kernel.data.FeatureOptionsDataAreaCreation;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;
import java.util.HashMap;

@SuppressWarnings("all")
public class Plano2_Schedule_A1E8094A74F0AD00FD8EE33930653439
		extends com.ibm.rational.test.lt.kernel.action.impl.Schedule {

	public Plano2_Schedule_A1E8094A74F0AD00FD8EE33930653439(IContainer parent, String name) {
		super(parent, name, "A1E8094A74F0AD00FD8EE33930653439");
		setThinkMax(10000);
		setThinkScheme(IKThinkControl.RECORDED);

	}

	public void execute() {

		this.addEventBehavior(new RPTEventStructure(new HTTPPageTitleVPEvent(), null, 1,
				"Falha de verifica\u00E7\u00E3o do t\u00EDtulo da p\u00E1gina"));
		this.addEventBehavior(new RPTEventStructure(new HTTPResponseCodeVPEvent(), null, 1,
				"Falha de verifica\u00E7\u00E3o do c\u00F3digo de resposta"));
		this.addEventBehavior(new RPTEventStructure(new HTTPResponseSizeVPEvent(), null, 1,
				"Falha de verifica\u00E7\u00E3o do tamanho da resposta"));
		this.addEventBehavior(new RPTEventStructure(new RPTFailVPEvent(), null, 1,
				"Falha do Ponto de Verifica\u00E7\u00E3o de Conte\u00FAdo"));
		this.addEventBehavior(new RPTEventStructure(new RPTConnectEvent(), null, 1, "Conex\u00E3o com falha"));
		this.addEventBehavior(
				new RPTEventStructure(new RPTAuthenticationEvent(), null, 1, "Autentica\u00E7\u00E3o com falha"));
		this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(),
				new RPTStopUserEvent("Fim do datapool atingido"), 1, "Fim do datapool atingido"));
		this.addEventBehavior(
				new RPTEventStructure(new RPTReferenceEvent(), null, 1, "Falha ao extrair refer\u00EAncia"));
		this.addEventBehavior(
				new RPTEventStructure(new RPTSubstitutionEvent(), null, 1, "Falha na substitui\u00E7\u00E3o"));
		this.addEventBehavior(new RPTEventStructure(new RPTServerTimeoutEvent(), null, 1, "Tempo Limite"));
		this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeVPFailureEvent(), null, 1,
				"Falha do Ponto de Verifica\u00E7\u00E3o Customizado"));
		this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(),
				new RPTStopUserEvent("O C\u00F3digo Customizado relatou uma exce\u00E7\u00E3o n\u00E3o manipulada"), 1,
				"O C\u00F3digo Customizado relatou uma exce\u00E7\u00E3o n\u00E3o manipulada"));

		this.addUserGroup(new UserGroup_1(this));

		setMaxHealthFailuresToLog(50, -1, 0);
		super.execute();
	}

	public class UserGroup_1 extends UserGroup {

		public UserGroup_1(IContainer parent) {
			super(parent, "Grupo de Usu\u00E1rios 1", "A1E8094A74F31E04FD8EE33930653439");

			setNumUsers(100.0);

		}

		public IContainer createTesterWorkload(IContainer parent) {
			return scenario_1(parent);
		}

		private Container scenario_1(IContainer parent) {
			Container scenario = new Container(parent, "Cen\u00E1rio Padr\u00E3o", "A1E8094A74F31E0FFD8EE33930653439") {

				public void reportStopMessage() {
				}

				public void reportForcedStopMessage() {
				}

				public void execute() {
					this.add(new test.Teste2_Test_A1E8094A2FEA8A50FD8EE33930653439(this,
							"A1E8094A7B901470FD8EE33930653439") {
						public void execute() {
							this.setRtbEnabled(false);
							super.execute();
						}
					});

					this.add(new com.ibm.rational.test.lt.execution.protocol.impl.HTTPUserComplete(this));
					super.execute();
				}
			};

			return scenario;
		}

	}

}