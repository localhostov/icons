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

public val Icons.Outline.HouseCircleXmark: ImageVector
    get() {
        if (_houseCircleXmark != null) {
            return _houseCircleXmark!!
        }
        _houseCircleXmark = Builder(name = "HouseCircleXmark", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 10.074f)
                verticalLineToRelative(1.275f)
                curveToRelative(-0.639f, -0.791f, -1.412f, -1.465f, -2.281f, -2.002f)
                curveToRelative(-0.043f, -0.049f, -0.088f, -0.097f, -0.14f, -0.138f)
                lineTo(12.674f, 2.232f)
                curveToRelative(-0.396f, -0.311f, -0.951f, -0.311f, -1.348f, 0.0f)
                lineTo(2.421f, 9.209f)
                curveToRelative(-0.268f, 0.21f, -0.421f, 0.525f, -0.421f, 0.865f)
                verticalLineToRelative(11.926f)
                horizontalLineToRelative(7.518f)
                curveToRelative(0.506f, 0.756f, 1.125f, 1.429f, 1.831f, 2.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-13.926f)
                curveToRelative(0.0f, -0.959f, 0.433f, -1.848f, 1.187f, -2.439f)
                lineTo(10.092f, 0.658f)
                curveToRelative(1.125f, -0.881f, 2.691f, -0.881f, 3.816f, 0.0f)
                lineToRelative(8.905f, 6.977f)
                curveToRelative(0.754f, 0.592f, 1.187f, 1.48f, 1.187f, 2.439f)
                close()
                moveTo(24.0f, 17.0f)
                curveToRelative(0.0f, 3.859f, -3.141f, 7.0f, -7.0f, 7.0f)
                reflectiveCurveToRelative(-7.0f, -3.141f, -7.0f, -7.0f)
                reflectiveCurveToRelative(3.141f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.141f, 7.0f, 7.0f)
                close()
                moveTo(22.0f, 17.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.243f, 5.0f, -5.0f)
                close()
                moveTo(18.543f, 14.043f)
                lineToRelative(-1.543f, 1.543f)
                lineToRelative(-1.543f, -1.543f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(1.543f, 1.543f)
                lineToRelative(-1.543f, 1.543f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.543f, -1.543f)
                lineToRelative(1.543f, 1.543f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-1.543f, -1.543f)
                lineToRelative(1.543f, -1.543f)
                lineToRelative(-1.414f, -1.414f)
                close()
            }
        }
        .build()
        return _houseCircleXmark!!
    }

private var _houseCircleXmark: ImageVector? = null
