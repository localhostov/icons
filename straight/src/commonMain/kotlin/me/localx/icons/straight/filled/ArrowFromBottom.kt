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

public val Icons.Filled.ArrowFromBottom: ImageVector
    get() {
        if (_arrowFromBottom != null) {
            return _arrowFromBottom!!
        }
        _arrowFromBottom = Builder(name = "ArrowFromBottom", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 21.976f)
                verticalLineTo(2.8f)
                lineToRelative(4.3f, 4.3f)
                lineToRelative(1.414f, -1.415f)
                lineTo(13.768f, 0.739f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -3.536f, 0.0f)
                lineTo(5.282f, 5.688f)
                lineTo(6.7f, 7.1f)
                lineTo(11.0f, 2.8f)
                verticalLineTo(21.976f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(19.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _arrowFromBottom!!
    }

private var _arrowFromBottom: ImageVector? = null
