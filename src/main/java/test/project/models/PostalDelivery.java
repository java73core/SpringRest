package test.project.models;

import javax.persistence.*;

@Entity
@Table(name = "PostalDelivery")
public class PostalDelivery {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "typeOfDelivery")
    @Enumerated(EnumType.STRING)
    private TypeOfDelivery typeOfDelivery;

    @Column(name = "indexRecipient")
    private int indexRecipient;

    @Column(name = "addressRecipient")
    private String addressRecipient;

    @Column(name = "recipientsName")
    private String recipientsName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TypeOfDelivery getTypeOfDelivery() {
        return typeOfDelivery;
    }

    public void setTypeOfDelivery(TypeOfDelivery typeOfDelivery) {
        this.typeOfDelivery = typeOfDelivery;
    }

    public int getIndexRecipient() {
        return indexRecipient;
    }

    public void setIndexRecipient(int indexRecipient) {
        this.indexRecipient = indexRecipient;
    }

    public String getAddressRecipient() {
        return addressRecipient;
    }

    public void setAddressRecipient(String addressRecipient) {
        this.addressRecipient = addressRecipient;
    }

    public String getRecipientsName() {
        return recipientsName;
    }

    public void setRecipientsName(String recipientsName) {
        this.recipientsName = recipientsName;
    }

    public PostalDelivery(int id, TypeOfDelivery typeOfDelivery, int indexRecipient, String addressRecipient, String recipientsName) {
        this.id = id;
        this.typeOfDelivery = typeOfDelivery;
        this.indexRecipient = indexRecipient;
        this.addressRecipient = addressRecipient;
        this.recipientsName = recipientsName;
    }
}
