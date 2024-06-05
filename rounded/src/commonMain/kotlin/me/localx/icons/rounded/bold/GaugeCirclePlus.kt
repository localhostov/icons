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

public val Icons.Bold.GaugeCirclePlus: ImageVector
    get() {
        if (_gaugeCirclePlus != null) {
            return _gaugeCirclePlus!!
        }
        _gaugeCirclePlus = Builder(name = "GaugeCirclePlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.5f, 14.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                curveToRelative(0.0f, -0.504f, 0.193f, -0.959f, 0.5f, -1.31f)
                verticalLineToRelative(-4.19f)
                curveToRelative(0.0f, -0.829f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(4.19f)
                curveToRelative(0.307f, 0.352f, 0.5f, 0.806f, 0.5f, 1.31f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(7.582f, 16.314f)
                lineToRelative(-1.553f, 1.203f)
                curveToRelative(-0.165f, 0.137f, -0.413f, 0.116f, -0.576f, -0.048f)
                curveToRelative(-1.848f, -1.871f, -2.717f, -4.452f, -2.382f, -7.083f)
                curveToRelative(0.484f, -3.816f, 3.613f, -6.897f, 7.439f, -7.326f)
                curveToRelative(4.442f, -0.496f, 8.437f, 2.401f, 9.318f, 6.74f)
                curveToRelative(0.165f, 0.812f, 0.964f, 1.334f, 1.769f, 1.171f)
                curveToRelative(0.812f, -0.165f, 1.336f, -0.957f, 1.171f, -1.769f)
                curveTo(21.575f, 3.329f, 16.16f, -0.586f, 10.177f, 0.078f)
                curveTo(4.991f, 0.659f, 0.752f, 4.835f, 0.095f, 10.007f)
                curveToRelative(-0.451f, 3.551f, 0.725f, 7.04f, 3.226f, 9.57f)
                curveToRelative(0.683f, 0.691f, 1.577f, 1.04f, 2.466f, 1.04f)
                curveToRelative(0.755f, 0.0f, 1.505f, -0.251f, 2.117f, -0.759f)
                lineToRelative(1.515f, -1.172f)
                curveToRelative(0.655f, -0.507f, 0.775f, -1.449f, 0.269f, -2.104f)
                curveToRelative(-0.508f, -0.655f, -1.448f, -0.776f, -2.104f, -0.268f)
                close()
                moveTo(24.0f, 18.0f)
                curveToRelative(0.0f, 3.314f, -2.686f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.686f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.686f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.686f, 6.0f, 6.0f)
                close()
                moveTo(21.5f, 18.0f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _gaugeCirclePlus!!
    }

private var _gaugeCirclePlus: ImageVector? = null
