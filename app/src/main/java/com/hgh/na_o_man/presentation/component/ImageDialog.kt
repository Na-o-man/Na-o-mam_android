package com.hgh.na_o_man.presentation.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.hgh.na_o_man.R
import com.hgh.na_o_man.domain.model.Dummy
import com.hgh.na_o_man.domain.model.photo.PhotoInfoModel
import com.hgh.na_o_man.presentation.theme.LightWhite
import com.hgh.na_o_man.presentation.theme.SteelBlue
import com.hgh.na_o_man.presentation.theme.Typography

@Composable
fun ImageDialog(
    image: PhotoInfoModel,
    onCancelButtonClick: () -> Unit,
    content: @Composable (Modifier) -> Unit,
) {
    Dialog(onDismissRequest = { onCancelButtonClick() }) {
        Box(
            Modifier.fillMaxSize()
        ) {

            Box(modifier = Modifier
                .fillMaxSize()
                .clickable { onCancelButtonClick() })

            Surface(
                modifier = Modifier
                    .align(Alignment.Center)
                    .wrapContentHeight(),
                shape = RoundedCornerShape(16.dp),
                border = BorderStroke(2.dp, Color(0xCFFFFFFF)),
                color = LightWhite.copy(alpha = 0.8f)
            ) {
                Column {
                    Box {
                        ImageCard(
                            image = image,
                            isSelectMode = false,
                            contentScale = ContentScale.FillWidth,
                            modifier = Modifier
                                .fillMaxWidth()
                                .wrapContentHeight()
                                .shadow(3.dp, RoundedCornerShape(16.dp))
                        )

                        IconButton(
                            modifier = Modifier
                                .align(Alignment.TopEnd), onClick = onCancelButtonClick
                        ) {
                            Icon(
                                imageVector = ImageVector.vectorResource(id = R.drawable.ic_button_close_26),
                                contentDescription = null,
                                tint = Color.Unspecified
                            )
                        }
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(height = 45.dp)
                            .padding(horizontal = 12.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = ImageVector.vectorResource(id = R.drawable.ic_nangman_23),
                            contentDescription = null,
                            tint = Color.Unspecified,
                        )
                        Text(
                            text = image.createdAt,
                            style = Typography.labelMedium,
                            textAlign = TextAlign.End,
                        )
                    }
                }
            }

            content(Modifier.align(Alignment.BottomCenter))
        }
    }
}


@Composable
@Preview
fun PreView() {
    ImageDialog(PhotoInfoModel(), {}) {

    }
}