package me.localx.icons.straight.outline

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

public val Icons.Outline.Mistletoe: ImageVector
    get() {
        if (_mistletoe != null) {
            return _mistletoe!!
        }
        _mistletoe = Builder(name = "Mistletoe", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.623f, 10.648f)
                curveToRelative(1.397f, -0.624f, 2.377f, -2.022f, 2.377f, -3.648f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                curveToRelative(-1.407f, 0.0f, -2.64f, 0.734f, -3.354f, 1.835f)
                curveTo(10.065f, 2.238f, 6.756f, 0.0f, 0.0f, 0.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(3.664f, 0.0f, 6.42f, 0.679f, 8.257f, 2.026f)
                curveToRelative(-0.087f, -0.006f, -0.169f, -0.026f, -0.257f, -0.026f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                curveToRelative(0.0f, 1.449f, 0.782f, 2.709f, 1.939f, 3.411f)
                curveTo(2.978f, 13.127f, 0.0f, 15.876f, 0.0f, 20.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                curveToRelative(0.0f, -4.922f, 2.788f, -7.752f, 3.997f, -8.748f)
                curveToRelative(1.197f, 0.996f, 4.003f, 3.85f, 4.003f, 8.748f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                curveToRelative(0.0f, -4.798f, -4.031f, -7.737f, -7.377f, -9.352f)
                close()
                moveTo(15.0f, 5.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(8.0f, 6.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(6.0f, 20.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                curveToRelative(0.0f, -3.727f, 3.377f, -6.151f, 6.252f, -7.54f)
                curveToRelative(-1.189f, 1.767f, -2.252f, 4.263f, -2.252f, 7.54f)
                close()
                moveTo(20.0f, 22.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                curveToRelative(0.0f, -3.277f, -1.063f, -5.773f, -2.252f, -7.54f)
                curveToRelative(2.875f, 1.389f, 6.252f, 3.813f, 6.252f, 7.54f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _mistletoe!!
    }

private var _mistletoe: ImageVector? = null
