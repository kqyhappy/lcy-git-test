package com.example.demo.mybatis.entity;

public class Info {
   int infoId;
   int postUserId;
   int receiveUserId;
   int type;
   int articleId; //可以为空
   int isRead;//0未读1已读
   //1:xx关注了你！
    //2:xx在你的文章xxx下给您留言了 clickhere
    //3：xx对你在XX文章下的留言回复进行了回复 clickhere:

}
