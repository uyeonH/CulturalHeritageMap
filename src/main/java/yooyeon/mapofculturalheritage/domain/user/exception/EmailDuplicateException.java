package yooyeon.mapofculturalheritage.domain.user.exception;

import yooyeon.mapofculturalheritage.domain.user.domain.Email;
import yooyeon.mapofculturalheritage.global.error.exception.ErrorCode;
import yooyeon.mapofculturalheritage.global.error.exception.InvalidValueException;

public class EmailDuplicateException extends InvalidValueException {

    public EmailDuplicateException(final Email email) {
        super(email.getValue(), ErrorCode.EMAIL_DUPLICATION);
    }
}