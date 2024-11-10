package tn.esprit.ouday_oueslati_4TWIN5.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.ouday_oueslati_4TWIN5.entities.Skier;
import tn.esprit.ouday_oueslati_4TWIN5.entities.Subscription;
import tn.esprit.ouday_oueslati_4TWIN5.services.ISubscriptionServices;
import org.springframework.web.bind.annotation.*;
@Tag(name = "Gestion Subscription")
@RequiredArgsConstructor
@RequestMapping("subscription")
@RestController
public class SubscriptionRestController {

    private final ISubscriptionServices subscriptionServices;
    @Operation(description = "sauvgarder Subscription")
    @PostMapping("/add")
    public Subscription saveSubscription(Subscription subscription){
        return subscriptionServices.addSubscription(subscription);
    }
    @Operation(description = "mise a jour Subscription")
    @PutMapping("/update")
    public Subscription updateSubscription(@RequestBody Subscription subscription){
        return subscriptionServices.updateSubscription(subscription);
    }
    @Operation(description = "récupérer Subscription avec numSub")
    @GetMapping("/get/{numSub}")
    public Subscription getSubscription(@PathVariable Long numSub){

        return subscriptionServices.retrieveSubscription(numSub);
    }
}
