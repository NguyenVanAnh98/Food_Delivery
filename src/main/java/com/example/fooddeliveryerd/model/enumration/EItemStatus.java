package com.example.fooddeliveryerd.model.enumration;

public enum EItemStatus {

    ACTIVE("ACTIVE"),
    INACTIVE("INACTIVE");

    private final String value;

    EItemStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static EItemStatus fromValue(String value) {
        for (EItemStatus iItemStatus : values()) {
            if (iItemStatus.value.equalsIgnoreCase(value)) {
                return iItemStatus;
            }
        }
        throw new IllegalArgumentException("Không tồn tại giá trị: " + value);
    }
}
