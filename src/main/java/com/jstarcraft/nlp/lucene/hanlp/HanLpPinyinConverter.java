package com.jstarcraft.nlp.lucene.hanlp;

import java.util.List;

import com.hankcs.hanlp.dictionary.py.Pinyin;

/**
 * 拼音字符串
 */
public interface HanLpPinyinConverter {

    CharSequence convert(String text, List<Pinyin> pinyin);

    /**
     * 全拼,HanLP.convertToPinyinString
     */
    class ToPinyinString implements HanLpPinyinConverter {
        private StringBuilder buffer = new StringBuilder(32);

        @Override
        public CharSequence convert(String text, List<Pinyin> pinyin) {
            buffer.setLength(0);
            for (Pinyin p : pinyin) {
                if (p != Pinyin.none5) {
                    buffer.append(p.getPinyinWithoutTone());
                }
            }
            return buffer;
        }
    }

    /**
     * 首字母,HanLP.convertToPinyinFirstCharString
     */
    class ToPinyinFirstCharString implements HanLpPinyinConverter {
        private StringBuilder buffer = new StringBuilder(32);

        @Override
        public CharSequence convert(String text, List<Pinyin> pinyin) {
            buffer.setLength(0);
            for (Pinyin p : pinyin) {
                if (p != Pinyin.none5) {
                    buffer.append(p.getFirstChar());
                }
            }
            return buffer;
        }
    }

}
