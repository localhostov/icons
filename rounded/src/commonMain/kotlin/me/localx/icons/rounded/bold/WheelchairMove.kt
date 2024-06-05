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

public val Icons.Bold.WheelchairMove: ImageVector
    get() {
        if (_wheelchairMove != null) {
            return _wheelchairMove!!
        }
        _wheelchairMove = Builder(name = "WheelchairMove", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 2.5f)
                curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(22.62f, 15.19f)
                curveToRelative(-0.46f, -0.74f, -1.25f, -1.19f, -2.13f, -1.19f)
                horizontalLineToRelative(-4.09f)
                lineToRelative(2.3f, -4.97f)
                curveToRelative(0.41f, -0.88f, 0.34f, -1.9f, -0.18f, -2.72f)
                curveToRelative(-0.52f, -0.82f, -1.42f, -1.31f, -2.39f, -1.31f)
                horizontalLineToRelative(-4.43f)
                curveToRelative(-1.7f, 0.0f, -3.29f, 0.99f, -4.04f, 2.52f)
                lineToRelative(-1.14f, 2.32f)
                curveToRelative(-0.37f, 0.74f, -0.06f, 1.64f, 0.69f, 2.01f)
                curveToRelative(0.21f, 0.1f, 0.44f, 0.15f, 0.66f, 0.15f)
                curveToRelative(0.55f, 0.0f, 1.09f, -0.31f, 1.35f, -0.84f)
                lineToRelative(1.14f, -2.32f)
                curveToRelative(0.25f, -0.51f, 0.78f, -0.84f, 1.35f, -0.84f)
                horizontalLineToRelative(0.92f)
                lineToRelative(-2.37f, 5.1f)
                curveToRelative(-0.4f, 0.85f, -0.33f, 1.84f, 0.18f, 2.63f)
                reflectiveCurveToRelative(1.37f, 1.27f, 2.32f, 1.27f)
                horizontalLineToRelative(1.17f)
                curveToRelative(-0.44f, 2.31f, -2.47f, 4.07f, -4.91f, 4.07f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                curveToRelative(0.0f, -0.98f, 0.28f, -1.93f, 0.82f, -2.75f)
                curveToRelative(0.46f, -0.69f, 0.27f, -1.62f, -0.43f, -2.08f)
                curveToRelative(-0.69f, -0.45f, -1.62f, -0.27f, -2.08f, 0.43f)
                curveToRelative(-0.86f, 1.31f, -1.32f, 2.83f, -1.32f, 4.4f)
                curveToRelative(0.0f, 4.41f, 3.59f, 8.0f, 8.0f, 8.0f)
                curveToRelative(4.1f, 0.0f, 7.48f, -3.1f, 7.94f, -7.07f)
                horizontalLineToRelative(2.73f)
                lineToRelative(-2.5f, 4.81f)
                curveToRelative(-0.38f, 0.73f, -0.1f, 1.64f, 0.64f, 2.02f)
                curveToRelative(0.22f, 0.12f, 0.46f, 0.17f, 0.69f, 0.17f)
                curveToRelative(0.54f, 0.0f, 1.06f, -0.29f, 1.33f, -0.81f)
                lineToRelative(2.91f, -5.58f)
                curveToRelative(0.39f, -0.78f, 0.35f, -1.69f, -0.11f, -2.43f)
                close()
            }
        }
        .build()
        return _wheelchairMove!!
    }

private var _wheelchairMove: ImageVector? = null
