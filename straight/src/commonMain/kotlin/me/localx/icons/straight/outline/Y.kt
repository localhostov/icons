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

public val Icons.Outline.Y: ImageVector
    get() {
        if (_y != null) {
            return _y!!
        }
        _y = Builder(name = "Y", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.041f, 0.0f)
                lineToRelative(-2.482f, 0.0f)
                lineToRelative(-7.559f, 10.308f)
                lineToRelative(-7.559f, -10.308f)
                lineToRelative(-2.482f, 0.0f)
                lineToRelative(9.041f, 12.328f)
                lineToRelative(0.0f, 11.672f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -11.672f)
                lineToRelative(9.041f, -12.328f)
                close()
            }
        }
        .build()
        return _y!!
    }

private var _y: ImageVector? = null
