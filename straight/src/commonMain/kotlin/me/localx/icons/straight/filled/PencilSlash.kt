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

public val Icons.Filled.PencilSlash: ImageVector
    get() {
        if (_pencilSlash != null) {
            return _pencilSlash!!
        }
        _pencilSlash = Builder(name = "PencilSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.729f, 23.98f)
                lineToRelative(-0.02f, 0.02f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-3.71f)
                lineToRelative(0.02f, -0.02f)
                lineToRelative(3.71f, 3.71f)
                close()
                moveTo(23.232f, 4.478f)
                curveToRelative(1.024f, -1.024f, 1.024f, -2.685f, 0.0f, -3.71f)
                curveToRelative(-1.024f, -1.024f, -2.685f, -1.024f, -3.71f, 0.0f)
                lineToRelative(-3.504f, 3.504f)
                lineToRelative(3.71f, 3.71f)
                lineToRelative(3.504f, -3.504f)
                close()
                moveTo(1.434f, 18.857f)
                lineToRelative(3.71f, 3.71f)
                lineToRelative(6.581f, -6.581f)
                lineToRelative(-3.71f, -3.71f)
                lineToRelative(-6.581f, 6.581f)
                close()
                moveTo(18.313f, 9.397f)
                lineToRelative(-3.71f, -3.71f)
                lineToRelative(-3.751f, 3.751f)
                lineTo(1.457f, 0.043f)
                lineTo(0.043f, 1.457f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-9.395f, -9.395f)
                lineToRelative(3.751f, -3.751f)
                close()
            }
        }
        .build()
        return _pencilSlash!!
    }

private var _pencilSlash: ImageVector? = null
