package me.localx.icons.straight.bold

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

public val Icons.Bold.FireBurner: ImageVector
    get() {
        if (_fireBurner != null) {
            return _fireBurner!!
        }
        _fireBurner = Builder(name = "FireBurner", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 14.0f)
                curveToRelative(3.314f, 0.0f, 6.0f, -2.686f, 6.0f, -6.0f)
                curveToRelative(0.0f, -3.474f, -4.105f, -6.105f, -6.0f, -8.0f)
                curveToRelative(-1.821f, 2.103f, -1.455f, 6.0f, -2.718f, 6.0f)
                curveToRelative(-0.606f, 0.0f, -1.287f, -2.087f, -1.287f, -2.087f)
                curveToRelative(-0.995f, 1.027f, -1.995f, 2.361f, -1.995f, 4.087f)
                curveToRelative(0.0f, 3.314f, 2.686f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(10.585f, 8.585f)
                lineToRelative(1.415f, -1.415f)
                lineToRelative(1.415f, 1.415f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.781f, 0.782f, 0.781f, 2.048f, 0.0f, 2.829f)
                reflectiveCurveToRelative(-2.048f, 0.781f, -2.829f, 0.0f)
                curveToRelative(-0.781f, -0.782f, -0.781f, -2.048f, 0.0f, -2.829f)
                close()
                moveTo(22.0f, 16.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.629f, -1.125f, -2.991f, -2.635f, -3.379f)
                curveToRelative(-0.473f, 1.112f, -1.196f, 2.091f, -2.092f, 2.879f)
                horizontalLineToRelative(1.226f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                lineTo(5.0f, 16.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.275f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.226f)
                curveToRelative(-0.895f, -0.788f, -1.618f, -1.766f, -2.092f, -2.879f)
                curveToRelative(-1.51f, 0.388f, -2.635f, 1.749f, -2.635f, 3.379f)
                verticalLineToRelative(1.5f)
                lineTo(0.0f, 16.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(13.0f, 19.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(3.0f, 19.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _fireBurner!!
    }

private var _fireBurner: ImageVector? = null
