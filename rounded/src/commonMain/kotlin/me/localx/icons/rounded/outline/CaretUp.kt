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

public val Icons.Outline.CaretUp: ImageVector
    get() {
        if (_caretUp != null) {
            return _caretUp!!
        }
        _caretUp = Builder(name = "CaretUp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.41f, 16.0f)
                horizontalLineTo(17.59f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.7f, -1.71f)
                lineTo(12.71f, 8.71f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.42f, 0.0f)
                lineTo(5.71f, 14.29f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.41f, 16.0f)
                close()
            }
        }
        .build()
        return _caretUp!!
    }

private var _caretUp: ImageVector? = null
