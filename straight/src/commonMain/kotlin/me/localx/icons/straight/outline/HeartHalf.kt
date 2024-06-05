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

public val Icons.Outline.HeartHalf: ImageVector
    get() {
        if (_heartHalf != null) {
            return _heartHalf!!
        }
        _heartHalf = Builder(name = "HeartHalf", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 24.1f)
                lineToRelative(-1.58f, -1.13f)
                curveTo(10.25f, 22.14f, 0.0f, 14.64f, 0.0f, 8.01f)
                curveToRelative(-0.07f, -1.92f, 0.61f, -3.79f, 1.87f, -5.1f)
                curveToRelative(1.2f, -1.25f, 2.81f, -1.91f, 4.64f, -1.91f)
                curveToRelative(2.28f, 0.05f, 4.36f, 1.29f, 5.46f, 3.26f)
                curveToRelative(0.2f, 0.3f, 1.02f, 1.68f, 1.02f, 3.74f)
                verticalLineTo(24.1f)
                close()
                moveTo(6.5f, 3.0f)
                curveToRelative(-1.26f, 0.0f, -2.37f, 0.45f, -3.18f, 1.29f)
                curveToRelative(-0.89f, 0.92f, -1.36f, 2.26f, -1.31f, 3.68f)
                curveToRelative(0.0f, 4.01f, 5.23f, 9.18f, 9.0f, 12.18f)
                verticalLineTo(8.0f)
                curveToRelative(0.0f, -3.61f, -2.94f, -4.97f, -4.5f, -5.0f)
                close()
            }
        }
        .build()
        return _heartHalf!!
    }

private var _heartHalf: ImageVector? = null
