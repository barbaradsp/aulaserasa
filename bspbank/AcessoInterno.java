package bspbank;

public interface AcessoInterno {
	
	//classe que s� possui assinatura de m�todos, eles n�o possuem comportamentos
	
	/**
	 * @param String usuario => pode-se informar um usu�rio v�lido
	 * @param String senha => pode-se informar uma senha com at� 255 caracteres alfanum�ricos
	 * @return retorna verdadeiro quando a senha estiver correta
	 **/
	public boolean autenticarSistema(String usuario, String senha);
	public boolean mudarSenha(String senhaAntiga, String senhaNova);
	public boolean mudarUsuario(String usuarioAntigo, String usuarioNovo);
	
}
