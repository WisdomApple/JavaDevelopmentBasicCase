package unit04��Զ���_��;

import unit04��Զ���_��.otherClass.MainBoard;
import unit04��Զ���_��.otherClass.NetWorkCard;
import unit04��Զ���_��.otherClass.SoudCard;

public class Assembler {

	public static void main(String[] args) {
		MainBoard mb = new MainBoard();
		NetWorkCard nc = new NetWorkCard();
		mb.usePCICard(nc);
		SoudCard sc = new SoudCard();
		mb.usePCICard(sc);
	}
}