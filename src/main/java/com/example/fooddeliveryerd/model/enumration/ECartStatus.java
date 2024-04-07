package com.example.fooddeliveryerd.model.enumration;

public enum ECartStatus {

    ACTIVE("ACTIVE"),
    INACTIVE("INACTIVE");

    private final String value;

    ECartStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static ECartStatus fromValue(String value) {
        for (ECartStatus eCartStatus : values()) {
            if (eCartStatus.value.equalsIgnoreCase(value)) {
                return eCartStatus;
            }
        }
        throw new IllegalArgumentException("Không tồn tại giá trị: " + value);
    }
}
