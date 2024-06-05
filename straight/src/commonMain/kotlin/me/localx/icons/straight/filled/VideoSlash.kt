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

public val Icons.Filled.VideoSlash: ImageVector
    get() {
        if (_videoSlash != null) {
            return _videoSlash!!
        }
        _videoSlash = Builder(name = "VideoSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 4.086f)
                verticalLineToRelative(15.828f)
                lineToRelative(-3.0f, -3.0f)
                lineTo(21.0f, 7.086f)
                lineToRelative(3.0f, -3.0f)
                close()
                moveTo(19.0f, 17.586f)
                lineToRelative(4.957f, 4.957f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(0.042f, 1.457f)
                lineTo(1.457f, 0.043f)
                lineToRelative(3.957f, 3.957f)
                horizontalLineToRelative(10.586f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(10.586f)
                close()
                moveTo(0.77f, 5.013f)
                curveToRelative(-0.473f, 0.531f, -0.77f, 1.222f, -0.77f, 1.987f)
                verticalLineToRelative(13.0f)
                lineTo(15.757f, 20.0f)
                lineTo(0.77f, 5.013f)
                close()
            }
        }
        .build()
        return _videoSlash!!
    }

private var _videoSlash: ImageVector? = null
