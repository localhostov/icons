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

public val Icons.Bold.VideoSlash: ImageVector
    get() {
        if (_videoSlash != null) {
            return _videoSlash!!
        }
        _videoSlash = Builder(name = "VideoSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 6.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(5.105f, 3.0f)
                lineTo(2.115f, 0.01f)
                lineTo(-0.006f, 2.131f)
                lineTo(21.869f, 24.006f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-2.99f, -2.99f)
                verticalLineToRelative(-2.895f)
                lineToRelative(3.0f, 3.0f)
                lineTo(24.0f, 5.019f)
                lineToRelative(-3.0f, 3.0f)
                verticalLineToRelative(-1.519f)
                close()
                moveTo(8.105f, 6.0f)
                horizontalLineToRelative(9.395f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                lineTo(18.0f, 15.895f)
                lineTo(8.105f, 6.0f)
                close()
                moveTo(13.035f, 18.0f)
                lineToRelative(3.0f, 3.0f)
                lineTo(0.0f, 21.0f)
                lineTo(0.0f, 6.5f)
                curveToRelative(0.0f, -0.454f, 0.093f, -0.884f, 0.251f, -1.283f)
                lineToRelative(2.749f, 2.749f)
                verticalLineToRelative(10.034f)
                lineTo(13.034f, 18.0f)
                close()
            }
        }
        .build()
        return _videoSlash!!
    }

private var _videoSlash: ImageVector? = null
