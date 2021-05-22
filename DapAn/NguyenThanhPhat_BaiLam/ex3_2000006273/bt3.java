class Point{
	private float x;
	private float y;
	double TinhKhoangCach(Point a) {
		return Math.sqrt(((a.x-this.x)*(a.x-this.x))+((a.y-this.y)*(a.y-this.y)));
	}
}
