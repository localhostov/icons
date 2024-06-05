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

public val Icons.Filled.Excavator: ImageVector
    get() {
        if (_excavator != null) {
            return _excavator!!
        }
        _excavator = Builder(name = "Excavator", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 3.356f)
                verticalLineToRelative(10.644f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-1.939f)
                curveToRelative(-1.138f, 0.0f, -2.061f, -0.923f, -2.061f, -2.061f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.546f, 0.217f, -1.071f, 0.604f, -1.457f)
                lineToRelative(4.396f, -4.396f)
                verticalLineToRelative(-4.251f)
                lineToRelative(-6.0f, 5.653f)
                verticalLineToRelative(1.512f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                lineTo(2.002f, 14.0f)
                curveTo(0.898f, 14.0f, 0.003f, 13.106f, 0.002f, 12.002f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.002f, 2.0f, -2.002f)
                horizontalLineToRelative(11.601f)
                lineToRelative(8.112f, -7.632f)
                curveToRelative(0.252f, -0.237f, 0.584f, -0.368f, 0.929f, -0.368f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.749f, 0.0f, 1.356f, 0.607f, 1.356f, 1.356f)
                close()
                moveTo(10.664f, 2.775f)
                curveToRelative(-0.483f, -1.08f, -1.556f, -1.775f, -2.739f, -1.775f)
                horizontalLineToRelative(-1.425f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(9.0f)
                lineToRelative(-2.336f, -5.225f)
                close()
                moveTo(16.0f, 20.0f)
                curveToRelative(0.0f, 2.205f, -1.795f, 4.0f, -4.0f, 4.0f)
                lineTo(4.0f, 24.0f)
                curveToRelative(-2.205f, 0.0f, -4.0f, -1.795f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.795f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(2.205f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                close()
                moveTo(6.0f, 20.0f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(13.0f, 20.0f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _excavator!!
    }

private var _excavator: ImageVector? = null
