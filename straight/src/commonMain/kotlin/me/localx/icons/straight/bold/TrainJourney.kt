package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.TrainJourney: ImageVector
    get() {
        if (_trainJourney != null) {
            return _trainJourney!!
        }
        _trainJourney = Builder(name = "TrainJourney", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.097f, 17.5f)
                curveToRelative(0.0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
                horizontalLineToRelative(-7.597f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(7.597f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -2.5f, -1.5f)
                horizontalLineToRelative(-6.097f)
                curveToRelative(-2.5f, 0.0f, -4.5f, -2.019f, -4.5f, -4.5f)
                curveToRelative(0.0f, -2.416f, 2.009f, -4.378f, 4.405f, -4.481f)
                curveToRelative(0.325f, 1.081f, 0.913f, 2.102f, 1.769f, 2.957f)
                lineToRelative(0.024f, 0.023f)
                horizontalLineToRelative(-1.602f)
                curveToRelative(-0.827f, 0.0f, -1.597f, 0.673f, -1.597f, 1.5f)
                reflectiveCurveToRelative(0.673f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(7.097f)
                curveToRelative(2.485f, 0.0f, 4.5f, 2.015f, 4.5f, 4.5f)
                close()
                moveTo(4.89f, 14.0f)
                lineTo(0.0f, 14.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 19.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.782f)
                lineToRelative(-0.918f, -2.354f)
                curveToRelative(-0.679f, -1.74f, -2.324f, -2.864f, -4.192f, -2.864f)
                close()
                moveTo(5.0f, 17.004f)
                curveToRelative(0.577f, 0.041f, 1.074f, 0.405f, 1.287f, 0.951f)
                lineToRelative(0.408f, 1.045f)
                horizontalLineToRelative(-1.695f)
                verticalLineToRelative(-1.996f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.535f, 1.464f)
                curveToRelative(-0.944f, -0.944f, -2.2f, -1.464f, -3.535f, -1.464f)
                reflectiveCurveToRelative(-2.591f, 0.52f, -3.536f, 1.464f)
                curveToRelative(-1.949f, 1.95f, -1.949f, 5.122f, 0.012f, 7.083f)
                lineToRelative(3.524f, 3.447f)
                lineToRelative(3.535f, -3.458f)
                curveToRelative(0.945f, -0.944f, 1.465f, -2.2f, 1.465f, -3.536f)
                reflectiveCurveToRelative(-0.52f, -2.591f, -1.465f, -3.536f)
                close()
                moveTo(19.0f, 7.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _trainJourney!!
    }

private var _trainJourney: ImageVector? = null
