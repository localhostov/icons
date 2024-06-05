package me.localx.icons.rounded.filled

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

public val Icons.Filled.MagnetUser: ImageVector
    get() {
        if (_magnetUser != null) {
            return _magnetUser!!
        }
        _magnetUser = Builder(name = "MagnetUser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 6.0f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                reflectiveCurveTo(14.691f, 0.0f, 18.0f, 0.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                close()
                moveTo(16.0f, 4.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                close()
                moveTo(20.776f, 8.87f)
                curveToRelative(-0.445f, -1.095f, -1.514f, -1.87f, -2.768f, -1.87f)
                horizontalLineToRelative(-0.016f)
                curveToRelative(-1.254f, 0.0f, -2.325f, 0.774f, -2.769f, 1.868f)
                curveToRelative(0.72f, 0.698f, 1.698f, 1.132f, 2.778f, 1.132f)
                reflectiveCurveToRelative(2.055f, -0.433f, 2.776f, -1.13f)
                close()
                moveTo(10.82f, 16.234f)
                lineToRelative(-2.135f, 2.133f)
                curveToRelative(-0.843f, 0.842f, -2.213f, 0.842f, -3.056f, 0.0f)
                curveToRelative(-0.842f, -0.843f, -0.842f, -2.213f, 0.0f, -3.056f)
                lineToRelative(2.135f, -2.133f)
                lineToRelative(-3.505f, -3.505f)
                lineToRelative(-2.178f, 2.177f)
                curveToRelative(-2.775f, 2.774f, -2.775f, 7.29f, 0.0f, 10.064f)
                curveToRelative(1.344f, 1.345f, 3.132f, 2.085f, 5.033f, 2.085f)
                reflectiveCurveToRelative(3.688f, -0.74f, 5.033f, -2.085f)
                lineToRelative(2.178f, -2.177f)
                lineToRelative(-3.504f, -3.504f)
                close()
                moveTo(15.739f, 18.325f)
                lineToRelative(0.7f, -0.7f)
                curveToRelative(0.586f, -0.586f, 0.586f, -1.536f, 0.0f, -2.122f)
                lineToRelative(-1.383f, -1.383f)
                curveToRelative(-0.586f, -0.586f, -1.535f, -0.586f, -2.121f, 0.0f)
                lineToRelative(-0.701f, 0.7f)
                lineToRelative(3.504f, 3.504f)
                close()
                moveTo(9.179f, 11.765f)
                lineToRelative(0.7f, -0.7f)
                curveToRelative(0.586f, -0.586f, 0.586f, -1.536f, 0.0f, -2.122f)
                lineToRelative(-1.383f, -1.383f)
                curveToRelative(-0.586f, -0.586f, -1.535f, -0.586f, -2.121f, 0.0f)
                lineToRelative(-0.701f, 0.7f)
                lineToRelative(3.504f, 3.504f)
                close()
            }
        }
        .build()
        return _magnetUser!!
    }

private var _magnetUser: ImageVector? = null
