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

public val Icons.Bold.VideoCameraAlt: ImageVector
    get() {
        if (_videoCameraAlt != null) {
            return _videoCameraAlt!!
        }
        _videoCameraAlt = Builder(name = "VideoCameraAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.925f, 5.695f)
                curveToRelative(-0.663f, -0.332f, -1.443f, -0.262f, -2.037f, 0.183f)
                lineToRelative(-1.944f, 1.882f)
                curveToRelative(-0.364f, -2.683f, -2.664f, -4.76f, -5.444f, -4.76f)
                lineTo(5.5f, 3.0f)
                curveTo(2.467f, 3.0f, 0.0f, 5.468f, 0.0f, 8.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 3.032f, 2.467f, 5.5f, 5.5f, 5.5f)
                lineTo(13.5f, 21.0f)
                curveToRelative(2.772f, 0.0f, 5.067f, -2.065f, 5.441f, -4.736f)
                lineToRelative(1.947f, 1.846f)
                curveToRelative(0.346f, 0.258f, 0.753f, 0.391f, 1.165f, 0.391f)
                curveToRelative(0.335f, 0.0f, 0.672f, -0.087f, 0.98f, -0.265f)
                curveToRelative(0.63f, -0.364f, 0.967f, -1.088f, 0.967f, -1.816f)
                lineTo(24.0f, 7.434f)
                curveToRelative(0.0f, -0.741f, -0.412f, -1.408f, -1.075f, -1.739f)
                close()
                moveTo(16.0f, 15.5f)
                curveToRelative(0.0f, 1.379f, -1.121f, 2.5f, -2.5f, 2.5f)
                lineTo(5.5f, 18.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.379f, 1.122f, -2.5f, 2.5f, -2.5f)
                lineTo(13.5f, 6.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(7.0f)
                close()
            }
        }
        .build()
        return _videoCameraAlt!!
    }

private var _videoCameraAlt: ImageVector? = null
