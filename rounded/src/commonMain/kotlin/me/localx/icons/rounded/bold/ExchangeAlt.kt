package me.localx.icons.rounded.bold

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

public val Icons.Bold.ExchangeAlt: ImageVector
    get() {
        if (_exchangeAlt != null) {
            return _exchangeAlt!!
        }
        _exchangeAlt = Builder(name = "ExchangeAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 1.5f, 5.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(2.449f)
                arcToRelative(0.978f, 0.978f, 0.0f, false, true, 1.666f, -0.7f)
                lineToRelative(4.011f, 3.958f)
                arcToRelative(1.086f, 1.086f, 0.0f, false, true, 0.0f, 1.546f)
                lineToRelative(-4.011f, 3.959f)
                arcToRelative(0.979f, 0.979f, 0.0f, false, true, -1.666f, -0.7f)
                verticalLineTo(8.0f)
                horizontalLineTo(1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 0.0f, 6.5f)
                close()
                moveTo(22.5f, 16.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.449f)
                arcToRelative(0.978f, 0.978f, 0.0f, false, false, -1.666f, -0.7f)
                lineTo(0.323f, 16.711f)
                arcToRelative(1.086f, 1.086f, 0.0f, false, false, 0.0f, 1.546f)
                lineToRelative(4.011f, 3.959f)
                arcTo(0.979f, 0.979f, 0.0f, false, false, 6.0f, 21.519f)
                verticalLineTo(19.0f)
                horizontalLineTo(22.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
            }
        }
        .build()
        return _exchangeAlt!!
    }

private var _exchangeAlt: ImageVector? = null
