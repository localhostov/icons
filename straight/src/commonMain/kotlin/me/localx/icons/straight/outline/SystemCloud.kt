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

public val Icons.Outline.SystemCloud: ImageVector
    get() {
        if (_systemCloud != null) {
            return _systemCloud!!
        }
        _systemCloud = Builder(name = "SystemCloud", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 22.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                curveToRelative(-0.738f, 0.0f, -1.376f, -0.405f, -1.723f, -1.0f)
                horizontalLineToRelative(-4.277f)
                lineTo(16.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.277f)
                curveToRelative(0.346f, -0.595f, 0.984f, -1.0f, 1.723f, -1.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(13.0f, 20.277f)
                verticalLineToRelative(-6.277f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.277f)
                curveToRelative(-0.595f, 0.346f, -1.0f, 0.984f, -1.0f, 1.723f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                curveToRelative(0.0f, -0.738f, -0.405f, -1.376f, -1.0f, -1.723f)
                close()
                moveTo(6.0f, 21.0f)
                lineTo(3.723f, 21.0f)
                curveToRelative(-0.346f, -0.595f, -0.984f, -1.0f, -1.723f, -1.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                curveToRelative(0.738f, 0.0f, 1.376f, -0.405f, 1.723f, -1.0f)
                horizontalLineToRelative(4.277f)
                lineTo(8.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(16.831f, 6.51f)
                lineToRelative(0.528f, 0.127f)
                curveToRelative(2.144f, 0.514f, 3.641f, 2.41f, 3.641f, 4.613f)
                curveToRelative(0.0f, 1.09f, -0.378f, 2.087f, -1.0f, 2.887f)
                verticalLineToRelative(2.704f)
                curveToRelative(1.803f, -1.212f, 3.0f, -3.26f, 3.0f, -5.591f)
                curveToRelative(0.0f, -2.951f, -1.891f, -5.517f, -4.659f, -6.413f)
                curveTo(17.085f, 1.923f, 14.199f, 0.0f, 11.0f, 0.0f)
                curveTo(6.589f, 0.0f, 3.0f, 3.589f, 3.0f, 8.0f)
                curveToRelative(0.0f, 0.324f, 0.021f, 0.65f, 0.061f, 0.976f)
                curveToRelative(-1.287f, 0.934f, -2.061f, 2.418f, -2.061f, 4.024f)
                curveToRelative(0.0f, 2.044f, 1.239f, 3.793f, 3.0f, 4.568f)
                verticalLineToRelative(-2.357f)
                curveToRelative(-0.609f, -0.546f, -1.0f, -1.329f, -1.0f, -2.211f)
                curveToRelative(0.0f, -1.107f, 0.621f, -2.121f, 1.621f, -2.645f)
                lineToRelative(0.673f, -0.352f)
                lineToRelative(-0.159f, -0.743f)
                curveToRelative(-0.09f, -0.419f, -0.135f, -0.843f, -0.135f, -1.261f)
                curveToRelative(0.0f, -3.309f, 2.691f, -6.0f, 6.0f, -6.0f)
                curveToRelative(2.531f, 0.0f, 4.802f, 1.606f, 5.65f, 3.998f)
                lineToRelative(0.181f, 0.512f)
                close()
            }
        }
        .build()
        return _systemCloud!!
    }

private var _systemCloud: ImageVector? = null
