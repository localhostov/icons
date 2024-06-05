package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

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
                moveTo(22.5f, 15.5f)
                horizontalLineTo(4.267f)
                lineToRelative(1.612f, -1.64f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.14f, -2.1f)
                lineTo(0.993f, 14.552f)
                arcToRelative(3.515f, 3.515f, 0.0f, false, false, 0.0f, 4.9f)
                lineToRelative(2.746f, 2.793f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.14f, -2.1f)
                lineTo(4.267f, 18.5f)
                horizontalLineTo(22.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5f, 8.5f)
                horizontalLineTo(19.733f)
                lineToRelative(-1.612f, 1.64f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.14f, 2.1f)
                lineToRelative(2.746f, -2.793f)
                arcToRelative(3.515f, 3.515f, 0.0f, false, false, 0.0f, -4.9f)
                lineTo(20.261f, 1.758f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.14f, 2.1f)
                lineTo(19.733f, 5.5f)
                horizontalLineTo(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                close()
            }
        }
        .build()
        return _exchange!!
    }

private var _exchange: ImageVector? = null
