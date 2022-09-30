package DiamonShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import DiamonShop.Entity.Categori;
import DiamonShop.Entity.MapperCategoris;

@Repository
public class CategoriDao {
	@Autowired
	public JdbcTemplate _jdbcTemplate;//đặt đấu gạch để thể hiện biến chung
	
	public List<Categori> GetDataCategoris(){
		List<Categori> list = new ArrayList<Categori>();
		String sql ="SELECT * FROM categorys";
		list = _jdbcTemplate.query(sql, new MapperCategoris());
		return list;
		
	}
	
	
}
