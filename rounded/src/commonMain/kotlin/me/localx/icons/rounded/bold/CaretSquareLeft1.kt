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

public val Icons.Bold.CaretSquareLeft1: ImageVector
    get() {
        if (_caretSquareLeft1 != null) {
            return _caretSquareLeft1!!
        }
        _caretSquareLeft1 = Builder(name = "CaretSquareLeft1", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 18.5f)
                lineTo(0.0f, 5.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 5.5f, 0.0f)
                horizontalLineToRelative(13.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 24.0f, 5.5f)
                verticalLineToRelative(13.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 18.5f, 24.0f)
                lineTo(5.5f, 24.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 0.0f, 18.5f)
                close()
                moveTo(21.0f, 5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.5f, 3.0f)
                lineTo(5.5f, 3.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 3.0f, 5.5f)
                verticalLineToRelative(13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.5f, 21.0f)
                horizontalLineToRelative(13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 21.0f, 18.5f)
                close()
                moveTo(13.4f, 6.269f)
                lineTo(8.25f, 11.356f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, false, 0.0f, 1.288f)
                lineTo(13.4f, 17.731f)
                arcToRelative(0.924f, 0.924f, 0.0f, false, false, 1.575f, -0.644f)
                lineTo(14.975f, 6.913f)
                arcTo(0.924f, 0.924f, 0.0f, false, false, 13.4f, 6.269f)
                close()
            }
        }
        .build()
        return _caretSquareLeft1!!
    }

private var _caretSquareLeft1: ImageVector? = null
