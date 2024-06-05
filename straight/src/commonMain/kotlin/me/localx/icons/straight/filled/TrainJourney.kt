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

public val Icons.Filled.TrainJourney: ImageVector
    get() {
        if (_trainJourney != null) {
            return _trainJourney!!
        }
        _trainJourney = Builder(name = "TrainJourney", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.473f, 8.543f)
                curveToRelative(-1.957f, -1.958f, -1.957f, -5.129f, -0.008f, -7.079f)
                curveToRelative(0.943f, -0.944f, 2.199f, -1.464f, 3.535f, -1.464f)
                reflectiveCurveToRelative(2.59f, 0.52f, 3.535f, 1.464f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.949f, 1.95f, 1.949f, 5.122f, 0.0f, 7.072f)
                lineToRelative(-3.535f, 3.458f)
                lineToRelative(-3.527f, -3.45f)
                close()
                moveTo(20.0f, 14.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(2.102f)
                lineToRelative(-0.027f, -0.027f)
                curveToRelative(-0.591f, -0.591f, -1.054f, -1.26f, -1.391f, -1.973f)
                horizontalLineToRelative(-0.683f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(5.39f, 15.0f)
                horizontalLineToRelative(-0.39f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.0f)
                lineTo(0.0f, 15.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.188f)
                lineToRelative(-0.884f, -2.266f)
                curveToRelative(-0.604f, -1.547f, -2.066f, -2.546f, -3.727f, -2.546f)
                close()
            }
        }
        .build()
        return _trainJourney!!
    }

private var _trainJourney: ImageVector? = null
