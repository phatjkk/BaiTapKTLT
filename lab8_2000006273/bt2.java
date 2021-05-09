package lab8;

import java.util.ArrayList;
import java.util.Scanner;

public class bt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DailyTemperature1 A = new DailyTemperature1();
		Scanner sc = new Scanner(System.in);
		A.inputTemp(sc);
		//Ngay nong nhat
		System.out.println(A.getHottest());
		//Ngay lanh nhat
		System.out.println(A.getColdest());
		//Nhiet do chenh lech ngay nong nhat va ngay lanh nhat.
		System.out.println(A.getDifference(A.getHottest(),A.getColdest()));
		//Nhiet do cua mot ngay trong nam
		System.out.println(A.getTemperature(12, 12));
	}

}
class DailyTemperature2{
	ArrayList<Month> temp = new ArrayList<Month>(12);
	private int soNgayTrongThang[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	void inputTemp(Scanner input){
		for(int i =0;i<12;i++){
			for(int j = 0; j<soNgayTrongThang[i];j++){
				System.out.println("Nhap nhiet do cho ngay "+(j+1)+"/"+(i+1));
				temp.get(i).setDailyTemp(j,input.nextDouble());
			}
		}
	}
	int getHottest(){
		
		double max = -1000;
		int dayMax = 0;
		for(int i=0;i<12;i++){
			for(int j = 0; j<soNgayTrongThang[i];j++) {
				if(temp.get(i).getDailyTemp(j)>max){
					max = temp.get(i).getDailyTemp(j);
				}
			}
			dayMax++;
		}
		return dayMax;
	}
	int getColdest(){
		double min = 1000;
		int dayMin = 0;
		for(int i=0;i<12;i++){
			for(int j = 0; j<soNgayTrongThang[i];j++) {
				if(temp.get(i).getDailyTemp(j)<min){
					min = temp.get(i).getDailyTemp(j);
				}
			}
			dayMin++;
		}
		return dayMin;
	}
	double getDifference(int a, int b) {
		double tempA = 0;
		double tempB = 0;
		int dayCount = 0;
		for(int i=0;i<12;i++){
			for(int j = 0; j<soNgayTrongThang[i];j++) {
				if(dayCount==a) {
					tempA = getTemperature(i,j);
				}
				else if(dayCount==b){
					tempB = getTemperature(i,j);
				}
				dayCount++;
			}
		}
		if(tempA>tempB) {
			return tempA-tempB;
		}
		else {
			return tempB-tempA;
		} 
	}
	double getTemperature(int month,int day) {
		if(month>12 && month <1) {
			return -1000;
		}
		else {
			if(day > soNgayTrongThang[month]&&day<1) {
				return -1000;
			}
			else {
				return temp.get(month).getDailyTemp(day);
			}
		}
	}
}
class Month {
	private int value;
	private double[] dailyTemp;
	private int soNgayTrongThang[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	
	Month(int value) {
		this.value = value;
		dailyTemp= new double[soNgayTrongThang[value - 1]];
	}
	void setDailyTemp(int day, double temp) {
		dailyTemp[day-1] = temp;
	}
	double getDailyTemp(int day) {
		return dailyTemp[day-1];
	}
}