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

public val Icons.Outline.CaretLeft: ImageVector
    get() {
        if (_caretLeft != null) {
            return _caretLeft!!
        }
        _caretLeft = Builder(name = "CaretLeft", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.29f, 18.59f)
                lineTo(7.71f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.41f)
                lineTo(13.29f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 6.71f)
                verticalLineTo(17.88f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.29f, 18.59f)
                close()
            }
        }
        .build()
        return _caretLeft!!
    }

private var _caretLeft: ImageVector? = null
