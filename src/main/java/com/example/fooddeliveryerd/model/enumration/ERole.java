package com.example.fooddeliveryerd.model.enumration;

public enum ERole {

    ROLE_USER("ROLE_USER"),
    ROLE_ADMIN("ROLE_ADMIN"),
    ROLE_RESTAURANT("ROLE_RESTAURANT");

    private final String value;

    ERole(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static ERole fromValue(String value) {
        for (ERole eRole : values()) {
            if (eRole.value.equalsIgnoreCase(value)) {
                return eRole;
            }
        }
        throw new IllegalArgumentException("Không tồn tại giá trị: " + value);
    }
}
