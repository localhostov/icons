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

public val Icons.Outline._7: ImageVector
    get() {
        if (__7 != null) {
            return __7!!
        }
        __7 = Builder(name = "_7", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.933f, 24.012f)
                lineToRelative(-1.789f, -0.894f)
                lineToRelative(10.546f, -21.118f)
                lineToRelative(-13.69f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(16.0f, 0.0f)
                lineToRelative(0.0f, 1.851f)
                lineToRelative(-11.067f, 22.161f)
                close()
            }
        }
        .build()
        return __7!!
    }

private var __7: ImageVector? = null
