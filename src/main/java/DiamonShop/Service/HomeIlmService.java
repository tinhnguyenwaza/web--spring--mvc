package DiamonShop.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.CategoriDao;

import DiamonShop.Dao.SlidesDao;
import DiamonShop.Entity.Categori;
import DiamonShop.Entity.Slides;

@Service
public class HomeIlmService implements IHomeService{
	@Autowired
	private  SlidesDao slidesDao;
	@Autowired
	private CategoriDao categoriDao;
	
	
	public List<Slides> GetDataSlides() {
		return slidesDao.GetDataSlides();
	}

	public List<Categori> GetDataCategori() {		
		return categoriDao.GetDataCategoris();
	}

}
