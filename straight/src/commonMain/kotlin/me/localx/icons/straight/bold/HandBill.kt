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

public val Icons.Bold.HandBill: ImageVector
    get() {
        if (_handBill != null) {
            return _handBill!!
        }
        _handBill = Builder(name = "HandBill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 9.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(15.5f, 13.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(9.0f, 4.0f)
                verticalLineToRelative(1.997f)
                lineToRelative(-6.621f, -0.013f)
                lineToRelative(-2.379f, 2.379f)
                verticalLineToRelative(4.242f)
                lineToRelative(3.621f, -3.621f)
                lineToRelative(3.01f, 0.007f)
                lineToRelative(-3.314f, 3.319f)
                lineToRelative(2.129f, 2.113f)
                lineToRelative(3.294f, -3.319f)
                curveToRelative(0.167f, -0.102f, 0.362f, -0.141f, 0.559f, -0.11f)
                curveToRelative(0.158f, 0.024f, 0.382f, 0.105f, 0.556f, 0.35f)
                curveToRelative(0.224f, 0.314f, 0.145f, 0.815f, -0.18f, 1.139f)
                lineToRelative(-3.769f, 3.769f)
                curveToRelative(-0.472f, 0.472f, -1.101f, 0.732f, -1.768f, 0.732f)
                lineTo(0.0f, 16.984f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.138f)
                curveToRelative(1.469f, 0.0f, 2.85f, -0.572f, 3.889f, -1.611f)
                lineToRelative(0.973f, -0.973f)
                verticalLineToRelative(2.599f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(-2.639f)
                curveToRelative(1.155f, -1.356f, 1.305f, -3.341f, 0.3f, -4.755f)
                curveToRelative(-0.09f, -0.126f, -0.198f, -0.232f, -0.3f, -0.345f)
                verticalLineToRelative(-2.261f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-15.0f)
                close()
                moveTo(18.0f, 12.0f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.343f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.343f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.343f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _handBill!!
    }

private var _handBill: ImageVector? = null
