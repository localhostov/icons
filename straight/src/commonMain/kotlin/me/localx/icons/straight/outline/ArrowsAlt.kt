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

public val Icons.Outline.ArrowsAlt: ImageVector
    get() {
        if (_arrowsAlt != null) {
            return _arrowsAlt!!
        }
        _arrowsAlt = Builder(name = "ArrowsAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.629f, 11.108f)
                lineTo(19.0f, 6.872f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(4.066f)
                lineTo(12.83f, 0.371f)
                arcToRelative(1.113f, 1.113f, 0.0f, false, false, -1.66f, 0.0f)
                lineTo(6.934f, 5.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(6.872f)
                lineTo(0.371f, 11.108f)
                arcToRelative(1.113f, 1.113f, 0.0f, false, false, 0.0f, 1.66f)
                lineTo(5.0f, 17.0f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(6.934f)
                lineToRelative(4.236f, 4.629f)
                arcToRelative(1.113f, 1.113f, 0.0f, false, false, 1.66f, 0.0f)
                lineTo(17.066f, 19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(4.0f)
                lineToRelative(4.629f, -4.236f)
                arcTo(1.113f, 1.113f, 0.0f, false, false, 23.629f, 11.108f)
                close()
            }
        }
        .build()
        return _arrowsAlt!!
    }

private var _arrowsAlt: ImageVector? = null
