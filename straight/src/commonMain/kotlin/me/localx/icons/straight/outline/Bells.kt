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

public val Icons.Outline.Bells: ImageVector
    get() {
        if (_bells != null) {
            return _bells!!
        }
        _bells = Builder(name = "Bells", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.91f, 16.51f)
                lineToRelative(-1.73f, -8.3f)
                curveToRelative(-0.87f, -3.12f, -3.44f, -5.43f, -6.53f, -6.05f)
                curveToRelative(-1.56f, -1.4f, -3.56f, -2.17f, -5.65f, -2.17f)
                curveTo(5.99f, 0.0f, 2.58f, 2.73f, 1.71f, 6.66f)
                lineTo(0.07f, 14.6f)
                curveToRelative(-0.18f, 0.83f, 0.02f, 1.69f, 0.55f, 2.36f)
                curveToRelative(0.53f, 0.67f, 1.33f, 1.05f, 2.18f, 1.05f)
                horizontalLineToRelative(1.33f)
                curveToRelative(0.1f, 0.34f, 0.26f, 0.67f, 0.49f, 0.95f)
                curveToRelative(0.53f, 0.67f, 1.33f, 1.05f, 2.18f, 1.05f)
                horizontalLineToRelative(2.75f)
                curveToRelative(0.25f, 2.24f, 2.14f, 4.0f, 4.45f, 4.0f)
                reflectiveCurveToRelative(4.2f, -1.76f, 4.45f, -4.0f)
                horizontalLineToRelative(2.75f)
                curveToRelative(0.83f, 0.0f, 1.6f, -0.36f, 2.13f, -0.98f)
                lineToRelative(0.1f, -0.12f)
                curveToRelative(0.53f, -0.7f, 0.7f, -1.59f, 0.48f, -2.38f)
                close()
                moveTo(4.19f, 16.0f)
                horizontalLineToRelative(-1.39f)
                curveToRelative(-0.25f, 0.0f, -0.47f, -0.11f, -0.62f, -0.3f)
                reflectiveCurveToRelative(-0.21f, -0.44f, -0.16f, -0.69f)
                lineToRelative(1.64f, -7.93f)
                curveToRelative(0.67f, -2.99f, 3.27f, -5.08f, 6.33f, -5.08f)
                curveToRelative(0.63f, 0.0f, 1.25f, 0.09f, 1.85f, 0.27f)
                curveToRelative(-3.03f, 0.78f, -5.43f, 3.19f, -6.14f, 6.39f)
                lineToRelative(-1.52f, 7.34f)
                close()
                moveTo(14.0f, 22.0f)
                curveToRelative(-1.21f, 0.0f, -2.22f, -0.86f, -2.45f, -2.0f)
                horizontalLineToRelative(4.9f)
                curveToRelative(-0.23f, 1.14f, -1.24f, 2.0f, -2.45f, 2.0f)
                close()
                moveTo(21.86f, 17.66f)
                lineToRelative(-0.02f, 0.02f)
                curveToRelative(-0.16f, 0.2f, -0.38f, 0.32f, -0.64f, 0.32f)
                lineTo(6.8f, 18.0f)
                curveToRelative(-0.24f, 0.0f, -0.47f, -0.11f, -0.62f, -0.3f)
                curveToRelative(-0.15f, -0.19f, -0.21f, -0.44f, -0.15f, -0.69f)
                lineToRelative(1.64f, -7.93f)
                curveToRelative(0.67f, -2.99f, 3.27f, -5.08f, 6.33f, -5.08f)
                curveToRelative(2.9f, 0.0f, 5.48f, 1.95f, 6.24f, 4.69f)
                lineToRelative(1.73f, 8.3f)
                curveToRelative(0.07f, 0.24f, 0.02f, 0.48f, -0.12f, 0.68f)
                close()
            }
        }
        .build()
        return _bells!!
    }

private var _bells: ImageVector? = null
