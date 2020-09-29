package com.sidaodin.community;

import com.sidaodin.community.dao.DiscussPostMapper;
import com.sidaodin.community.entity.DiscussPost;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MapperTests {


    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Test
    public void testSelectPosts(){

        List<DiscussPost> list = discussPostMapper.selectDiscussPosts(149,0,10);

        for(DiscussPost post : list){
            System.out.println(post);
        }

        int rows = discussPostMapper.selectDiscussPostRows(149);
        System.out.println(rows);

    }
}
