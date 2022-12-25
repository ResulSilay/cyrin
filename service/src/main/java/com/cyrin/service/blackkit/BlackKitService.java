package com.cyrin.service.blackkit;

import com.cyrin.model.BlackListIP;
import com.cyrin.model.DomainBreach;
import com.cyrin.model.DomainPhishing;
import com.cyrin.model.EmailBreach;
import com.cyrin.repository.blackkit.BlackKitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlackKitService {

    @Autowired
    private BlackKitRepository blackKitRepository;

    public <T> T emailBreach(EmailBreach emailBreach, Class<T> response) {
        return blackKitRepository.emailBreach(emailBreach, response);
    }

    public <T> T domainBreach(DomainBreach domainBreach, Class<T> response) {
        return blackKitRepository.domainBreach(domainBreach, response);
    }

    public <T> T blacklistIP(BlackListIP blackListIP, Class<T> response) {
        return blackKitRepository.blacklistIP(blackListIP, response);
    }

    public <T> T domainPhishing(DomainPhishing domainPhishing, Class<T> response) {
        return blackKitRepository.domainPhishing(domainPhishing, response);
    }
}