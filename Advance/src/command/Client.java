package command;
/**
 * 在该类图中，我们看到三个角色：
	Receiver接受者角色：该角色就是干活的角色，命令传递到这里是应该被执行的
	Command命令角色：需要执行的所有命令都在这里声明
	Invoker调用者角色：接收到命令，并执行命令
 * @author dell
 *
 */
public class Client {
	 public static void main(String[] args){
	        Invoker invoker = new Invoker();
	        Receiver receiver = new ConcreteReciver1();
	       // Receiver receiver = new ConcreteReceiver1();
	        Command command = new ConcreteCommand1(receiver);
	        invoker.setCommand(command);
	        invoker.action();
	    }
}
