public class LoggerFactory {

    public Logger createLogger(String channel) {
        if (channel == null || channel.isEmpty())
            return null;
        switch (channel) {
            case "File" :
                return new FileLogger();
            case "Console":
                return new ConsoleLogger();
            default:
                throw new IllegalArgumentException("Channel bulunamadı : " + channel);

        }

    }
}
