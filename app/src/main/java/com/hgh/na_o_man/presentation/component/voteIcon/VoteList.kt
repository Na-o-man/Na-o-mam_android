import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hgh.na_o_man.domain.model.photo.PhotoInfoModel
import com.hgh.na_o_man.presentation.component.ImageCard
import com.hgh.na_o_man.presentation.theme.DeepBlue

@Composable
fun getVoteList(
    title: String,
    images: List<String>,
    voteId: Long = 33L,
    onClick: (Long) -> Unit = {}
) {
    Log.d("getVoteList", "Rendering getVoteList with title: $title")

    val gradient = Brush.linearGradient(
        colors = listOf(
            Color(0x00FFFFFF),
            Color(0xCCFFFFFF),
            Color(0x33FFFFFF),
            Color(0xB3FFFFFF),
        ),
        start = Offset.Zero,
        end = Offset.Infinite,
    )

    Box(
        modifier = Modifier
            .background(Color(0xBFFFFFFF), shape = RoundedCornerShape(14.dp))
            .border(1.dp, gradient, RoundedCornerShape(14.dp))
            .clickable(onClick = { onClick(voteId) })
    ) {
        Column(
            modifier = Modifier
                .padding(15.dp)
        ) {
            Box(
                modifier = Modifier
                    .offset(x = 8.dp)
            ) {
                Text(
                    text = title,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = DeepBlue
                )
            }
            Spacer(modifier = Modifier.height(8.dp))

            Log.d("getVoteList", "Middle check")

            images.chunked(2).forEach { rowItems ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                ) {
                    rowItems.forEach { item ->
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .aspectRatio(1.32f)
                                .padding(6.dp)
                        ) {
                            ImageCard(
                                image = PhotoInfoModel(rawPhotoUrl = item),
                                isSelectMode = false
                            )
                        }
                        if (rowItems.size < 2) {
                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .padding(6.dp)
                            )
                        }
                    }
                }

            }
        }
    }
}
