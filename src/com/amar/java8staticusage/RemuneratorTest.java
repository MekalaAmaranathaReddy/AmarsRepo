package com.amar.java8staticusage;

public class RemuneratorTest implements Remunerator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Double pension = Remunerator .deductForPension(150000);
		System.out.println(pension);
		RemuneratorTest remnTest = new RemuneratorTest();
		System.out.println(remnTest .deductHealthInsurancePremium(200000));
	}

	@Override
	public double deductFoodFee() {
		// TODO Auto-generated method stub
		return 0;
	}

}
