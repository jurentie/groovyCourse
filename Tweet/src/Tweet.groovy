import java.time.LocalDateTime

class Tweet {

    String userId
    LocalDateTime timestamp
    String tweetBody
    String[] hashtags

    Tweet(String usr, String body, String[] hashtags){
        userId = usr
        tweetBody = body
        this.hashtags = hashtags
        timestamp = LocalDateTime.now()
    }

    String formatHashtags(String[] hashtags){
        String formattedHashtags = ""
        for(String h: hashtags){
            formattedHashtags += h + " "
        }
        return formattedHashtags.trim() + "\n"
    }

    @Override
    String toString() {
        return "@$userId\n" + "$tweetBody\n" + formatHashtags(hashtags) + "$timestamp"
    }
}
