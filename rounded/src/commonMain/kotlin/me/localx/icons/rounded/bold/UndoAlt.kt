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

public val Icons.Bold.UndoAlt: ImageVector
    get() {
        if (_undoAlt != null) {
            return _undoAlt!!
        }
        _undoAlt = Builder(name = "UndoAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.7f, 15.007f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.121f, 0.0f)
                lineTo(0.858f, 10.282f)
                arcToRelative(2.932f, 2.932f, 0.0f, false, true, 0.0f, -4.145f)
                lineTo(5.583f, 1.412f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.7f, 3.533f)
                lineTo(4.467f, 6.7f)
                lineToRelative(14.213f, 0.0f)
                arcTo(5.325f, 5.325f, 0.0f, false, true, 24.0f, 12.019f)
                verticalLineTo(18.7f)
                arcToRelative(5.323f, 5.323f, 0.0f, false, true, -5.318f, 5.318f)
                horizontalLineTo(5.318f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f)
                horizontalLineTo(18.681f)
                arcTo(2.321f, 2.321f, 0.0f, false, false, 21.0f, 18.7f)
                verticalLineTo(12.019f)
                arcTo(2.321f, 2.321f, 0.0f, false, false, 18.68f, 9.7f)
                lineTo(4.522f, 9.7f)
                lineTo(7.7f, 12.886f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.7f, 15.007f)
                close()
            }
        }
        .build()
        return _undoAlt!!
    }

private var _undoAlt: ImageVector? = null
