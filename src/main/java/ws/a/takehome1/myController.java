/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ws.a.takehome1;

import java.io.IOException;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author eunannana
 */
@Controller
public class myController {

    @RequestMapping("/nextpage")
    public String next(@RequestParam(value = "thename") String itsname,
            @RequestParam(value = "thelocation") String itslocation,
            @RequestParam(value = "thepicture") MultipartFile itspicture,
            Model courier) 
    throws IOException{
        // convert MultipartFile to String
        byte[] img = itspicture.getBytes();
        String theimg = Base64.encodeBase64String(img);
        String itsimg = "data:image/png;base64,".concat(theimg);
        
        courier.addAttribute("package1", itsname);
        courier.addAttribute("package2", itslocation);
        courier.addAttribute("package3", itsimg);
        
        return "viewpage";
    }

}
