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

public val Icons.Filled.ArrowFromRight: ImageVector
    get() {
        if (_arrowFromRight != null) {
            return _arrowFromRight!!
        }
        _arrowFromRight = Builder(name = "ArrowFromRight", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 5.0f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(2.793f)
                lineTo(7.1f, 6.7f)
                lineTo(5.682f, 5.283f)
                lineTo(0.732f, 10.232f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 3.536f)
                lineToRelative(4.95f, 4.949f)
                lineTo(7.1f, 17.3f)
                lineTo(2.793f, 13.0f)
                horizontalLineTo(22.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _arrowFromRight!!
    }

private var _arrowFromRight: ImageVector? = null
