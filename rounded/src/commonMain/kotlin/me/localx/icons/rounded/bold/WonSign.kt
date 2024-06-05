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

public val Icons.Bold.WonSign: ImageVector
    get() {
        if (_wonSign != null) {
            return _wonSign!!
        }
        _wonSign = Builder(name = "WonSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 13.0f)
                horizontalLineToRelative(-0.4f)
                lineToRelative(1.88f, -11.26f)
                curveToRelative(0.14f, -0.82f, -0.42f, -1.59f, -1.23f, -1.73f)
                curveToRelative(-0.82f, -0.14f, -1.59f, 0.42f, -1.73f, 1.23f)
                lineToRelative(-1.96f, 11.75f)
                horizontalLineToRelative(-4.71f)
                lineToRelative(-0.89f, -3.84f)
                curveToRelative(-0.16f, -0.68f, -0.76f, -1.16f, -1.46f, -1.16f)
                reflectiveCurveToRelative(-1.3f, 0.48f, -1.46f, 1.16f)
                lineToRelative(-0.89f, 3.84f)
                lineTo(4.94f, 12.99f)
                lineTo(2.98f, 1.25f)
                curveTo(2.84f, 0.43f, 2.07f, -0.12f, 1.25f, 0.01f)
                curveTo(0.44f, 0.15f, -0.12f, 0.92f, 0.02f, 1.74f)
                lineTo(1.9f, 13.0f)
                horizontalLineToRelative(-0.4f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.9f)
                lineToRelative(0.79f, 4.71f)
                curveToRelative(0.3f, 1.81f, 1.74f, 3.13f, 3.57f, 3.27f)
                curveToRelative(1.83f, 0.15f, 3.46f, -0.93f, 4.04f, -2.67f)
                curveToRelative(0.01f, -0.04f, 1.21f, -5.18f, 1.21f, -5.18f)
                curveToRelative(0.0f, 0.0f, 1.19f, 5.13f, 1.21f, 5.18f)
                curveToRelative(0.55f, 1.64f, 2.01f, 2.69f, 3.71f, 2.69f)
                curveToRelative(0.11f, 0.0f, 0.22f, 0.0f, 0.33f, -0.01f)
                curveToRelative(1.83f, -0.14f, 3.27f, -1.46f, 3.57f, -3.27f)
                lineToRelative(0.79f, -4.71f)
                horizontalLineToRelative(0.9f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(6.99f, 20.99f)
                curveToRelative(-0.22f, -0.02f, -0.74f, -0.13f, -0.85f, -0.77f)
                lineToRelative(-0.7f, -4.22f)
                horizontalLineToRelative(3.51f)
                lineToRelative(-1.02f, 4.41f)
                curveToRelative(-0.22f, 0.57f, -0.72f, 0.6f, -0.94f, 0.58f)
                close()
                moveTo(17.86f, 20.22f)
                curveToRelative(-0.11f, 0.65f, -0.63f, 0.76f, -0.85f, 0.77f)
                curveToRelative(-0.21f, 0.02f, -0.72f, 0.0f, -0.94f, -0.58f)
                lineToRelative(-1.02f, -4.41f)
                horizontalLineToRelative(3.51f)
                lineToRelative(-0.7f, 4.22f)
                close()
            }
        }
        .build()
        return _wonSign!!
    }

private var _wonSign: ImageVector? = null
