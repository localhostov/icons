package me.localx.icons.rounded.outline

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
                moveTo(24.0f, 3.46f)
                curveToRelative(-0.05f, -1.03f, -0.54f, -1.99f, -1.34f, -2.64f)
                curveToRelative(-1.43f, -1.17f, -3.61f, -1.01f, -4.98f, 0.36f)
                lineToRelative(-1.67f, 1.67f)
                curveToRelative(-0.81f, -0.54f, -1.77f, -0.84f, -2.77f, -0.84f)
                curveToRelative(-1.34f, 0.0f, -2.59f, 0.52f, -3.54f, 1.46f)
                lineToRelative(-3.03f, 3.03f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                reflectiveCurveToRelative(1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(3.03f, -3.03f)
                curveToRelative(0.89f, -0.89f, 2.3f, -1.08f, 3.42f, -0.57f)
                lineTo(2.07f, 16.79f)
                curveToRelative(-0.69f, 0.69f, -1.07f, 1.6f, -1.07f, 2.57f)
                curveToRelative(0.0f, 0.63f, 0.16f, 1.23f, 0.46f, 1.77f)
                lineToRelative(-1.16f, 1.16f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(1.16f, -1.16f)
                curveToRelative(0.53f, 0.3f, 1.14f, 0.46f, 1.77f, 0.46f)
                curveToRelative(0.97f, 0.0f, 1.89f, -0.38f, 2.57f, -1.07f)
                lineTo(22.93f, 6.21f)
                curveToRelative(0.73f, -0.73f, 1.11f, -1.73f, 1.06f, -2.76f)
                close()
                moveTo(5.8f, 20.52f)
                curveToRelative(-0.62f, 0.62f, -1.7f, 0.62f, -2.32f, 0.0f)
                curveToRelative(-0.31f, -0.31f, -0.48f, -0.72f, -0.48f, -1.16f)
                reflectiveCurveToRelative(0.17f, -0.85f, 0.48f, -1.16f)
                lineTo(16.08f, 5.61f)
                lineToRelative(2.32f, 2.32f)
                lineTo(5.8f, 20.52f)
                close()
                moveTo(21.52f, 4.8f)
                lineToRelative(-1.71f, 1.71f)
                lineToRelative(-2.32f, -2.32f)
                lineToRelative(1.6f, -1.6f)
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
