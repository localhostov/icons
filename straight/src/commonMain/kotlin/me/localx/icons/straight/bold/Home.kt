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

public val Icons.Bold.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.768f, 1.147f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -3.536f, 0.0f)
                lineTo(0.0f, 11.38f)
                verticalLineTo(21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                verticalLineTo(11.38f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(17.818f)
                arcTo(3.818f, 3.818f, 0.0f, false, false, 12.182f, 14.0f)
                horizontalLineToRelative(-0.364f)
                arcTo(3.818f, 3.818f, 0.0f, false, false, 8.0f, 17.818f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(12.622f)
                lineToRelative(9.0f, -9.0f)
                lineToRelative(9.0f, 9.0f)
                close()
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null
