package org.javaboy.vhr.utils;

import org.javaboy.vhr.model.Hr;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @作者 无唔之物
 */
public class HrUtils {
    public static Hr getCurrentHr() {
        return ((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal());
    }
}
