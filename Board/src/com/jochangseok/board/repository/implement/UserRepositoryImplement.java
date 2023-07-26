package com.jochangseok.board.repository.implement;

import com.jochangseok.board.entity.User;
import com.jochangseok.board.repository.UserRepository;

public class UserRepositoryImplement implements UserRepository {

	@Override
	public boolean create(User entity) {
		if (entity == null) return false;
		if (!entity.isCreateValid()) return false;
		
		USERS.add(entity);
		
		return true;
	}

	@Override
	public User read(String key) {
		User result = null;
		
		if (key == null) return result;
		
		for(User user: USERS) {
			String email = user.getEmail();
			
			if (email.equals(key)) {
				result = user;
				break;
			}
		}
		
		return result;
	}

	@Override
	public boolean update(User entity) {
		if (entity == null) return false;
		
		String email = entity.getEmail();
		if (email == null) return false;
		
		for (int index = 0; index < USERS.size(); index++) {
			User user = USERS.get(index);
			String findEmail = user.getEmail();
			
			if (email.equals(findEmail)) {
				USERS.set(index, entity);
				break;
			}
		}
		
		return true;
	}

	@Override
	public boolean delete(String key) {
		if (key == null) return false;
		
		for (int index = 0; index < USERS.size(); index++) {
			User user = USERS.get(index);
			String email = user.getEmail();
			
			if (key.equals(email)) {
				USERS.remove(index);
				break;
			}
		}
		
		return true;
	}

	@Override
	public boolean existsByEmail(String email) {
		boolean result = false;
		
		for (User user: USERS) {
			if (user.getEmail().equals(email)) {
				result = true;
				break;
			}
		}
		
		return result;
	}

	@Override
	public boolean existsByTelNumber(String telNumber) {
		boolean result = false;
		
		for (User user: USERS) {
			if (user.getTelNumber().equals(telNumber)) {
				result = true;
				break;
			}
		}
		
		return result;
	}

	@Override
	public boolean existsByNickname(String nickname) {
		boolean result = false;
		
		for (User user: USERS) {
			if (user.getNickname().equals(nickname)) {
				result = true;
				break;
			}
		}
		
		return result;
	}

}
