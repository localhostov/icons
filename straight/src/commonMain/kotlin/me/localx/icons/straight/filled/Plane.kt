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

public val Icons.Filled.Plane: ImageVector
    get() {
        if (_plane != null) {
            return _plane!!
        }
        _plane = Builder(name = "Plane", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.962f, 8.0f)
                lineTo(7.643f, 0.0f)
                horizontalLineTo(10.4f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.634f, 1.564f)
                lineTo(16.269f, 8.0f)
                close()
                moveTo(21.0f, 10.0f)
                horizontalLineTo(4.987f)
                lineTo(2.4f, 7.411f)
                arcTo(1.4f, 1.4f, 0.0f, false, false, 0.187f, 9.1f)
                lineTo(3.407f, 15.0f)
                horizontalLineToRelative(7.148f)
                lineTo(7.019f, 24.0f)
                horizontalLineToRelative(3.063f)
                arcToRelative(2.97f, 2.97f, 0.0f, false, false, 2.6f, -1.513f)
                lineTo(17.269f, 15.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(13.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 10.0f)
                close()
            }
        }
        .build()
        return _plane!!
    }

private var _plane: ImageVector? = null
