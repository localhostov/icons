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

public val Icons.Bold.Drumstick: ImageVector
    get() {
        if (_drumstick != null) {
            return _drumstick!!
        }
        _drumstick = Builder(name = "Drumstick", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 2.5f)
                arcToRelative(8.539f, 8.539f, 0.0f, false, false, -12.064f, 0.0f)
                curveTo(6.361f, 5.574f, 6.029f, 12.82f, 6.0f, 13.637f)
                lineToRelative(-0.022f, 0.651f)
                lineToRelative(0.806f, 0.806f)
                lineTo(3.348f, 18.531f)
                arcTo(2.0f, 2.0f, 0.0f, true, false, 2.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 3.469f, -1.348f)
                lineToRelative(3.437f, -3.437f)
                lineToRelative(0.806f, 0.806f)
                lineTo(10.363f, 18.0f)
                curveToRelative(0.817f, -0.028f, 8.063f, -0.36f, 11.138f, -3.436f)
                arcTo(8.57f, 8.57f, 0.0f, false, false, 21.5f, 2.5f)
                close()
                moveTo(19.38f, 12.442f)
                curveToRelative(-1.719f, 1.719f, -6.23f, 2.366f, -8.48f, 2.524f)
                lineTo(9.035f, 13.1f)
                curveToRelative(0.158f, -2.188f, 0.814f, -6.772f, 2.523f, -8.481f)
                curveTo(16.9f, -0.388f, 24.389f, 7.124f, 19.38f, 12.442f)
                close()
            }
        }
        .build()
        return _drumstick!!
    }

private var _drumstick: ImageVector? = null
