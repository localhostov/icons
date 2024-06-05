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

public val Icons.Outline.H: ImageVector
    get() {
        if (_h != null) {
            return _h!!
        }
        _h = Builder(name = "H", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 0.0f)
                lineToRelative(0.0f, 11.0f)
                lineToRelative(-16.0f, 0.0f)
                lineToRelative(0.0f, -11.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 24.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -11.0f)
                lineToRelative(16.0f, 0.0f)
                lineToRelative(0.0f, 11.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -24.0f)
                lineToRelative(-2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _h!!
    }

private var _h: ImageVector? = null
