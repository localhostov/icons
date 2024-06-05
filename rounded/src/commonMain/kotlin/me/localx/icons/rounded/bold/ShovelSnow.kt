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

public val Icons.Bold.ShovelSnow: ImageVector
    get() {
        if (_shovelSnow != null) {
            return _shovelSnow!!
        }
        _shovelSnow = Builder(name = "ShovelSnow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.561f, 4.439f)
                lineTo(19.561f, 0.439f)
                curveToRelative(-0.586f, -0.586f, -1.535f, -0.586f, -2.121f, 0.0f)
                curveToRelative(-0.586f, 0.585f, -0.586f, 1.536f, 0.0f, 2.121f)
                lineToRelative(0.939f, 0.939f)
                lineToRelative(-6.382f, 6.382f)
                lineToRelative(-1.141f, -1.141f)
                curveToRelative(-0.795f, -0.795f, -1.853f, -1.234f, -2.978f, -1.234f)
                reflectiveCurveToRelative(-2.183f, 0.438f, -2.978f, 1.234f)
                curveToRelative(0.0f, 0.001f, -0.002f, 0.002f, -0.003f, 0.004f)
                lineTo(0.732f, 12.939f)
                curveToRelative(-0.472f, 0.472f, -0.732f, 1.1f, -0.732f, 1.768f)
                reflectiveCurveToRelative(0.26f, 1.296f, 0.732f, 1.768f)
                lineToRelative(6.824f, 6.824f)
                curveToRelative(0.487f, 0.487f, 1.126f, 0.73f, 1.766f, 0.73f)
                reflectiveCurveToRelative(1.283f, -0.245f, 1.773f, -0.734f)
                lineToRelative(4.164f, -4.195f)
                curveToRelative(1.642f, -1.642f, 1.642f, -4.313f, 0.0f, -5.956f)
                lineToRelative(-1.141f, -1.141f)
                lineToRelative(6.382f, -6.382f)
                lineToRelative(0.939f, 0.939f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                curveToRelative(0.586f, -0.585f, 0.586f, -1.536f, 0.0f, -2.121f)
                close()
                moveTo(13.135f, 16.982f)
                lineToRelative(-3.812f, 3.84f)
                lineToRelative(-2.012f, -2.012f)
                lineToRelative(2.25f, -2.25f)
                curveToRelative(0.586f, -0.585f, 0.586f, -1.536f, 0.0f, -2.121f)
                curveToRelative(-0.586f, -0.586f, -1.535f, -0.586f, -2.121f, 0.0f)
                lineToRelative(-2.25f, 2.25f)
                lineToRelative(-1.984f, -1.984f)
                lineToRelative(3.818f, -3.846f)
                curveToRelative(0.457f, -0.456f, 1.254f, -0.455f, 1.711f, 0.002f)
                lineToRelative(4.404f, 4.404f)
                curveToRelative(0.472f, 0.473f, 0.472f, 1.241f, -0.004f, 1.717f)
                close()
            }
        }
        .build()
        return _shovelSnow!!
    }

private var _shovelSnow: ImageVector? = null
