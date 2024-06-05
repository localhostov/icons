package me.localx.icons.straight.bold

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
import me.localx.icons.straight.Icons

public val Icons.Bold.Refresh: ImageVector
    get() {
        if (_refresh != null) {
            return _refresh!!
        }
        _refresh = Builder(name = "Refresh", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.99f)
                arcToRelative(9.03f, 9.03f, 0.0f, false, true, 6.36f, 2.65f)
                lineTo(15.986f, 8.014f)
                horizontalLineToRelative(5.83f)
                arcToRelative(1.146f, 1.146f, 0.0f, false, false, 1.146f, -1.146f)
                verticalLineTo(1.038f)
                lineTo(20.471f, 3.529f)
                arcTo(11.98f, 11.98f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineTo(2.99f)
                arcTo(9.02f, 9.02f, 0.0f, false, true, 12.0f, 2.99f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.01f, 12.0f)
                arcTo(8.994f, 8.994f, 0.0f, false, true, 5.64f, 18.36f)
                lineToRelative(2.374f, -2.374f)
                horizontalLineTo(1.993f)
                arcToRelative(0.956f, 0.956f, 0.0f, false, false, -0.955f, 0.955f)
                verticalLineToRelative(6.021f)
                lineToRelative(2.491f, -2.491f)
                arcTo(11.98f, 11.98f, 0.0f, false, false, 24.0f, 12.0f)
                close()
            }
        }
        .build()
        return _refresh!!
    }

private var _refresh: ImageVector? = null
