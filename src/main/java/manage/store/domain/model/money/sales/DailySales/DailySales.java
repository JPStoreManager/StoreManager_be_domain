package manage.store.domain.model.money.sales.DailySales;


import lombok.Data;
import manage.store.domain.model.common.value.DbUpdateDate;
import manage.store.domain.model.money.sales.value.Money;
import manage.store.domain.model.user.value.UserId;

import java.text.SimpleDateFormat;
@Data
public class DailySales {

    private String branchCd;
    private String registDate;
    private Money cardSales;
    private Money cashSales;
    private String comment;
    private UserId createdBy;
    private DbUpdateDate createdDate;
    private UserId lastUpdatedBy;
    private DbUpdateDate lastUpdatedDate;

    // 애노테이션을 보고 각 프로퍼티의 유효성 검증 메서드를 작성해
    private boolean isBranchCdValid(String branchCd) {
        return branchCd != null && !branchCd.isBlank();
    }

    private boolean isRegistDateValid(String registDate) {
        return registDate != null && isDateFormatValid(registDate);
    }

    private boolean isCardSalesValid(Money cardSales) {
        return cardSales != null;
    }

    private boolean isCashSalesValid(Money cashSales) {
        return cashSales != null;
    }

    private boolean isCommentValid(String comment) {
        return true;
    }

    private boolean isCreatedByValid(UserId createdBy) {
        return createdBy != null;
    }

    private boolean isLastUpdatedByValid(UserId lastUpdatedBy) {
        return lastUpdatedBy != null;
    }

    private boolean isDateFormatValid(String date) {
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.setLenient(false);
        try {
            simpleDateFormat.parse(date);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 유효성 검사 메소드
     * @return true if valid, false otherwise
     */
    public boolean isValid() {
        return isBranchCdValid(branchCd)
                && isRegistDateValid(registDate)
                && isCardSalesValid(cardSales)
                && isCashSalesValid(cashSales)
                && isCommentValid(comment)
                && isCreatedByValid(createdBy)
                && isLastUpdatedByValid(lastUpdatedBy);
    }

}
