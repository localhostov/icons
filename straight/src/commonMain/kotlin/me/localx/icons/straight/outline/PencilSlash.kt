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

public val Icons.Outline.PencilSlash: ImageVector
    get() {
        if (_pencilSlash != null) {
            return _pencilSlash!!
        }
        _pencilSlash = Builder(name = "PencilSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.183f, 15.183f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-7.404f, 7.403f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-5.193f)
                lineToRelative(7.403f, -7.403f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-6.0f, 6.0f)
                lineToRelative(2.365f, 2.365f)
                lineToRelative(6.0f, -6.0f)
                close()
                moveTo(15.304f, 13.89f)
                lineToRelative(8.654f, 8.654f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(0.043f, 1.457f)
                lineTo(1.457f, 0.043f)
                lineToRelative(8.653f, 8.653f)
                lineToRelative(7.621f, -7.621f)
                curveToRelative(1.431f, -1.432f, 3.761f, -1.432f, 5.193f, 0.0f)
                curveToRelative(1.431f, 1.432f, 1.431f, 3.762f, 0.0f, 5.193f)
                lineToRelative(-7.621f, 7.621f)
                close()
                moveTo(16.775f, 4.861f)
                lineToRelative(2.365f, 2.365f)
                lineToRelative(2.371f, -2.371f)
                curveToRelative(0.651f, -0.652f, 0.651f, -1.713f, 0.0f, -2.365f)
                curveToRelative(-0.652f, -0.652f, -1.712f, -0.651f, -2.365f, 0.0f)
                lineToRelative(-2.371f, 2.371f)
                close()
                moveTo(11.525f, 10.111f)
                lineToRelative(2.365f, 2.365f)
                lineToRelative(3.836f, -3.836f)
                lineToRelative(-2.365f, -2.365f)
                lineToRelative(-3.836f, 3.836f)
                close()
            }
        }
        .build()
        return _pencilSlash!!
    }

private var _pencilSlash: ImageVector? = null
