package com.app.handcraft.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.handcraft.Model.CraftMenu;

public interface CraftRepo extends JpaRepository<CraftMenu, Long>{

}