package test.project.models;

import javax.persistence.Entity;

//@Entity
public class Operations extends PostalDelivery{

    public Operations(int id, TypeOfDelivery typeOfDelivery, int indexRecipient, String addressRecipient, String recipientsName) {
        super(id, typeOfDelivery, indexRecipient, addressRecipient, recipientsName);
    }
}
