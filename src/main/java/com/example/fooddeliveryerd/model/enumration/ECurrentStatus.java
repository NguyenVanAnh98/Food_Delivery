package com.example.fooddeliveryerd.model.enumration;

public enum ECurrentStatus {

    ACTIVE("ACTIVE"),
    INACTIVE("INACTIVE");

    private final String value;

    ECurrentStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static ECurrentStatus fromValue(String value) {
        for (ECurrentStatus eCurrentStatus : values()) {
            if (eCurrentStatus.value.equalsIgnoreCase(value)) {
                return eCurrentStatus;
            }
        }
        throw new IllegalArgumentException("Không tồn tại giá trị: " + value);
    }
}
