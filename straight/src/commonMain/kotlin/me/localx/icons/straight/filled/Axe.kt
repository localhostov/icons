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

public val Icons.Filled.Axe: ImageVector
    get() {
        if (_axe != null) {
            return _axe!!
        }
        _axe = Builder(name = "Axe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 7.008f)
                curveToRelative(0.0f, 5.294f, -3.698f, 8.992f, -8.992f, 8.992f)
                horizontalLineToRelative(-1.053f)
                lineToRelative(0.054f, -1.053f)
                curveToRelative(0.041f, -0.795f, -0.076f, -3.082f, -1.091f, -4.097f)
                lineToRelative(-4.749f, -4.768f)
                lineTo(14.091f, 0.162f)
                lineToRelative(3.659f, 3.674f)
                lineToRelative(2.037f, -2.037f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.006f, 2.006f)
                curveToRelative(1.128f, 0.757f, 3.036f, 0.833f, 3.743f, 0.791f)
                lineToRelative(1.06f, -0.064f)
                lineToRelative(0.002f, 1.062f)
                close()
                moveTo(0.049f, 21.537f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(10.494f, -10.494f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(0.049f, 21.537f)
                close()
            }
        }
        .build()
        return _axe!!
    }

private var _axe: ImageVector? = null
