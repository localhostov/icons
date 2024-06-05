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

public val Icons.Bold.RegionPinAlt: ImageVector
    get() {
        if (_regionPinAlt != null) {
            return _regionPinAlt!!
        }
        _regionPinAlt = Builder(name = "RegionPinAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.477f, 8.547f)
                lineToRelative(3.523f, 3.447f)
                lineToRelative(3.535f, -3.458f)
                curveToRelative(0.944f, -0.944f, 1.465f, -2.2f, 1.465f, -3.536f)
                reflectiveCurveToRelative(-0.521f, -2.591f, -1.465f, -3.535f)
                reflectiveCurveToRelative(-2.2f, -1.465f, -3.535f, -1.465f)
                reflectiveCurveToRelative(-2.591f, 0.521f, -3.535f, 1.465f)
                curveToRelative(-0.944f, 0.943f, -1.465f, 2.199f, -1.465f, 3.535f)
                reflectiveCurveToRelative(0.521f, 2.592f, 1.477f, 3.547f)
                close()
                moveTo(17.586f, 3.586f)
                curveToRelative(0.378f, -0.378f, 0.88f, -0.586f, 1.414f, -0.586f)
                reflectiveCurveToRelative(1.036f, 0.208f, 1.414f, 0.586f)
                reflectiveCurveToRelative(0.586f, 0.88f, 0.586f, 1.414f)
                reflectiveCurveToRelative(-0.208f, 1.036f, -0.574f, 1.402f)
                lineToRelative(-1.426f, 1.395f)
                lineToRelative(-1.414f, -1.384f)
                curveToRelative(-0.378f, -0.377f, -0.586f, -0.879f, -0.586f, -1.413f)
                reflectiveCurveToRelative(0.208f, -1.036f, 0.586f, -1.414f)
                close()
                moveTo(21.0f, 12.835f)
                verticalLineToRelative(1.165f)
                horizontalLineToRelative(-5.462f)
                lineToRelative(-4.538f, -4.16f)
                lineTo(11.0f, 3.0f)
                horizontalLineToRelative(1.29f)
                curveToRelative(0.327f, -1.103f, 0.979f, -2.164f, 1.816f, -3.0f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-14.106f)
                curveToRelative(-0.018f, 0.018f, -0.033f, 0.038f, -0.051f, 0.056f)
                lineToRelative(-2.949f, 2.885f)
                close()
                moveTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(6.573f)
                lineToRelative(-5.0f, 2.5f)
                lineTo(3.0f, 3.5f)
                close()
                moveTo(10.364f, 21.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-5.573f)
                lineToRelative(6.247f, -3.124f)
                lineToRelative(4.292f, 3.934f)
                lineToRelative(-3.175f, 4.763f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineToRelative(-7.031f)
                lineToRelative(2.667f, -4.0f)
                horizontalLineToRelative(4.364f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _regionPinAlt!!
    }

private var _regionPinAlt: ImageVector? = null
