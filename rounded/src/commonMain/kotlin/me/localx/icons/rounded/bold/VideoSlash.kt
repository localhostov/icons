package me.localx.icons.rounded.bold

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
                moveTo(14.5f, 19.5f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.378f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
                moveTo(19.0f, 15.5f)
                curveToRelative(0.0f, 0.417f, -0.06f, 0.825f, -0.152f, 1.227f)
                lineToRelative(4.713f, 4.713f)
                curveToRelative(0.586f, 0.585f, 0.586f, 1.536f, 0.0f, 2.121f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                lineTo(0.439f, 2.561f)
                curveTo(-0.146f, 1.975f, -0.146f, 1.025f, 0.439f, 0.439f)
                curveTo(1.025f, -0.146f, 1.975f, -0.146f, 2.561f, 0.439f)
                lineToRelative(2.583f, 2.583f)
                curveToRelative(0.119f, -0.008f, 0.236f, -0.022f, 0.357f, -0.022f)
                lineTo(13.5f, 3.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, 2.467f, 5.5f, 5.5f)
                verticalLineToRelative(0.718f)
                lineToRelative(1.888f, -1.828f)
                curveToRelative(0.594f, -0.445f, 1.374f, -0.515f, 2.037f, -0.183f)
                curveToRelative(0.663f, 0.331f, 1.075f, 0.998f, 1.075f, 1.739f)
                verticalLineToRelative(5.971f)
                curveToRelative(0.0f, 0.728f, -0.337f, 1.452f, -0.967f, 1.816f)
                curveToRelative(-0.308f, 0.178f, -0.644f, 0.265f, -0.98f, 0.265f)
                curveToRelative(-0.412f, 0.0f, -0.819f, -0.132f, -1.165f, -0.391f)
                lineToRelative(-1.888f, -1.789f)
                verticalLineToRelative(0.68f)
                close()
                moveTo(16.0f, 13.879f)
                verticalLineToRelative(-5.379f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-5.379f)
                lineToRelative(7.879f, 7.879f)
                close()
            }
        }
        .build()
        return _videoSlash!!
    }

private var _videoSlash: ImageVector? = null
