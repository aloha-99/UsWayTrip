package productcoupon;

public class ProductCouponVO {
	private int mc_no;
	private int product_no;
	
	public ProductCouponVO() {
		
	}
	
	public ProductCouponVO(int mc_no, int product_no) {
		this.mc_no = mc_no;
		this.product_no = product_no;
	}

	public int getMc_no() {
		return mc_no;
	}

	public void setMc_no(int mc_no) {
		this.mc_no = mc_no;
	}

	public int getProduct_no() {
		return product_no;
	}

	public void setProduct_no(int product_no) {
		this.product_no = product_no;
	}
	
	
}
