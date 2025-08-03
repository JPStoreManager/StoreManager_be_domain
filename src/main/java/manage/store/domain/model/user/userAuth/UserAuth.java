package manage.store.domain.model.user.userAuth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import manage.store.domain.model.common.value.DbUpdateDate;
import manage.store.domain.model.common.value.SortOrder;
import manage.store.domain.model.common.value.UseYn;
import manage.store.domain.model.user.value.UserId;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAuth {

    private String authCd;
    private String authNm;
    private String authDesc;
    private UseYn useYn;
    private SortOrder sortOrder;
    private UserId createdBy;
    private DbUpdateDate createdDate;
    private UserId lastUpdatedBy;
    private DbUpdateDate lastUpdatedDate;

}
