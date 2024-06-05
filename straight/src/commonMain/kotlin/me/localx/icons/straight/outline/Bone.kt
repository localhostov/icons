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

public val Icons.Outline.Bone: ImageVector
    get() {
        if (_bone != null) {
            return _bone!!
        }
        _bone = Builder(name = "Bone", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 24.0f)
                curveToRelative(-2.0f, 0.0f, -3.74f, -1.33f, -4.31f, -3.19f)
                curveToRelative(-1.86f, -0.57f, -3.19f, -2.31f, -3.19f, -4.31f)
                curveToRelative(0.0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                curveToRelative(0.89f, 0.0f, 1.76f, 0.27f, 2.5f, 0.76f)
                lineToRelative(5.76f, -5.76f)
                curveToRelative(-0.49f, -0.73f, -0.76f, -1.61f, -0.76f, -2.5f)
                curveToRelative(0.0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                curveToRelative(2.0f, 0.0f, 3.74f, 1.33f, 4.31f, 3.19f)
                curveToRelative(1.86f, 0.57f, 3.19f, 2.31f, 3.19f, 4.31f)
                curveToRelative(0.0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                curveToRelative(-0.89f, 0.0f, -1.76f, -0.27f, -2.5f, -0.76f)
                lineToRelative(-5.76f, 5.76f)
                curveToRelative(0.49f, 0.73f, 0.76f, 1.61f, 0.76f, 2.5f)
                curveToRelative(0.0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(4.5f, 14.0f)
                curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0.0f, 1.25f, 0.93f, 2.31f, 2.16f, 2.48f)
                lineToRelative(0.76f, 0.1f)
                lineToRelative(0.1f, 0.76f)
                curveToRelative(0.17f, 1.23f, 1.23f, 2.16f, 2.48f, 2.16f)
                curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.7f, -0.28f, -1.35f, -0.8f, -1.83f)
                lineToRelative(-0.76f, -0.71f)
                lineToRelative(8.52f, -8.52f)
                lineToRelative(0.71f, 0.76f)
                curveToRelative(0.48f, 0.51f, 1.13f, 0.79f, 1.83f, 0.79f)
                curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0.0f, -1.25f, -0.93f, -2.31f, -2.16f, -2.48f)
                lineToRelative(-0.76f, -0.1f)
                lineToRelative(-0.1f, -0.76f)
                curveToRelative(-0.17f, -1.23f, -1.23f, -2.16f, -2.48f, -2.16f)
                curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0.0f, 0.7f, 0.28f, 1.35f, 0.8f, 1.83f)
                lineToRelative(0.76f, 0.71f)
                lineTo(7.03f, 15.55f)
                lineToRelative(-0.71f, -0.76f)
                curveToRelative(-0.48f, -0.51f, -1.13f, -0.79f, -1.83f, -0.79f)
                close()
            }
        }
        .build()
        return _bone!!
    }

private var _bone: ImageVector? = null
