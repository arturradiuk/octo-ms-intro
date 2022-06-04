package com.aradiuk.octomsintro.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Group {
    private UUID id;
    private LocalDateTime creationDateTime;
    private LocalDateTime lastUpdateDateTime;
    private String description;
    private List<User> users;
    private boolean active;
    private User owner; // cyclic reference
    private BigDecimal royalty;
}
