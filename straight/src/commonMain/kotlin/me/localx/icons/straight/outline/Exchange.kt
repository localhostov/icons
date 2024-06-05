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

public val Icons.Outline.Exchange: ImageVector
    get() {
        if (_exchange != null) {
            return _exchange!!
        }
        _exchange = Builder(name = "Exchange", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 18.0f)
                lineTo(3.0f, 18.0f)
                lineToRelative(2.6f, 2.6f)
                lineTo(4.183f, 22.011f)
                lineToRelative(-3.6f, -3.6f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.828f)
                lineToRelative(3.569f, -3.569f)
                lineToRelative(1.414f, 1.414f)
                lineTo(3.0f, 16.0f)
                lineTo(24.0f, 16.0f)
                close()
                moveTo(18.426f, 10.573f)
                lineTo(19.84f, 11.987f)
                lineTo(23.414f, 8.414f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -2.828f)
                lineTo(19.821f, 1.993f)
                lineTo(18.407f, 3.407f)
                lineTo(21.0f, 6.0f)
                lineTo(0.0f, 6.0f)
                lineTo(0.0f, 8.0f)
                lineTo(21.0f, 8.0f)
                close()
            }
        }
        .build()
        return _exchange!!
    }

private var _exchange: ImageVector? = null
