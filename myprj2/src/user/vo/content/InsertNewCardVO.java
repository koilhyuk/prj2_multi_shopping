package user.vo.content;

public class InsertNewCardVO {

	private String transCardNum, cardCom, transCvc;

	public InsertNewCardVO(String transCardNum, String cardCom, String transCvc) {
		super();
		this.transCardNum = transCardNum;
		this.cardCom = cardCom;
		this.transCvc = transCvc;
	}

	public String getTransCardNum() {
		return transCardNum;
	}

	public String getCardCom() {
		return cardCom;
	}

	public String getTransCvc() {
		return transCvc;
	}

}// class
