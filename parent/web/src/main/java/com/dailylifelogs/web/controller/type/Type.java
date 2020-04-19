package com.dailylifelogs.web.controller.type;

import ajaxResponse.AjaxResponse;
import com.dailylifelogs.web.model.TypeExample;
import com.dailylifelogs.web.service.type.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/type/")
public class Type {
    @Autowired
    TypeService typeService;

    @GetMapping("types")
    @ResponseBody
    public AjaxResponse getTypes() {
        TypeExample typeExample = new TypeExample();
        typeExample.setDistinct(true);
        return AjaxResponse.success(typeService.selectByExample(typeExample));
    }
}
