package com.cyrin.repository.blackkit;

import com.cyrin.http.RestService;
import com.cyrin.model.BlackListIP;
import com.cyrin.model.DomainBreach;
import com.cyrin.model.DomainPhishing;
import com.cyrin.model.EmailBreach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BlackKitRepository {

    @Autowired
    private RestService restService;

    public <T> T emailBreach(EmailBreach emailBreach, Class<T> response) {
        return restService.post("https://services.blackkitetech.com/api/v1/breach/email", emailBreach, response);
    }

    public <T> T domainBreach(DomainBreach domainBreach, Class<T> response) {
        return restService.post("https://services.blackkitetech.com/api/v1/breach/domain", domainBreach, response);
    }

    public <T> T blacklistIP(BlackListIP blackListIP, Class<T> response) {
        return restService.post("https://services.blackkitetech.com/api/v1/blacklist/searchip", blackListIP, response);
    }

    public <T> T domainPhishing(DomainPhishing domainPhishing, Class<T> response) {
        return restService.post("https://services.blackkitetech.com/api/v1/phishing/domain", domainPhishing, response);
    }
}
