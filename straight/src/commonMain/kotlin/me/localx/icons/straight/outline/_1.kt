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

public val Icons.Outline._1: ImageVector
    get() {
        if (__1 != null) {
            return __1!!
        }
        __1 = Builder(name = "_1", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 24.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, -20.724f)
                lineToRelative(-5.562f, 5.719f)
                lineToRelative(-1.434f, -1.394f)
                lineToRelative(7.392f, -7.601f)
                lineToRelative(1.604f, 0.0f)
                lineToRelative(0.0f, 24.0f)
                close()
            }
        }
        .build()
        return __1!!
    }

private var __1: ImageVector? = null
