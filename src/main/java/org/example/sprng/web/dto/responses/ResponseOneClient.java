package org.example.sprng.web.dto.responses;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.sprng.data.entities.Client;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class ResponseOneClient {
    private Long id;
    private Long phoneNumber;
    private String name;
    private String country;
    private String street;
    private List<ResponseAllOrders> orders;

    public ResponseOneClient(Client client) {
        this.id = client.getId();
        this.phoneNumber = client.getPhoneNumber();
        this.name = client.getName();
        this.country = client.getCountry();
        this.street = client.getStreet();
    }
}
