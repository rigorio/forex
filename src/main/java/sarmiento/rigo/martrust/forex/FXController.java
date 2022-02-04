package sarmiento.rigo.martrust.forex;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/api/fx")
public class FXController {

    @GetMapping()
    public String smoketest() {
        return ServletUriComponentsBuilder.fromCurrentContextPath().build().toUriString();
    }
}
