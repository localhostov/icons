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

public val Icons.Filled.PlantGrowth: ImageVector
    get() {
        if (_plantGrowth != null) {
            return _plantGrowth!!
        }
        _plantGrowth = Builder(name = "PlantGrowth", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.97f, 8.942f)
                lineToRelative(-0.055f, -0.957f)
                lineToRelative(-0.959f, 0.015f)
                curveToRelative(-6.708f, 0.104f, -9.661f, 4.232f, -10.956f, 7.606f)
                curveToRelative(-1.295f, -3.375f, -4.248f, -7.502f, -10.956f, -7.606f)
                lineToRelative(-0.959f, -0.015f)
                lineToRelative(-0.055f, 0.957f)
                curveToRelative(-0.219f, 3.798f, 0.749f, 6.79f, 2.874f, 8.893f)
                curveToRelative(2.635f, 2.606f, 6.303f, 3.085f, 8.096f, 3.154f)
                verticalLineToRelative(3.022f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.022f)
                curveToRelative(1.793f, -0.069f, 5.46f, -0.549f, 8.096f, -3.154f)
                curveToRelative(2.125f, -2.103f, 3.093f, -5.094f, 2.874f, -8.893f)
                close()
                moveTo(8.5f, 5.5f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(10.586f, 0.586f)
                curveToRelative(0.779f, -0.78f, 2.049f, -0.78f, 2.828f, 0.0f)
                lineToRelative(3.5f, 3.5f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.5f, -2.5f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 3.0f)
                lineToRelative(-2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _plantGrowth!!
    }

private var _plantGrowth: ImageVector? = null
