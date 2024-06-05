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

public val Icons.Bold.VideoArrowDownLeft: ImageVector
    get() {
        if (_videoArrowDownLeft != null) {
            return _videoArrowDownLeft!!
        }
        _videoArrowDownLeft = Builder(name = "VideoArrowDownLeft", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.561f, 8.439f)
                curveToRelative(0.586f, 0.585f, 0.586f, 1.536f, 0.0f, 2.121f)
                lineToRelative(-2.912f, 2.912f)
                lineToRelative(1.106f, 1.106f)
                curveToRelative(0.525f, 0.525f, 0.153f, 1.422f, -0.589f, 1.422f)
                horizontalLineToRelative(-3.969f)
                curveToRelative(-0.661f, 0.0f, -1.196f, -0.536f, -1.196f, -1.196f)
                verticalLineToRelative(-3.969f)
                curveToRelative(0.0f, -0.742f, 0.897f, -1.114f, 1.422f, -0.589f)
                lineToRelative(1.106f, 1.106f)
                lineToRelative(2.912f, -2.912f)
                curveToRelative(0.586f, -0.586f, 1.535f, -0.586f, 2.121f, 0.0f)
                close()
                moveTo(24.0f, 7.433f)
                verticalLineToRelative(8.984f)
                curveToRelative(0.0f, 0.728f, -0.337f, 1.452f, -0.967f, 1.816f)
                curveToRelative(-0.308f, 0.178f, -0.644f, 0.265f, -0.98f, 0.265f)
                curveToRelative(-0.412f, 0.0f, -0.819f, -0.132f, -1.165f, -0.391f)
                lineToRelative(-1.947f, -1.846f)
                curveToRelative(-0.374f, 2.672f, -2.668f, 4.736f, -5.441f, 4.736f)
                lineTo(5.5f, 20.997f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                verticalLineToRelative(-7.0f)
                curveTo(0.0f, 5.467f, 2.467f, 3.0f, 5.5f, 3.0f)
                lineTo(13.5f, 3.0f)
                curveToRelative(2.781f, 0.0f, 5.081f, 2.077f, 5.444f, 4.76f)
                lineToRelative(1.944f, -1.882f)
                curveToRelative(0.594f, -0.445f, 1.374f, -0.515f, 2.037f, -0.183f)
                curveToRelative(0.663f, 0.331f, 1.075f, 0.998f, 1.075f, 1.739f)
                close()
                moveTo(16.0f, 8.499f)
                curveToRelative(0.0f, -1.378f, -1.122f, -2.5f, -2.5f, -2.5f)
                lineTo(5.5f, 5.999f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.378f, 1.122f, 2.5f, 2.5f, 2.5f)
                lineTo(13.5f, 17.999f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                verticalLineToRelative(-7.0f)
                close()
            }
        }
        .build()
        return _videoArrowDownLeft!!
    }

private var _videoArrowDownLeft: ImageVector? = null
