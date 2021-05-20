package com.example.mykolkata;

public class Word {

    int imageId,nameId,descId;
    int contactId = 0;
    int entryFeeId = 0;
    int priceId = 0;
    int timingsId = 0;

    public Word(int nameId, int imageId, int descId, int entryFeeId) {
        this.imageId = imageId;
        this.nameId = nameId;
        this.descId = descId;
        this.entryFeeId = entryFeeId;
    }

    public Word(int nameId, int imageId, int descId, int priceId, int contactId) {
        this.imageId = imageId;
        this.nameId = nameId;
        this.descId = descId;
        this.contactId = contactId;
        this.priceId = priceId;
    }

    public Word(int nameId, int imageId, int descId, int priceId, int contactId, int timinigsId) {
        this.imageId = imageId;
        this.nameId = nameId;
        this.descId = descId;
        this.contactId = contactId;
        this.priceId = priceId;
        this.timingsId = timinigsId;
    }

    public int getContactId() {
        return contactId;
    }

    public int getDescId() {
        return descId;
    }

    public int getEntryFeeId() {
        return entryFeeId;
    }

    public int getPriceId() {
        return priceId;
    }

    public int getImageId() {
        return imageId;
    }

    public int getNameId() {
        return nameId;
    }

    public int getTimingsId() { return timingsId; }

    @Override
    public String toString() {
        return "imageId: " + this.imageId + ", nameId: " + this.nameId + ", descId:" + this.descId;
    }
}
