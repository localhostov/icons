package me.localx.icons.straight.filled

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

public val Icons.Filled.Undo: ImageVector
    get() {
        if (_undo != null) {
            return _undo!!
        }
        _undo = Builder(name = "Undo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                horizontalLineTo(22.0f)
                arcToRelative(7.008f, 7.008f, 0.0f, false, false, -7.0f, -7.0f)
                horizontalLineTo(10.17f)
                verticalLineToRelative(6.414f)
                lineTo(0.877f, 14.121f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -4.242f)
                lineTo(10.17f, 0.586f)
                verticalLineTo(7.0f)
                horizontalLineTo(15.0f)
                arcToRelative(9.01f, 9.01f, 0.0f, false, true, 9.0f, 9.0f)
                close()
            }
        }
        .build()
        return _undo!!
    }

private var _undo: ImageVector? = null
