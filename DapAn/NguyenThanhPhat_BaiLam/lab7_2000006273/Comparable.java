package Chapter7;

public interface Comparable<T> {
	// Tham số: o - đối tượng được so sánh
	// Kết quả trả về: 0 - bằng nhau, -1 - nhỏ hơn, 1 - lớn hơn
	public abstract int compareTo(T o);	
}
