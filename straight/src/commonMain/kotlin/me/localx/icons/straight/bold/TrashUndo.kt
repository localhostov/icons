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

public val Icons.Bold.TrashUndo: ImageVector
    get() {
        if (_trashUndo != null) {
            return _trashUndo!!
        }
        _trashUndo = Builder(name = "TrashUndo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                lineTo(1.0f, 3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.62f)
                lineToRelative(1.233f, 14.79f)
                curveToRelative(0.149f, 1.8f, 1.682f, 3.21f, 3.487f, 3.21f)
                horizontalLineToRelative(9.32f)
                curveToRelative(1.806f, 0.0f, 3.338f, -1.41f, 3.487f, -3.209f)
                lineToRelative(1.233f, -14.791f)
                horizontalLineToRelative(1.62f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(17.157f, 20.542f)
                curveToRelative(-0.021f, 0.257f, -0.239f, 0.458f, -0.497f, 0.458f)
                lineTo(7.34f, 21.0f)
                curveToRelative(-0.258f, 0.0f, -0.476f, -0.201f, -0.497f, -0.458f)
                lineToRelative(-1.212f, -14.542f)
                horizontalLineToRelative(12.739f)
                lineToRelative(-1.212f, 14.542f)
                close()
                moveTo(7.293f, 13.207f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0.0f, -1.414f)
                lineToRelative(3.707f, -3.793f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.276f, -0.225f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(3.0f)
                lineToRelative(-3.707f, -3.793f)
                close()
            }
        }
        .build()
        return _trashUndo!!
    }

private var _trashUndo: ImageVector? = null
