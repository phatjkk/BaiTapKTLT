package lab8;

import java.util.ArrayList;

public class bt3 {

}
class Contact{
	private String ten; // Tên
	private int tuoi; // Tuổi
	private String gioiTinh; // Giới tính: Nam / Nu
	
	public Contact(String ten, int tuoi, String gioiTinh) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
	}
	
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getTen() {
		return ten;
	}
	
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	
	public String getGioiTinh() {
		return gioiTinh;
	}
	
	public int getTuoi() {
		return tuoi;
	}
	
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

}

class AddressBook {
	private ArrayList<Contact> contact;
	
	public AddressBook() {
		contact = new ArrayList<Contact>();
	}
	public void add(Contact uAdd) {
		contact.add(uAdd);
	}
	public void delete(Contact uDelete) {
		contact.remove(uDelete);
	}
	public Contact search(Contact uSearch) {
		//Tra ve so thu tu trong arraylist
		if(contact.contains(uSearch)) {
			return uSearch;
		}
		else {
			return null;
		}
		
	}
	public ArrayList<Contact> getContact() {
		return contact;
	}
	
	public void setContact(ArrayList<Contact> contact) {
		this.contact = contact;
	}
	
	public int getSize() { // Lấy kích thước của danh sách
		return this.contact.size();
	}
}
