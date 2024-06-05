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

public val Icons.Outline.CaretSquareRight: ImageVector
    get() {
        if (_caretSquareRight != null) {
            return _caretSquareRight!!
        }
        _caretSquareRight = Builder(name = "CaretSquareRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 5.0f)
                lineTo(24.0f, 19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, 5.0f)
                lineTo(5.0f, 24.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, -5.0f)
                lineTo(0.0f, 5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 5.0f, 0.0f)
                lineTo(19.0f, 0.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 24.0f, 5.0f)
                close()
                moveTo(2.0f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                lineTo(19.0f, 22.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                lineTo(22.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(5.0f, 2.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 2.0f, 5.0f)
                close()
                moveTo(10.6f, 17.731f)
                lineTo(15.754f, 12.644f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, false, 0.0f, -1.288f)
                lineTo(10.6f, 6.269f)
                arcToRelative(0.924f, 0.924f, 0.0f, false, false, -1.575f, 0.644f)
                lineTo(9.025f, 17.087f)
                arcTo(0.924f, 0.924f, 0.0f, false, false, 10.6f, 17.731f)
                close()
            }
        }
        .build()
        return _caretSquareRight!!
    }

private var _caretSquareRight: ImageVector? = null
