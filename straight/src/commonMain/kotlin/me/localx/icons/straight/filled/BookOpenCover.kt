package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.BookOpenCover: ImageVector
    get() {
        if (_bookOpenCover != null) {
            return _bookOpenCover!!
        }
        _bookOpenCover = Builder(name = "BookOpenCover", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 3.0f)
                lineTo(24.0f, 20.611f)
                lineToRelative(-12.0f, 3.429f)
                lineTo(0.0f, 20.611f)
                lineTo(0.0f, 4.0f)
                curveToRelative(0.0f, -0.95f, 0.435f, -1.823f, 1.194f, -2.395f)
                curveToRelative(0.249f, -0.188f, 0.523f, -0.316f, 0.806f, -0.418f)
                lineTo(2.0f, 19.103f)
                lineToRelative(10.0f, 2.857f)
                lineToRelative(10.0f, -2.857f)
                lineTo(22.0f, 0.187f)
                curveToRelative(0.283f, 0.102f, 0.558f, 0.23f, 0.806f, 0.418f)
                curveToRelative(0.759f, 0.572f, 1.194f, 1.445f, 1.194f, 2.395f)
                close()
                moveTo(13.0f, 3.371f)
                verticalLineToRelative(14.263f)
                lineToRelative(-1.0f, 0.286f)
                lineToRelative(-1.0f, -0.286f)
                lineTo(11.0f, 3.371f)
                curveToRelative(0.0f, -1.332f, -0.895f, -2.519f, -2.251f, -2.903f)
                lineTo(7.08f, 0.069f)
                curveToRelative(-1.571f, -0.375f, -3.08f, 0.817f, -3.08f, 2.432f)
                verticalLineToRelative(15.213f)
                lineToRelative(8.0f, 2.286f)
                lineToRelative(8.0f, -2.286f)
                lineTo(20.0f, 2.535f)
                curveToRelative(0.0f, -1.597f, -1.477f, -2.785f, -3.037f, -2.442f)
                lineToRelative(-1.788f, 0.393f)
                curveToRelative(-1.281f, 0.366f, -2.176f, 1.553f, -2.176f, 2.885f)
                close()
            }
        }
        .build()
        return _bookOpenCover!!
    }

private var _bookOpenCover: ImageVector? = null
