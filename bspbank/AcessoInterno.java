package bspbank;

public interface AcessoInterno {
	
	//classe que só possui assinatura de métodos
	
	/**
	 * @param String usuario => pode-se informar um usuário válido
	 * @param String senha => pode-se informar uma senha com até 255 caracteres alfanuméricos
	 * @return retorna verdadeiro quando a senha estiver correta
	 **/
	public boolean autenticarSistema(String usuario, String senha);
	public boolean mudarSenha(String senhaAntiga, String senhaNova);
	public boolean mudarUsuario(String usuarioAntigo, String usuarioNovo);
	
}
