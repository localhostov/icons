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

public val Icons.Bold.HouseSignal: ImageVector
    get() {
        if (_houseSignal != null) {
            return _houseSignal!!
        }
        _houseSignal = Builder(name = "HouseSignal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 8.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(1.5f, 21.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(1.5f, 16.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -3.584f, -2.916f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(1.5f, 11.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(4.687f, 0.0f, 8.5f, 3.813f, 8.5f, 8.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -6.341f, -5.159f, -11.5f, -11.5f, -11.5f)
                close()
                moveTo(22.529f, 4.466f)
                lineToRelative(-4.667f, -3.652f)
                curveToRelative(-1.391f, -1.089f, -3.334f, -1.089f, -4.725f, 0.0f)
                lineToRelative(-4.666f, 3.652f)
                curveToRelative(-0.936f, 0.731f, -1.472f, 1.832f, -1.472f, 3.019f)
                verticalLineToRelative(2.601f)
                curveToRelative(1.073f, 0.44f, 2.074f, 1.011f, 3.0f, 1.683f)
                verticalLineToRelative(-4.285f)
                curveToRelative(0.0f, -0.258f, 0.116f, -0.498f, 0.32f, -0.657f)
                lineToRelative(4.667f, -3.652f)
                curveToRelative(0.301f, -0.236f, 0.725f, -0.236f, 1.025f, 0.0f)
                lineToRelative(4.668f, 3.652f)
                curveToRelative(0.203f, 0.159f, 0.319f, 0.398f, 0.319f, 0.657f)
                verticalLineToRelative(6.515f)
                horizontalLineToRelative(-8.77f)
                curveToRelative(0.672f, 0.926f, 1.243f, 1.927f, 1.683f, 3.0f)
                horizontalLineToRelative(10.087f)
                lineTo(23.998f, 7.485f)
                curveToRelative(0.0f, -1.188f, -0.536f, -2.288f, -1.471f, -3.019f)
                close()
            }
        }
        .build()
        return _houseSignal!!
    }

private var _houseSignal: ImageVector? = null
