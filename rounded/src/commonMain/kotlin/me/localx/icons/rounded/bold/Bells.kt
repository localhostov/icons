package me.localx.icons.rounded.bold

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
                moveTo(23.82f, 14.99f)
                lineToRelative(-1.38f, -4.96f)
                curveToRelative(-0.99f, -3.55f, -4.25f, -6.03f, -7.94f, -6.03f)
                curveToRelative(-3.89f, 0.0f, -7.2f, 2.65f, -8.02f, 6.37f)
                lineToRelative(-1.36f, 4.86f)
                curveToRelative(-0.31f, 1.41f, 0.03f, 2.87f, 0.93f, 3.99f)
                curveToRelative(0.9f, 1.13f, 2.25f, 1.77f, 3.7f, 1.77f)
                horizontalLineToRelative(1.36f)
                curveToRelative(0.22f, 1.69f, 1.65f, 3.0f, 3.4f, 3.0f)
                reflectiveCurveToRelative(3.18f, -1.31f, 3.4f, -3.0f)
                horizontalLineToRelative(1.36f)
                curveToRelative(1.49f, 0.0f, 2.87f, -0.68f, 3.78f, -1.87f)
                curveToRelative(0.9f, -1.19f, 1.19f, -2.7f, 0.79f, -4.14f)
                close()
                moveTo(20.64f, 17.31f)
                curveToRelative(-0.33f, 0.44f, -0.84f, 0.69f, -1.38f, 0.69f)
                lineTo(9.74f, 18.0f)
                curveToRelative(-0.53f, 0.0f, -1.03f, -0.24f, -1.36f, -0.65f)
                curveToRelative(-0.33f, -0.41f, -0.46f, -0.95f, -0.36f, -1.39f)
                lineToRelative(1.36f, -4.86f)
                curveToRelative(0.54f, -2.42f, 2.64f, -4.1f, 5.12f, -4.1f)
                curveToRelative(2.35f, 0.0f, 4.42f, 1.58f, 5.05f, 3.84f)
                lineToRelative(1.38f, 4.96f)
                curveToRelative(0.15f, 0.54f, 0.04f, 1.07f, -0.29f, 1.52f)
                close()
                moveTo(3.02f, 11.96f)
                curveToRelative(-0.09f, 0.44f, 0.03f, 0.97f, 0.36f, 1.39f)
                curveToRelative(0.05f, 0.06f, 0.1f, 0.12f, 0.16f, 0.17f)
                curveToRelative(0.6f, 0.57f, 0.62f, 1.52f, 0.04f, 2.12f)
                curveToRelative(-0.29f, 0.31f, -0.69f, 0.46f, -1.08f, 0.46f)
                reflectiveCurveToRelative(-0.75f, -0.14f, -1.04f, -0.42f)
                curveToRelative(-0.15f, -0.14f, -0.29f, -0.3f, -0.42f, -0.46f)
                curveTo(0.14f, 14.1f, -0.2f, 12.64f, 0.11f, 11.23f)
                lineTo(1.47f, 6.37f)
                curveTo(2.3f, 2.65f, 5.61f, 0.0f, 9.5f, 0.0f)
                curveTo(9.91f, 0.0f, 10.32f, 0.03f, 10.72f, 0.09f)
                curveToRelative(0.82f, 0.12f, 1.38f, 0.89f, 1.26f, 1.71f)
                curveToRelative(-0.12f, 0.82f, -0.88f, 1.38f, -1.71f, 1.26f)
                curveToRelative(-0.26f, -0.04f, -0.52f, -0.06f, -0.78f, -0.06f)
                curveToRelative(-2.47f, 0.0f, -4.58f, 1.69f, -5.12f, 4.1f)
                lineToRelative(-1.36f, 4.86f)
                close()
            }
        }
        .build()
        return _bells!!
    }

private var _bells: ImageVector? = null
