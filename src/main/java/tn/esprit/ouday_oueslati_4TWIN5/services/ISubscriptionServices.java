package tn.esprit.ouday_oueslati_4TWIN5.services;
import tn.esprit.ouday_oueslati_4TWIN5.entities.Subscription;

import java.util.List;

public interface ISubscriptionServices {

    Subscription addSubscription(Subscription subscription);
    Subscription updateSubscription(Subscription subscription);
    Subscription retrieveSubscription(Long numSub);
    List<Subscription> retrieveAll();
    void removeSubscription(Long numSub);
}
