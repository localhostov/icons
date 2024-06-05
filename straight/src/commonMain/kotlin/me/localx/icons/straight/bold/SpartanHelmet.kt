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

public val Icons.Bold.SpartanHelmet: ImageVector
    get() {
        if (_spartanHelmet != null) {
            return _spartanHelmet!!
        }
        _spartanHelmet = Builder(name = "SpartanHelmet", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.112f, 16.435f)
                curveToRelative(0.32f, -0.968f, 0.904f, -3.055f, 0.904f, -5.403f)
                curveTo(22.017f, 3.256f, 12.392f, 0.147f, 12.002f, 0.017f)
                curveToRelative(-0.389f, 0.13f, -10.0f, 3.253f, -10.0f, 11.015f)
                curveToRelative(0.0f, 2.347f, 0.583f, 4.432f, 0.903f, 5.401f)
                lineToRelative(-1.914f, 5.104f)
                lineToRelative(11.011f, 2.446f)
                lineToRelative(11.005f, -2.445f)
                lineToRelative(-1.896f, -5.103f)
                close()
                moveTo(18.997f, 19.356f)
                lineToRelative(-5.481f, 1.218f)
                verticalLineToRelative(-5.007f)
                curveToRelative(1.472f, -0.947f, 3.486f, -2.533f, 3.486f, -4.12f)
                curveToRelative(0.0f, -1.5f, -1.0f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-0.541f, 0.0f, -1.077f, 0.249f, -1.5f, 0.616f)
                lineToRelative(-1.0f, 1.124f)
                lineToRelative(-1.0f, -1.124f)
                curveToRelative(-0.423f, -0.368f, -0.959f, -0.616f, -1.5f, -0.616f)
                curveToRelative(-1.5f, 0.0f, -2.5f, 1.0f, -2.5f, 2.5f)
                curveToRelative(0.0f, 1.598f, 2.039f, 3.192f, 3.514f, 4.138f)
                verticalLineToRelative(4.996f)
                lineToRelative(-5.503f, -1.223f)
                lineToRelative(1.096f, -2.927f)
                lineToRelative(-0.213f, -0.538f)
                curveToRelative(-0.009f, -0.022f, -0.894f, -2.289f, -0.894f, -4.86f)
                curveToRelative(0.0f, -4.605f, 5.358f, -7.154f, 7.002f, -7.828f)
                curveToRelative(1.652f, 0.67f, 7.012f, 3.201f, 7.012f, 7.828f)
                curveToRelative(0.0f, 2.562f, -0.879f, 4.823f, -0.894f, 4.86f)
                lineToRelative(-0.214f, 0.535f)
                lineToRelative(1.088f, 2.929f)
                close()
            }
        }
        .build()
        return _spartanHelmet!!
    }

private var _spartanHelmet: ImageVector? = null
