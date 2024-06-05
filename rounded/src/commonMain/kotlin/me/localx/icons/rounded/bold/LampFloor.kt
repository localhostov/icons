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

public val Icons.Bold.LampFloor: ImageVector
    get() {
        if (_lampFloor != null) {
            return _lampFloor!!
        }
        _lampFloor = Builder(name = "LampFloor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.451f, 11.0f)
                curveToRelative(1.03f, 0.0f, 2.004f, -0.451f, 2.67f, -1.238f)
                curveToRelative(0.667f, -0.787f, 0.952f, -1.821f, 0.782f, -2.837f)
                lineToRelative(-0.667f, -3.999f)
                curveToRelative(-0.281f, -1.695f, -1.733f, -2.926f, -3.452f, -2.926f)
                horizontalLineToRelative(-7.568f)
                curveToRelative(-1.718f, 0.0f, -3.17f, 1.23f, -3.453f, 2.925f)
                lineToRelative(-0.667f, 4.0f)
                curveToRelative(-0.169f, 1.017f, 0.115f, 2.051f, 0.782f, 2.837f)
                reflectiveCurveToRelative(1.64f, 1.238f, 2.67f, 1.238f)
                horizontalLineToRelative(2.951f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(2.951f)
                close()
                moveTo(7.167f, 7.823f)
                curveToRelative(-0.056f, -0.066f, -0.145f, -0.207f, -0.112f, -0.405f)
                lineToRelative(0.667f, -4.0f)
                curveToRelative(0.041f, -0.242f, 0.248f, -0.418f, 0.494f, -0.418f)
                horizontalLineToRelative(7.568f)
                curveToRelative(0.245f, 0.0f, 0.453f, 0.175f, 0.493f, 0.418f)
                lineToRelative(0.667f, 4.0f)
                curveToRelative(0.033f, 0.199f, -0.056f, 0.339f, -0.112f, 0.405f)
                curveToRelative(-0.056f, 0.066f, -0.18f, 0.177f, -0.381f, 0.177f)
                lineTo(7.549f, 8.0f)
                curveToRelative(-0.202f, 0.0f, -0.325f, -0.111f, -0.381f, -0.177f)
                close()
            }
        }
        .build()
        return _lampFloor!!
    }

private var _lampFloor: ImageVector? = null
