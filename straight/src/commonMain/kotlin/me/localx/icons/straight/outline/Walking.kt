package me.localx.icons.straight.outline

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

public val Icons.Outline.Walking: ImageVector
    get() {
        if (_walking != null) {
            return _walking!!
        }
        _walking = Builder(name = "Walking", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(14.621f, 10.538f)
                lineToRelative(-1.408f, 5.296f)
                lineToRelative(2.788f, 1.584f)
                verticalLineToRelative(6.582f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.418f)
                lineToRelative(-4.482f, -2.546f)
                curveToRelative(-1.148f, -0.652f, -1.74f, -2.006f, -1.439f, -3.292f)
                lineToRelative(1.037f, -4.434f)
                lineToRelative(-3.119f, 1.559f)
                lineToRelative(-1.03f, 3.887f)
                lineToRelative(-1.934f, -0.513f)
                lineToRelative(1.262f, -4.759f)
                lineToRelative(4.969f, -2.484f)
                horizontalLineToRelative(3.236f)
                curveToRelative(0.865f, 0.0f, 1.687f, 0.374f, 2.258f, 1.024f)
                lineToRelative(2.347f, 3.706f)
                lineToRelative(3.75f, 1.875f)
                lineToRelative(-0.895f, 1.789f)
                lineToRelative(-4.25f, -2.125f)
                lineToRelative(-1.089f, -1.731f)
                close()
                moveTo(11.457f, 14.836f)
                lineToRelative(1.721f, -6.572f)
                curveToRelative(-0.184f, -0.169f, -0.425f, -0.264f, -0.677f, -0.264f)
                horizontalLineToRelative(-1.258f)
                lineToRelative(-1.216f, 5.2f)
                curveToRelative(-0.1f, 0.428f, 0.097f, 0.879f, 0.48f, 1.097f)
                lineToRelative(0.951f, 0.54f)
                close()
                moveTo(8.023f, 17.132f)
                lineToRelative(-0.463f, 1.996f)
                lineToRelative(-2.272f, 4.872f)
                horizontalLineToRelative(2.199f)
                lineToRelative(1.923f, -4.086f)
                lineToRelative(0.388f, -1.688f)
                lineToRelative(-1.029f, -0.585f)
                curveToRelative(-0.259f, -0.147f, -0.508f, -0.317f, -0.747f, -0.509f)
                close()
            }
        }
        .build()
        return _walking!!
    }

private var _walking: ImageVector? = null
