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

public val Icons.Filled.Kite: ImageVector
    get() {
        if (_kite != null) {
            return _kite!!
        }
        _kite = Builder(name = "Kite", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 21.242f)
                verticalLineTo(24.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(21.242f)
                arcToRelative(3.243f, 3.243f, 0.0f, false, false, -5.535f, -2.293f)
                lineToRelative(-3.0f, 3.0f)
                arcTo(6.955f, 6.955f, 0.0f, false, true, 8.517f, 24.0f)
                horizontalLineTo(3.123f)
                arcTo(3.121f, 3.121f, 0.0f, false, true, 0.916f, 18.672f)
                lineTo(4.1f, 15.485f)
                lineTo(7.639f, 2.227f)
                arcTo(2.953f, 2.953f, 0.0f, false, true, 8.0f, 1.413f)
                lineTo(13.087f, 6.5f)
                lineTo(4.106f, 15.482f)
                lineTo(5.52f, 16.9f)
                lineTo(14.5f, 7.915f)
                lineTo(19.587f, 13.0f)
                arcToRelative(2.953f, 2.953f, 0.0f, false, true, -0.814f, 0.36f)
                lineTo(5.52f, 16.9f)
                lineToRelative(-3.19f, 3.19f)
                arcTo(1.121f, 1.121f, 0.0f, false, false, 3.123f, 22.0f)
                horizontalLineTo(8.517f)
                arcToRelative(4.971f, 4.971f, 0.0f, false, false, 3.536f, -1.465f)
                lineToRelative(3.0f, -3.0f)
                arcTo(5.242f, 5.242f, 0.0f, false, true, 24.0f, 21.242f)
                close()
                moveTo(19.287f, 0.3f)
                arcTo(2.977f, 2.977f, 0.0f, false, false, 18.0f, 0.0f)
                horizontalLineTo(10.536f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.962f, 0.16f)
                lineTo(14.5f, 5.087f)
                close()
                moveTo(20.84f, 11.426f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.16f, -0.962f)
                verticalLineTo(3.0f)
                arcToRelative(2.963f, 2.963f, 0.0f, false, false, -0.3f, -1.284f)
                lineTo(15.915f, 6.5f)
                close()
            }
        }
        .build()
        return _kite!!
    }

private var _kite: ImageVector? = null
