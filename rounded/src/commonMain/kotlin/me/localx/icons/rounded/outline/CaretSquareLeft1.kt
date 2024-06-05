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

public val Icons.Outline.CaretSquareLeft1: ImageVector
    get() {
        if (_caretSquareLeft1 != null) {
            return _caretSquareLeft1!!
        }
        _caretSquareLeft1 = Builder(name = "CaretSquareLeft1", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 5.0f, 0.0f)
                horizontalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, 5.0f, 5.0f)
                verticalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, 5.0f)
                horizontalLineTo(5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 0.0f, 19.0f)
                close()
                moveTo(22.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                horizontalLineTo(5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 2.0f, 5.0f)
                verticalLineTo(19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineTo(19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                close()
                moveTo(13.4f, 6.269f)
                lineTo(8.25f, 11.356f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, false, 0.0f, 1.288f)
                lineTo(13.4f, 17.731f)
                arcToRelative(0.924f, 0.924f, 0.0f, false, false, 1.575f, -0.644f)
                verticalLineTo(6.913f)
                arcTo(0.924f, 0.924f, 0.0f, false, false, 13.4f, 6.269f)
                close()
            }
        }
        .build()
        return _caretSquareLeft1!!
    }

private var _caretSquareLeft1: ImageVector? = null
