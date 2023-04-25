public class LoggerMain {
    public static void main(String[] args) {
        LoggerFactory loggerFactory = new LoggerFactory();
        Logger logger = loggerFactory.createLogger("File");
        logger.log();
    }
}
