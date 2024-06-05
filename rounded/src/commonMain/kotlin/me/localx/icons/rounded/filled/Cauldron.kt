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

public val Icons.Filled.Cauldron: ImageVector
    get() {
        if (_cauldron != null) {
            return _cauldron!!
        }
        _cauldron = Builder(name = "Cauldron", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.107f, 22.006f)
                curveToRelative(-0.231f, -0.028f, -0.976f, -0.185f, -1.101f, -1.016f)
                curveToRelative(1.862f, -1.561f, 2.994f, -3.608f, 2.994f, -5.846f)
                curveToRelative(0.0f, -3.012f, -1.558f, -5.616f, -2.724f, -7.143f)
                horizontalLineToRelative(0.725f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.449f, 1.0f, -1.001f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-20.0f, 0.009f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.718f)
                curveToRelative(-1.166f, 1.528f, -2.718f, 4.127f, -2.718f, 7.134f)
                curveToRelative(0.0f, 2.239f, 1.132f, 4.285f, 2.994f, 5.846f)
                curveToRelative(-0.126f, 0.829f, -0.865f, 0.987f, -1.099f, 1.016f)
                curveToRelative(-0.544f, 0.058f, -0.942f, 0.543f, -0.89f, 1.09f)
                curveToRelative(0.05f, 0.518f, 0.485f, 0.905f, 0.995f, 0.905f)
                curveToRelative(0.032f, 0.0f, 0.064f, -0.001f, 0.096f, -0.004f)
                curveToRelative(0.736f, -0.071f, 2.032f, -0.549f, 2.617f, -1.821f)
                curveToRelative(2.022f, 1.144f, 4.549f, 1.825f, 7.287f, 1.825f)
                reflectiveCurveToRelative(5.266f, -0.681f, 7.287f, -1.825f)
                curveToRelative(0.585f, 1.272f, 1.882f, 1.75f, 2.617f, 1.821f)
                curveToRelative(0.032f, 0.003f, 0.064f, 0.004f, 0.096f, 0.004f)
                curveToRelative(0.503f, 0.0f, 0.93f, -0.381f, 0.986f, -0.892f)
                curveToRelative(0.059f, -0.544f, -0.336f, -1.036f, -0.88f, -1.102f)
                close()
                moveTo(7.0f, 1.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(14.0f, 2.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _cauldron!!
    }

private var _cauldron: ImageVector? = null
