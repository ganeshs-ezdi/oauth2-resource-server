package com.ezdi.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by EZDI\ganesh.s on 25/7/16.
 */
@RestController
public class AccessTokenController {
    @RequestMapping("/")
    @PreAuthorize("@tokenStore.readAccessToken(authentication.details.tokenValue).additionalInformation.get('principalName') == 'adminuser'")
    public Map<String,String> getAttributes() {
        Map<String,String> attrs = new HashMap<>();
        attrs.put("User", SecurityContextHolder.getContext().getAuthentication().getName());

        return attrs;
    }
}
