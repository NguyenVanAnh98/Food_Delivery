package com.example.fooddeliveryerd.model.enumration;

public enum EOrderStatus {

    PENDING("PENDING"),
    COMPLETED("COMPLETED");

    private final String value;

    EOrderStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static EOrderStatus fromValue(String value) {
        for (EOrderStatus eOrderStatus : values()) {
            if (eOrderStatus.value.equalsIgnoreCase(value)) {
                return eOrderStatus;
            }
        }
        throw new IllegalArgumentException("Không tồn tại giá trị: " + value);
    }
}
