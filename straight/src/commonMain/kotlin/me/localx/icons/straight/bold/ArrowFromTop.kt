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
                moveTo(16.95f, 16.052f)
                lineTo(13.5f, 19.5f)
                verticalLineTo(3.005f)
                horizontalLineTo(19.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.5f)
                verticalLineTo(19.5f)
                lineToRelative(-3.45f, -3.45f)
                lineTo(4.929f, 18.173f)
                lineToRelative(4.95f, 4.951f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.242f, 0.0f)
                lineToRelative(4.95f, -4.95f)
                close()
            }
        }
        .build()
        return _arrowFromTop!!
    }

private var _arrowFromTop: ImageVector? = null
