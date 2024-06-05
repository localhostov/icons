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

public val Icons.Bold.LaptopBinary: ImageVector
    get() {
        if (_laptopBinary != null) {
            return _laptopBinary!!
        }
        _laptopBinary = Builder(name = "LaptopBinary", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 16.0f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0.0f, -3.033f, -2.467f, -5.5f, -5.5f, -5.5f)
                lineTo(7.5f, 3.0f)
                curveToRelative(-3.033f, 0.0f, -5.5f, 2.467f, -5.5f, 5.5f)
                verticalLineToRelative(7.5f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(1.154f)
                curveToRelative(0.0f, 1.02f, 0.827f, 1.846f, 1.846f, 1.846f)
                lineTo(22.154f, 21.0f)
                curveToRelative(1.02f, 0.0f, 1.846f, -0.827f, 1.846f, -1.846f)
                verticalLineToRelative(-1.154f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(14.769f, 17.0f)
                horizontalLineToRelative(-5.538f)
                lineToRelative(-0.923f, -1.0f)
                horizontalLineToRelative(-3.308f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-3.308f)
                lineToRelative(-0.923f, 1.0f)
                close()
                moveTo(12.8f, 8.8f)
                verticalLineToRelative(4.4f)
                curveToRelative(0.0f, 0.442f, -0.358f, 0.8f, -0.8f, 0.8f)
                reflectiveCurveToRelative(-0.8f, -0.358f, -0.8f, -0.8f)
                verticalLineToRelative(-4.4f)
                curveToRelative(0.0f, -0.442f, 0.358f, -0.8f, 0.8f, -0.8f)
                reflectiveCurveToRelative(0.8f, 0.358f, 0.8f, 0.8f)
                close()
                moveTo(16.0f, 8.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(16.4f, 12.0f)
                curveToRelative(0.0f, 0.221f, -0.179f, 0.4f, -0.4f, 0.4f)
                reflectiveCurveToRelative(-0.4f, -0.179f, -0.4f, -0.4f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.221f, 0.179f, -0.4f, 0.4f, -0.4f)
                reflectiveCurveToRelative(0.4f, 0.179f, 0.4f, 0.4f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(8.0f, 8.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(8.4f, 12.0f)
                curveToRelative(0.0f, 0.221f, -0.179f, 0.4f, -0.4f, 0.4f)
                reflectiveCurveToRelative(-0.4f, -0.179f, -0.4f, -0.4f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.221f, 0.179f, -0.4f, 0.4f, -0.4f)
                reflectiveCurveToRelative(0.4f, 0.179f, 0.4f, 0.4f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _laptopBinary!!
    }

private var _laptopBinary: ImageVector? = null
