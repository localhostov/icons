package me.localx.icons.rounded.filled

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

public val Icons.Filled.CaretSquareRight: ImageVector
    get() {
        if (_caretSquareRight != null) {
            return _caretSquareRight!!
        }
        _caretSquareRight = Builder(name = "CaretSquareRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 5.0f)
                verticalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineTo(5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, -5.0f)
                horizontalLineTo(5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 0.0f, 5.0f)
                close()
                moveTo(10.6f, 6.269f)
                lineToRelative(5.154f, 5.087f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, true, 0.0f, 1.288f)
                lineTo(10.6f, 17.731f)
                arcToRelative(0.924f, 0.924f, 0.0f, false, true, -1.575f, -0.644f)
                verticalLineTo(6.913f)
                arcTo(0.924f, 0.924f, 0.0f, false, true, 10.6f, 6.269f)
                close()
            }
        }
        .build()
        return _caretSquareRight!!
    }

private var _caretSquareRight: ImageVector? = null
