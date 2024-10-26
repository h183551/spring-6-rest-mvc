package guru.springframework.spring6restmvc.controller;

import guru.springframework.spring6restmvc.model.Beer;
import guru.springframework.spring6restmvc.services.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import java.util.UUID;

/**
 * Class BeerController
 * <p>
 * Description: [Add class description here]
 * <p>
 * Created by hasan on 10/26/2024.
 */
@Slf4j
@AllArgsConstructor
@Controller
public class BeerController {
    private final BeerService beerService;

    public Beer getBeerById(UUID id){

        log.debug("Get Beer by Id - in controller");
        return beerService.getBeerById(id);
    }

}
