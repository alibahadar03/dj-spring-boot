package com.tgss.dockerspringboot;

import com.tgss.dockerspringboot.repository.UserRepository;
import com.tgss.dockerspringboot.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


@SpringBootTest
class DockerSpringBootApplicationTests {

	@Autowired
	private UserServiceImpl userService;

	@MockBean
	private UserRepository userRepository;

    @Test
	public void getUserTest(){
//		when()
	}

}
