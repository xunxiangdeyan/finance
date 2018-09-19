package com.atguigu.finance.serviceImpl;

import com.atguigu.finance.bean.NplmContractAttribute;
import com.atguigu.finance.bean.NplmRepaymentDetail;
import com.atguigu.finance.bean.NplmRepaymentRecord;
import com.atguigu.finance.mapper.NplmContractAttributeMapper;
import com.atguigu.finance.mapper.NplmRepaymentDetailMapper;
import com.atguigu.finance.mapper.NplmRepaymentRecordMapper;
import com.atguigu.finance.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManageServiceImpl implements ManageService {

    @Autowired
    private NplmContractAttributeMapper nplmContractAttributeMapper;

    @Autowired
    private NplmRepaymentDetailMapper nplmRepaymentDetailMapper;

    @Autowired
    private NplmRepaymentRecordMapper nplmRepaymentRecordMapper;

    @Override
    public List<NplmContractAttribute> getContract() {
        return nplmContractAttributeMapper.selectAll();
    }

   /* @Override
    public List<NplmRepaymentDetail> getDetail(Integer ContractloanContractNum) {

        return null;
    }

    @Override
    public List<NplmRepaymentRecord> getRecord(Integer ContractloanContractNum) {
        return null;
    }*/
}
