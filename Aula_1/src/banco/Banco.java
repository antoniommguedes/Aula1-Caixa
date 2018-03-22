package banco;
import java.util.ArrayList;

public class Banco {

	private ArrayList<Cliente> filaDeClientes;

	public Banco() {
		filaDeClientes = new ArrayList<Cliente>();
	}

	public void addCliente(Cliente cliente) {
		filaDeClientes.add(cliente);
	}

	public void proximoDaFila(int nroCaixa) {
		if (nroCaixa > 0 && nroCaixa <= 5) {
			for (Cliente c : filaDeClientes) {
				if (c.getIdade() >= 65) {
					filaDeClientes.remove(c);
					return;
				}
			}
		}
			filaDeClientes.remove(0);
	}

	public void getPessoasNaFila() {
		for (Cliente c : filaDeClientes) {
			System.out.println(c.getNome() + ", " + c.getIdade());
		}
	}
	
}
