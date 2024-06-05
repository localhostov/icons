package me.localx.icons.rounded.outline

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

public val Icons.Outline.FireExtinguisher: ImageVector
    get() {
        if (_fireExtinguisher != null) {
            return _fireExtinguisher!!
        }
        _fireExtinguisher = Builder(name = "FireExtinguisher", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.046f)
                curveToRelative(-1.585f, 0.144f, -3.124f, 0.63f, -4.501f, 1.426f)
                curveToRelative(-0.478f, 0.277f, -0.641f, 0.889f, -0.365f, 1.367f)
                curveToRelative(0.186f, 0.32f, 0.521f, 0.499f, 0.867f, 0.499f)
                curveToRelative(0.17f, 0.0f, 0.342f, -0.043f, 0.5f, -0.134f)
                curveToRelative(1.072f, -0.621f, 2.266f, -1.011f, 3.499f, -1.148f)
                verticalLineToRelative(2.028f)
                curveToRelative(-2.834f, 0.477f, -5.0f, 2.948f, -5.0f, 5.916f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0.0f, -2.968f, -2.166f, -5.439f, -5.0f, -5.916f)
                verticalLineToRelative(-2.084f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(10.0f, 13.0f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.207f, 0.0f, -2.217f, -0.86f, -2.45f, -2.0f)
                horizontalLineToRelative(4.95f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(2.0f, 18.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                close()
                moveTo(23.189f, 0.463f)
                curveToRelative(-0.515f, -0.403f, -1.172f, -0.542f, -1.848f, -0.373f)
                lineToRelative(-4.408f, 1.293f)
                curveToRelative(-1.156f, 0.355f, -1.934f, 1.406f, -1.934f, 2.616f)
                reflectiveCurveToRelative(0.78f, 2.265f, 1.946f, 2.62f)
                lineToRelative(4.434f, 1.317f)
                curveToRelative(0.171f, 0.043f, 0.345f, 0.064f, 0.516f, 0.064f)
                curveToRelative(0.464f, 0.0f, 0.917f, -0.154f, 1.293f, -0.448f)
                curveToRelative(0.515f, -0.402f, 0.811f, -1.008f, 0.811f, -1.662f)
                verticalLineToRelative(-3.766f)
                curveToRelative(0.0f, -0.654f, -0.295f, -1.259f, -0.811f, -1.662f)
                close()
                moveTo(22.0f, 5.891f)
                lineToRelative(-0.092f, 0.117f)
                lineToRelative(-4.386f, -1.303f)
                curveToRelative(-0.312f, -0.095f, -0.522f, -0.378f, -0.522f, -0.705f)
                reflectiveCurveToRelative(0.209f, -0.609f, 0.509f, -0.701f)
                lineToRelative(4.449f, -1.26f)
                curveToRelative(0.042f, 0.033f, 0.042f, 0.072f, 0.042f, 0.085f)
                verticalLineToRelative(3.766f)
                close()
            }
        }
        .build()
        return _fireExtinguisher!!
    }

private var _fireExtinguisher: ImageVector? = null
