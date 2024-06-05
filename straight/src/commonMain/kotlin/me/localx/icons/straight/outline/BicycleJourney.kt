package me.localx.icons.straight.outline

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

public val Icons.Outline.BicycleJourney: ImageVector
    get() {
        if (_bicycleJourney != null) {
            return _bicycleJourney!!
        }
        _bicycleJourney = Builder(name = "BicycleJourney", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 21.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                curveToRelative(0.0f, -0.61f, 0.218f, -1.168f, 0.581f, -1.602f)
                lineToRelative(-0.208f, -0.417f)
                lineToRelative(-1.64f, 0.894f)
                curveToRelative(0.171f, 0.338f, 0.267f, 0.72f, 0.267f, 1.124f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                curveToRelative(0.011f, 0.0f, 0.023f, 0.0f, 0.034f, 0.0f)
                lineToRelative(-0.601f, -1.001f)
                horizontalLineToRelative(-0.934f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.066f)
                lineToRelative(1.359f, 2.265f)
                lineToRelative(1.052f, -0.574f)
                lineToRelative(-0.478f, -0.956f)
                verticalLineToRelative(-1.736f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.632f)
                lineToRelative(1.002f, 2.003f)
                curveToRelative(0.043f, -0.002f, 0.087f, -0.003f, 0.13f, -0.003f)
                curveToRelative(1.381f, 0.0f, 2.5f, 1.119f, 2.5f, 2.5f)
                close()
                moveTo(20.0f, 5.0f)
                lineToRelative(4.0f, -2.5f)
                lineToRelative(-4.0f, -2.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(20.0f, 14.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _bicycleJourney!!
    }

private var _bicycleJourney: ImageVector? = null
