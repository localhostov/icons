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

public val Icons.Filled.RentSignal: ImageVector
    get() {
        if (_rentSignal != null) {
            return _rentSignal!!
        }
        _rentSignal = Builder(name = "RentSignal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.5f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(4.5f, 14.6f)
                horizontalLineToRelative(-0.9f)
                verticalLineToRelative(1.8f)
                horizontalLineToRelative(0.9f)
                curveToRelative(0.496f, 0.0f, 0.9f, -0.404f, 0.9f, -0.9f)
                reflectiveCurveToRelative(-0.404f, -0.9f, -0.9f, -0.9f)
                close()
                moveTo(20.5f, 10.0f)
                horizontalLineToRelative(-0.029f)
                lineToRelative(-4.72f, -5.014f)
                curveToRelative(-0.566f, 0.853f, -1.416f, 1.502f, -2.414f, 1.812f)
                lineToRelative(3.013f, 3.202f)
                lineTo(7.649f, 10.0f)
                lineToRelative(3.013f, -3.202f)
                curveToRelative(-0.999f, -0.31f, -1.848f, -0.959f, -2.414f, -1.812f)
                lineToRelative(-4.72f, 5.014f)
                horizontalLineToRelative(-0.029f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(5.988f, 17.509f)
                curveToRelative(-0.018f, 0.012f, -0.018f, 0.012f, -0.042f, 0.029f)
                lineToRelative(1.054f, 3.462f)
                horizontalLineToRelative(-1.744f)
                lineToRelative(-0.872f, -3.0f)
                horizontalLineToRelative(-0.784f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.381f, 0.0f, 2.5f, 1.119f, 2.5f, 2.5f)
                curveToRelative(0.0f, 0.846f, -0.423f, 1.592f, -1.067f, 2.044f)
                curveToRelative(0.024f, -0.014f, 0.036f, -0.023f, 0.055f, -0.035f)
                close()
                moveTo(11.0f, 14.6f)
                horizontalLineToRelative(-1.4f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(1.4f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-1.4f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(1.4f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.6f)
                close()
                moveTo(17.0f, 21.0f)
                horizontalLineToRelative(-1.6f)
                lineToRelative(-1.8f, -4.054f)
                verticalLineToRelative(4.054f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(0.009f)
                lineToRelative(1.8f, 4.054f)
                verticalLineToRelative(-4.063f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(22.0f, 14.6f)
                horizontalLineToRelative(-1.2f)
                verticalLineToRelative(6.4f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-6.4f)
                horizontalLineToRelative(-1.2f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.6f)
                close()
            }
        }
        .build()
        return _rentSignal!!
    }

private var _rentSignal: ImageVector? = null
