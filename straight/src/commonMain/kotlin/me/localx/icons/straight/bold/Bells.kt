package me.localx.icons.straight.bold

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

public val Icons.Bold.Bells: ImageVector
    get() {
        if (_bells != null) {
            return _bells!!
        }
        _bells = Builder(name = "Bells", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.91f, 17.05f)
                lineToRelative(-1.65f, -7.82f)
                curveToRelative(-1.03f, -3.67f, -4.42f, -6.24f, -8.26f, -6.24f)
                curveToRelative(-4.05f, 0.0f, -7.49f, 2.74f, -8.37f, 6.69f)
                lineToRelative(-1.55f, 7.43f)
                curveToRelative(-0.21f, 0.95f, 0.02f, 1.93f, 0.63f, 2.69f)
                curveToRelative(0.61f, 0.76f, 1.52f, 1.19f, 2.49f, 1.19f)
                horizontalLineToRelative(3.35f)
                curveToRelative(0.24f, 1.69f, 1.69f, 3.0f, 3.45f, 3.0f)
                reflectiveCurveToRelative(3.21f, -1.31f, 3.45f, -3.0f)
                horizontalLineToRelative(3.35f)
                curveToRelative(0.93f, 0.0f, 1.79f, -0.39f, 2.39f, -1.07f)
                lineToRelative(0.16f, -0.19f)
                curveToRelative(0.61f, -0.8f, 0.81f, -1.82f, 0.56f, -2.69f)
                close()
                moveTo(20.98f, 17.91f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.04f, 0.06f, -0.09f, 0.09f, -0.16f, 0.09f)
                lineTo(7.2f, 18.0f)
                curveToRelative(-0.07f, 0.0f, -0.12f, -0.02f, -0.16f, -0.07f)
                curveToRelative(-0.04f, -0.05f, -0.05f, -0.1f, -0.03f, -0.17f)
                lineToRelative(1.55f, -7.43f)
                curveToRelative(0.57f, -2.55f, 2.81f, -4.33f, 5.44f, -4.33f)
                curveToRelative(2.5f, 0.0f, 4.7f, 1.66f, 5.35f, 3.95f)
                lineToRelative(1.65f, 7.82f)
                curveToRelative(0.01f, 0.05f, 0.0f, 0.1f, -0.02f, 0.15f)
                close()
                moveTo(5.26f, 5.61f)
                curveToRelative(-0.73f, 1.08f, -1.29f, 2.32f, -1.59f, 3.67f)
                lineToRelative(-1.54f, 7.41f)
                curveToRelative(-0.08f, 0.35f, -0.12f, 0.71f, -0.12f, 1.06f)
                curveToRelative(-0.5f, -0.2f, -0.95f, -0.51f, -1.3f, -0.94f)
                curveToRelative(-0.61f, -0.76f, -0.84f, -1.74f, -0.63f, -2.69f)
                lineTo(1.62f, 6.69f)
                curveTo(2.51f, 2.74f, 5.95f, 0.0f, 10.0f, 0.0f)
                curveToRelative(1.43f, 0.0f, 2.81f, 0.36f, 4.02f, 1.0f)
                curveToRelative(0.0f, 0.0f, -0.01f, 0.0f, -0.02f, 0.0f)
                curveToRelative(-3.26f, 0.0f, -6.2f, 1.46f, -8.15f, 3.83f)
                curveToRelative(-0.02f, 0.02f, -0.03f, 0.04f, -0.05f, 0.06f)
                curveToRelative(-0.16f, 0.19f, -0.31f, 0.39f, -0.45f, 0.6f)
                curveToRelative(-0.03f, 0.05f, -0.06f, 0.09f, -0.09f, 0.13f)
                close()
            }
        }
        .build()
        return _bells!!
    }

private var _bells: ImageVector? = null
