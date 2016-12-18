package hu.kniznertamas.web.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hu.kniznertamas.web.request.RegistrationRequest;

@Controller
public class RegistrationController {

    private static final String REGISTRATION_URL = "/registration";
    private static final String REGISTRATION_PAGE = "registration";
    private static final String INDEX_PAGE = "index";

    @RequestMapping(value = REGISTRATION_URL, method = RequestMethod.GET)
    public String registrationGet(Model model) {
        model.addAttribute("RegistrationRequest", new RegistrationRequest());
        return REGISTRATION_PAGE;
    }

    @RequestMapping(value = REGISTRATION_URL, method = RequestMethod.POST)
    public String registration(@Valid RegistrationRequest request, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return INDEX_PAGE;
        }
        return REGISTRATION_PAGE;
    }

}
