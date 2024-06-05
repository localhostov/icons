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

public val Icons.Filled.Skating: ImageVector
    get() {
        if (_skating != null) {
            return _skating!!
        }
        _skating = Builder(name = "Skating", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 18.5f, 0.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 21.0f, 2.5f)
                close()
                moveTo(8.219f, 15.293f)
                lineTo(3.4f, 20.112f)
                lineTo(2.2f, 18.888f)
                lineToRelative(-1.428f, 1.4f)
                lineToRelative(2.8f, 2.856f)
                arcToRelative(2.983f, 2.983f, 0.0f, false, false, 2.113f, 0.9f)
                horizontalLineToRelative(0.031f)
                arcToRelative(2.978f, 2.978f, 0.0f, false, false, 2.1f, -0.857f)
                lineToRelative(-1.4f, -1.429f)
                arcToRelative(1.039f, 1.039f, 0.0f, false, true, -0.71f, 0.286f)
                arcToRelative(0.986f, 0.986f, 0.0f, false, true, -0.7f, -0.3f)
                lineToRelative(-0.2f, -0.2f)
                lineToRelative(4.833f, -4.833f)
                close()
                moveTo(17.0f, 21.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(18.274f)
                lineTo(8.8f, 13.333f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.055f, -4.3f)
                lineTo(11.781f, 6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(9.959f)
                lineToRelative(2.062f, 1.723f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.1f, 4.338f)
                horizontalLineToRelative(0.0f)
                lineTo(12.29f, 13.892f)
                lineTo(16.0f, 17.416f)
                verticalLineTo(22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 21.0f)
                close()
            }
        }
        .build()
        return _skating!!
    }

private var _skating: ImageVector? = null
