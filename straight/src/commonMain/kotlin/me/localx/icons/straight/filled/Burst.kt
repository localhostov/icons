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

public val Icons.Filled.Burst: ImageVector
    get() {
        if (_burst != null) {
            return _burst!!
        }
        _burst = Builder(name = "Burst", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.542f, 23.961f)
                lineToRelative(-2.96f, -5.531f)
                lineToRelative(-5.797f, 1.991f)
                lineToRelative(2.138f, -5.825f)
                lineTo(0.163f, 12.052f)
                lineToRelative(5.642f, -2.782f)
                lineTo(-0.006f, 0.15f)
                lineTo(9.605f, 5.316f)
                lineTo(12.42f, 0.028f)
                lineToRelative(2.911f, 5.454f)
                lineToRelative(7.074f, -2.995f)
                lineToRelative(-3.422f, 6.756f)
                lineToRelative(4.94f, 2.639f)
                lineToRelative(-4.819f, 2.578f)
                lineToRelative(4.583f, 8.663f)
                lineToRelative(-8.389f, -4.549f)
                lineToRelative(-2.757f, 5.388f)
                close()
            }
        }
        .build()
        return _burst!!
    }

private var _burst: ImageVector? = null
