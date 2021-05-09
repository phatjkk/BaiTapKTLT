package Chapter7;

public interface Cloneable<T> {
	// Tham số: không có tham số truyền vào
	// Kết quả trả về: Một đối tượng T mới có nội dung giống nội dung của đối tượng được 
	// nhân bản nhưng khác tham chiếu
	public T clone();	
}
