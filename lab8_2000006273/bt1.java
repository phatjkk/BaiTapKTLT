package lab8;

import java.util.Scanner;

public class bt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Nhap nhien do 365 ngay
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
class DailyTemperature1{
	private double temp[] = new double[366];
	private int soNgayTrongThang[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	void inputTemp(Scanner input){
		int demThuTu = 0;
		for(int i =0;i<12;i++){
			for(int j = 0; j<soNgayTrongThang[i];j++){
				System.out.println("Nhap nhiet do cho ngay "+(j+1)+"/"+(i+1));
				temp[demThuTu] = input.nextDouble();
				demThuTu++;
			}
		}
	}
	int getHottest(){
		double max = -1000;
		int dayMax = 0;
		for(int i=0;i<temp.length;i++){
			if(temp[i]>max){
				max = temp[i];
			}
			dayMax++;
		}
		return dayMax;
	}
	int getColdest(){
		double min = 1000;
		int dayMin = 0;
		for(int i=0;i<temp.length;i++){
			if(temp[i]<min){
				min = temp[i];
			}
			dayMin++;
		}
		return dayMin;
	}
	double getDifference(int a, int b) {
		if(temp[a]>temp[b]) {
			return temp[a]-temp[b];
		}
		else {
			return temp[b]-temp[a];
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
				int demThuTu = 0;
				for(int i =0;i<12;i++){
					for(int j = 0; j<soNgayTrongThang[i];j++){
						if (day == j && month ==i) {
							return temp[demThuTu];
						}
						demThuTu++;
					}
				}
				return -1000;
			}
		}
	}
}

