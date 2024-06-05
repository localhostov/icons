package me.localx.icons.rounded.outline

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

public val Icons.Outline.SleepingBag: ImageVector
    get() {
        if (_sleepingBag != null) {
            return _sleepingBag!!
        }
        _sleepingBag = Builder(name = "SleepingBag", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.536f, 4.126f)
                curveToRelative(-0.432f, -2.391f, -2.502f, -4.126f, -4.925f, -4.126f)
                horizontalLineToRelative(-5.223f)
                curveToRelative(-2.423f, 0.0f, -4.493f, 1.735f, -4.925f, 4.125f)
                curveToRelative(-0.308f, 1.708f, -0.464f, 3.348f, -0.464f, 4.875f)
                curveToRelative(0.0f, 3.24f, 0.732f, 7.738f, 1.347f, 10.942f)
                curveToRelative(0.452f, 2.352f, 2.518f, 4.058f, 4.911f, 4.058f)
                horizontalLineToRelative(3.484f)
                curveToRelative(2.394f, 0.0f, 4.459f, -1.706f, 4.911f, -4.058f)
                curveToRelative(0.614f, -3.204f, 1.347f, -7.703f, 1.347f, -10.942f)
                curveToRelative(0.0f, -1.527f, -0.156f, -3.167f, -0.464f, -4.874f)
                close()
                moveTo(6.432f, 4.48f)
                curveToRelative(0.259f, -1.437f, 1.502f, -2.48f, 2.956f, -2.48f)
                horizontalLineToRelative(5.223f)
                curveToRelative(1.454f, 0.0f, 2.697f, 1.043f, 2.956f, 2.481f)
                curveToRelative(0.228f, 1.265f, 0.341f, 2.468f, 0.388f, 3.623f)
                curveToRelative(-2.188f, 0.284f, -7.568f, 1.313f, -11.695f, 4.802f)
                curveToRelative(-0.159f, -1.394f, -0.261f, -2.742f, -0.261f, -3.906f)
                curveToRelative(0.0f, -1.408f, 0.146f, -2.929f, 0.433f, -4.52f)
                close()
                moveTo(16.303f, 10.429f)
                lineToRelative(-2.93f, 4.261f)
                curveToRelative(-0.449f, 0.652f, -1.282f, 0.92f, -2.03f, 0.656f)
                lineToRelative(-3.405f, -1.216f)
                curveToRelative(2.735f, -2.151f, 6.062f, -3.205f, 8.365f, -3.702f)
                close()
                moveTo(16.688f, 19.565f)
                curveToRelative(-0.271f, 1.41f, -1.51f, 2.435f, -2.946f, 2.435f)
                horizontalLineToRelative(-3.484f)
                curveToRelative(-1.437f, 0.0f, -2.676f, -1.024f, -2.946f, -2.435f)
                curveToRelative(-0.217f, -1.132f, -0.449f, -2.43f, -0.657f, -3.77f)
                lineToRelative(4.016f, 1.434f)
                curveToRelative(0.413f, 0.147f, 0.839f, 0.219f, 1.26f, 0.219f)
                curveToRelative(1.209f, 0.0f, 2.378f, -0.586f, 3.092f, -1.625f)
                lineToRelative(2.839f, -4.129f)
                curveToRelative(-0.236f, 2.63f, -0.734f, 5.584f, -1.173f, 7.871f)
                close()
                moveTo(9.5f, 6.0f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _sleepingBag!!
    }

private var _sleepingBag: ImageVector? = null
