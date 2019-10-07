package illia.herman.complexrecyclerview.model

/**
 * Created by illia.herman on 07.10.2019
 */
data class Article(
    val id: Int,
    val content: Content,
    val picUrl: List<String>,
    val popularity: Popularity
)

data class Content(
    val header: String,
    val description: String
)

data class Popularity(
    val likeCount: Int,
    val dislikeCount: Int,
    val viewsCount: Int
)



