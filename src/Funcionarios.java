import java.rmi.Remote;
import java.rmi.RemoteException;


public interface Funcionarios extends Remote{
	public String Cadastrar (String a) throws RemoteException;
	public String Alterar (String b) throws RemoteException;
	public String Remover (String c) throws RemoteException;
}
