package com.roncoo.education.util;

/**
 * Created by luzhenxing on 2017/10/9 0009.
 */
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Logger 日志记录辅助类
 *
 *
 */
public class LoggerUtil {

//private static final Logger LOGGER = LogManager.getLogger();
private static final Logger LOGGER = LogManager.getLogger(LoggerUtil.class.getName());

        private LoggerUtil(){
    /* cannot be instantiated */
        throw new UnsupportedOperationException("cannot be instantiated");
        }

        public static Logger getLogger(){
        return LOGGER;
        }

        public static void t(String msg){
        LOGGER.trace(msg);
        }

        public static void d(String msg){
        LOGGER.debug(msg);
        }

        public static void i(String msg){
        LOGGER.info(msg);
        }

        public static void w(String msg){
        LOGGER.warn(msg);
        }

        public static void e(String msg){
        LOGGER.error(msg);
        }
        }