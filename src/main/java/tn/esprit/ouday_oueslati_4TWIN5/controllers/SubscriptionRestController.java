package tn.esprit.ouday_oueslati_4TWIN5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.ouday_oueslati_4TWIN5.entities.Skier;
import tn.esprit.ouday_oueslati_4TWIN5.entities.Subscription;
import tn.esprit.ouday_oueslati_4TWIN5.services.ISubscriptionServices;
import org.springframework.web.bind.annotation.*;
@RequiredArgsConstructor
@RequestMapping("subscription")
@RestController
public class SubscriptionRestController {

    private final ISubscriptionServices subscriptionServices;

    @PostMapping("/add")
    public Subscription saveSubscription(Subscription subscription){
        return subscriptionServices.addSubscription(subscription);
    }
    @PutMapping("/update")
    public Subscription updateSubscription(@RequestBody Subscription subscription){
        return subscriptionServices.updateSubscription(subscription);
    }
    @GetMapping("/get/{numSub}")
    public Subscription getSubscription(@PathVariable Long numSub){

        return subscriptionServices.retrieveSubscription(numSub);
    }
}
