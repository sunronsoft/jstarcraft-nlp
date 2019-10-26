package com.jstarcraft.nlp.tokenization;

import com.jstarcraft.nlp.tokenization.Tokenizer;
import com.jstarcraft.nlp.tokenization.thulac.ThulacTokenizer;

public class ThulacTokenizerTestCase extends TokenizerTestCase {

    @Override
    protected Tokenizer getTokenizer() {
        return new ThulacTokenizer();
    }

}