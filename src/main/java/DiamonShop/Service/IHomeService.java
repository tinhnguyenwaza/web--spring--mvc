package DiamonShop.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Entity.Categori;
import DiamonShop.Entity.Slides;
@Service
public interface IHomeService {
	@Autowired
	public List<Slides> GetDataSlides();
	
	public List<Categori> GetDataCategori();
}
