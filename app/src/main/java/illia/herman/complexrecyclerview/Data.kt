package illia.herman.complexrecyclerview

import illia.herman.complexrecyclerview.model.Article
import illia.herman.complexrecyclerview.model.Content
import illia.herman.complexrecyclerview.model.Popularity

/**
 * Created by illia.herman on 07.10.2019
 */
object Data {

    val articles = ArrayList<Article>()

    init {
        articles.addAll(
            arrayListOf(
                Article(
                    id = 0,
                    content =
                    Content(
                        header = "Lorem ipsum dolor sit amet",
                        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."

                    ),
                    popularity =
                    Popularity(
                        likeCount = 125,
                        dislikeCount = 33,
                        viewsCount = 854

                    ),
                    picUrl = arrayListOf(
                        "https://www.freepnglogos.com/uploads/smartphone-png/smartphone-png-images-16.png",
                        "https://www.freepnglogos.com/uploads/laptop-png/flat-laptop-icon-transparent-png-svg-vector-10.png",
                        "https://www.freepnglogos.com/uploads/microphone-png/microphone-shure-microphones-wireless-microphones-ear-3.png"
                    )
                ),
                Article(
                    id = 1,
                    content =
                    Content(
                        header = "Lorem ipsum dolor sit amet",
                        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."

                    ),
                    popularity =
                    Popularity(
                        likeCount = 25,
                        dislikeCount = 1,
                        viewsCount = 54

                    ),
                    picUrl = arrayListOf(
                        "https://www.freepnglogos.com/uploads/microphone-png/microphone-shure-microphones-wireless-microphones-ear-3.png",
                        "https://www.freepnglogos.com/uploads/laptop-png/flat-laptop-icon-transparent-png-svg-vector-10.png",
                        "https://www.freepnglogos.com/uploads/smartphone-png/smartphone-png-images-16.png"
                    )
                ),
                Article(
                    id = 2,
                    content =
                    Content(
                        header = "Lorem ipsum dolor sit amet",
                        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."

                    ),
                    popularity =
                    Popularity(
                        likeCount = 243,
                        dislikeCount = 77,
                        viewsCount = 1024

                    ),
                    picUrl = arrayListOf(
                        "https://www.freepnglogos.com/uploads/laptop-png/flat-laptop-icon-transparent-png-svg-vector-10.png",
                        "https://www.freepnglogos.com/uploads/smartphone-png/smartphone-png-images-16.png",
                        "https://www.freepnglogos.com/uploads/microphone-png/microphone-shure-microphones-wireless-microphones-ear-3.png"
                    )
                ),
                Article(
                    id = 3,
                    content =
                    Content(
                        header = "Lorem ipsum dolor sit amet",
                        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."

                    ),
                    popularity =
                    Popularity(
                        likeCount = 321,
                        dislikeCount = 87,
                        viewsCount = 955

                    ),
                    picUrl = arrayListOf(
                        "https://www.freepnglogos.com/uploads/smartphone-png/smartphone-png-images-16.png",
                        "https://www.freepnglogos.com/uploads/laptop-png/flat-laptop-icon-transparent-png-svg-vector-10.png",
                        "https://www.freepnglogos.com/uploads/microphone-png/microphone-shure-microphones-wireless-microphones-ear-3.png"
                    )
                )
            )
        )
    }
}