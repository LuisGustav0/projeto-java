package com.arpia.tecnologia.meraki;

import java.util.List;

public class TestMeraki {

    public static void main(String[] args) {
        OrganizationApi organizationApi = new OrganizationApi();

        List<Organizations> listOrganization = organizationApi.getOrganizations();

        System.out.println(listOrganization);
    }
}
