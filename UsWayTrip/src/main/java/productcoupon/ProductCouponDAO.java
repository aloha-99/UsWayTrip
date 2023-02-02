package productcoupon;

import org.apache.ibatis.session.SqlSession;

public class ProductCouponDAO {
	private SqlSession sqlSession;
	
	public ProductCouponDAO(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public int pcInsert(ProductCouponVO pcvo) {
		return sqlSession.insert("pc.pcInsert",pcvo);
	}
	
	
}
