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

public val Icons.Filled.SleepingBag: ImageVector
    get() {
        if (_sleepingBag != null) {
            return _sleepingBag!!
        }
        _sleepingBag = Builder(name = "SleepingBag", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.611f, 0.0f)
                horizontalLineToRelative(-5.223f)
                curveToRelative(-2.423f, 0.0f, -4.493f, 1.735f, -4.925f, 4.125f)
                curveToRelative(-0.308f, 1.708f, -0.464f, 3.348f, -0.464f, 4.875f)
                curveToRelative(0.0f, 1.411f, 0.143f, 3.063f, 0.351f, 4.741f)
                curveToRelative(5.168f, -5.106f, 15.022f, -5.707f, 15.618f, -5.739f)
                curveToRelative(-0.052f, -1.237f, -0.191f, -2.533f, -0.433f, -3.876f)
                curveToRelative(-0.432f, -2.391f, -2.502f, -4.126f, -4.925f, -4.126f)
                close()
                moveTo(12.0f, 7.5f)
                curveToRelative(-1.381f, 0.0f, -2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(19.975f, 9.987f)
                curveToRelative(-0.121f, 3.124f, -0.767f, 7.063f, -1.321f, 9.956f)
                curveToRelative(-0.452f, 2.352f, -2.518f, 4.058f, -4.911f, 4.058f)
                horizontalLineToRelative(-3.484f)
                curveToRelative(-2.394f, 0.0f, -4.459f, -1.706f, -4.911f, -4.058f)
                curveToRelative(-0.259f, -1.349f, -0.535f, -2.93f, -0.772f, -4.547f)
                curveToRelative(0.046f, 0.022f, 6.097f, 1.834f, 6.097f, 1.834f)
                curveToRelative(0.413f, 0.147f, 0.839f, 0.219f, 1.26f, 0.219f)
                curveToRelative(1.191f, 0.0f, 2.345f, -0.569f, 3.061f, -1.58f)
                lineToRelative(4.983f, -5.882f)
                close()
                moveTo(11.293f, 15.331f)
                lineToRelative(-4.254f, -1.267f)
                curveToRelative(3.142f, -2.33f, 7.403f, -3.344f, 10.055f, -3.771f)
                curveToRelative(0.0f, 0.0f, -3.7f, 4.371f, -3.72f, 4.398f)
                curveToRelative(-0.45f, 0.653f, -1.288f, 0.92f, -2.081f, 0.64f)
                close()
            }
        }
        .build()
        return _sleepingBag!!
    }

private var _sleepingBag: ImageVector? = null
