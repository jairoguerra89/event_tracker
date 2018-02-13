package com.jaguergo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jaguergo.model.Attendee;

@Controller
public class AttendeeController {

	@RequestMapping(value = "/attendee", method = RequestMethod.GET)
	public String displayAttendeePage() {
		return "attendee";
	}

	@RequestMapping(value = "/attendee", method = RequestMethod.POST)
	public String processAtendee(@ModelAttribute("attendee") Attendee attendee) {
		return "attendee";
	}
}
