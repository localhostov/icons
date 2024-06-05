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

public val Icons.Bold.ShippingFast: ImageVector
    get() {
        if (_shippingFast != null) {
            return _shippingFast!!
        }
        _shippingFast = Builder(name = "ShippingFast", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.682f, 5.0f)
                horizontalLineToRelative(-1.853f)
                curveToRelative(-0.354f, -1.377f, -1.249f, -2.581f, -2.513f, -3.303f)
                curveToRelative(-0.716f, -0.408f, -1.635f, -0.161f, -2.046f, 0.559f)
                reflectiveCurveToRelative(-0.16f, 1.636f, 0.56f, 2.046f)
                curveToRelative(0.722f, 0.413f, 1.171f, 1.185f, 1.171f, 2.016f)
                verticalLineToRelative(10.682f)
                lineTo(4.363f, 17.0f)
                curveToRelative(-0.752f, 0.0f, -1.363f, -0.612f, -1.363f, -1.364f)
                verticalLineToRelative(-1.636f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                lineTo(1.5f, 11.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(3.136f)
                curveToRelative(0.0f, 1.935f, 1.273f, 3.56f, 3.02f, 4.13f)
                curveToRelative(-0.006f, 0.078f, -0.02f, 0.154f, -0.02f, 0.233f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.343f, 3.0f, -3.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.343f, 3.0f, -3.0f)
                curveToRelative(0.0f, -0.08f, -0.014f, -0.156f, -0.02f, -0.233f)
                curveToRelative(1.746f, -0.57f, 3.02f, -2.196f, 3.02f, -4.13f)
                verticalLineToRelative(-5.363f)
                curveToRelative(0.0f, -2.908f, -2.386f, -5.273f, -5.318f, -5.273f)
                close()
                moveTo(21.0f, 10.273f)
                verticalLineToRelative(0.727f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.682f)
                curveToRelative(1.3f, 0.0f, 2.318f, 0.999f, 2.318f, 2.273f)
                close()
                moveTo(19.637f, 17.0f)
                horizontalLineToRelative(-2.637f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.636f)
                curveToRelative(0.0f, 0.752f, -0.611f, 1.364f, -1.363f, 1.364f)
                close()
                moveTo(0.0f, 2.5f)
                curveToRelative(0.0f, -0.829f, 0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                lineTo(1.5f, 4.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                close()
                moveTo(0.0f, 7.5f)
                curveToRelative(0.0f, -0.829f, 0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                lineTo(1.5f, 9.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _shippingFast!!
    }

private var _shippingFast: ImageVector? = null
