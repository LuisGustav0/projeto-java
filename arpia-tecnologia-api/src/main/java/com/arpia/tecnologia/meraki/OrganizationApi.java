package com.arpia.tecnologia.meraki;

import com.arpia.tecnologia.meraki.consts.UtilJson;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class OrganizationApi {

    List<Organizations> getOrganizations() {
        RestTemplate restTemplate = new RestTemplate();

        String baseUrl = AppConst.URL_API.concat("/").concat("organizations");

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("X-Cisco-Meraki-API-Key", AppConst.API_KEY);
        httpHeaders.add("Content-Type", "application/json; charset=utf-8");

        var responseEntity = restTemplate.exchange(baseUrl, HttpMethod.GET, new HttpEntity<>(httpHeaders), String.class);

        List<Organizations> listOrganization = Optional.ofNullable(responseEntity)
                                                       .map(ResponseEntity::getBody)
                                                       .map(body -> UtilJson.strJsonToList(body, Organizations.class))
                                                       .orElse(new ArrayList<>());

        return listOrganization;
    }
}
