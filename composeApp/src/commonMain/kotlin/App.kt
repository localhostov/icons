import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastFilter
import com.dokar.sonner.ToastType
import com.dokar.sonner.Toaster
import com.dokar.sonner.rememberToasterState
import me.localx.icons.rounded.Icons
import me.localx.icons.rounded.allIconsList
import me.localx.icons.rounded.outline.Check
import me.localx.icons.rounded.outline.Cross
import me.localx.icons.straight.allIconsList
import org.jetbrains.compose.ui.tooling.preview.Preview
import views.ActionsView

enum class IconMode {
    Outline,
    Bold,
    Filled
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
@Preview
fun App() {
    val clipboard = LocalClipboardManager.current

    val toaster = rememberToasterState()

    var isRoundedIcons by remember { mutableStateOf(false) }
    var mode by remember { mutableStateOf(IconMode.Outline) }
    var query by remember { mutableStateOf("") }
    val icons = remember(mode, query, isRoundedIcons) {
        val icons = when (mode) {
            IconMode.Outline -> if (isRoundedIcons) {
                me.localx.icons.rounded.Icons.Outline.allIconsList
            } else {
                me.localx.icons.straight.Icons.Outline.allIconsList
            }
            IconMode.Bold -> if (isRoundedIcons) {
                me.localx.icons.rounded.Icons.Bold.allIconsList
            } else {
                me.localx.icons.straight.Icons.Bold.allIconsList
            }
            IconMode.Filled -> if (isRoundedIcons) {
                me.localx.icons.rounded.Icons.Filled.allIconsList
            } else {
                me.localx.icons.straight.Icons.Filled.allIconsList
            }
        }

        icons.fastFilter {
            it.name.contains(query, ignoreCase = true)
        }
    }

    fun copyIcon(icon: ImageVector) {
        val import = when (mode) {
            IconMode.Outline -> "Icons.Outline.${icon.name}"
            IconMode.Bold -> "Icons.Bold.${icon.name}"
            IconMode.Filled -> "Icons.Filled.${icon.name}"
        }

        clipboard.setText(buildAnnotatedString {
            append(import)
        })

        toaster.show(
            message = "copied to clipboard",
            type = ToastType.Success,
            icon = Icons.Outline.Check
        )
    }

    Toaster(state = toaster)

    MaterialTheme(colorScheme = darkColorScheme()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .navigationBarsPadding()
                .statusBarsPadding()
                .padding(16.dp)
        ) {
            TextField(
                value = query,
                onValueChange = { query = it },
                modifier = Modifier.fillMaxWidth(),
                placeholder = {
                    Text(text = "Search")
                },
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.DarkGray,
                    unfocusedContainerColor = Color.DarkGray,
                    focusedTextColor = MaterialTheme.colorScheme.onBackground,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                shape = RoundedCornerShape(14.dp),
                trailingIcon = {
                    if (query.isNotEmpty()) {
                        Icon(
                            painter = rememberVectorPainter(Icons.Outline.Cross),
                            tint = Color.Gray,
                            contentDescription = null,
                            modifier = Modifier
                                .size(20.dp)
                                .clickable { query = "" }
                                .pointerHoverIcon(PointerIcon.Hand)
                        )
                    }
                }
            )

            LazyVerticalGrid(
                columns = GridCells.Adaptive(24.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                item(span = { GridItemSpan(maxLineSpan) }) {
                    ActionsView(
                        query = query,
                        mode = mode,
                        onChangeMode = { mode = it },
                        isNotFound = icons.isEmpty(),
                        isRoundedIcons = isRoundedIcons,
                        onChangeRoundedIcons = { isRoundedIcons = it }
                    )
                }

                items(
                    items = icons,
                    key = { it.name }
                ) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .animateItemPlacement()
                            .requiredSize(36.dp)
                            .clip(RoundedCornerShape(6.dp))
                            .background(iconCardColor)
                            .clickable {
                                copyIcon(it)
                            }
                            .pointerHoverIcon(PointerIcon.Hand)
                    ) {
                        Icon(
                            painter = rememberVectorPainter(it),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp),
                            tint = iconColor
                        )
                    }
                }
            }
        }
    }
}

val iconColor = Color(0xffffffff)
val iconCardColor = Color(0xff2d2d2d)
