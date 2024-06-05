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

public val Icons.Bold.DriverWoman: ImageVector
    get() {
        if (_driverWoman != null) {
            return _driverWoman!!
        }
        _driverWoman = Builder(name = "DriverWoman", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 24.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.346f, -3.0f, 3.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.0f, -3.309f, 2.691f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                close()
                moveTo(20.771f, 17.989f)
                curveToRelative(-0.671f, -2.349f, -2.846f, -3.989f, -5.289f, -3.989f)
                horizontalLineToRelative(-6.966f)
                curveToRelative(-2.442f, 0.0f, -4.617f, 1.64f, -5.289f, 3.989f)
                lineToRelative(-1.717f, 6.011f)
                horizontalLineToRelative(3.12f)
                lineToRelative(1.482f, -5.187f)
                curveToRelative(0.305f, -1.067f, 1.293f, -1.813f, 2.404f, -1.813f)
                horizontalLineToRelative(6.966f)
                curveToRelative(1.11f, 0.0f, 2.099f, 0.746f, 2.404f, 1.813f)
                lineToRelative(1.482f, 5.187f)
                horizontalLineToRelative(3.12f)
                lineToRelative(-1.717f, -6.011f)
                close()
                moveTo(12.0f, 12.0f)
                curveToRelative(0.836f, 0.0f, 1.627f, -0.183f, 2.351f, -0.495f)
                lineToRelative(-0.525f, -3.085f)
                curveToRelative(-0.5f, 0.399f, -1.256f, 0.579f, -1.826f, 0.579f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                curveToRelative(1.145f, 0.0f, 3.621f, -1.282f, 4.849f, -2.418f)
                curveToRelative(0.865f, 0.576f, 1.508f, 1.528f, 1.666f, 2.631f)
                lineToRelative(0.984f, 5.787f)
                curveToRelative(1.232f, 0.182f, 2.384f, 0.663f, 3.363f, 1.385f)
                curveToRelative(-0.002f, -0.007f, -1.386f, -7.653f, -1.386f, -7.653f)
                curveToRelative(-0.497f, -3.271f, -3.271f, -5.732f, -6.477f, -5.732f)
                reflectiveCurveToRelative(-5.979f, 2.46f, -6.477f, 5.732f)
                curveToRelative(0.0f, 0.0f, -1.376f, 7.622f, -1.382f, 7.648f)
                curveToRelative(0.978f, -0.72f, 2.128f, -1.2f, 3.358f, -1.381f)
                horizontalLineToRelative(4.5f)
                close()
            }
        }
        .build()
        return _driverWoman!!
    }

private var _driverWoman: ImageVector? = null
