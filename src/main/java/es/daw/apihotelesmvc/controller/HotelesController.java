package es.daw.apihotelesmvc.controller;



import es.daw.apihotelesmvc.dto.HotelesDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HotelesController {

    @GetMapping("/hoteles")
    public String hoteles(Model model){

        List<HotelesDTO> hoteles = new ArrayList<>();
        model.addAttribute("hoteles", hoteles);


    }

}
