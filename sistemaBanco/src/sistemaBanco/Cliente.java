package sistemaBanco;

public class Cliente {
	private String nome;
	private String cpf;
	private int senha;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autenticar(int senha) {
		if(this.senha==senha) {
			System.out.println("Autoriazado");
			return true;
		}else {
			System.out.println("Senha incorreta");
			return false;
		}
	}
	
}
