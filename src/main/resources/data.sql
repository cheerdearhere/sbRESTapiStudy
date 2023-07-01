-- table query
-- id: auto_increment, primary key
insert into user(
                  name
                , password
                , ssn
                , join_date
) values
(
        "user1"
    , "test1111"
    , "701010-1111111"
    , curdate()
)
,(
      "user2"
    , "test2222"
    , "801010-2222222"
    , curdate()
)
,(
      "user3"
    , "test3333"
    , "831010-1222222"
    , curdate()
),(
    "user4"
    , "test4444"
    , "901010-4444222"
    , curdate()
),(
    "user5"
    , "test5555"
    , "911010-2555522"
    , curdate()
);