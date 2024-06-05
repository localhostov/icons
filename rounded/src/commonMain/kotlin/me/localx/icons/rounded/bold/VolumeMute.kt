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

public val Icons.Bold.VolumeMute: ImageVector
    get() {
        if (_volumeMute != null) {
            return _volumeMute!!
        }
        _volumeMute = Builder(name = "VolumeMute", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.599f, 13.439f)
                curveToRelative(0.586f, 0.585f, 0.586f, 1.536f, 0.0f, 2.121f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                lineToRelative(-1.439f, -1.439f)
                lineToRelative(-1.439f, 1.439f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                curveToRelative(-0.586f, -0.585f, -0.586f, -1.536f, 0.0f, -2.121f)
                lineToRelative(1.439f, -1.439f)
                lineToRelative(-1.439f, -1.439f)
                curveToRelative(-0.586f, -0.585f, -0.586f, -1.536f, 0.0f, -2.121f)
                curveToRelative(0.586f, -0.586f, 1.535f, -0.586f, 2.121f, 0.0f)
                lineToRelative(1.439f, 1.439f)
                lineToRelative(1.439f, -1.439f)
                curveToRelative(0.586f, -0.586f, 1.535f, -0.586f, 2.121f, 0.0f)
                curveToRelative(0.586f, 0.585f, 0.586f, 1.536f, 0.0f, 2.121f)
                lineToRelative(-1.439f, 1.439f)
                lineToRelative(1.439f, 1.439f)
                close()
                moveTo(13.455f, 0.343f)
                curveToRelative(0.345f, 0.285f, 0.545f, 0.709f, 0.545f, 1.157f)
                verticalLineToRelative(21.0f)
                curveToRelative(0.0f, 0.448f, -0.2f, 0.872f, -0.545f, 1.157f)
                curveToRelative(-0.271f, 0.224f, -0.609f, 0.343f, -0.955f, 0.343f)
                curveToRelative(-0.095f, 0.0f, -0.19f, -0.009f, -0.284f, -0.027f)
                curveToRelative(-3.213f, -0.62f, -5.267f, -2.709f, -6.596f, -4.473f)
                horizontalLineToRelative(-0.62f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(0.251f)
                curveTo(7.166f, 2.19f, 9.451f, 0.561f, 12.216f, 0.027f)
                curveToRelative(0.436f, -0.088f, 0.894f, 0.031f, 1.239f, 0.316f)
                close()
                moveTo(11.0f, 3.587f)
                curveToRelative(-1.363f, 0.701f, -2.553f, 1.911f, -3.658f, 3.701f)
                curveToRelative(-0.273f, 0.442f, -0.756f, 0.712f, -1.276f, 0.712f)
                horizontalLineToRelative(-1.065f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(1.385f)
                curveToRelative(0.49f, 0.0f, 0.949f, 0.239f, 1.229f, 0.641f)
                curveToRelative(1.097f, 1.569f, 2.185f, 2.626f, 3.386f, 3.261f)
                lineTo(11.001f, 3.587f)
                close()
            }
        }
        .build()
        return _volumeMute!!
    }

private var _volumeMute: ImageVector? = null
