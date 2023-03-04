package Project.ATM.Management.System.Services;

import Project.ATM.Management.System.Repositories.BalanceInquiriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BalanceInquiriesService {
@Autowired
    BalanceInquiriesRepository balanceInquiriesRepository;
}
