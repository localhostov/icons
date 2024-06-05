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

public val Icons.Bold.LinkSlash: ImageVector
    get() {
        if (_linkSlash != null) {
            return _linkSlash!!
        }
        _linkSlash = Builder(name = "LinkSlash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.278f, 10.437f)
                curveToRelative(0.587f, -0.583f, 1.536f, -0.583f, 2.121f, 0.006f)
                curveToRelative(0.584f, 0.587f, 0.582f, 1.537f, -0.006f, 2.121f)
                lineToRelative(-1.145f, 1.138f)
                curveToRelative(-1.663f, 1.663f, -1.663f, 4.37f, 0.0f, 6.033f)
                curveToRelative(1.673f, 1.672f, 4.379f, 1.687f, 6.03f, 0.036f)
                lineToRelative(1.157f, -1.164f)
                curveToRelative(0.583f, -0.588f, 1.532f, -0.589f, 2.121f, -0.006f)
                curveToRelative(0.588f, 0.584f, 0.59f, 1.534f, 0.006f, 2.122f)
                lineToRelative(-1.16f, 1.167f)
                curveToRelative(-1.406f, 1.406f, -3.255f, 2.108f, -5.107f, 2.108f)
                curveToRelative(-1.868f, 0.0f, -3.741f, -0.714f, -5.168f, -2.141f)
                curveToRelative(-2.832f, -2.833f, -2.832f, -7.442f, 0.003f, -10.278f)
                lineToRelative(1.147f, -1.141f)
                close()
                moveTo(0.439f, 2.561f)
                curveToRelative(-0.586f, -0.585f, -0.586f, -1.536f, 0.0f, -2.121f)
                curveToRelative(0.586f, -0.586f, 1.535f, -0.586f, 2.121f, 0.0f)
                lineTo(7.92f, 5.799f)
                lineToRelative(3.677f, -3.67f)
                curveToRelative(2.832f, -2.833f, 7.443f, -2.833f, 10.275f, 0.0f)
                curveToRelative(2.832f, 2.833f, 2.832f, 7.442f, 0.0f, 10.274f)
                lineToRelative(-3.672f, 3.678f)
                lineToRelative(5.359f, 5.359f)
                curveToRelative(0.586f, 0.585f, 0.586f, 1.536f, 0.0f, 2.121f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                lineTo(0.439f, 2.561f)
                close()
                moveTo(19.751f, 10.283f)
                curveToRelative(1.662f, -1.664f, 1.662f, -4.37f, 0.0f, -6.033f)
                curveToRelative(-1.664f, -1.663f, -4.37f, -1.663f, -6.034f, 0.0f)
                lineToRelative(-3.676f, 3.669f)
                lineToRelative(1.958f, 1.958f)
                lineToRelative(2.44f, -2.439f)
                curveToRelative(0.586f, -0.585f, 1.535f, -0.585f, 2.121f, 0.0f)
                reflectiveCurveToRelative(0.586f, 1.536f, 0.0f, 2.122f)
                lineToRelative(-2.44f, 2.439f)
                lineToRelative(1.959f, 1.959f)
                lineToRelative(3.671f, -3.677f)
                close()
                moveTo(7.546f, 14.342f)
                curveToRelative(-0.643f, 0.522f, -0.74f, 1.467f, -0.218f, 2.11f)
                curveToRelative(0.296f, 0.365f, 0.729f, 0.554f, 1.165f, 0.554f)
                curveToRelative(0.332f, 0.0f, 0.667f, -0.11f, 0.945f, -0.336f)
                curveToRelative(0.643f, -0.522f, 0.744f, -1.47f, 0.222f, -2.113f)
                curveToRelative(-0.521f, -0.643f, -1.461f, -0.746f, -2.106f, -0.221f)
                lineToRelative(-0.008f, 0.006f)
                close()
            }
        }
        .build()
        return _linkSlash!!
    }

private var _linkSlash: ImageVector? = null
