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

public val Icons.Filled.Loveseat: ImageVector
    get() {
        if (_loveseat != null) {
            return _loveseat!!
        }
        _loveseat = Builder(name = "Loveseat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.0f, 8.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -3.314f, 2.686f, -6.0f, 6.0f, -6.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(3.314f, 0.0f, 6.0f, 2.686f, 6.0f, 6.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(-2.209f, 0.0f, -4.0f, 1.791f, -4.0f, 4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.634f, 0.0f, -3.087f, 0.788f, -4.0f, 2.003f)
                curveToRelative(-0.913f, -1.216f, -2.366f, -2.003f, -4.0f, -2.003f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.209f, -1.791f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(8.0f, 17.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.484f, 0.0f, -0.887f, -0.343f, -0.98f, -0.798f)
                curveToRelative(-0.013f, -0.065f, -0.02f, -0.133f, -0.02f, -0.202f)
                verticalLineToRelative(-3.893f)
                curveToRelative(0.0f, -0.996f, -0.681f, -1.92f, -1.664f, -2.08f)
                curveToRelative(-1.253f, -0.204f, -2.336f, 0.758f, -2.336f, 1.973f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.636f, 0.786f, 3.088f, 2.0f, 4.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-1.1f)
                curveToRelative(0.323f, 0.066f, 0.658f, 0.1f, 1.0f, 0.1f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(21.664f, 10.027f)
                curveToRelative(-0.983f, 0.16f, -1.664f, 1.083f, -1.664f, 2.08f)
                verticalLineToRelative(3.893f)
                curveToRelative(0.0f, 0.069f, -0.007f, 0.136f, -0.02f, 0.202f)
                curveToRelative(-0.093f, 0.456f, -0.496f, 0.798f, -0.98f, 0.798f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.342f, 0.0f, 0.677f, -0.034f, 1.0f, -0.1f)
                verticalLineToRelative(1.1f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(1.214f, -0.912f, 2.0f, -2.364f, 2.0f, -4.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.215f, -1.083f, -2.176f, -2.336f, -1.973f)
                close()
            }
        }
        .build()
        return _loveseat!!
    }

private var _loveseat: ImageVector? = null
