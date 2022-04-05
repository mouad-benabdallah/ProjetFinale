package com.exo.service;

import java.util.List;

import com.exo.entities.Admin;
import com.exo.entities.Role;

public interface AccountInterface {
	public Admin saveAdmin(Admin admin);
	public Role saveRole(Role role);
	public void addRoleToAdmin(String login, String roleName);
	public Admin findByLogin(String login);
	public Admin findByNomComplet(String nomComplet);
	public List<Admin> admins();

}
