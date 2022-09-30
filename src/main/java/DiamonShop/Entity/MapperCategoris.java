package DiamonShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperCategoris implements RowMapper<Categori>{

	public Categori mapRow(ResultSet rs, int rowNum) throws SQLException {
		Categori categori = new Categori();
		categori.setId(rs.getInt("id"));
		categori.setName(rs.getString("name"));
		categori.setDescription(rs.getString("description"));
		
		return categori;
	}

}
