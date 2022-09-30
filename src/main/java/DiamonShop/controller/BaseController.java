package DiamonShop.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Service.HomeIlmService;

@Controller
public class BaseController {
	@Autowired
	HomeIlmService _homeService;

	public ModelAndView _myShare = new ModelAndView();
	
	@PostConstruct	
	public ModelAndView Init() {
		//_myShare.addObject("menu",_homeService.GetDataMenu());
		return _myShare;
	}
}
