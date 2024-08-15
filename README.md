# 나o만
<div>
  <img src="https://img.shields.io/badge/Kotlin-7F52FF?style=flat-square&logo=Kotlin&logoColor=white">
  <img src="https://img.shields.io/badge/jetpack_compose-4285F4?style=flat-square&logo=jetpackcompose&logoColor=white">
</div>
<br>
<table>
  <tr>
    <td align="center"><img width="150" alt="na-o-man-한건희" src="https://github.com/user-attachments/assets/e7f9feda-04c8-4dda-8426-4173bac0dcb8"></td>
    <td align="center"><img width="150" alt="na-o-man-백종원" src="https://github.com/user-attachments/assets/7264840a-7b59-43ce-88fd-c4d6f22cd2c0"></td>
    <td align="center"><img width="150" alt="na-o-man-고민균" src="https://github.com/user-attachments/assets/af546406-fca2-48c6-a7d0-6cc8a34dc091"></td>
  </tr>
  <tr>
    <td align="center"><a href="https://github.com/hangunhee39">⭐️한건희</a></td>
    <td align="center"><a href="https://github.com/BAEK0111">백종원</a></td>
    <td align="center"><a href="https://github.com/skyblue1232">고민균</a></td>
  </tr>
  <tr>
    <td align="center"> 프로젝트 설계( MVVM+MVI패턴, Hilt, ..) <br> Sign <br> MyPage <br> PhotoList <br> AgendaAdd <br> VoteDetail <br> Image-Up/Download(Background) </td>
    <td align="center"> Home <br> Alarm <br> GroupFolder <br> VoteHome </td>
    <td align="center"> GroupAdd <br> GroupJoin </td>
  </tr>
</table>


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
