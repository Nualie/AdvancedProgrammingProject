package bean;

import model.InternEntity;
import model.InternSB;

import java.util.ArrayList;
import java.util.List;

public class InternInfoDao {

    //TODO: make sure the display page is only accessible when logged in properly!
    public static List<InternInfoBean> InternInformation(){
        InternSB Requester = new InternSB();
        List<InternEntity> InternEntities = Requester.getInterns();
        List<InternInfoBean> InternBeans = new ArrayList<InternInfoBean>();
        for (var intern : InternEntities) {
            InternBeans.add(InternInfoBean.Beanify(intern));
        }
        return InternBeans;
    }
}
