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

public val Icons.Outline.ChessPawn: ImageVector
    get() {
        if (_chessPawn != null) {
            return _chessPawn!!
        }
        _chessPawn = Builder(name = "ChessPawn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 17.0f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.889f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, -9.778f, 0.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, 5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(22.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 17.0f, 17.0f)
                close()
                moveTo(7.0f, 7.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 5.0f, 5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 7.0f, 7.0f)
                close()
                moveTo(6.9f, 22.0f)
                arcTo(6.98f, 6.98f, 0.0f, false, false, 9.0f, 17.0f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(6.98f, 6.98f, 0.0f, false, false, 2.105f, 5.0f)
                close()
            }
        }
        .build()
        return _chessPawn!!
    }

private var _chessPawn: ImageVector? = null
