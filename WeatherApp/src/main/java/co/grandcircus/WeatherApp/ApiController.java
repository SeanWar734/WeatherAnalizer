package co.grandcircus.WeatherApp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ApiController {
	
	@Autowired
	private ApiService apiServ;
	
	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/location")
	public ModelAndView location(
			@RequestParam("latitude") Double latitude,
			@RequestParam("longitude") Double longitude) {

		ModelAndView mav = new ModelAndView("location");
		mav.addObject("area", apiServ.getArea(longitude, latitude));
		
		return mav;

	}

}
