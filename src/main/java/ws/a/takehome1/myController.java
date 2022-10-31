/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ws.a.takehome1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author eunannana
 */
@Controller
public class myController {

    @RequestMapping("/nextpage")
    public String next(@RequestParam(value = "thename") String itsname,
            @RequestParam(value = "thelocation") String itslocation,
            Model courier) {
        courier.addAttribute("package1", itsname);
        courier.addAttribute("package2", itslocation);
        return "viewpage";
    }

}
