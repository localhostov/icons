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

public val Icons.Outline.PenClip: ImageVector
    get() {
        if (_penClip != null) {
            return _penClip!!
        }
        _penClip = Builder(name = "PenClip", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.66f, 0.78f)
                curveToRelative(-1.43f, -1.17f, -3.61f, -1.01f, -4.98f, 0.36f)
                lineToRelative(-1.39f, 1.39f)
                lineToRelative(-0.72f, -0.72f)
                curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, 0.0f)
                lineTo(6.47f, 6.67f)
                lineToRelative(1.41f, 1.41f)
                lineTo(12.74f, 3.23f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                lineToRelative(0.72f, 0.72f)
                lineTo(3.43f, 15.39f)
                curveToRelative(-1.08f, 1.08f, -1.49f, 4.02f, -1.62f, 5.35f)
                lineTo(0.04f, 22.51f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.77f, -1.77f)
                curveToRelative(1.33f, -0.13f, 4.27f, -0.53f, 5.35f, -1.62f)
                lineTo(22.93f, 6.18f)
                curveToRelative(0.73f, -0.73f, 1.11f, -1.73f, 1.06f, -2.76f)
                curveToRelative(-0.05f, -1.02f, -0.54f, -1.99f, -1.34f, -2.64f)
                close()
                moveTo(7.16f, 19.12f)
                curveToRelative(-0.36f, 0.36f, -1.79f, 0.72f, -3.25f, 0.93f)
                curveToRelative(0.21f, -1.46f, 0.57f, -2.89f, 0.93f, -3.25f)
                lineTo(16.29f, 5.36f)
                lineToRelative(2.32f, 2.32f)
                lineTo(7.16f, 19.12f)
                close()
                moveTo(21.52f, 4.76f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(-2.32f, -2.32f)
                lineToRelative(1.39f, -1.39f)
                curveToRelative(0.37f, -0.37f, 0.85f, -0.56f, 1.32f, -0.56f)
                curveToRelative(0.36f, 0.0f, 0.7f, 0.11f, 0.98f, 0.34f)
                curveToRelative(0.37f, 0.3f, 0.58f, 0.72f, 0.61f, 1.19f)
                curveToRelative(0.02f, 0.46f, -0.15f, 0.92f, -0.48f, 1.24f)
                close()
            }
        }
        .build()
        return _penClip!!
    }

private var _penClip: ImageVector? = null
