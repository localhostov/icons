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

public val Icons.Bold.EarDeaf: ImageVector
    get() {
        if (_earDeaf != null) {
            return _earDeaf!!
        }
        _earDeaf = Builder(name = "EarDeaf", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.56f, 15.56f)
                lineTo(2.56f, 23.56f)
                curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
                reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
                curveToRelative(-0.59f, -0.59f, -0.59f, -1.54f, 0.0f, -2.12f)
                lineTo(8.44f, 13.44f)
                curveToRelative(0.59f, -0.59f, 1.54f, -0.59f, 2.12f, 0.0f)
                curveToRelative(0.59f, 0.59f, 0.59f, 1.54f, 0.0f, 2.12f)
                close()
                moveTo(23.56f, 0.44f)
                curveToRelative(-0.59f, -0.59f, -1.54f, -0.59f, -2.12f, 0.0f)
                lineToRelative(-2.44f, 2.44f)
                curveTo(17.45f, 1.35f, 15.4f, 0.32f, 13.15f, 0.06f)
                curveToRelative(-2.78f, -0.31f, -5.47f, 0.5f, -7.59f, 2.29f)
                curveToRelative(-2.09f, 1.76f, -3.38f, 4.34f, -3.54f, 7.06f)
                curveToRelative(-0.05f, 0.83f, 0.58f, 1.54f, 1.41f, 1.58f)
                curveToRelative(0.83f, 0.05f, 1.54f, -0.58f, 1.58f, -1.41f)
                curveToRelative(0.11f, -1.91f, 1.01f, -3.71f, 2.48f, -4.94f)
                curveToRelative(1.48f, -1.25f, 3.37f, -1.82f, 5.32f, -1.6f)
                curveToRelative(3.16f, 0.35f, 5.74f, 2.9f, 6.13f, 6.06f)
                curveToRelative(0.22f, 1.79f, -0.24f, 3.57f, -1.28f, 4.99f)
                curveToRelative(-0.41f, 0.42f, -1.67f, 1.68f, -1.67f, 3.77f)
                reflectiveCurveToRelative(-1.76f, 3.13f, -3.5f, 3.13f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                curveToRelative(3.71f, 0.0f, 6.5f, -2.63f, 6.5f, -6.13f)
                curveToRelative(0.0f, -0.86f, 0.5f, -1.36f, 0.8f, -1.66f)
                curveToRelative(0.14f, -0.14f, 0.23f, -0.25f, 0.29f, -0.32f)
                curveToRelative(1.5f, -2.05f, 2.15f, -4.59f, 1.84f, -7.14f)
                curveToRelative(-0.15f, -1.23f, -0.54f, -2.39f, -1.11f, -3.44f)
                lineToRelative(2.74f, -2.74f)
                curveToRelative(0.59f, -0.59f, 0.59f, -1.54f, 0.0f, -2.12f)
                close()
                moveTo(13.51f, 13.62f)
                curveToRelative(0.29f, 0.25f, 0.64f, 0.38f, 0.99f, 0.38f)
                curveToRelative(0.42f, 0.0f, 0.83f, -0.17f, 1.13f, -0.51f)
                curveToRelative(0.84f, -0.95f, 1.38f, -2.32f, 1.38f, -3.49f)
                curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f)
                curveToRelative(-2.49f, 0.0f, -4.64f, 1.84f, -4.98f, 4.29f)
                curveToRelative(-0.12f, 0.82f, 0.45f, 1.58f, 1.27f, 1.7f)
                curveToRelative(0.82f, 0.12f, 1.58f, -0.45f, 1.7f, -1.27f)
                curveToRelative(0.14f, -0.98f, 1.01f, -1.71f, 2.02f, -1.71f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                curveToRelative(0.0f, 0.46f, -0.27f, 1.1f, -0.62f, 1.51f)
                curveToRelative(-0.55f, 0.62f, -0.49f, 1.57f, 0.13f, 2.12f)
                close()
            }
        }
        .build()
        return _earDeaf!!
    }

private var _earDeaf: ImageVector? = null
