package DiamonShop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Dao.SlidesDao;
import DiamonShop.Service.HomeIlmService;

@Controller
public class HomeController extends BaseController{
	
	@RequestMapping(value = {"/","/trang-chu"})
	public ModelAndView Index() {
		ModelAndView mv = new ModelAndView("user/index");
		mv.addObject("slides",_homeService.GetDataSlides());
		mv.addObject("categori",_homeService.GetDataCategori());
		return mv;
	}
	
	@RequestMapping(value = {"/product"})
	public ModelAndView product() {
		ModelAndView mv = new ModelAndView("user/product");
		
		return mv;
	}
}
