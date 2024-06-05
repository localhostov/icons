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

public val Icons.Bold.ShippingTimed: ImageVector
    get() {
        if (_shippingTimed != null) {
            return _shippingTimed!!
        }
        _shippingTimed = Builder(name = "ShippingTimed", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.682f, 5.0f)
                horizontalLineToRelative(-1.707f)
                curveToRelative(-0.062f, -1.061f, -0.418f, -2.063f, -1.068f, -2.912f)
                curveToRelative(-0.503f, -0.658f, -1.444f, -0.782f, -2.103f, -0.279f)
                curveToRelative(-0.657f, 0.504f, -0.782f, 1.445f, -0.278f, 2.103f)
                curveToRelative(0.311f, 0.406f, 0.475f, 0.892f, 0.475f, 1.406f)
                verticalLineToRelative(11.682f)
                lineTo(4.363f, 17.0f)
                curveToRelative(-0.752f, 0.0f, -1.363f, -0.612f, -1.363f, -1.364f)
                verticalLineToRelative(-1.136f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(1.136f)
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
                moveTo(3.307f, 11.412f)
                curveToRelative(5.009f, 2.212f, 9.836f, -2.176f, 8.452f, -7.136f)
                curveToRelative(-0.546f, -1.959f, -2.077f, -3.489f, -4.036f, -4.035f)
                curveTo(2.764f, -1.143f, -1.624f, 3.684f, 0.588f, 8.692f)
                curveToRelative(0.532f, 1.205f, 1.514f, 2.187f, 2.719f, 2.719f)
                close()
                moveTo(5.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(2.586f)
                lineToRelative(1.5f, 1.5f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0.0f, 1.414f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.391f, 0.391f, -1.024f, 0.391f, -1.414f, 0.0f)
                lineToRelative(-1.793f, -1.793f)
                curveToRelative(-0.188f, -0.188f, -0.293f, -0.442f, -0.293f, -0.707f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _shippingTimed!!
    }

private var _shippingTimed: ImageVector? = null
