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

public val Icons.Filled.DriverWoman: ImageVector
    get() {
        if (_driverWoman != null) {
            return _driverWoman!!
        }
        _driverWoman = Builder(name = "DriverWoman", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 24.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                close()
                moveTo(20.771f, 17.989f)
                curveToRelative(-0.671f, -2.349f, -2.846f, -3.989f, -5.289f, -3.989f)
                horizontalLineToRelative(-6.966f)
                curveToRelative(-2.442f, 0.0f, -4.617f, 1.64f, -5.289f, 3.989f)
                lineToRelative(-1.717f, 6.011f)
                horizontalLineToRelative(4.489f)
                curveToRelative(0.0f, -3.309f, 2.691f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                horizontalLineToRelative(4.489f)
                lineToRelative(-1.717f, -6.011f)
                close()
                moveTo(15.53f, 12.001f)
                curveToRelative(0.04f, 0.0f, 0.081f, 0.001f, 0.121f, 0.002f)
                curveToRelative(-0.045f, -0.021f, -0.086f, -0.024f, -0.121f, -0.002f)
                close()
                moveTo(18.202f, 4.551f)
                curveToRelative(-0.855f, -2.722f, -3.348f, -4.55f, -6.202f, -4.55f)
                reflectiveCurveToRelative(-5.348f, 1.829f, -6.202f, 4.55f)
                curveToRelative(-0.017f, 0.054f, -0.058f, 0.211f, -0.117f, 0.45f)
                horizontalLineToRelative(2.088f)
                curveToRelative(1.25f, 0.0f, 2.214f, -0.212f, 3.025f, -0.717f)
                curveToRelative(0.858f, -0.535f, 1.508f, -1.312f, 1.879f, -2.233f)
                curveToRelative(0.679f, 0.102f, 1.313f, 0.356f, 1.862f, 0.732f)
                curveToRelative(-0.527f, 1.319f, -1.455f, 2.432f, -2.683f, 3.198f)
                curveToRelative(-1.081f, 0.674f, -2.609f, 1.02f, -3.852f, 1.02f)
                curveToRelative(-0.038f, 0.0f, -0.41f, 0.0f, -0.69f, 0.0f)
                curveToRelative(0.361f, 2.264f, 2.327f, 3.999f, 4.69f, 3.999f)
                curveToRelative(1.751f, 0.0f, 3.284f, -0.953f, 4.108f, -2.368f)
                curveToRelative(0.097f, 0.409f, 0.485f, 2.044f, 0.834f, 3.513f)
                curveToRelative(1.303f, 0.261f, 2.503f, 0.865f, 3.484f, 1.725f)
                curveToRelative(-0.875f, -3.729f, -2.106f, -8.945f, -2.224f, -9.32f)
                close()
                moveTo(5.295f, 7.031f)
                curveToRelative(-0.02f, -0.065f, -0.04f, -0.13f, -0.059f, -0.196f)
                curveToRelative(-0.465f, 1.945f, -1.13f, 4.766f, -1.663f, 7.036f)
                curveToRelative(1.327f, -1.163f, 3.054f, -1.858f, 4.895f, -1.87f)
                curveToRelative(-1.72f, -1.06f, -2.931f, -2.87f, -3.174f, -4.971f)
                close()
            }
        }
        .build()
        return _driverWoman!!
    }

private var _driverWoman: ImageVector? = null
