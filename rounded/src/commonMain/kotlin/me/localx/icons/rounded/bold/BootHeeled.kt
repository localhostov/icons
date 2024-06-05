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

public val Icons.Bold.BootHeeled: ImageVector
    get() {
        if (_bootHeeled != null) {
            return _bootHeeled!!
        }
        _bootHeeled = Builder(name = "BootHeeled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.407f, 14.776f)
                lineToRelative(-5.025f, -2.513f)
                curveToRelative(-0.852f, -0.426f, -1.381f, -1.283f, -1.381f, -2.236f)
                verticalLineToRelative(-5.526f)
                curveToRelative(0.0f, -1.407f, -0.639f, -2.706f, -1.753f, -3.564f)
                curveTo(11.132f, 0.079f, 9.713f, -0.21f, 8.353f, 0.15f)
                lineToRelative(-4.255f, 1.122f)
                curveTo(1.685f, 1.908f, 0.0f, 4.095f, 0.0f, 6.59f)
                verticalLineToRelative(14.91f)
                curveToRelative(0.0f, 1.378f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.32f, 0.0f, 2.404f, -1.029f, 2.493f, -2.326f)
                lineToRelative(3.28f, 1.64f)
                curveToRelative(0.898f, 0.449f, 1.903f, 0.686f, 2.907f, 0.686f)
                horizontalLineToRelative(5.41f)
                curveToRelative(1.88f, 0.0f, 3.41f, -1.53f, 3.41f, -3.41f)
                curveToRelative(0.0f, -2.479f, -1.377f, -4.706f, -3.593f, -5.814f)
                close()
                moveTo(20.591f, 21.0f)
                horizontalLineToRelative(-5.41f)
                curveToRelative(-0.541f, 0.0f, -1.082f, -0.128f, -1.565f, -0.37f)
                lineToRelative(-3.889f, -1.944f)
                curveToRelative(-0.898f, -0.449f, -1.903f, -0.686f, -2.907f, -0.686f)
                horizontalLineToRelative(-3.82f)
                lineTo(3.0f, 6.59f)
                curveToRelative(0.0f, -1.134f, 0.766f, -2.128f, 1.863f, -2.417f)
                lineToRelative(0.137f, -0.036f)
                verticalLineToRelative(6.363f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                lineTo(8.0f, 3.346f)
                lineToRelative(1.118f, -0.295f)
                curveToRelative(0.454f, -0.121f, 0.926f, -0.024f, 1.298f, 0.262f)
                reflectiveCurveToRelative(0.584f, 0.719f, 0.584f, 1.188f)
                verticalLineToRelative(5.526f)
                curveToRelative(0.0f, 2.097f, 1.165f, 3.982f, 3.04f, 4.919f)
                lineToRelative(5.025f, 2.513f)
                curveToRelative(1.193f, 0.596f, 1.935f, 1.796f, 1.935f, 3.13f)
                curveToRelative(0.0f, 0.226f, -0.184f, 0.41f, -0.41f, 0.41f)
                close()
            }
        }
        .build()
        return _bootHeeled!!
    }

private var _bootHeeled: ImageVector? = null
