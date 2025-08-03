package manage.store.domain.model.user.value;

public class OtpNo {

    private String otpNo;

    public OtpNo(String otpNo) {
        if (otpNo == null || otpNo.isEmpty() || otpNo.length() > 6) {
            throw new IllegalArgumentException("OTP number must be a non-empty string with a maximum length of 6 characters.");
        }
        this.otpNo = otpNo;
    }

    public String value() {
        return otpNo;
    }

    public OtpNo setOtpNo(String otpNo) {
        return new OtpNo(otpNo);
    }

    @Override
    public String toString() {
        return otpNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OtpNo otpNo1 = (OtpNo) o;
        return otpNo.equals(otpNo1.otpNo);
    }

}
