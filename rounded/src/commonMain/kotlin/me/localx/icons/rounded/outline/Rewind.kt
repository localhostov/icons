package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.Rewind: ImageVector
    get() {
        if (_rewind != null) {
            return _rewind!!
        }
        _rewind = Builder(name = "Rewind", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.42f, 20.656f)
                arcToRelative(3.77f, 3.77f, 0.0f, false, true, -2.233f, -0.735f)
                lineToRelative(-6.641f, -4.87f)
                arcToRelative(3.784f, 3.784f, 0.0f, false, true, 0.0f, -6.1f)
                lineToRelative(6.641f, -4.87f)
                arcTo(3.783f, 3.783f, 0.0f, false, true, 14.2f, 6.853f)
                lineToRelative(3.782f, -2.774f)
                arcTo(3.784f, 3.784f, 0.0f, false, true, 24.0f, 7.13f)
                verticalLineToRelative(9.74f)
                arcToRelative(3.784f, 3.784f, 0.0f, false, true, -6.021f, 3.051f)
                lineTo(14.2f, 17.147f)
                arcToRelative(3.79f, 3.79f, 0.0f, false, true, -3.777f, 3.509f)
                close()
                moveTo(13.207f, 14.181f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.592f, 0.194f)
                lineToRelative(5.363f, 3.933f)
                arcTo(1.784f, 1.784f, 0.0f, false, false, 22.0f, 16.87f)
                lineTo(22.0f, 7.13f)
                arcToRelative(1.785f, 1.785f, 0.0f, false, false, -2.839f, -1.438f)
                lineTo(13.8f, 9.625f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.592f, -0.806f)
                lineTo(12.208f, 7.13f)
                arcTo(1.784f, 1.784f, 0.0f, false, false, 9.369f, 5.692f)
                lineToRelative(-6.64f, 4.87f)
                arcToRelative(1.783f, 1.783f, 0.0f, false, false, 0.0f, 2.876f)
                lineToRelative(6.64f, 4.87f)
                arcToRelative(1.784f, 1.784f, 0.0f, false, false, 2.838f, -1.438f)
                lineTo(12.207f, 15.181f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _rewind!!
    }

private var _rewind: ImageVector? = null
