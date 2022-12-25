package com.cyrin.controller;

import com.cyrin.model.BlackListIP;
import com.cyrin.model.DomainBreach;
import com.cyrin.model.DomainPhishing;
import com.cyrin.model.EmailBreach;
import com.cyrin.payload.request.DomainBreachRequest;
import com.cyrin.payload.request.DomainPhishingRequest;
import com.cyrin.payload.request.EmailBreachRequest;
import com.cyrin.payload.request.BlackListIPRequest;
import com.cyrin.payload.response.BlackListIPResponse;
import com.cyrin.payload.response.DomainBreachResponse;
import com.cyrin.payload.response.EmailBreachResponse;
import com.cyrin.service.blackkit.BlackKitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/v1/black/kit")
public class BlackKitController {

    @Autowired
    private BlackKitService blackKitService;

    @PostMapping("/breach/email")
    ResponseEntity<EmailBreachResponse> breachEmail(
            @Valid
            @RequestBody EmailBreachRequest emailBreachRequest
    ) {
        return ResponseEntity.ok(
                blackKitService.emailBreach(
                        new EmailBreach(emailBreachRequest.getEmail()),
                        EmailBreachResponse.class
                )
        );
    }

    @PostMapping("/breach/domain")
    ResponseEntity<DomainBreachResponse> breachDomain(
            @Valid
            @RequestBody DomainBreachRequest domainBreachRequest
    ) {
        return ResponseEntity.ok(
                blackKitService.domainBreach(
                        new DomainBreach(domainBreachRequest.getDomain()),
                        DomainBreachResponse.class
                )
        );
    }

    @PostMapping("/blacklist/ip")
    ResponseEntity<BlackListIPResponse> blackListIP(
            @Valid
            @RequestBody BlackListIPRequest blackListIPRequest
    ) {
        return ResponseEntity.ok(
                blackKitService.blacklistIP(
                        new BlackListIP(blackListIPRequest.getIp()),
                        BlackListIPResponse.class
                )
        );
    }

    @PostMapping("/phishing/domain")
    ResponseEntity<EmailBreachResponse> domainPhishing(
            @Valid
            @RequestBody DomainPhishingRequest domainPhishingRequest
    ) {
        return ResponseEntity.ok(
                blackKitService.domainPhishing(
                        new DomainPhishing(domainPhishingRequest.getDomain()),
                        EmailBreachResponse.class
                )
        );
    }
}
