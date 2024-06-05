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

public val Icons.Outline.Pencil: ImageVector
    get() {
        if (_pencil != null) {
            return _pencil!!
        }
        _pencil = Builder(name = "Pencil", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.853f, 1.148f)
                arcToRelative(3.626f, 3.626f, 0.0f, false, false, -5.124f, 0.0f)
                lineTo(1.465f, 17.412f)
                arcTo(4.968f, 4.968f, 0.0f, false, false, 0.0f, 20.947f)
                verticalLineTo(23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineTo(3.053f)
                arcToRelative(4.966f, 4.966f, 0.0f, false, false, 3.535f, -1.464f)
                lineTo(22.853f, 6.271f)
                arcTo(3.626f, 3.626f, 0.0f, false, false, 22.853f, 1.148f)
                close()
                moveTo(5.174f, 21.122f)
                arcTo(3.022f, 3.022f, 0.0f, false, true, 3.053f, 22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.947f)
                arcToRelative(2.98f, 2.98f, 0.0f, false, true, 0.879f, -2.121f)
                lineTo(15.222f, 6.483f)
                lineToRelative(2.3f, 2.3f)
                close()
                moveTo(21.438f, 4.857f)
                lineTo(18.932f, 7.364f)
                lineToRelative(-2.3f, -2.295f)
                lineToRelative(2.507f, -2.507f)
                arcToRelative(1.623f, 1.623f, 0.0f, true, true, 2.295f, 2.3f)
                close()
            }
        }
        .build()
        return _pencil!!
    }

private var _pencil: ImageVector? = null
