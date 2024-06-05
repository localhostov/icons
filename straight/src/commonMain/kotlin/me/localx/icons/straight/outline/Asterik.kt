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

public val Icons.Outline.Asterik: ImageVector
    get() {
        if (_asterik != null) {
            return _asterik!!
        }
        _asterik = Builder(name = "Asterik", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 24.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-4.9f)
                lineToRelative(-3.854f, 2.4f)
                lineToRelative(-4.138f, -6.645f)
                lineToRelative(4.585f, -2.855f)
                lineToRelative(-4.585f, -2.855f)
                lineToRelative(4.138f, -6.645f)
                lineToRelative(3.854f, 2.4f)
                verticalLineToRelative(-4.9f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(4.9f)
                lineToRelative(3.854f, -2.4f)
                lineToRelative(4.138f, 6.648f)
                lineToRelative(-4.585f, 2.852f)
                lineToRelative(4.585f, 2.855f)
                lineToRelative(-4.138f, 6.645f)
                lineToRelative(-3.854f, -2.4f)
                close()
                moveTo(10.0f, 22.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-6.5f)
                lineToRelative(5.213f, 3.247f)
                lineToRelative(2.025f, -3.247f)
                lineToRelative(-5.614f, -3.5f)
                lineToRelative(5.614f, -3.5f)
                lineToRelative(-2.025f, -3.248f)
                lineToRelative(-5.213f, 3.248f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(6.5f)
                lineToRelative(-5.213f, -3.248f)
                lineToRelative(-2.025f, 3.248f)
                lineToRelative(5.614f, 3.5f)
                lineToRelative(-5.614f, 3.5f)
                lineToRelative(2.025f, 3.252f)
                lineToRelative(5.213f, -3.252f)
                close()
            }
        }
        .build()
        return _asterik!!
    }

private var _asterik: ImageVector? = null
