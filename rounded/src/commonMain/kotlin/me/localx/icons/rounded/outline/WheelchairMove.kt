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

public val Icons.Outline.WheelchairMove: ImageVector
    get() {
        if (_wheelchairMove != null) {
            return _wheelchairMove!!
        }
        _wheelchairMove = Builder(name = "WheelchairMove", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 2.5f)
                curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(22.79f, 17.89f)
                lineToRelative(-2.9f, 5.57f)
                curveToRelative(-0.18f, 0.34f, -0.53f, 0.54f, -0.89f, 0.54f)
                curveToRelative(-0.16f, 0.0f, -0.31f, -0.04f, -0.46f, -0.11f)
                curveToRelative(-0.49f, -0.26f, -0.68f, -0.86f, -0.42f, -1.35f)
                lineToRelative(2.89f, -5.55f)
                horizontalLineToRelative(-3.07f)
                curveToRelative(-0.49f, 3.95f, -3.86f, 7.01f, -7.94f, 7.01f)
                curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f)
                curveToRelative(0.0f, -2.17f, 0.85f, -4.2f, 2.4f, -5.71f)
                curveToRelative(0.4f, -0.39f, 1.03f, -0.38f, 1.41f, 0.01f)
                curveToRelative(0.39f, 0.39f, 0.38f, 1.03f, -0.01f, 1.41f)
                curveToRelative(-1.16f, 1.14f, -1.8f, 2.66f, -1.8f, 4.29f)
                curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f)
                curveToRelative(2.97f, 0.0f, 5.44f, -2.17f, 5.92f, -5.0f)
                horizontalLineToRelative(-2.18f)
                curveToRelative(-0.94f, 0.0f, -1.81f, -0.47f, -2.32f, -1.27f)
                reflectiveCurveToRelative(-0.57f, -1.78f, -0.18f, -2.63f)
                lineToRelative(2.83f, -6.1f)
                horizontalLineToRelative(-0.76f)
                curveToRelative(-0.76f, 0.0f, -1.46f, 0.44f, -1.8f, 1.12f)
                lineToRelative(-1.63f, 3.32f)
                curveToRelative(-0.24f, 0.5f, -0.84f, 0.7f, -1.34f, 0.46f)
                curveToRelative(-0.5f, -0.24f, -0.7f, -0.84f, -0.46f, -1.34f)
                lineToRelative(1.63f, -3.32f)
                curveToRelative(0.67f, -1.36f, 2.08f, -2.24f, 3.59f, -2.24f)
                horizontalLineToRelative(3.8f)
                curveToRelative(0.97f, 0.0f, 1.87f, 0.49f, 2.39f, 1.31f)
                curveToRelative(0.52f, 0.82f, 0.59f, 1.84f, 0.18f, 2.72f)
                lineToRelative(-2.76f, 5.97f)
                horizontalLineToRelative(4.06f)
                curveToRelative(0.7f, 0.0f, 1.33f, 0.35f, 1.7f, 0.95f)
                reflectiveCurveToRelative(0.4f, 1.32f, 0.09f, 1.95f)
                close()
                moveTo(13.74f, 15.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(3.15f, -6.81f)
                curveToRelative(0.17f, -0.38f, 0.02f, -0.69f, -0.05f, -0.8f)
                reflectiveCurveToRelative(-0.29f, -0.39f, -0.71f, -0.39f)
                horizontalLineToRelative(-0.84f)
                lineToRelative(-3.22f, 6.94f)
                curveToRelative(-0.16f, 0.33f, -0.02f, 0.61f, 0.05f, 0.72f)
                curveToRelative(0.07f, 0.1f, 0.26f, 0.35f, 0.63f, 0.35f)
                close()
            }
        }
        .build()
        return _wheelchairMove!!
    }

private var _wheelchairMove: ImageVector? = null
