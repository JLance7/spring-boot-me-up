package com.josh;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.josh.SoftwareEngineerService;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    private final SoftwareEngineerService softwareEngineerService;

    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService){
        this.softwareEngineerService = softwareEngineerService;
    }

//    @GetMapping
//    public List<SoftwareEngineer> getEngineers(){
//        return List.of(
//                new SoftwareEngineer(
//                        1,
//                        "James",
//                        "js, node, react, tailwindcss"
//                ),
//                new SoftwareEngineer(
//                        2,
//                        "Ronald",
//                        "java, spring boot"
//                )
//        );
//    }

    @GetMapping
    public List<SoftwareEngineer> getEngineers(){
        return softwareEngineerService.getAllSoftwareEngineers();
    }
}
