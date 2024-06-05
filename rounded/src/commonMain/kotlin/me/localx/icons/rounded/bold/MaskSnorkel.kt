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

public val Icons.Bold.MaskSnorkel: ImageVector
    get() {
        if (_maskSnorkel != null) {
            return _maskSnorkel!!
        }
        _maskSnorkel = Builder(name = "MaskSnorkel", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.694f, 10.812f)
                curveToRelative(0.384f, -0.418f, 0.65f, -0.633f, 0.806f, -0.738f)
                curveToRelative(0.155f, 0.105f, 0.421f, 0.319f, 0.804f, 0.736f)
                curveToRelative(0.691f, 0.756f, 1.673f, 1.189f, 2.696f, 1.189f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(16.309f, 0.0f, 13.0f, 0.0f)
                horizontalLineToRelative(-7.0f)
                curveTo(2.691f, 0.0f, 0.0f, 2.691f, 0.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                curveToRelative(1.023f, 0.0f, 2.005f, -0.434f, 2.694f, -1.188f)
                close()
                moveTo(6.481f, 8.787f)
                curveToRelative(-0.125f, 0.138f, -0.296f, 0.213f, -0.481f, 0.213f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                curveToRelative(-0.185f, 0.0f, -0.356f, -0.075f, -0.483f, -0.215f)
                curveToRelative(-1.117f, -1.218f, -2.075f, -1.785f, -3.017f, -1.785f)
                reflectiveCurveToRelative(-1.9f, 0.567f, -3.019f, 1.787f)
                close()
                moveTo(24.0f, 1.5f)
                verticalLineToRelative(14.5f)
                curveToRelative(0.0f, 4.411f, -3.589f, 8.0f, -8.0f, 8.0f)
                reflectiveCurveToRelative(-8.0f, -3.589f, -8.0f, -8.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.828f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(21.0f, 1.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _maskSnorkel!!
    }

private var _maskSnorkel: ImageVector? = null
