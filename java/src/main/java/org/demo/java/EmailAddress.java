package org.demo.java;

import java.util.Objects;

public record EmailAddress (String localPart, String domain) {
    public static EmailAddress parse(String value) {
        var atIndex = value.lastIndexOf('@');
        if (atIndex < 1 || atIndex == value.length() - 1)
            throw new IllegalArgumentException(
                    "EmailAddress must be two parts separated by @"
            );
        return new EmailAddress(
                value.substring(0, atIndex),
                value.substring(atIndex + 1) );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false; EmailAddress that = (EmailAddress) o;
        return localPart.equals(that.localPart) &&
                domain.equals(that.domain);
    }
    @Override
    public int hashCode() {
        return Objects.hash(localPart, domain);
    }
    @Override
    public String toString() {
        return localPart + "@" + domain;
    }
}
