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

public val Icons.Outline.Redo: ImageVector
    get() {
        if (_redo != null) {
            return _redo!!
        }
        _redo = Builder(name = "Redo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 23.0f)
                verticalLineTo(16.0f)
                arcTo(9.01f, 9.01f, 0.0f, false, true, 9.0f, 7.0f)
                horizontalLineToRelative(4.83f)
                verticalLineTo(5.414f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 17.244f, 4.0f)
                lineToRelative(5.88f, 5.879f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, 4.242f)
                lineTo(17.244f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.414f, -1.414f)
                verticalLineTo(17.0f)
                horizontalLineTo(8.0f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, false, -6.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                close()
                moveTo(15.83f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(9.0f)
                arcToRelative(7.008f, 7.008f, 0.0f, false, false, -7.0f, 7.0f)
                verticalLineToRelative(1.714f)
                arcTo(7.984f, 7.984f, 0.0f, false, true, 8.0f, 15.0f)
                horizontalLineToRelative(6.83f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(2.586f)
                lineToRelative(5.879f, -5.879f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.414f)
                lineTo(15.83f, 5.414f)
                close()
            }
        }
        .build()
        return _redo!!
    }

private var _redo: ImageVector? = null
