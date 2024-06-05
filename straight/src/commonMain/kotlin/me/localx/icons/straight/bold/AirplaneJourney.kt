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

public val Icons.Bold.AirplaneJourney: ImageVector
    get() {
        if (_airplaneJourney != null) {
            return _airplaneJourney!!
        }
        _airplaneJourney = Builder(name = "AirplaneJourney", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 19.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.654f)
                lineToRelative(-1.911f, 2.421f)
                curveToRelative(-0.195f, 0.357f, -0.569f, 0.579f, -0.975f, 0.579f)
                horizontalLineToRelative(-1.459f)
                lineToRelative(1.167f, -3.0f)
                horizontalLineToRelative(-1.83f)
                curveToRelative(-0.732f, 0.0f, -1.405f, -0.4f, -1.756f, -1.042f)
                lineToRelative(-0.977f, -1.791f)
                curveToRelative(-0.297f, -0.52f, 0.078f, -1.167f, 0.677f, -1.167f)
                curveToRelative(0.207f, 0.0f, 0.405f, 0.082f, 0.551f, 0.228f)
                lineToRelative(1.11f, 0.772f)
                horizontalLineToRelative(2.241f)
                lineToRelative(-1.184f, -3.0f)
                horizontalLineToRelative(1.442f)
                curveToRelative(0.407f, 0.0f, 0.781f, 0.222f, 0.975f, 0.579f)
                lineToRelative(1.929f, 2.421f)
                horizontalLineToRelative(1.654f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(19.5f, 13.0f)
                horizontalLineToRelative(-9.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.602f)
                lineToRelative(-0.024f, -0.023f)
                curveToRelative(-0.861f, -0.861f, -1.453f, -1.888f, -1.776f, -2.977f)
                horizontalLineToRelative(-1.801f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.019f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-6.55f)
                curveToRelative(0.024f, 0.165f, 0.05f, 0.329f, 0.05f, 0.5f)
                curveToRelative(0.0f, 0.952f, -0.383f, 1.813f, -1.0f, 2.444f)
                verticalLineToRelative(0.056f)
                horizontalLineToRelative(7.5f)
                curveToRelative(2.485f, 0.0f, 4.5f, -2.015f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.015f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(22.535f, 1.464f)
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
        return _airplaneJourney!!
    }

private var _airplaneJourney: ImageVector? = null
