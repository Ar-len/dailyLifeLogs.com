package com.dailylifelogs.web.controller;

import aopException.ModelView;
import com.dailylifelogs.web.model.Type;
import com.dailylifelogs.web.model.TypeExample;
import com.dailylifelogs.web.service.ExceptionService;
import com.dailylifelogs.web.service.type.TypeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/template")
public class TemplateController {

    @Resource
    TypeService typeService;

    @Resource
    ExceptionService exceptionService;

    @ModelView
    @GetMapping("/freemarker")
    public String index(Model model) {

        List<Type> types = typeService.selectByExample(new TypeExample());

        model.addAttribute("types", types);
        exceptionService.systemBizError();
        return "fremarkertemp";
    }
}