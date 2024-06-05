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

public val Icons.Bold.LaptopSlash: ImageVector
    get() {
        if (_laptopSlash != null) {
            return _laptopSlash!!
        }
        _laptopSlash = Builder(name = "LaptopSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.793f, 19.746f)
                curveToRelative(0.463f, 0.463f, 0.135f, 1.254f, -0.52f, 1.254f)
                lineTo(1.846f, 21.0f)
                curveToRelative(-1.02f, 0.0f, -1.846f, -0.827f, -1.846f, -1.846f)
                verticalLineToRelative(-1.154f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -0.829f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(3.308f)
                lineToRelative(0.923f, 1.0f)
                horizontalLineToRelative(2.325f)
                curveToRelative(0.315f, 0.0f, 0.617f, 0.125f, 0.84f, 0.348f)
                lineToRelative(2.398f, 2.398f)
                close()
                moveTo(22.944f, 20.823f)
                lineToRelative(0.617f, 0.617f)
                curveToRelative(0.586f, 0.586f, 0.586f, 1.535f, 0.0f, 2.121f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                lineTo(0.439f, 2.561f)
                curveTo(-0.146f, 1.975f, -0.146f, 1.025f, 0.439f, 0.439f)
                curveTo(1.025f, -0.146f, 1.975f, -0.146f, 2.561f, 0.439f)
                lineToRelative(2.937f, 2.937f)
                curveToRelative(0.635f, -0.247f, 1.316f, -0.377f, 2.002f, -0.377f)
                horizontalLineToRelative(9.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, 2.467f, 5.5f, 5.5f)
                verticalLineToRelative(7.5f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                verticalLineToRelative(1.154f)
                curveToRelative(0.0f, 0.737f, -0.432f, 1.373f, -1.056f, 1.669f)
                close()
                moveTo(8.121f, 6.0f)
                lineToRelative(10.0f, 10.0f)
                horizontalLineToRelative(0.879f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-8.379f)
                close()
            }
        }
        .build()
        return _laptopSlash!!
    }

private var _laptopSlash: ImageVector? = null
