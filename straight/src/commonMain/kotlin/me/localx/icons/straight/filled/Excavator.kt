package me.localx.icons.straight.filled

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
                moveToRelative(24.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.914f)
                lineToRelative(5.0f, -5.0f)
                verticalLineToRelative(-4.251f)
                lineToRelative(-6.0f, 5.653f)
                verticalLineToRelative(1.512f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                lineTo(2.002f, 14.0f)
                curveTo(0.898f, 14.0f, 0.003f, 13.107f, 0.002f, 12.003f)
                lineToRelative(-0.002f, -2.003f)
                horizontalLineToRelative(13.602f)
                lineTo(22.106f, 2.0f)
                horizontalLineToRelative(1.894f)
                close()
                moveTo(10.66f, 2.766f)
                curveToRelative(-0.482f, -1.079f, -1.557f, -1.766f, -2.739f, -1.766f)
                horizontalLineToRelative(-2.921f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(8.0f)
                lineToRelative(-2.34f, -5.234f)
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
