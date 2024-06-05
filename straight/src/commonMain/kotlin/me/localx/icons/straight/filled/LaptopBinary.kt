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

public val Icons.Filled.LaptopBinary: ImageVector
    get() {
        if (_laptopBinary != null) {
            return _laptopBinary!!
        }
        _laptopBinary = Builder(name = "LaptopBinary", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.013f, 18.0f)
                lineToRelative(0.846f, -1.0f)
                horizontalLineToRelative(8.14f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                lineTo(3.0f, 21.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.343f, -3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                lineTo(8.145f, 17.0f)
                lineToRelative(0.846f, 1.0f)
                horizontalLineToRelative(6.023f)
                close()
                moveTo(17.5f, 6.6f)
                curveToRelative(-0.496f, 0.0f, -0.9f, 0.404f, -0.9f, 0.9f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.496f, 0.404f, 0.9f, 0.9f, 0.9f)
                reflectiveCurveToRelative(0.9f, -0.404f, 0.9f, -0.9f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.496f, -0.404f, -0.9f, -0.9f, -0.9f)
                close()
                moveTo(6.5f, 6.6f)
                curveToRelative(-0.496f, 0.0f, -0.9f, 0.404f, -0.9f, 0.9f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.496f, 0.404f, 0.9f, 0.9f, 0.9f)
                reflectiveCurveToRelative(0.9f, -0.404f, 0.9f, -0.9f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.496f, -0.404f, -0.9f, -0.9f, -0.9f)
                close()
                moveTo(2.0f, 3.0f)
                lineTo(2.0f, 15.0f)
                horizontalLineToRelative(7.082f)
                lineToRelative(0.846f, 1.0f)
                horizontalLineToRelative(4.157f)
                lineToRelative(0.846f, -1.0f)
                horizontalLineToRelative(7.068f)
                lineTo(21.999f, 3.0f)
                lineTo(2.0f, 3.0f)
                close()
                moveTo(9.0f, 10.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(13.203f, 13.0f)
                horizontalLineToRelative(-1.6f)
                lineTo(11.603f, 7.835f)
                lineToRelative(-0.417f, 0.461f)
                lineToRelative(-1.186f, -1.075f)
                lineToRelative(2.013f, -2.221f)
                horizontalLineToRelative(1.19f)
                lineTo(13.203f, 13.0f)
                close()
                moveTo(20.0f, 10.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _laptopBinary!!
    }

private var _laptopBinary: ImageVector? = null
