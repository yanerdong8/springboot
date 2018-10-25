package com.yed.springboot;

import com.yed.springboot.domain.User;
import com.yed.springboot.rabbitmq.HelloReceiver;
import com.yed.springboot.rabbitmq.HelloSender;
import com.yed.springboot.rabbitmq.TopicSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

	@Autowired
	private RedisTemplate redisTemplate;

	@Autowired
	private HelloSender helloSender;

	@Autowired
	private TopicSender topicSender;

	@Test
	public void contextLoads() {

	}

	@Test
	public void testMQ(){
	//	helloSender.send();
		topicSender.topicSend();
		topicSender.topicSends();
	}

//	@Test
//	public void testRedisTemplate(){
//		// redis存储数据
//		String key = "name";
//		redisTemplate.opsForValue().set(key, "yed");
//		// 获取数据
//		String value = (String) redisTemplate.opsForValue().get(key);
//		System.out.println("获取缓存中key为" + key + "的值为：" + value);
//
//		User user = new User();
//		user.setUserName("yanerdong");
//		user.setPassword("666");
//		String userKey = "yed";
//		redisTemplate.opsForValue().set(userKey, user);
//		User newUser = (User) redisTemplate.opsForValue().get(userKey);
//
//		System.out.println("获取缓存中key为" + userKey + "的值为：" + newUser);
//	}
}
