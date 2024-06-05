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

public val Icons.Bold.ChessPawn: ImageVector
    get() {
        if (_chessPawn != null) {
            return _chessPawn!!
        }
        _chessPawn = Builder(name = "ChessPawn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 21.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 18.0f, 16.5f)
                verticalLineTo(16.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineTo(18.24f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 5.76f, 13.0f)
                horizontalLineTo(4.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(0.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 1.5f, 21.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(21.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
                moveTo(12.0f, 3.0f)
                arcTo(5.0f, 5.0f, 0.0f, true, true, 7.0f, 8.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 12.0f, 3.0f)
                close()
                moveTo(7.5f, 21.0f)
                arcTo(7.464f, 7.464f, 0.0f, false, false, 9.0f, 16.5f)
                verticalLineTo(16.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(0.5f)
                arcTo(7.464f, 7.464f, 0.0f, false, false, 16.5f, 21.0f)
                close()
            }
        }
        .build()
        return _chessPawn!!
    }

private var _chessPawn: ImageVector? = null
