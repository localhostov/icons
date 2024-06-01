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

public val Icons.Bold.Check: ImageVector
    get() {
        if (_check != null) {
            return _check!!
        }
        _check = Builder(name = "Check", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.8001f, 21.425f)
                curveTo(7.4657f, 21.4251f, 7.1347f, 21.3593f, 6.8258f, 21.2313f)
                curveTo(6.5169f, 21.1033f, 6.2363f, 20.9156f, 6.0001f, 20.679f)
                lineTo(0.4391f, 15.121f)
                lineTo(2.5611f, 13.0f)
                lineTo(7.8001f, 18.239f)
                lineTo(21.4391f, 4.6f)
                lineTo(23.5611f, 6.721f)
                lineTo(9.6001f, 20.679f)
                curveTo(9.3639f, 20.9156f, 9.0833f, 21.1033f, 8.7744f, 21.2313f)
                curveTo(8.4655f, 21.3593f, 8.1344f, 21.4251f, 7.8001f, 21.425f)
                close()
            }
        }
        .build()
        return _check!!
    }

private var _check: ImageVector? = null
