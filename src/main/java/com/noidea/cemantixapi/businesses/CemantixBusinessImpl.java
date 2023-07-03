package com.noidea.cemantixapi.businesses;

import com.noidea.cemantixapi.beans.WordValue;
import com.noidea.cemantixapi.dao.CemantixDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.AccessType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CemantixBusinessImpl implements CemantixBusiness {

    @Autowired
    CemantixDao cemantixDao;

    @Override
    public List<WordValue> getMostSimilar(String word, int size) {
        return cemantixDao.getMostSimilar(word, size);
    }
}
