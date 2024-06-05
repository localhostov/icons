package me.localx.icons.rounded.outline

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

public val Icons.Outline.Piece: ImageVector
    get() {
        if (_piece != null) {
            return _piece!!
        }
        _piece = Builder(name = "Piece", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 22.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, -5.0f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineTo(16.893f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, -9.786f, 0.0f)
                horizontalLineTo(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineTo(22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
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
        return _piece!!
    }

private var _piece: ImageVector? = null
