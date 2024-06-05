package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 509.348f, viewportHeight = 509.348f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(488.935f, 188.541f)
                curveTo(437.397f, 109.024f, 349.407f, 60.662f, 254.652f, 59.773f)
                curveTo(159.898f, 60.662f, 71.908f, 109.024f, 20.37f, 188.541f)
                curveToRelative(-27.16f, 39.859f, -27.16f, 92.279f, 0.0f, 132.139f)
                curveToRelative(51.509f, 79.566f, 139.504f, 127.978f, 234.283f, 128.896f)
                curveToRelative(94.754f, -0.889f, 182.744f, -49.251f, 234.283f, -128.768f)
                curveTo(516.153f, 280.919f, 516.153f, 228.429f, 488.935f, 188.541f)
                close()
                moveTo(436.199f, 284.541f)
                curveToRelative(-39.348f, 62.411f, -107.769f, 100.488f, -181.547f, 101.035f)
                curveToRelative(-73.777f, -0.546f, -142.198f, -38.624f, -181.547f, -101.035f)
                curveToRelative(-12.267f, -18.022f, -12.267f, -41.712f, 0.0f, -59.733f)
                curveToRelative(39.348f, -62.411f, 107.769f, -100.488f, 181.547f, -101.035f)
                curveToRelative(73.777f, 0.546f, 142.198f, 38.624f, 181.547f, 101.035f)
                curveTo(448.466f, 242.829f, 448.466f, 266.519f, 436.199f, 284.541f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(254.652f, 254.674f)
                moveToRelative(-85.333f, 0.0f)
                arcToRelative(85.333f, 85.333f, 0.0f, true, true, 170.666f, 0.0f)
                arcToRelative(85.333f, 85.333f, 0.0f, true, true, -170.666f, 0.0f)
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
