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

public val Icons.Outline.Undo: ImageVector
    get() {
        if (_undo != null) {
            return _undo!!
        }
        _undo = Builder(name = "Undo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, false, -6.0f, -6.0f)
                horizontalLineTo(10.17f)
                verticalLineToRelative(1.586f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.756f, 20.0f)
                lineTo(0.877f, 14.121f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -4.242f)
                lineTo(6.756f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.17f, 5.414f)
                verticalLineTo(7.0f)
                horizontalLineTo(15.0f)
                arcToRelative(9.01f, 9.01f, 0.0f, false, true, 9.0f, 9.0f)
                verticalLineToRelative(7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 23.0f, 24.0f)
                close()
                moveTo(8.17f, 5.414f)
                lineTo(2.291f, 11.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.414f)
                lineTo(8.17f, 18.586f)
                verticalLineTo(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineTo(16.0f)
                arcToRelative(7.984f, 7.984f, 0.0f, false, true, 6.0f, 2.714f)
                verticalLineTo(16.0f)
                arcToRelative(7.008f, 7.008f, 0.0f, false, false, -7.0f, -7.0f)
                horizontalLineTo(9.17f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _undo!!
    }

private var _undo: ImageVector? = null
