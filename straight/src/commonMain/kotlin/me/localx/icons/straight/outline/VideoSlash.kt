package me.localx.icons.straight.outline

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

public val Icons.Outline.VideoSlash: ImageVector
    get() {
        if (_videoSlash != null) {
            return _videoSlash!!
        }
        _videoSlash = Builder(name = "VideoSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 19.914f)
                lineTo(24.0f, 4.086f)
                lineToRelative(-4.0f, 4.0f)
                verticalLineToRelative(-1.086f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(5.414f, 4.0f)
                lineTo(1.457f, 0.043f)
                lineTo(0.042f, 1.457f)
                lineTo(22.542f, 23.957f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-3.956f, -3.956f)
                verticalLineToRelative(-2.673f)
                lineToRelative(4.0f, 4.0f)
                close()
                moveTo(20.0f, 10.914f)
                lineToRelative(2.0f, -2.0f)
                verticalLineToRelative(6.172f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineToRelative(-2.172f)
                close()
                moveTo(18.0f, 16.587f)
                lineTo(7.413f, 6.0f)
                horizontalLineToRelative(9.587f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(9.587f)
                close()
                moveTo(13.757f, 18.0f)
                lineToRelative(2.0f, 2.0f)
                lineTo(0.0f, 20.0f)
                lineTo(0.0f, 7.0f)
                curveToRelative(0.0f, -0.765f, 0.297f, -1.457f, 0.77f, -1.987f)
                lineToRelative(1.426f, 1.426f)
                curveToRelative(-0.114f, 0.162f, -0.195f, 0.349f, -0.195f, 0.562f)
                verticalLineToRelative(11.0f)
                lineTo(13.757f, 18.001f)
                close()
            }
        }
        .build()
        return _videoSlash!!
    }

private var _videoSlash: ImageVector? = null
