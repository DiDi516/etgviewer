package com.winlu.etgviewer.controller;

import com.phy.manifest.webservices.InputManifestIPortTypeProxy;
import com.winlu.etgviewer.config.ConfigBean;
import com.winlu.etgviewer.config.SzediConfigBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestContorller {

    private static Logger LOGGER = LoggerFactory.getLogger(TestContorller.class);


    @Autowired
    private ConfigBean configBean;

    @Autowired
    private SzediConfigBean szediConfigBean;


    @RequestMapping("/")
    public ModelAndView index(){
        ModelAndView mv=new ModelAndView("index");//模板文件的名称，不需要指定后缀
        mv.addObject("key","hello freemaker");
        return mv;
    }

    @RequestMapping("/test.html")
    public String test(Model model) throws Exception{
        InputManifestIPortTypeProxy inputManifestIPortTypeProxy = new InputManifestIPortTypeProxy();
        //imo voyage billNo
        String imo = "UN9241308";
        String voyage = "1019137E";
        String billNo = "E1801129983";
        String result = inputManifestIPortTypeProxy.queryMfStatus(szediConfigBean.getType(), szediConfigBean.getLoginName(), szediConfigBean.getPassWord(), imo, voyage, billNo);
        System.out.println("==============>"+result);
        LOGGER.info("访问TEST");
        model.addAttribute("key",szediConfigBean.getLoginName());
        return "index";
    }

}
