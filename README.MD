一，此项目为文章阅读项目
项目采用的分库分表设计，因为业务比较复杂，后期的访问量巨大，为了分摊数据库的压力，整个项目用的不只是一个数据库。其中核心库有**5**个，每一个数据库解决的是一个业务点，非常接近与实际项目设计。

- AppInfo  app信息库，主要存储用户信息，文章信息，用户动态，用户评论，用户认证等信息
- Behavior  用户行为库，主要存储用户行为，包括用户的转发，点赞，评论行为等
- WeMedia  多媒体库，主要存储多媒体人图文数据统计，账号信息，粉丝相关信息等。
- Crawlers  爬虫库，主要存储从网络上爬取的文章信息等。
- Admin  后台管理库，主要存储后台管理员的信息。

项目中的文章采用了多库设计的方式，以减少高并发情况下核心数据库表压力，共计设计为三个库表：

- ap_article：APP用户读取文章数据和记录次数
- cl_news：爬虫爬得文章数据
- wm_news：自媒体用户发布的文章数据

cl_news和wm_news中的数据审核通过之后发布到ap_article中。
