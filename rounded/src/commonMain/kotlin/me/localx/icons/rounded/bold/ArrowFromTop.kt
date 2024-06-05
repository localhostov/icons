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

public val Icons.Bold.ArrowFromTop: ImageVector
    get() {
        if (_arrowFromTop != null) {
            return _arrowFromTop!!
        }
        _arrowFromTop = Builder(name = "ArrowFromTop", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.074f, 23.157f)
                lineToRelative(4.731f, -4.732f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 16.684f, 16.3f)
                lineTo(13.5f, 19.553f)
                verticalLineTo(3.016f)
                horizontalLineToRelative(4.235f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineTo(6.264f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(19.489f)
                lineTo(7.314f, 16.3f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.121f, 2.121f)
                lineToRelative(4.732f, 4.733f)
                arcTo(2.94f, 2.94f, 0.0f, false, false, 14.074f, 23.157f)
                close()
            }
        }
        .build()
        return _arrowFromTop!!
    }

private var _arrowFromTop: ImageVector? = null
