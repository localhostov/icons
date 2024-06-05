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

public val Icons.Bold.TintSlash: ImageVector
    get() {
        if (_tintSlash != null) {
            return _tintSlash!!
        }
        _tintSlash = Builder(name = "TintSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.947f, 21.77f)
                curveToRelative(0.219f, 0.799f, -0.252f, 1.624f, -1.051f, 1.843f)
                curveToRelative(-0.941f, 0.257f, -1.916f, 0.388f, -2.896f, 0.388f)
                curveToRelative(-2.94f, 0.0f, -5.704f, -1.149f, -7.781f, -3.238f)
                curveTo(1.459f, 17.989f, 0.366f, 13.91f, 1.367f, 10.117f)
                curveToRelative(0.211f, -0.801f, 1.028f, -1.282f, 1.833f, -1.067f)
                curveToRelative(0.801f, 0.211f, 1.279f, 1.032f, 1.067f, 1.833f)
                curveToRelative(-0.73f, 2.767f, 0.066f, 5.742f, 2.078f, 7.764f)
                curveToRelative(1.51f, 1.518f, 3.519f, 2.354f, 5.654f, 2.354f)
                curveToRelative(0.713f, 0.0f, 1.421f, -0.095f, 2.104f, -0.282f)
                curveToRelative(0.802f, -0.219f, 1.625f, 0.253f, 1.843f, 1.052f)
                close()
                moveTo(23.561f, 23.561f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                lineTo(0.439f, 2.561f)
                curveTo(-0.146f, 1.975f, -0.146f, 1.025f, 0.439f, 0.439f)
                reflectiveCurveTo(1.975f, -0.146f, 2.561f, 0.439f)
                lineToRelative(3.239f, 3.239f)
                lineToRelative(2.227f, -2.068f)
                curveToRelative(1.044f, -1.027f, 2.466f, -1.61f, 3.973f, -1.61f)
                reflectiveCurveToRelative(2.928f, 0.582f, 4.004f, 1.64f)
                lineToRelative(3.734f, 3.466f)
                curveToRelative(3.757f, 3.774f, 4.298f, 9.615f, 1.436f, 13.947f)
                lineToRelative(2.387f, 2.387f)
                curveToRelative(0.586f, 0.586f, 0.586f, 1.535f, 0.0f, 2.121f)
                close()
                moveTo(7.922f, 5.801f)
                lineToRelative(11.069f, 11.069f)
                curveToRelative(1.716f, -3.09f, 1.224f, -7.034f, -1.337f, -9.606f)
                lineToRelative(-3.723f, -3.454f)
                curveToRelative(-1.085f, -1.064f, -2.81f, -1.036f, -3.833f, -0.03f)
                lineToRelative(-2.177f, 2.022f)
                close()
            }
        }
        .build()
        return _tintSlash!!
    }

private var _tintSlash: ImageVector? = null
