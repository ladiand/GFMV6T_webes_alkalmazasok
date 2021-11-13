package controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import service.PeopleService;

@RestController
public class PeopleController {
	
	private final PeopleService peopleService;
	public PeopleController(PeopleService peopleService) {
		this.peopleService = peopleService;
	}


	@PostMapping(path = "/people", consumes = "application/json")
	public void savePeople(@Valid @RequestBody PeopleDto peopleDto) {
		this.peopleService.savePeople(
				peopleDto.toPeople()
						);
	}
	
}
