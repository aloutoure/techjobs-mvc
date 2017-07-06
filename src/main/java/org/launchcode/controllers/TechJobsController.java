package org.launchcode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;

/**
 * Created by Alou on 7/3/2017.
 */

public class TechJobsController {
    static HashMap<String, String> actionChoices = new HashMap<>();

    public TechJobsController() {
        actionChoices.put("search", "Search");
        actionChoices.put("list", "List");
    }

    @ModelAttribute("actions")
    static HashMap getActionChoices() {
        return actionChoices;
    }
}
