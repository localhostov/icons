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
                moveTo(0.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 1.0f, 6.0f)
                lineTo(18.0f, 6.0f)
                lineTo(18.0f, 2.639f)
                arcToRelative(0.792f, 0.792f, 0.0f, false, true, 1.35f, -0.552f)
                lineToRelative(4.418f, 4.361f)
                arcToRelative(0.773f, 0.773f, 0.0f, false, true, 0.0f, 1.1f)
                lineTo(19.35f, 11.913f)
                arcTo(0.792f, 0.792f, 0.0f, false, true, 18.0f, 11.361f)
                lineTo(18.0f, 8.0f)
                lineTo(1.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 0.0f, 7.0f)
                close()
                moveTo(23.0f, 16.0f)
                lineTo(6.0f, 16.0f)
                lineTo(6.0f, 12.639f)
                arcToRelative(0.792f, 0.792f, 0.0f, false, false, -1.35f, -0.552f)
                lineTo(0.232f, 16.448f)
                arcToRelative(0.773f, 0.773f, 0.0f, false, false, 0.0f, 1.1f)
                lineTo(4.65f, 21.913f)
                arcTo(0.792f, 0.792f, 0.0f, false, false, 6.0f, 21.361f)
                lineTo(6.0f, 18.0f)
                lineTo(23.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
            }
        }
        .build()
        return _exchangeAlt!!
    }

private var _exchangeAlt: ImageVector? = null
