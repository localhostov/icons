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

public val Icons.Filled.TruckFront: ImageVector
    get() {
        if (_truckFront != null) {
            return _truckFront!!
        }
        _truckFront = Builder(name = "TruckFront", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.076f, 14.0f)
                lineTo(2.95f, 14.0f)
                curveToRelative(0.107f, -0.258f, 0.205f, -0.52f, 0.33f, -0.77f)
                lineToRelative(2.286f, -4.572f)
                curveToRelative(0.512f, -1.022f, 1.54f, -1.658f, 2.684f, -1.658f)
                horizontalLineToRelative(7.527f)
                curveToRelative(1.144f, 0.0f, 2.172f, 0.636f, 2.684f, 1.658f)
                lineToRelative(2.286f, 4.572f)
                curveToRelative(0.125f, 0.25f, 0.223f, 0.512f, 0.33f, 0.77f)
                close()
                moveTo(21.718f, 16.0f)
                lineTo(2.307f, 16.0f)
                curveToRelative(-0.189f, 0.853f, -0.295f, 1.724f, -0.295f, 2.597f)
                verticalLineToRelative(3.403f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.403f)
                curveToRelative(0.0f, -0.873f, -0.105f, -1.744f, -0.295f, -2.597f)
                close()
                moveTo(7.013f, 20.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(17.013f, 20.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(0.013f, 18.597f)
                curveToRelative(0.0f, -0.988f, 0.115f, -2.008f, 0.343f, -3.03f)
                lineToRelative(0.002f, -0.007f)
                curveToRelative(0.23f, -1.036f, 0.583f, -2.041f, 1.052f, -2.992f)
                lineToRelative(2.367f, -4.803f)
                curveToRelative(0.854f, -1.705f, 2.567f, -2.764f, 4.473f, -2.764f)
                horizontalLineToRelative(7.527f)
                curveToRelative(1.905f, 0.0f, 3.619f, 1.059f, 4.472f, 2.763f)
                lineToRelative(2.367f, 4.797f)
                curveToRelative(0.472f, 0.957f, 0.827f, 1.967f, 1.057f, 3.009f)
                curveToRelative(0.182f, 0.828f, 0.293f, 1.653f, 0.328f, 2.46f)
                lineTo(24.001f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(0.013f)
                verticalLineToRelative(-0.403f)
                close()
            }
        }
        .build()
        return _truckFront!!
    }

private var _truckFront: ImageVector? = null
