package BD;

import Batalha.Oponente;
import Cartas.Carta;
import Cartas.CartaDeColecao;
import Colecao.Colecao;
import Colecao.Usuario;

public class DAOController {

	private static DAOController daoController;
	private DAOFactory daoFactory;
	
	private DAOController(){
		daoFactory = DAOFactory.getInstance();
	}
	
	public static DAOController getInstance(){
		if(daoController == null) daoController = new DAOController();
		return daoController;
	}
	
	public Carta getCarta(int id){
		CartaDAO cartaDAO = daoFactory.getCartaDAO();
		CartaDeColecao carta = (CartaDeColecao) cartaDAO.load(id);
		return carta;
	}
	
	public Colecao getColecao(int id){
		ColecaoDAO colecaoDAO = daoFactory.getColecaoDAO();
		Colecao colecao = (Colecao) colecaoDAO.loadColecao(id);
		return colecao;
	}
	
	public Oponente getOponente(int id){
		OponenteDAO oponenteDAO = daoFactory.getOponenteDAO();
		Oponente oponente = (Oponente) oponenteDAO.load(id);
		return oponente;
	}
	
	public Usuario getUsuario(int id){
		UsuarioDAO usuarioDAO = daoFactory.getUsuarioDAO();
		Usuario usuario = (Usuario) usuarioDAO.load(id);
		return usuario;
	}
}
