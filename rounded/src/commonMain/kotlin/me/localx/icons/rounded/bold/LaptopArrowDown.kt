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

public val Icons.Bold.LaptopArrowDown: ImageVector
    get() {
        if (_laptopArrowDown != null) {
            return _laptopArrowDown!!
        }
        _laptopArrowDown = Builder(name = "LaptopArrowDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 18.0f)
                verticalLineToRelative(1.154f)
                curveToRelative(0.0f, 1.02f, -0.827f, 1.846f, -1.846f, 1.846f)
                lineTo(1.846f, 21.0f)
                curveToRelative(-1.02f, 0.0f, -1.846f, -0.827f, -1.846f, -1.846f)
                verticalLineToRelative(-1.154f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                verticalLineToRelative(-7.626f)
                curveToRelative(0.0f, -2.511f, 1.697f, -4.702f, 4.126f, -5.327f)
                curveToRelative(0.801f, -0.205f, 1.62f, 0.277f, 1.826f, 1.079f)
                curveToRelative(0.207f, 0.802f, -0.276f, 1.62f, -1.079f, 1.826f)
                curveToRelative(-1.103f, 0.284f, -1.874f, 1.28f, -1.874f, 2.421f)
                verticalLineToRelative(7.626f)
                horizontalLineToRelative(3.308f)
                lineToRelative(0.923f, 1.0f)
                horizontalLineToRelative(5.538f)
                lineToRelative(0.923f, -1.0f)
                horizontalLineToRelative(3.308f)
                verticalLineToRelative(-7.626f)
                curveToRelative(0.0f, -1.142f, -0.771f, -2.138f, -1.874f, -2.421f)
                curveToRelative(-0.802f, -0.206f, -1.285f, -1.024f, -1.079f, -1.826f)
                curveToRelative(0.207f, -0.803f, 1.022f, -1.285f, 1.827f, -1.079f)
                curveToRelative(2.429f, 0.625f, 4.126f, 2.815f, 4.126f, 5.327f)
                verticalLineToRelative(7.626f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(8.13f, 9.707f)
                lineToRelative(3.163f, 3.163f)
                curveToRelative(0.391f, 0.391f, 1.024f, 0.391f, 1.414f, 0.0f)
                lineToRelative(3.163f, -3.163f)
                curveToRelative(0.63f, -0.63f, 0.184f, -1.707f, -0.707f, -1.707f)
                horizontalLineToRelative(-1.663f)
                lineTo(13.5f, 1.5f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-1.663f)
                curveToRelative(-0.891f, 0.0f, -1.337f, 1.077f, -0.707f, 1.707f)
                close()
            }
        }
        .build()
        return _laptopArrowDown!!
    }

private var _laptopArrowDown: ImageVector? = null
