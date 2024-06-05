package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled._1: ImageVector
    get() {
        if (__1 != null) {
            return __1!!
        }
        __1 = Builder(name = "_1", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 24.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineTo(2.011f)
                lineToRelative(-5.215f, 6.608f)
                curveToRelative(-0.342f, 0.434f, -0.972f, 0.507f, -1.405f, 0.166f)
                curveToRelative(-0.434f, -0.342f, -0.507f, -0.971f, -0.166f, -1.405f)
                curveToRelative(0.0f, 0.0f, 5.343f, -6.767f, 5.371f, -6.794f)
                curveTo(11.16f, 0.012f, 12.016f, -0.157f, 12.766f, 0.152f)
                curveToRelative(0.75f, 0.311f, 1.234f, 1.036f, 1.234f, 1.848f)
                verticalLineTo(23.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return __1!!
    }

private var __1: ImageVector? = null
