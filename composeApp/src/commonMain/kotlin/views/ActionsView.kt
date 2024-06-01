package views

import IconMode
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.LazyGridItemScope
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import iconCardColor
import iconColor
import me.localx.icons.rounded.Icons
import me.localx.icons.rounded.bold.Sticker
import me.localx.icons.rounded.filled.Sticker
import me.localx.icons.rounded.outline.Sticker

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun LazyGridItemScope.ActionsView(
    query: String,
    mode: IconMode,
    onChangeMode: (IconMode) -> Unit,
    isNotFound: Boolean,
    isRoundedIcons: Boolean,
    onChangeRoundedIcons: (Boolean) -> Unit
) {
    Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Straight",
                    color = MaterialTheme.colorScheme.onBackground
                )

                Switch(
                    checked = isRoundedIcons,
                    onCheckedChange = onChangeRoundedIcons,
                    colors = SwitchDefaults.colors(
                        uncheckedThumbColor = SwitchDefaults.colors().checkedThumbColor,
                        uncheckedTrackColor = SwitchDefaults.colors().checkedTrackColor,
                        uncheckedBorderColor = SwitchDefaults.colors().checkedBorderColor,
                    ),
                    thumbContent = {}
                )

                Text(
                    text = "Rounded",
                    color = MaterialTheme.colorScheme.onBackground
                )
            }

            Row(
                modifier = Modifier
                    .clip(RoundedCornerShape(6.dp))
                    .border(1.dp, iconCardColor, RoundedCornerShape(6.dp))
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .animateItemPlacement()
                        .requiredSize(36.dp)
                        .background(if (mode == IconMode.Outline) iconCardColor else Color.Transparent)
                        .clickable {
                            onChangeMode(IconMode.Outline)
                        }
                        .pointerHoverIcon(PointerIcon.Hand)
                ) {
                    Icon(
                        painter = rememberVectorPainter(Icons.Outline.Sticker),
                        contentDescription = null,
                        modifier = Modifier.size(24.dp),
                        tint = iconColor
                    )
                }

                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .animateItemPlacement()
                        .requiredSize(36.dp)
                        .background(if (mode == IconMode.Bold) iconCardColor else Color.Transparent)
                        .clickable {
                            onChangeMode(IconMode.Bold)
                        }
                        .pointerHoverIcon(PointerIcon.Hand)
                ) {
                    Icon(
                        painter = rememberVectorPainter(Icons.Bold.Sticker),
                        contentDescription = null,
                        modifier = Modifier.size(24.dp),
                        tint = iconColor
                    )
                }

                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .animateItemPlacement()
                        .requiredSize(36.dp)
                        .background(if (mode == IconMode.Filled) iconCardColor else Color.Transparent)
                        .clickable {
                            onChangeMode(IconMode.Filled)
                        }
                        .pointerHoverIcon(PointerIcon.Hand)
                ) {
                    Icon(
                        painter = rememberVectorPainter(Icons.Filled.Sticker),
                        contentDescription = null,
                        modifier = Modifier.size(24.dp),
                        tint = iconColor
                    )
                }
            }
        }

        if (isNotFound) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxWidth().padding(vertical = 24.dp)
            ) {
                Text(
                    text = "Icons with name «${query}» not found",
                    textAlign = TextAlign.Center,
                    color = Color.White
                )
            }
        }
    }
}