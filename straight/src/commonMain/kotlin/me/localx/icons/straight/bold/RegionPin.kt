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

public val Icons.Bold.RegionPin: ImageVector
    get() {
        if (_regionPin != null) {
            return _regionPin!!
        }
        _regionPin = Builder(name = "RegionPin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 11.994f)
                lineToRelative(3.535f, -3.458f)
                curveToRelative(0.945f, -0.944f, 1.465f, -2.2f, 1.465f, -3.536f)
                reflectiveCurveToRelative(-0.52f, -2.591f, -1.464f, -3.535f)
                reflectiveCurveToRelative(-2.2f, -1.465f, -3.536f, -1.465f)
                reflectiveCurveToRelative(-2.591f, 0.521f, -3.536f, 1.465f)
                curveToRelative(-0.944f, 0.943f, -1.464f, 2.199f, -1.464f, 3.535f)
                reflectiveCurveToRelative(0.52f, 2.592f, 1.476f, 3.547f)
                lineToRelative(3.524f, 3.447f)
                close()
                moveTo(10.585f, 3.586f)
                curveToRelative(0.378f, -0.378f, 0.88f, -0.586f, 1.415f, -0.586f)
                reflectiveCurveToRelative(1.036f, 0.208f, 1.414f, 0.586f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.377f, 0.378f, 0.585f, 0.88f, 0.585f, 1.414f)
                reflectiveCurveToRelative(-0.208f, 1.036f, -0.574f, 1.402f)
                lineToRelative(-1.426f, 1.395f)
                lineToRelative(-1.415f, -1.383f)
                curveToRelative(-0.377f, -0.378f, -0.585f, -0.88f, -0.585f, -1.414f)
                reflectiveCurveToRelative(0.208f, -1.036f, 0.585f, -1.414f)
                close()
                moveTo(22.224f, 9.022f)
                curveToRelative(-0.23f, -1.668f, -1.638f, -2.927f, -3.305f, -3.006f)
                curveToRelative(-0.156f, 1.078f, -0.556f, 2.095f, -1.179f, 2.985f)
                horizontalLineToRelative(1.017f)
                curveToRelative(0.249f, 0.0f, 0.461f, 0.186f, 0.496f, 0.432f)
                lineToRelative(0.287f, 2.085f)
                lineToRelative(-9.045f, 4.111f)
                lineToRelative(-5.884f, -5.205f)
                lineToRelative(0.137f, -0.991f)
                curveToRelative(0.034f, -0.246f, 0.247f, -0.432f, 0.496f, -0.432f)
                horizontalLineToRelative(1.021f)
                curveToRelative(-0.626f, -0.895f, -1.026f, -1.911f, -1.182f, -2.985f)
                curveToRelative(-1.667f, 0.079f, -3.075f, 1.338f, -3.306f, 3.007f)
                lineTo(0.014f, 21.795f)
                lineToRelative(-0.014f, 2.205f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(-1.776f, -12.979f)
                close()
                moveTo(4.119f, 13.992f)
                lineToRelative(7.922f, 7.008f)
                lineTo(3.152f, 21.0f)
                lineToRelative(0.966f, -7.008f)
                close()
                moveTo(16.568f, 21.0f)
                lineToRelative(-3.613f, -3.196f)
                lineToRelative(7.013f, -3.188f)
                lineToRelative(0.88f, 6.383f)
                horizontalLineToRelative(-4.28f)
                close()
            }
        }
        .build()
        return _regionPin!!
    }

private var _regionPin: ImageVector? = null
