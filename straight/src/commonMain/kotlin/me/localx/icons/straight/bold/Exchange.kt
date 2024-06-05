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

public val Icons.Bold.Exchange: ImageVector
    get() {
        if (_exchange != null) {
            return _exchange!!
        }
        _exchange = Builder(name = "Exchange", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 18.957f)
                horizontalLineTo(4.707f)
                lineToRelative(1.9f, 1.9f)
                lineTo(4.482f, 22.975f)
                lineToRelative(-3.75f, -3.75f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, -3.536f)
                lineToRelative(3.75f, -3.75f)
                lineTo(6.6f, 14.061f)
                lineToRelative(-1.9f, 1.9f)
                horizontalLineTo(24.0f)
                close()
                moveTo(17.4f, 9.9f)
                lineToRelative(2.122f, 2.122f)
                lineToRelative(3.75f, -3.75f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -3.536f)
                lineTo(19.518f, 0.982f)
                lineTo(17.4f, 3.1f)
                lineToRelative(1.9f, 1.9f)
                horizontalLineTo(0.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.293f)
                close()
            }
        }
        .build()
        return _exchange!!
    }

private var _exchange: ImageVector? = null
