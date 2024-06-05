package me.localx.icons.straight.filled

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

public val Icons.Filled.Navigation: ImageVector
    get() {
        if (_navigation != null) {
            return _navigation!!
        }
        _navigation = Builder(name = "Navigation", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.093f, 11.071f)
                lineToRelative(-0.108f, -0.028f)
                lineTo(15.1f, 8.9f)
                lineTo(12.986f, 17.0f)
                lineToRelative(-1.719f, -4.271f)
                close()
                moveTo(24.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 24.0f, 12.0f)
                close()
                moveTo(17.9f, 6.1f)
                lineTo(6.461f, 9.113f)
                arcTo(1.982f, 1.982f, 0.0f, false, false, 5.0f, 11.031f)
                arcToRelative(1.945f, 1.945f, 0.0f, false, false, 1.354f, 1.9f)
                lineToRelative(3.379f, 1.342f)
                lineToRelative(1.349f, 3.34f)
                arcTo(1.982f, 1.982f, 0.0f, false, false, 12.986f, 19.0f)
                horizontalLineTo(13.0f)
                arcToRelative(1.989f, 1.989f, 0.0f, false, false, 1.922f, -1.478f)
                close()
            }
        }
        .build()
        return _navigation!!
    }

private var _navigation: ImageVector? = null
