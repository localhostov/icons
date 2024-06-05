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

public val Icons.Bold.Tenge: ImageVector
    get() {
        if (_tenge != null) {
            return _tenge!!
        }
        _tenge = Builder(name = "Tenge", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 0.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(22.0f)
                close()
                moveTo(2.0f, 8.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _tenge!!
    }

private var _tenge: ImageVector? = null
