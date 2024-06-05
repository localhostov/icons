package me.localx.icons.straight.bold

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

public val Icons.Bold.PlayPause: ImageVector
    get() {
        if (_playPause != null) {
            return _playPause!!
        }
        _playPause = Builder(name = "PlayPause", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 21.208f)
                lineTo(1.0f, 2.82f)
                lineToRelative(10.715f, 6.841f)
                curveToRelative(0.802f, 0.504f, 1.286f, 1.382f, 1.285f, 2.342f)
                curveToRelative(0.0f, 0.958f, -0.487f, 1.836f, -1.302f, 2.349f)
                lineTo(1.0f, 21.208f)
                close()
                moveTo(4.0f, 8.294f)
                verticalLineToRelative(7.428f)
                lineToRelative(5.806f, -3.721f)
                lineToRelative(-5.806f, -3.707f)
                close()
                moveTo(23.0f, 21.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(20.0f, 3.0f)
                horizontalLineToRelative(3.0f)
                lineTo(23.0f, 21.0f)
                close()
                moveTo(18.0f, 21.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(15.0f, 3.0f)
                horizontalLineToRelative(3.0f)
                lineTo(18.0f, 21.0f)
                close()
            }
        }
        .build()
        return _playPause!!
    }

private var _playPause: ImageVector? = null
