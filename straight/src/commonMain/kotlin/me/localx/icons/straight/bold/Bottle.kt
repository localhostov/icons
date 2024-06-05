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

public val Icons.Bold.Bottle: ImageVector
    get() {
        if (_bottle != null) {
            return _bottle!!
        }
        _bottle = Builder(name = "Bottle", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.814f, 7.84f)
                lineTo(16.0f, 6.151f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.151f)
                lineTo(5.185f, 7.839f)
                arcTo(4.523f, 4.523f, 0.0f, false, false, 3.0f, 11.7f)
                verticalLineTo(24.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(11.7f)
                arcTo(4.519f, 4.519f, 0.0f, false, false, 18.814f, 7.84f)
                close()
                moveTo(18.0f, 21.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.7f)
                arcToRelative(1.508f, 1.508f, 0.0f, false, true, 0.728f, -1.286f)
                lineTo(11.0f, 7.849f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(7.849f)
                lineToRelative(4.271f, 2.564f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 11.7f)
                close()
                moveTo(8.0f, 14.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _bottle!!
    }

private var _bottle: ImageVector? = null
