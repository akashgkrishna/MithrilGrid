package org.mithrilgrid.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerUtil {
    private static final Logger generalLogger = LogManager.getLogger("MithrilGrid");

    // General application logger
    public static Logger getLogger() {
        return generalLogger;
    }

    // Info-level logging
    public static void info(String message) {
        generalLogger.info(message);
    }

    // Warning-level logging
    public static void warn(String message) {
        generalLogger.warn(message);
    }

    // Error-level logging
    public static void error(String message) {
        generalLogger.error(message);
    }

    // Logging with exception details
    public static void error(String message, Throwable throwable) {
        generalLogger.error(message, throwable);
    }

}
