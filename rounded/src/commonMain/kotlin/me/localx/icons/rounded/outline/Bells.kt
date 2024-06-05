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
                moveTo(23.83f, 14.12f)
                lineToRelative(-1.56f, -5.84f)
                curveToRelative(-0.88f, -3.15f, -3.47f, -5.48f, -6.58f, -6.11f)
                curveToRelative(-0.01f, -0.01f, -0.02f, -0.03f, -0.03f, -0.04f)
                curveToRelative(-1.57f, -1.38f, -3.58f, -2.14f, -5.66f, -2.14f)
                curveTo(5.94f, 0.0f, 2.5f, 2.76f, 1.63f, 6.68f)
                lineTo(0.11f, 12.35f)
                curveToRelative(-0.31f, 1.38f, 0.03f, 2.81f, 0.91f, 3.91f)
                curveToRelative(0.89f, 1.1f, 2.21f, 1.74f, 3.62f, 1.74f)
                horizontalLineToRelative(0.19f)
                curveToRelative(0.06f, 0.09f, 0.12f, 0.18f, 0.19f, 0.26f)
                curveToRelative(0.89f, 1.1f, 2.21f, 1.74f, 3.62f, 1.74f)
                horizontalLineToRelative(0.96f)
                curveToRelative(0.23f, 2.24f, 2.1f, 4.0f, 4.4f, 4.0f)
                reflectiveCurveToRelative(4.17f, -1.76f, 4.4f, -4.0f)
                horizontalLineToRelative(0.95f)
                curveToRelative(1.46f, 0.0f, 2.81f, -0.67f, 3.7f, -1.84f)
                curveToRelative(0.88f, -1.17f, 1.17f, -2.64f, 0.78f, -4.04f)
                close()
                moveTo(2.58f, 15.01f)
                curveToRelative(-0.5f, -0.63f, -0.69f, -1.44f, -0.53f, -2.19f)
                lineToRelative(1.52f, -5.67f)
                curveToRelative(0.67f, -3.04f, 3.32f, -5.16f, 6.43f, -5.16f)
                curveToRelative(0.62f, 0.0f, 1.22f, 0.11f, 1.8f, 0.28f)
                curveToRelative(-3.05f, 0.8f, -5.46f, 3.22f, -6.17f, 6.4f)
                lineToRelative(-1.52f, 5.67f)
                curveToRelative(-0.12f, 0.53f, -0.14f, 1.06f, -0.08f, 1.58f)
                curveToRelative(-0.57f, -0.13f, -1.08f, -0.45f, -1.45f, -0.92f)
                close()
                moveTo(14.0f, 22.0f)
                curveToRelative(-1.2f, 0.0f, -2.19f, -0.86f, -2.4f, -2.0f)
                horizontalLineToRelative(4.8f)
                curveToRelative(-0.21f, 1.14f, -1.2f, 2.0f, -2.4f, 2.0f)
                close()
                moveTo(21.46f, 16.96f)
                curveToRelative(-0.5f, 0.66f, -1.27f, 1.04f, -2.11f, 1.04f)
                lineTo(8.64f, 18.0f)
                curveToRelative(-0.81f, 0.0f, -1.56f, -0.36f, -2.06f, -0.99f)
                curveToRelative(-0.5f, -0.63f, -0.69f, -1.44f, -0.53f, -2.19f)
                lineToRelative(1.52f, -5.67f)
                curveToRelative(0.67f, -3.04f, 3.32f, -5.16f, 6.43f, -5.16f)
                curveToRelative(2.95f, 0.0f, 5.55f, 1.98f, 6.34f, 4.81f)
                lineToRelative(1.56f, 5.84f)
                curveToRelative(0.22f, 0.8f, 0.06f, 1.64f, -0.44f, 2.31f)
                close()
            }
        }
        .build()
        return _bells!!
    }

private var _bells: ImageVector? = null
