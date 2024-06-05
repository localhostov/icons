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

public val Icons.Bold.Spider: ImageVector
    get() {
        if (_spider != null) {
            return _spider!!
        }
        _spider = Builder(name = "Spider", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.085f, 12.641f)
                lineToRelative(2.813f, 1.233f)
                curveToRelative(0.196f, 0.086f, 0.4f, 0.126f, 0.602f, 0.126f)
                curveToRelative(0.578f, 0.0f, 1.128f, -0.335f, 1.375f, -0.897f)
                curveToRelative(0.332f, -0.759f, -0.013f, -1.644f, -0.771f, -1.977f)
                lineToRelative(-5.469f, -2.397f)
                lineToRelative(1.455f, -0.776f)
                curveToRelative(1.796f, -0.958f, 2.911f, -2.818f, 2.911f, -4.853f)
                verticalLineToRelative(-1.6f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(1.6f)
                curveToRelative(0.0f, 0.925f, -0.507f, 1.771f, -1.323f, 2.206f)
                lineToRelative(-2.798f, 1.492f)
                curveToRelative(0.071f, -0.256f, 0.121f, -0.52f, 0.121f, -0.798f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.343f, -3.0f, 3.0f)
                curveToRelative(0.0f, 0.278f, 0.05f, 0.542f, 0.121f, 0.797f)
                lineToRelative(-2.797f, -1.492f)
                curveToRelative(-0.816f, -0.435f, -1.324f, -1.28f, -1.324f, -2.206f)
                verticalLineToRelative(-1.6f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(1.6f)
                curveToRelative(0.0f, 2.036f, 1.116f, 3.895f, 2.912f, 4.853f)
                lineToRelative(1.455f, 0.776f)
                lineTo(0.898f, 11.126f)
                curveToRelative(-0.759f, 0.333f, -1.104f, 1.217f, -0.772f, 1.977f)
                curveToRelative(0.247f, 0.562f, 0.797f, 0.897f, 1.375f, 0.897f)
                curveToRelative(0.201f, 0.0f, 0.405f, -0.04f, 0.601f, -0.126f)
                lineToRelative(2.815f, -1.234f)
                lineToRelative(-3.615f, 4.273f)
                curveToRelative(-0.839f, 0.991f, -1.301f, 2.253f, -1.301f, 3.552f)
                verticalLineToRelative(2.035f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-2.035f)
                curveToRelative(0.0f, -0.59f, 0.21f, -1.163f, 0.591f, -1.614f)
                lineToRelative(1.671f, -1.975f)
                curveToRelative(0.823f, 2.951f, 3.528f, 5.125f, 6.737f, 5.125f)
                reflectiveCurveToRelative(5.914f, -2.174f, 6.737f, -5.124f)
                lineToRelative(1.672f, 1.976f)
                curveToRelative(0.381f, 0.449f, 0.591f, 1.022f, 0.591f, 1.613f)
                verticalLineToRelative(2.035f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-2.035f)
                curveToRelative(0.0f, -1.3f, -0.462f, -2.562f, -1.301f, -3.552f)
                lineToRelative(-3.615f, -4.272f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _spider!!
    }

private var _spider: ImageVector? = null
