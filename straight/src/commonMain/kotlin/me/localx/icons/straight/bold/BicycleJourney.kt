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

public val Icons.Bold.BicycleJourney: ImageVector
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
                curveToRelative(0.011f, 0.0f, -0.566f, -1.0f, -0.566f, -1.0f)
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
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(19.5f, 13.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.019f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.5f)
                curveToRelative(2.485f, 0.0f, 4.5f, -2.015f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.015f, -4.5f, -4.5f, -4.5f)
                close()
            }
        }
        .build()
        return _bicycleJourney!!
    }

private var _bicycleJourney: ImageVector? = null
