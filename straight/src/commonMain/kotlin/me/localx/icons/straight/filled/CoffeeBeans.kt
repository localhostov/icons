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

public val Icons.Filled.CoffeeBeans: ImageVector
    get() {
        if (_coffeeBeans != null) {
            return _coffeeBeans!!
        }
        _coffeeBeans = Builder(name = "CoffeeBeans", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.437f, 23.902f)
                curveToRelative(-2.553f, -0.881f, -4.437f, -3.865f, -4.437f, -7.402f)
                curveToRelative(0.0f, -3.896f, 2.286f, -7.12f, 5.234f, -7.602f)
                curveToRelative(0.243f, 0.346f, 1.905f, 2.965f, -0.134f, 7.166f)
                curveToRelative(-1.722f, 3.549f, -1.26f, 6.278f, -0.663f, 7.838f)
                close()
                moveTo(19.563f, 9.099f)
                curveToRelative(0.597f, 1.56f, 1.059f, 4.289f, -0.663f, 7.838f)
                curveToRelative(-2.039f, 4.201f, -0.377f, 6.82f, -0.134f, 7.166f)
                curveToRelative(2.948f, -0.482f, 5.234f, -3.706f, 5.234f, -7.602f)
                curveToRelative(0.0f, -3.537f, -1.884f, -6.52f, -4.437f, -7.402f)
                close()
                moveTo(7.328f, 7.946f)
                curveToRelative(-4.249f, 1.471f, -5.141f, 4.292f, -5.303f, 5.015f)
                curveToRelative(0.907f, 0.681f, 2.031f, 1.042f, 3.278f, 1.042f)
                curveToRelative(0.323f, 0.0f, 0.654f, -0.024f, 0.991f, -0.072f)
                curveToRelative(1.799f, -0.257f, 3.58f, -1.188f, 5.014f, -2.623f)
                curveToRelative(2.528f, -2.528f, 3.317f, -6.001f, 2.142f, -8.464f)
                curveToRelative(-0.723f, 1.561f, -2.378f, 3.806f, -6.121f, 5.103f)
                close()
                moveTo(6.673f, 6.055f)
                curveToRelative(4.253f, -1.473f, 5.143f, -4.298f, 5.304f, -5.017f)
                curveTo(10.834f, 0.18f, 9.343f, -0.163f, 7.707f, 0.07f)
                curveToRelative(-1.799f, 0.257f, -3.58f, 1.188f, -5.014f, 2.623f)
                curveTo(0.164f, 5.222f, -0.625f, 8.694f, 0.552f, 11.158f)
                curveToRelative(0.723f, -1.561f, 2.378f, -3.806f, 6.121f, -5.103f)
                close()
            }
        }
        .build()
        return _coffeeBeans!!
    }

private var _coffeeBeans: ImageVector? = null
