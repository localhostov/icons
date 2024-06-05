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

public val Icons.Bold.Watch: ImageVector
    get() {
        if (_watch != null) {
            return _watch!!
        }
        _watch = Builder(name = "Watch", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.561f, 12.439f)
                curveToRelative(0.586f, 0.586f, 0.586f, 1.535f, 0.0f, 2.121f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                lineToRelative(-1.5f, -1.5f)
                curveToRelative(-0.281f, -0.281f, -0.439f, -0.663f, -0.439f, -1.061f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(2.879f)
                lineToRelative(1.061f, 1.061f)
                close()
                moveTo(18.0f, 19.994f)
                verticalLineToRelative(2.505f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-0.96f)
                curveToRelative(-0.947f, 0.299f, -1.955f, 0.46f, -3.0f, 0.46f)
                reflectiveCurveToRelative(-2.053f, -0.161f, -3.0f, -0.46f)
                verticalLineToRelative(0.96f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-2.505f)
                curveToRelative(-2.427f, -1.826f, -4.0f, -4.73f, -4.0f, -7.995f)
                reflectiveCurveToRelative(1.573f, -6.169f, 4.0f, -7.995f)
                lineTo(6.0f, 1.5f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(0.96f)
                curveToRelative(0.947f, -0.299f, 1.955f, -0.46f, 3.0f, -0.46f)
                reflectiveCurveToRelative(2.053f, 0.161f, 3.0f, 0.46f)
                verticalLineToRelative(-0.96f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(2.505f)
                curveToRelative(2.427f, 1.826f, 4.0f, 4.73f, 4.0f, 7.995f)
                reflectiveCurveToRelative(-1.573f, 6.169f, -4.0f, 7.995f)
                close()
                moveTo(19.0f, 11.999f)
                curveToRelative(0.0f, -3.86f, -3.14f, -7.0f, -7.0f, -7.0f)
                reflectiveCurveToRelative(-7.0f, 3.14f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.14f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.141f, 7.0f, -7.0f)
                close()
            }
        }
        .build()
        return _watch!!
    }

private var _watch: ImageVector? = null
