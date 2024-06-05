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
                moveToRelative(20.005f, 5.853f)
                curveToRelative(-0.088f, -2.278f, -2.117f, -4.096f, -4.433f, -3.819f)
                curveTo(14.83f, 0.792f, 13.49f, 0.006f, 12.008f, 0.006f)
                reflectiveCurveToRelative(-2.822f, 0.787f, -3.564f, 2.027f)
                curveToRelative(-2.384f, -0.292f, -4.437f, 1.623f, -4.437f, 3.974f)
                curveToRelative(0.0f, 0.078f, 0.003f, 0.157f, 0.009f, 0.238f)
                curveToRelative(-1.241f, 0.776f, -2.008f, 2.128f, -2.008f, 3.629f)
                curveToRelative(0.0f, 0.076f, 0.006f, 0.15f, 0.01f, 0.225f)
                curveToRelative(0.315f, -0.061f, 0.637f, -0.099f, 0.965f, -0.099f)
                horizontalLineToRelative(10.108f)
                curveToRelative(-0.056f, -0.157f, -0.092f, -0.324f, -0.092f, -0.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                curveToRelative(0.0f, 0.176f, -0.036f, 0.343f, -0.092f, 0.5f)
                horizontalLineToRelative(5.063f)
                curveToRelative(0.336f, 0.0f, 0.664f, 0.039f, 0.986f, 0.103f)
                curveToRelative(0.031f, -0.207f, 0.051f, -0.416f, 0.051f, -0.626f)
                curveToRelative(0.0f, -1.487f, -0.767f, -2.843f, -2.003f, -3.624f)
                close()
                moveTo(9.507f, 8.007f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(23.363f, 13.174f)
                curveToRelative(-0.578f, -0.746f, -1.45f, -1.174f, -2.392f, -1.174f)
                lineTo(2.983f, 12.0f)
                curveToRelative(-0.941f, 0.0f, -1.813f, 0.428f, -2.392f, 1.174f)
                curveTo(0.03f, 13.898f, -0.162f, 14.817f, 0.064f, 15.694f)
                curveToRelative(0.92f, 3.0f, 4.828f, 6.642f, 7.92f, 8.306f)
                horizontalLineToRelative(8.0f)
                curveToRelative(3.091f, -1.663f, 7.0f, -5.306f, 7.908f, -8.306f)
                curveToRelative(0.263f, -0.867f, 0.033f, -1.796f, -0.528f, -2.521f)
                close()
            }
        }
        .build()
        return _bowlRice!!
    }

private var _bowlRice: ImageVector? = null
