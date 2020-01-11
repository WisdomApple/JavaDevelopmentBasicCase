package unit04面对对象_下;

import unit04面对对象_下.otherClass.MainBoard;
import unit04面对对象_下.otherClass.NetWorkCard;
import unit04面对对象_下.otherClass.SoudCard;

public class Assembler {

	public static void main(String[] args) {
		MainBoard mb = new MainBoard();
		NetWorkCard nc = new NetWorkCard();
		mb.usePCICard(nc);
		SoudCard sc = new SoudCard();
		mb.usePCICard(sc);
	}
}