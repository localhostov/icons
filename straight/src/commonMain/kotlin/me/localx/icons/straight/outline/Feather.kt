package me.localx.icons.straight.outline

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

public val Icons.Outline.Feather: ImageVector
    get() {
        if (_feather != null) {
            return _feather!!
        }
        _feather = Builder(name = "Feather", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.245f, 0.758f)
                arcToRelative(2.566f, 2.566f, 0.0f, false, false, -2.206f, -0.731f)
                arcToRelative(29.392f, 29.392f, 0.0f, false, false, -15.783f, 7.842f)
                arcToRelative(7.754f, 7.754f, 0.0f, false, false, -2.247f, 5.836f)
                arcToRelative(7.636f, 7.636f, 0.0f, false, false, 1.569f, 4.3f)
                lineToRelative(-4.535f, 4.538f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(4.534f, -4.534f)
                arcToRelative(7.436f, 7.436f, 0.0f, false, false, 4.6f, 1.571f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 5.909f, -2.553f)
                arcToRelative(29.709f, 29.709f, 0.0f, false, false, 7.475f, -15.5f)
                arcToRelative(2.546f, 2.546f, 0.0f, false, false, -0.73f, -2.183f)
                close()
                moveTo(5.007f, 13.608f)
                arcToRelative(5.748f, 5.748f, 0.0f, false, true, 1.665f, -4.327f)
                curveToRelative(0.433f, -0.434f, 0.878f, -0.835f, 1.328f, -1.22f)
                verticalLineToRelative(6.525f)
                lineToRelative(-1.99f, 1.99f)
                arcToRelative(5.671f, 5.671f, 0.0f, false, true, -1.003f, -2.968f)
                close()
                moveTo(15.054f, 17.059f)
                arcToRelative(5.912f, 5.912f, 0.0f, false, true, -7.627f, 0.928f)
                lineToRelative(4.987f, -4.987f)
                horizontalLineToRelative(5.747f)
                arcToRelative(24.108f, 24.108f, 0.0f, false, true, -3.107f, 4.059f)
                close()
                moveTo(21.993f, 2.659f)
                arcToRelative(28.762f, 28.762f, 0.0f, false, true, -2.716f, 8.341f)
                horizontalLineToRelative(-4.863f)
                lineToRelative(3.543f, -3.543f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-6.543f, 6.543f)
                verticalLineToRelative(-6.069f)
                arcToRelative(28.429f, 28.429f, 0.0f, false, true, 11.327f, -4.511f)
                arcToRelative(0.651f, 0.651f, 0.0f, false, true, 0.088f, -0.006f)
                arcToRelative(0.587f, 0.587f, 0.0f, false, true, 0.417f, 0.173f)
                arcToRelative(0.559f, 0.559f, 0.0f, false, true, 0.161f, 0.483f)
                close()
            }
        }
        .build()
        return _feather!!
    }

private var _feather: ImageVector? = null
