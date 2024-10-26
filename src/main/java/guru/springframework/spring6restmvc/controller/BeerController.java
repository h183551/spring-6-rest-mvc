package guru.springframework.spring6restmvc.controller;

import guru.springframework.spring6restmvc.services.BeerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

/**
 * Class BeerController
 * <p>
 * Description: [Add class description here]
 * <p>
 * Created by hasan on 10/26/2024.
 */
@AllArgsConstructor
@Controller
public class BeerController {
    private final BeerService beerService;

}
