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

public val Icons.Filled.ExchangeAlt: ImageVector
    get() {
        if (_exchangeAlt != null) {
            return _exchangeAlt!!
        }
        _exchangeAlt = Builder(name = "ExchangeAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 8.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(1.872f)
                lineToRelative(4.629f, 4.236f)
                arcToRelative(1.113f, 1.113f, 0.0f, false, true, 0.0f, 1.66f)
                lineTo(19.0f, 12.0f)
                close()
                moveTo(5.0f, 11.872f)
                lineTo(0.371f, 16.108f)
                arcToRelative(1.113f, 1.113f, 0.0f, false, false, 0.0f, 1.66f)
                lineTo(5.0f, 22.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _exchangeAlt!!
    }

private var _exchangeAlt: ImageVector? = null
