package me.localx.icons.straight.bold

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

public val Icons.Bold.MeterFire: ImageVector
    get() {
        if (_meterFire != null) {
            return _meterFire!!
        }
        _meterFire = Builder(name = "MeterFire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.0f, 12.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(10.5f, 12.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(10.542f, 20.871f)
                curveToRelative(-4.27f, -0.7f, -7.542f, -4.406f, -7.542f, -8.871f)
                curveTo(3.0f, 7.037f, 7.037f, 3.0f, 12.0f, 3.0f)
                curveToRelative(4.185f, 0.0f, 7.701f, 2.875f, 8.704f, 6.751f)
                curveToRelative(0.016f, 0.014f, 0.031f, 0.027f, 0.047f, 0.041f)
                curveToRelative(1.02f, 0.886f, 2.211f, 1.924f, 3.202f, 3.141f)
                curveToRelative(0.024f, -0.309f, 0.047f, -0.618f, 0.047f, -0.933f)
                curveTo(24.0f, 5.383f, 18.617f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                curveToRelative(0.232f, 0.0f, 0.459f, -0.022f, 0.688f, -0.035f)
                curveToRelative(-0.942f, -0.84f, -1.684f, -1.897f, -2.146f, -3.094f)
                close()
                moveTo(24.0f, 18.0f)
                curveToRelative(0.0f, 3.314f, -2.686f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.686f, -6.0f, -6.0f)
                curveToRelative(0.0f, -1.725f, 1.0f, -3.06f, 1.995f, -4.087f)
                curveToRelative(0.0f, 0.0f, 0.681f, 2.087f, 1.287f, 2.087f)
                curveToRelative(1.263f, 0.0f, 0.897f, -3.898f, 2.718f, -6.0f)
                curveToRelative(1.895f, 1.895f, 6.0f, 4.526f, 6.0f, 8.0f)
                close()
                moveTo(19.414f, 18.585f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-1.415f, -1.415f)
                lineToRelative(-1.415f, 1.415f)
                curveToRelative(-0.781f, 0.781f, -0.781f, 2.048f, 0.0f, 2.829f)
                curveToRelative(0.781f, 0.781f, 2.048f, 0.781f, 2.829f, 0.0f)
                reflectiveCurveToRelative(0.781f, -2.048f, 0.0f, -2.829f)
                close()
                moveTo(16.488f, 8.691f)
                lineToRelative(1.512f, -1.69f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.306f, -0.806f, 0.877f, -1.604f, 1.488f, -2.31f)
                close()
            }
        }
        .build()
        return _meterFire!!
    }

private var _meterFire: ImageVector? = null
