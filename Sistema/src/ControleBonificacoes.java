/**
 * 
 */
package aulaInterface;

/**
 * @author frazeal
 *
 */
public class ControleBonificacoes {
	private double totalBonificacoes = 0;
	
	public void registrarFuncionario(Funcionario f) {
		System.out.println("Adicionando bonificação do funcionário: " + f);
		this.totalBonificacoes += f.getBonificacao();
	}
	
	public double getTotalBonificacoes() {
		return this.totalBonificacoes;
	}
}
