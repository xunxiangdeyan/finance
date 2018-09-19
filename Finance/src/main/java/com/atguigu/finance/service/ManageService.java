package com.atguigu.finance.service;

import com.atguigu.finance.bean.NplmContractAttribute;
import com.atguigu.finance.bean.NplmRepaymentDetail;
import com.atguigu.finance.bean.NplmRepaymentRecord;

import java.util.List;

public interface ManageService {

    public List<NplmContractAttribute>getContract();


   /* public List<NplmRepaymentDetail>getDetail(Integer ContractloanContractNum);
    public List<NplmRepaymentRecord>getRecord(Integer ContractloanContractNum);*/
}
