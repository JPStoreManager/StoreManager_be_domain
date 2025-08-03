package manage.store.domain.model.user.user;


import lombok.*;
import manage.store.domain.model.common.value.DbUpdateDate;
import manage.store.domain.model.user.value.*;

import java.util.Objects;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class User {

    private UserId id;
    private String password;
    private UserName name;
    private ResidentRegistNo residentRegistNo;
    private PhoneNo phoneNo;
    private Email email;
    private String address;
    private UserAuthCode authCd;
    private WorkDate workStartDate;
    private WorkDate workEndDate;
    private WorkStatusCode workStatusCd;
    private String bankName;
    private String bankAccountNo;
    private Salary monthSalary;
    private Salary hourWage;
    private OtpNo otpNo;
    private UserId createdBy;
    private DbUpdateDate createdDate;
    private UserId lastUpdatedBy;
    private DbUpdateDate lastUpdatedDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(getId(), user.getId())
                && Objects.equals(getPassword(), user.getPassword())
                && Objects.equals(getName(), user.getName())
                && Objects.equals(getResidentRegistNo(), user.getResidentRegistNo())
                && Objects.equals(getPhoneNo(), user.getPhoneNo())
                && Objects.equals(getEmail(), user.getEmail())
                && Objects.equals(getAddress(), user.getAddress())
                && Objects.equals(getAuthCd(), user.getAuthCd())
                && Objects.equals(getWorkStartDate(), user.getWorkStartDate())
                && Objects.equals(getWorkEndDate(), user.getWorkEndDate())
                && Objects.equals(getWorkStatusCd(), user.getWorkStatusCd())
                && Objects.equals(getBankName(), user.getBankName())
                && Objects.equals(getBankAccountNo(), user.getBankAccountNo())
                && Objects.equals(getMonthSalary(), user.getMonthSalary())
                && Objects.equals(getHourWage(), user.getHourWage())
                && Objects.equals(getOtpNo(), user.getOtpNo());
    }

    // 각 프로퍼티별 validation을 검증하는 메서드를 작성해
    private boolean isUserIdValid(UserId id) {
        return id != null;
    }

    private boolean isPasswordValid(String password) {
        final int MAX_PASSWORD_LENGTH = 300;

        return password != null && !password.isBlank() && password.length() <= MAX_PASSWORD_LENGTH;
    }

    private boolean isNameValid(UserName name) {
        return name != null;
    }

    private boolean isResidentRegistNoValid(ResidentRegistNo residentRegistNo) {
        return true;
    }

    private boolean isPhoneNoValid(PhoneNo phoneNo) {
        return phoneNo != null;
    }

    private boolean isEmailValid(Email email) {
        return true;
    }

    private boolean isAddressValid(String address) {
        final int MAX_ADDRESS_LENGTH = 200;

        return address == null || address.length() <= MAX_ADDRESS_LENGTH;
    }

    private boolean isAuthCdValid(UserAuthCode authCd) {
        return authCd != null;
    }

    private boolean isWorkStartDateValid(WorkDate workStartDate) {
        return workStartDate != null;
    }

    private boolean isWorkEndDateValid(WorkDate workEndDate) {
        return true;
    }

    private boolean isWorkStatusCdValid(WorkStatusCode workStatusCd) {
        return workStatusCd != null;
    }

    private boolean isBankNameValid(String bankName) {
        final int MAX_BANK_NAME_LENGTH = 6;

        return bankName == null || bankName.length() <= MAX_BANK_NAME_LENGTH;
    }

    private boolean isBankAccountNoValid(String bankAccountNo) {
        final int MAX_BANK_ACCOUNT_NO_LENGTH = 20;

        return bankAccountNo == null || bankAccountNo.length() <= MAX_BANK_ACCOUNT_NO_LENGTH;
    }

    private boolean isMonthSalaryValid(Salary monthSalary) {
        return true;
    }

    private boolean isHourWageValid(Salary hourWage) {
        return true;
    }

    private boolean isOtpNoValid(OtpNo otpNo) {
        return true;
    }

    private boolean isCreatedByValid(UserId createdBy) {
        return createdBy != null;
    }

    private boolean isLastUpdatedByValid(UserId lastUpdatedBy) {
        return lastUpdatedBy != null;
    }

    /**
     * 현재 객체의 유효한 데이터를 가지고 있는 객체인지 검사
     * @return true: 유효한 객체, false: 유효하지 않은 객체
     */
    public boolean isValid() {
        return isUserIdValid(getId()) &&
                isPasswordValid(getPassword()) &&
                isNameValid(getName()) &&
                isResidentRegistNoValid(getResidentRegistNo()) &&
                isPhoneNoValid(getPhoneNo()) &&
                isEmailValid(getEmail()) &&
                isAddressValid(getAddress()) &&
                isAuthCdValid(getAuthCd()) &&
                isWorkStartDateValid(getWorkStartDate()) &&
                isWorkEndDateValid(getWorkEndDate()) &&
                isWorkStatusCdValid(getWorkStatusCd()) &&
                isBankNameValid(getBankName()) &&
                isBankAccountNoValid(getBankAccountNo()) &&
                isMonthSalaryValid(getMonthSalary()) &&
                isHourWageValid(getHourWage()) &&
                isOtpNoValid(getOtpNo()) &&
                isCreatedByValid(getCreatedBy()) &&
                isLastUpdatedByValid(getLastUpdatedBy());
    }
}


