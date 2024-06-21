//package com.forwork.forwork;
//
//import com.forwork.forwork.forum.user.User;
//import com.forwork.forwork.forum.user.UserRepository;
//import com.forwork.forwork.forum.publication.Publication;
//import com.forwork.forwork.forum.publication.PublicationRepository;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.time.LocalDate;
//
//@SpringBootTest
//class ForworkApplicationTests {
//
//	@Autowired
//	private UserRepository userRepository;
//	@Autowired
////	private PublicationRepository publicationRepository;
//
//	@Test
//	void contextLoads() {
//		// user
////		var user = new User();
////		user.setName("user1337");
////		user.setEmail("test1@mail");
////		user.setUserId(10000000);
//
////		var savedUser = userRepository.save(user);
////		System.out.println(savedUser);
//
//		// publication
////		var publication = new Publication();
////		// publicationId will be auto-generated if not set explicitly
//////		publication.setUserId(savedUser.getUserId());
////		publication.setPublicationDate(2024-6-18);  // Correct way to set the date
////		publication.setTitle("Статья об котиках");
////		publication.setHeader("В этой статье вы узнаете, что может напичатать котик на клаве");
////		publication.setContent("пауцкпраыврпшграывлрпаыврпгшпавыи павырп9аывроа, мяу");
//
////		var savedPublication = publicationRepository.save(publication);
////		System.out.println(savedPublication);
//	}
//}