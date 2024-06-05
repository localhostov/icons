package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.MeterFire: ImageVector
    get() {
        if (_meterFire != null) {
            return _meterFire!!
        }
        _meterFire = Builder(name = "MeterFire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 18.0f)
                curveToRelative(0.0f, -2.543f, 1.46f, -4.345f, 2.559f, -5.479f)
                lineToRelative(1.474f, -1.521f)
                horizontalLineToRelative(-1.032f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.037f)
                curveToRelative(0.294f, -0.226f, 2.0f, -1.938f, 2.0f, -1.938f)
                verticalLineToRelative(-1.099f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.172f)
                reflectiveCurveToRelative(1.244f, 1.181f, 1.751f, 1.62f)
                curveToRelative(1.023f, 0.888f, 2.22f, 1.928f, 3.212f, 3.149f)
                curveToRelative(0.024f, -0.31f, 0.037f, -0.624f, 0.037f, -0.941f)
                curveTo(24.0f, 5.383f, 18.617f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                curveToRelative(0.232f, 0.0f, 0.463f, -0.007f, 0.692f, -0.02f)
                curveToRelative(-1.65f, -1.466f, -2.692f, -3.604f, -2.692f, -5.98f)
                close()
                moveTo(7.0f, 11.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(9.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(18.0f, 10.0f)
                curveToRelative(-1.821f, 2.103f, -1.455f, 6.0f, -2.718f, 6.0f)
                curveToRelative(-0.606f, 0.0f, -1.287f, -2.087f, -1.287f, -2.087f)
                curveToRelative(-0.995f, 1.027f, -1.995f, 2.361f, -1.995f, 4.087f)
                curveToRelative(0.0f, 3.314f, 2.686f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.686f, 6.0f, -6.0f)
                curveToRelative(0.0f, -3.474f, -4.105f, -6.105f, -6.0f, -8.0f)
                close()
                moveTo(19.414f, 21.414f)
                curveToRelative(-0.781f, 0.781f, -2.048f, 0.781f, -2.829f, 0.0f)
                curveToRelative(-0.781f, -0.782f, -0.781f, -2.048f, 0.0f, -2.829f)
                lineToRelative(1.415f, -1.415f)
                lineToRelative(1.415f, 1.415f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.781f, 0.782f, 0.781f, 2.048f, 0.0f, 2.829f)
                close()
            }
        }
        .build()
        return _meterFire!!
    }

private var _meterFire: ImageVector? = null
