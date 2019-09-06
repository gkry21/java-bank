package com.lotto.web.domains;

import java.io.Serializable;

public class LottoBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
			private String lottoSeq, ball, lotteryNum;  //시퀀스는 4자리 랜덤수, NO. 1~4/ 슬러쉬로 끊기, 볼은 1~45의 랜덤수,중복수 체크 6개 숫자입력0,0,0,0,0 

			public String getLottoSeq() {
				return lottoSeq;
			}

			public void setLottoSeq(String lottoSeq) {
				this.lottoSeq = lottoSeq;
			}

			public String getBall() {
				return ball;
			}

			public void setBall(String ball) {
				this.ball = ball;
			}

			public String getLotteryNum() {
				return lotteryNum;
			}

			public void setLotteryNum(String lotteryNum) {
				this.lotteryNum = lotteryNum;
			}

			@Override
			public String toString() {
				return "LottoBean [로또번호=" + lottoSeq 
												+ ", 공번호=" + ball 
												+ ", 당첨번호=" + lotteryNum + "]";
			}
			
}
