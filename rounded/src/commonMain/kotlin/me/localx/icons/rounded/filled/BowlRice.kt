package me.localx.icons.rounded.filled

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

public val Icons.Filled.BowlRice: ImageVector
    get() {
        if (_bowlRice != null) {
            return _bowlRice!!
        }
        _bowlRice = Builder(name = "BowlRice", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.964f, 8.864f)
                curveToRelative(-0.179f, -1.241f, -0.908f, -2.342f, -1.959f, -3.011f)
                curveToRelative(-0.087f, -2.278f, -2.121f, -4.101f, -4.433f, -3.82f)
                curveTo(14.83f, 0.793f, 13.49f, 0.006f, 12.008f, 0.006f)
                reflectiveCurveToRelative(-2.822f, 0.787f, -3.564f, 2.027f)
                curveToRelative(-2.384f, -0.292f, -4.437f, 1.623f, -4.437f, 3.974f)
                curveToRelative(0.0f, 0.079f, 0.003f, 0.159f, 0.009f, 0.24f)
                curveToRelative(-0.901f, 0.57f, -1.573f, 1.46f, -1.856f, 2.496f)
                curveToRelative(-0.082f, 0.301f, -0.02f, 0.623f, 0.17f, 0.87f)
                curveToRelative(0.189f, 0.248f, 0.483f, 0.394f, 0.795f, 0.394f)
                horizontalLineToRelative(9.964f)
                curveToRelative(-0.057f, -0.158f, -0.088f, -0.329f, -0.088f, -0.507f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                curveToRelative(0.0f, 0.178f, -0.031f, 0.349f, -0.088f, 0.507f)
                horizontalLineToRelative(5.062f)
                curveToRelative(0.29f, 0.0f, 0.565f, -0.126f, 0.756f, -0.345f)
                curveToRelative(0.189f, -0.22f, 0.275f, -0.511f, 0.234f, -0.798f)
                close()
                moveTo(9.507f, 8.006f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(23.974f, 14.999f)
                curveToRelative(0.0f, 5.077f, -7.0f, 9.0f, -9.0f, 9.0f)
                horizontalLineToRelative(-6.0f)
                curveTo(6.974f, 24.0f, -0.026f, 20.077f, -0.025f, 15.0f)
                curveToRelative(0.0f, -0.641f, 0.223f, -1.293f, 0.636f, -1.826f)
                curveToRelative(0.578f, -0.746f, 1.45f, -1.174f, 2.392f, -1.174f)
                horizontalLineToRelative(17.944f)
                curveToRelative(0.941f, 0.0f, 1.813f, 0.428f, 2.392f, 1.174f)
                curveToRelative(0.413f, 0.533f, 0.636f, 1.185f, 0.636f, 1.826f)
                close()
            }
        }
        .build()
        return _bowlRice!!
    }

private var _bowlRice: ImageVector? = null
