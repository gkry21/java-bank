package com.lotto.web.serviceimpl;

import java.util.Random;

import com.lotto.web.daoimpl.LottoDAOImpl;
import com.lotto.web.daos.LottoDao;
import com.lotto.web.domains.LottoBean;
import com.lotto.web.services.LottoService;

public class LottoServiceImpl implements LottoService{
private LottoDao dao;
		
		public LottoServiceImpl() {
				dao = new LottoDAOImpl();
		}
	@Override  //�������� 4�ڸ� ������, NO. 1~4/ �������� ����, ���� 1~45�� ������,�ߺ��� üũ 6�� �����Է�0,0,0,0,0 lottoSeq, ball, lotteryNum
	public void createLotto(LottoBean param) {
		param.setBall(createBall()+"");
		param.setLotteryNum(createLottoNum());
		param.setLottoSeq(createLottoSeq());
		dao.insertLotto(param);
		}

	@Override
	public String createLottoSeq() {
		String seq = "No.";
		Random ran = new Random();
		for(int i =0;i<4;i++) {
			seq += ran.nextInt(10) +"";
		}
		System.out.println("��������:" +seq);
		return seq;
	}

	@Override
	public int createBall() {
		Random ran = new Random();
		int ball =ran.nextInt(45)+1 ;
		return ball;
	}

	@Override
	public String createLottoNum() {
		String result = "";
		int[] arr = new int[6];
		int a =createBall() ;
		for(int i=0;i<arr.length;i++) {
			if(exist(arr, a)) {
				arr[i] = a;
				break;
			}else {i--;
			}
		}
		for(int i=0;i<arr.length;i++) {
			result += arr[i]+",";
		}
		return result;
	}
	
	@Override
	public boolean exist(int[] arr, int a) {
		boolean flag = false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==a) {
				flag = false;
				break;
			} else {flag = true; break;}
	}
		return flag; 
}
	@Override
	public int[] bubbleSort(int[] arr, boolean flag) { //������������, �������� ���� �ֺ��� ū�� ������ ���� ������, arr[i]�꺸�� ũ��arr[i]+1�̸� �������� �ֱ�
					//�Ҹ� �÷��� ���� �־���ߵ�..... �׷� ������ ? , 
		for(int i : arr) {
			if(arr[i]>arr[i+1]) {
				
			}
		}
		return arr;
	}

}
