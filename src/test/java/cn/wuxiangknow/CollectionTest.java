package cn.wuxiangknow;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Desciption
 * @Author WuXiang
 * @Date 2019/8/10 14:21
 */
@Slf4j
public class CollectionTest {

    /**
     * Collections.sort
     *
     *
     *
     *
     * @throws Exception
     */
    @Test
    public void testSort() throws Exception{
        List<String> strings = Arrays.asList("6", "1", "3", "1","2");
        Collections.sort(strings);//sort方法在这里
        for (String string : strings) {
            log.debug(string);
        }
    }
}
