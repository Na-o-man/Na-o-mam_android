package com.hgh.na_o_man.presentation.ui.add.joingroup

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import coil.compose.rememberAsyncImagePainter
import com.hgh.na_o_man.R
import com.hgh.na_o_man.presentation.component.userIcon.UserInfo
import com.hgh.na_o_man.presentation.theme.lightSkyBlue

@Composable
fun AcceptWho1(
    navController: NavHostController,
    onProfileSelected: (String) -> Unit,
    members: List<Member>,
    selectedProfile: Member?,
    currentPage: Int
) {
    val firstItemIndex = currentPage * 3

    Box(
        modifier = Modifier
            .size(350.dp, 380.dp)
            .background(Color.Transparent)
    ) {
        Scaffold(
            containerColor = lightSkyBlue
        ) { padding ->
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(padding)
                    .padding(start = 30.dp, bottom = 4.dp)
                    .background(Color.Transparent)
                    .align(Alignment.Center)
            ) {
                members.forEachIndexed { index, member ->
                    //val isProfileIdNull = existingMemberIds.contains(null)
                   // val isSelectable = member.id != null && !isProfileIdNull
                    val painter = if (member.avatarUrl.isNotEmpty()) {
                        rememberAsyncImagePainter(member.avatarUrl)
                    } else {
                        painterResource(id = R.drawable.ic_profile_155)
                    }


                    UserInfo(
                        userName = member.name,
                        profileImagePainter = painter,
                        isSelected = selectedProfile?.name == member.name ,
                        onClick = {
                            if (member.memberId==-1L) {
                                onProfileSelected(member.name)
                            }
                        }
                    )
                }
            }
        }
    }
}
