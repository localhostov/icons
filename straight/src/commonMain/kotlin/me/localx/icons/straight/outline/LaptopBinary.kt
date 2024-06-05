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

public val Icons.Outline.LaptopBinary: ImageVector
    get() {
        if (_laptopBinary != null) {
            return _laptopBinary!!
        }
        _laptopBinary = Builder(name = "LaptopBinary", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.8f, 14.0f)
                horizontalLineToRelative(-1.6f)
                lineTo(11.2f, 6.0f)
                horizontalLineToRelative(1.6f)
                lineTo(12.8f, 14.0f)
                close()
                moveTo(7.5f, 14.0f)
                curveToRelative(-1.381f, 0.0f, -2.5f, -1.119f, -2.5f, -2.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(8.4f, 8.5f)
                curveToRelative(0.0f, -0.496f, -0.404f, -0.9f, -0.9f, -0.9f)
                reflectiveCurveToRelative(-0.9f, 0.404f, -0.9f, 0.9f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.496f, 0.404f, 0.9f, 0.9f, 0.9f)
                reflectiveCurveToRelative(0.9f, -0.404f, 0.9f, -0.9f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(14.0f, 11.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(15.6f, 11.5f)
                curveToRelative(0.0f, 0.496f, 0.404f, 0.9f, 0.9f, 0.9f)
                reflectiveCurveToRelative(0.9f, -0.404f, 0.9f, -0.9f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.496f, -0.404f, -0.9f, -0.9f, -0.9f)
                reflectiveCurveToRelative(-0.9f, 0.404f, -0.9f, 0.9f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(24.0f, 15.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(3.0f, 21.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-3.0f)
                lineTo(2.0f, 15.0f)
                lineTo(2.0f, 3.0f)
                lineTo(22.0f, 3.0f)
                lineTo(22.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(4.0f, 15.0f)
                horizontalLineToRelative(4.914f)
                lineToRelative(1.0f, 1.0f)
                horizontalLineToRelative(4.172f)
                lineToRelative(1.0f, -1.0f)
                horizontalLineToRelative(4.914f)
                lineTo(20.0f, 5.0f)
                lineTo(4.0f, 5.0f)
                lineTo(4.0f, 15.0f)
                close()
                moveTo(22.0f, 17.0f)
                horizontalLineToRelative(-6.086f)
                lineToRelative(-1.0f, 1.0f)
                horizontalLineToRelative(-5.828f)
                lineToRelative(-1.0f, -1.0f)
                lineTo(2.0f, 17.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.551f, 0.449f, 1.0f, 1.0f, 1.0f)
                lineTo(21.0f, 19.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, -0.449f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _laptopBinary!!
    }

private var _laptopBinary: ImageVector? = null
