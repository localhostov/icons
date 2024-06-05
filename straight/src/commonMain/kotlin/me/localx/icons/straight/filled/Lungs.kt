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

public val Icons.Filled.Lungs: ImageVector
    get() {
        if (_lungs != null) {
            return _lungs!!
        }
        _lungs = Builder(name = "Lungs", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.897f, 16.088f)
                curveToRelative(0.805f, -0.268f, 1.504f, -0.712f, 2.103f, -1.257f)
                verticalLineToRelative(2.724f)
                curveToRelative(0.0f, 2.587f, -1.648f, 4.875f, -4.103f, 5.692f)
                horizontalLineToRelative(0.0f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(-1.633f, 0.544f, -1.633f, 0.544f)
                curveToRelative(-0.41f, 0.137f, -0.836f, 0.207f, -1.263f, 0.208f)
                horizontalLineToRelative(-0.006f)
                curveToRelative(-1.049f, 0.0f, -2.078f, -0.428f, -2.826f, -1.176f)
                curveToRelative(-0.755f, -0.753f, -1.17f, -1.757f, -1.17f, -2.827f)
                curveToRelative(0.0f, -1.402f, 0.16f, -2.805f, 0.475f, -4.169f)
                lineToRelative(1.835f, -7.952f)
                curveToRelative(0.527f, -2.282f, 2.53f, -3.876f, 4.872f, -3.876f)
                horizontalLineToRelative(3.818f)
                verticalLineToRelative(6.396f)
                curveToRelative(0.0f, 1.725f, -1.1f, 3.25f, -2.735f, 3.795f)
                lineToRelative(-2.581f, 0.86f)
                lineToRelative(0.633f, 1.897f)
                lineToRelative(2.581f, -0.86f)
                close()
                moveTo(23.525f, 15.828f)
                lineToRelative(-1.835f, -7.953f)
                curveToRelative(-0.527f, -2.282f, -2.53f, -3.875f, -4.872f, -3.875f)
                horizontalLineToRelative(-3.818f)
                verticalLineToRelative(6.396f)
                curveToRelative(0.0f, 1.725f, 1.1f, 3.25f, 2.735f, 3.795f)
                lineToRelative(2.581f, 0.86f)
                lineToRelative(-0.633f, 1.897f)
                lineToRelative(-2.581f, -0.86f)
                curveToRelative(-0.805f, -0.268f, -1.504f, -0.712f, -2.103f, -1.257f)
                verticalLineToRelative(2.724f)
                curveToRelative(0.0f, 2.587f, 1.648f, 4.875f, 4.103f, 5.692f)
                horizontalLineToRelative(0.0f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(1.633f, 0.544f, 1.633f, 0.544f)
                curveToRelative(0.412f, 0.138f, 0.872f, 0.234f, 1.269f, 0.208f)
                curveToRelative(1.049f, 0.0f, 2.078f, -0.428f, 2.826f, -1.176f)
                curveToRelative(0.755f, -0.753f, 1.17f, -1.757f, 1.17f, -2.827f)
                curveToRelative(0.0f, -1.402f, -0.16f, -2.805f, -0.475f, -4.169f)
                close()
                moveTo(13.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 0.0f)
                close()
            }
        }
        .build()
        return _lungs!!
    }

private var _lungs: ImageVector? = null
