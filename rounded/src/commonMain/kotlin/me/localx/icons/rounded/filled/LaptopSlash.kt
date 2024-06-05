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

public val Icons.Filled.LaptopSlash: ImageVector
    get() {
        if (_laptopSlash != null) {
            return _laptopSlash!!
        }
        _laptopSlash = Builder(name = "LaptopSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.707f, 22.293f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineTo(0.293f, 1.707f)
                curveTo(-0.098f, 1.316f, -0.098f, 0.684f, 0.293f, 0.293f)
                reflectiveCurveTo(1.316f, -0.098f, 1.707f, 0.293f)
                lineToRelative(3.178f, 3.178f)
                curveToRelative(0.643f, -0.302f, 1.36f, -0.471f, 2.115f, -0.471f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                verticalLineToRelative(6.11f)
                curveToRelative(-0.323f, -0.067f, -0.656f, -0.11f, -1.0f, -0.11f)
                horizontalLineToRelative(-5.151f)
                curveToRelative(-0.139f, 0.0f, -0.276f, 0.008f, -0.413f, 0.022f)
                lineToRelative(1.978f, 1.978f)
                horizontalLineToRelative(4.086f)
                curveToRelative(1.381f, 0.0f, 2.5f, 1.119f, 2.5f, 2.5f)
                curveToRelative(0.0f, 1.106f, -0.718f, 2.043f, -1.713f, 2.373f)
                lineToRelative(1.42f, 1.42f)
                close()
                moveTo(8.151f, 14.0f)
                curveToRelative(0.927f, 0.0f, 1.814f, 0.319f, 2.52f, 0.893f)
                lineTo(2.242f, 6.464f)
                curveToRelative(-0.157f, 0.484f, -0.242f, 1.001f, -0.242f, 1.536f)
                verticalLineToRelative(6.11f)
                curveToRelative(0.323f, -0.067f, 0.656f, -0.11f, 1.0f, -0.11f)
                horizontalLineToRelative(5.151f)
                close()
                moveTo(9.925f, 17.0f)
                lineToRelative(-0.247f, -0.292f)
                curveToRelative(-0.38f, -0.449f, -0.939f, -0.708f, -1.527f, -0.708f)
                lineTo(2.5f, 16.0f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(14.278f)
                lineToRelative(-4.0f, -4.0f)
                horizontalLineToRelative(-2.853f)
                close()
            }
        }
        .build()
        return _laptopSlash!!
    }

private var _laptopSlash: ImageVector? = null
