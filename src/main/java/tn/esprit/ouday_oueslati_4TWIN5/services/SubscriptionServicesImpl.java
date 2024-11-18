package tn.esprit.ouday_oueslati_4TWIN5.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.ouday_oueslati_4TWIN5.entities.Subscription;
import tn.esprit.ouday_oueslati_4TWIN5.entities.TypeSubscription;
import tn.esprit.ouday_oueslati_4TWIN5.repositries.ISubscriptionRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
@Service
public class SubscriptionServicesImpl implements ISubscriptionServices{
    private final ISubscriptionRepository subscriptionRepository;

    public Subscription addSubscription(Subscription subscription){
        return subscriptionRepository.save(subscription);
    }

    @Override
    public Subscription updateSubscription(Subscription subscription) {
        return subscriptionRepository.save(subscription);
    }

    @Override
    public Subscription retrieveSubscription(Long numSub) {
        return subscriptionRepository.findById(numSub).orElse(null);
    }

    @Override
    public List<Subscription> retrieveAll() {
        return (List<Subscription>) subscriptionRepository.findAll();
    }

    @Override
    public void removeSubscription(Long numSub) {
        subscriptionRepository.deleteById(numSub);
    }
    @Override
    public Set<Subscription> getSubscriptionByType(TypeSubscription type) {
        return subscriptionRepository.findByTypeSub(type);
    }
}
