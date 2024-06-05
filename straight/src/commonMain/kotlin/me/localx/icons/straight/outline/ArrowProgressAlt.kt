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

public val Icons.Outline.ArrowProgressAlt: ImageVector
    get() {
        if (_arrowProgressAlt != null) {
            return _arrowProgressAlt!!
        }
        _arrowProgressAlt = Builder(name = "ArrowProgressAlt", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 8.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(16.893f)
                lineToRelative(-2.014f, -1.805f)
                lineToRelative(1.338f, -1.486f)
                lineToRelative(3.123f, 2.811f)
                curveToRelative(0.419f, 0.375f, 0.66f, 0.916f, 0.66f, 1.48f)
                reflectiveCurveToRelative(-0.241f, 1.105f, -0.662f, 1.482f)
                lineToRelative(-3.121f, 2.81f)
                lineToRelative(-1.338f, -1.486f)
                lineToRelative(2.005f, -1.805f)
                lineTo(4.0f, 6.001f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                lineTo(4.0f, 12.001f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                close()
                moveTo(12.217f, 14.708f)
                lineToRelative(-1.338f, 1.486f)
                lineToRelative(2.029f, 1.805f)
                horizontalLineToRelative(-4.909f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.847f)
                lineToRelative(-2.004f, 1.746f)
                lineToRelative(1.313f, 1.508f)
                lineToRelative(3.182f, -2.772f)
                curveToRelative(0.42f, -0.377f, 0.662f, -0.917f, 0.662f, -1.482f)
                reflectiveCurveToRelative(-0.241f, -1.105f, -0.66f, -1.48f)
                lineToRelative(-3.123f, -2.811f)
                close()
                moveTo(0.0f, 16.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(6.0f)
                lineTo(0.0f, 22.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(2.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(18.0f, 16.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(20.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _arrowProgressAlt!!
    }

private var _arrowProgressAlt: ImageVector? = null
