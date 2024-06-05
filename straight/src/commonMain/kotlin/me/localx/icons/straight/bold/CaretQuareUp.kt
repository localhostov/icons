package me.localx.icons.straight.bold

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

public val Icons.Bold.CaretQuareUp: ImageVector
    get() {
        if (_caretQuareUp != null) {
            return _caretQuareUp!!
        }
        _caretQuareUp = Builder(name = "CaretQuareUp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.17f, 9.35f)
                arcToRelative(1.115f, 1.115f, 0.0f, false, true, 1.66f, 0.0f)
                lineTo(18.0f, 15.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(24.0f, 3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 20.5f, 0.0f)
                horizontalLineTo(3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 0.0f, 3.5f)
                verticalLineTo(24.0f)
                horizontalLineTo(24.0f)
                close()
                moveTo(3.0f, 3.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.5f, 3.0f)
                horizontalLineToRelative(17.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _caretQuareUp!!
    }

private var _caretQuareUp: ImageVector? = null
