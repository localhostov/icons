package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.TruckCheck: ImageVector
    get() {
        if (_truckCheck != null) {
            return _truckCheck!!
        }
        _truckCheck = Builder(name = "TruckCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.682f, 5.0f)
                horizontalLineToRelative(-1.867f)
                curveToRelative(-0.591f, -2.293f, -2.658f, -4.0f, -5.133f, -4.0f)
                horizontalLineToRelative(-6.363f)
                curveTo(2.386f, 1.0f, 0.0f, 3.386f, 0.0f, 6.318f)
                verticalLineToRelative(9.318f)
                curveToRelative(0.0f, 1.935f, 1.273f, 3.56f, 3.02f, 4.13f)
                curveToRelative(-0.006f, 0.078f, -0.02f, 0.154f, -0.02f, 0.233f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.343f, 3.0f, -3.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.343f, 3.0f, -3.0f)
                curveToRelative(0.0f, -0.08f, -0.014f, -0.155f, -0.02f, -0.233f)
                curveToRelative(1.746f, -0.57f, 3.02f, -2.195f, 3.02f, -4.13f)
                verticalLineToRelative(-5.364f)
                curveToRelative(0.0f, -2.908f, -2.386f, -5.273f, -5.318f, -5.273f)
                close()
                moveTo(21.0f, 10.273f)
                verticalLineToRelative(0.727f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.682f)
                curveToRelative(1.3f, 0.0f, 2.318f, 0.999f, 2.318f, 2.273f)
                close()
                moveTo(4.363f, 17.0f)
                curveToRelative(-0.752f, 0.0f, -1.363f, -0.611f, -1.363f, -1.363f)
                lineTo(3.0f, 6.318f)
                curveToRelative(0.0f, -1.278f, 1.04f, -2.318f, 2.318f, -2.318f)
                horizontalLineToRelative(6.363f)
                curveToRelative(1.278f, 0.0f, 2.318f, 1.04f, 2.318f, 2.318f)
                verticalLineToRelative(10.682f)
                lineTo(4.363f, 17.0f)
                close()
                moveTo(19.636f, 17.0f)
                horizontalLineToRelative(-2.637f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.637f)
                curveToRelative(0.0f, 0.752f, -0.611f, 1.363f, -1.363f, 1.363f)
                close()
                moveTo(12.56f, 8.154f)
                curveToRelative(0.586f, 0.585f, 0.586f, 1.536f, 0.0f, 2.121f)
                lineToRelative(-3.043f, 3.043f)
                curveToRelative(-0.487f, 0.486f, -1.128f, 0.73f, -1.768f, 0.73f)
                reflectiveCurveToRelative(-1.28f, -0.244f, -1.767f, -0.73f)
                lineToRelative(-1.544f, -1.543f)
                curveToRelative(-0.586f, -0.585f, -0.586f, -1.536f, 0.0f, -2.121f)
                curveToRelative(0.586f, -0.586f, 1.535f, -0.586f, 2.121f, 0.0f)
                lineToRelative(1.189f, 1.189f)
                lineToRelative(2.689f, -2.689f)
                curveToRelative(0.586f, -0.586f, 1.535f, -0.586f, 2.121f, 0.0f)
                close()
            }
        }
        .build()
        return _truckCheck!!
    }

private var _truckCheck: ImageVector? = null
