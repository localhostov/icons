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

public val Icons.Outline.CaretRight: ImageVector
    get() {
        if (_caretRight != null) {
            return _caretRight!!
        }
        _caretRight = Builder(name = "CaretRight", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 17.88f)
                verticalLineTo(6.71f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.71f, 6.0f)
                lineToRelative(5.58f, 5.59f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.41f)
                lineToRelative(-5.58f, 5.59f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 17.88f)
                close()
            }
        }
        .build()
        return _caretRight!!
    }

private var _caretRight: ImageVector? = null
