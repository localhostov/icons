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

public val Icons.Bold.LaptopCode: ImageVector
    get() {
        if (_laptopCode != null) {
            return _laptopCode!!
        }
        _laptopCode = Builder(name = "LaptopCode", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF1d1d1b)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.604f, 9.561f)
                lineToRelative(-1.49f, 1.49f)
                lineToRelative(1.425f, 1.367f)
                curveToRelative(0.598f, 0.574f, 0.617f, 1.523f, 0.044f, 2.121f)
                curveToRelative(-0.295f, 0.307f, -0.688f, 0.461f, -1.083f, 0.461f)
                curveToRelative(-0.374f, 0.0f, -0.748f, -0.139f, -1.039f, -0.417f)
                lineToRelative(-1.638f, -1.572f)
                curveToRelative(-1.088f, -1.088f, -1.088f, -2.824f, -0.022f, -3.89f)
                lineToRelative(1.681f, -1.681f)
                curveToRelative(0.586f, -0.586f, 1.535f, -0.586f, 2.121f, 0.0f)
                curveToRelative(0.586f, 0.585f, 0.586f, 1.536f, 0.0f, 2.121f)
                close()
                moveTo(15.518f, 7.44f)
                curveToRelative(-0.586f, -0.586f, -1.535f, -0.586f, -2.121f, 0.0f)
                curveToRelative(-0.586f, 0.585f, -0.586f, 1.536f, 0.0f, 2.121f)
                lineToRelative(1.49f, 1.49f)
                lineToRelative(-1.425f, 1.367f)
                curveToRelative(-0.598f, 0.574f, -0.617f, 1.523f, -0.044f, 2.121f)
                curveToRelative(0.295f, 0.307f, 0.688f, 0.461f, 1.083f, 0.461f)
                curveToRelative(0.374f, 0.0f, 0.748f, -0.139f, 1.039f, -0.417f)
                lineToRelative(1.66f, -1.594f)
                curveToRelative(1.066f, -1.066f, 1.066f, -2.802f, 0.0f, -3.868f)
                lineToRelative(-1.681f, -1.681f)
                close()
                moveTo(24.0f, 18.001f)
                verticalLineToRelative(1.154f)
                curveToRelative(0.0f, 1.02f, -0.827f, 1.846f, -1.846f, 1.846f)
                lineTo(1.846f, 21.001f)
                curveToRelative(-1.02f, 0.0f, -1.846f, -0.827f, -1.846f, -1.846f)
                verticalLineToRelative(-1.154f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0.0f, -3.033f, 2.467f, -5.5f, 5.5f, -5.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, 2.467f, 5.5f, 5.5f)
                verticalLineToRelative(7.5f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(15.692f, 16.001f)
                horizontalLineToRelative(3.308f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0.0f, -1.378f, -1.122f, -2.5f, -2.5f, -2.5f)
                lineTo(7.5f, 6.001f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(3.308f)
                lineToRelative(0.923f, 1.0f)
                horizontalLineToRelative(5.538f)
                lineToRelative(0.923f, -1.0f)
                close()
            }
        }
        .build()
        return _laptopCode!!
    }

private var _laptopCode: ImageVector? = null
