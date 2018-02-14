package com.jaguergo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jaguergo.model.Event;

@Controller
@RestController
public class EventController {

	@RequestMapping(value = "/event", method = RequestMethod.GET)
	public String displayEventPage(Model model) {
		Event event = new Event();
		event.setName("Java user group");
		model.addAttribute("event", event);
		return "event";
	}

	@RequestMapping(value = "/event", method = RequestMethod.POST)
	public String processEvent(@ModelAttribute("event") Event event) {
		return "redirect:index.html";
	}

	@RequestMapping(value = "/events")
	public List<Event> findAllEvents() {
		List<Event> events = new ArrayList<Event>();

		Event event1 = new Event();
		event1.setName("Java group");

		Event event2 = new Event();
		event2.setName("Angular group");

		events.add(event1);
		events.add(event2);
		
		return events;
	}
}
