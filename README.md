# 나o만
<div>
  <img src="https://img.shields.io/badge/Kotlin-7F52FF?style=flat-square&logo=Kotlin&logoColor=white">
  <img src="https://img.shields.io/badge/jetpack_compose-4285F4?style=flat-square&logo=jetpackcompose&logoColor=white">
</div>


## Clean Architecture
- MVVM + MVI
<img width="767" alt="manageApp_arch" src="https://github.com/hangunhee39/manageApp/assets/77563098/d10cb136-8371-415c-b1bb-672d19b09f8c">

## Project Folder Structure
```plaintext
📁 na-o-man
....
├── data
│   ├── dto
│   │   ├── agenda
│   │   │   └── response
│   │   ├── auth
│   │   │   ├── request
│   │   │   └── response
│   │   ├── common
│   │   │   ├── request
│   │   │   └── response
│   │   ├── member
│   │   │   └── response
│   │   ├── notification
│   │   │   ├── request
│   │   │   └── response
│   │   ├── photo
│   │   │   ├── request
│   │   │   └── response
│   │   └── share_group
│   │       ├── request
│   │       └── response
│   ├── repository
│   └── source
│       └── remote
│           └── api
├── di
│   └── util
│       ├── auth
│       ├── data_store
│       ├── remote
│       ├── s3
│       └── work_manager
│           ├── enqueue
│           └── task
├── domain
│   ├── model
│   │   ├── agenda
│   │   ├── auth
│   │   ├── member
│   │   ├── notification
│   │   ├── photo
│   │   └── share_group
│   ├── repository
│   └── usecase
│       ├── agenda
│       ├── auth
│       ├── member
│       ├── notification
│       ├── photo
│       └── share_group
└── presentation
    ├── base
    ├── component
    │   ├── NoticeIcon
    │   ├── groupdetail
    │   ├── home
    │   ├── homeIcon
    │   ├── mypage
    │   ├── type
    │   ├── userIcon
    │   └── voteIcon
    ├── theme
    ├── ui
    │   ├── add
    │   │   ├── addgroup
    │   │   └── joingroup
    │   ├── detail
    │   │   ├── GroupDetailFolder
    │   │   ├── agenda
    │   │   ├── photo_list
    │   │   ├── vote
    │   │   └── vote_detail
    │   ├── main
    │   │   ├── alarm
    │   │   ├── home
    │   │   └── mypage
    │   └── sign
    │       └── signin
    └── util
