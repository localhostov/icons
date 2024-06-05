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

public val Icons.Filled.Label: ImageVector
    get() {
        if (_label != null) {
            return _label!!
        }
        _label = Builder(name = "Label", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.177f)
                verticalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineTo(17.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineTo(7.177f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -1.543f, -2.622f)
                lineTo(12.486f, 0.126f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.972f, 0.0f)
                lineTo(3.543f, 4.555f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 2.0f, 7.177f)
                close()
                moveTo(12.0f, 5.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 10.5f, 7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 5.5f)
                close()
            }
        }
        .build()
        return _label!!
    }

private var _label: ImageVector? = null
