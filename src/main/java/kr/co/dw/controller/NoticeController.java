package kr.co.dw.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.dw.domain.NoticeDTO;
import kr.co.dw.service.notice.NoticeService;


@Controller
@RequestMapping("/notice")
public class NoticeController {
	
	@Inject
	private NoticeService nService;
	
	
	@RequestMapping(value = "/update", method=RequestMethod.POST)
	public String update(NoticeDTO nDto) {
		nService.update(nDto);
		
		return "redirect:/notice/read/"+nDto.getNno();
	}
	
	@RequestMapping(value="/update/{Nno}", method =RequestMethod.GET)
	public String updateUI(@PathVariable("Nno")int Nno, Model model) {
		NoticeDTO nDto = nService.updateUI(Nno);
		model.addAttribute("nDto",nDto);
		return "/notcie/update";
		
	}
	
	
	@RequestMapping(value = "/delete/{Nno}", method = RequestMethod.POST)
	public String delete(@PathVariable("Nno") int Nno) {
		
		nService.delete(Nno);
		return "redirect:/notice/list";
	}
	

	@RequestMapping(value = "/read/{Nno}", method = RequestMethod.GET)
	public String read(@PathVariable("Nno") int Nno, Model model) {
		NoticeDTO nDto = nService.read(Nno);
		model.addAttribute("nDto", nDto);

		return "/notice/read";
	}
	
	
	
	 @RequestMapping(value = "/insert", method = RequestMethod.POST) public String
	 insert(NoticeDTO nDto) {
	 
	 nService.insert(nDto);
	  
	 return "redirect:/notice/read/" + nDto.getNno(); 
	 }
	 
	
	
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert() {
		
		
		return "/notice/insert";
	}
	
	
	@RequestMapping( value = "/list", method = RequestMethod.GET)
	public String list(Model model) {
		List<NoticeDTO> list = nService.list();
		model.addAttribute("list", list);
		
		return "/notice/list";
	}
	

}
