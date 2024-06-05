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

public val Icons.Outline.CircleHalf: ImageVector
    get() {
        if (_circleHalf != null) {
            return _circleHalf!!
        }
        _circleHalf = Builder(name = "CircleHalf", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.99f, 24.0f)
                curveToRelative(-0.22f, 0.0f, -0.44f, -0.02f, -0.65f, -0.07f)
                curveTo(3.93f, 22.75f, 0.0f, 17.74f, 0.0f, 12.0f)
                reflectiveCurveTo(3.93f, 1.25f, 9.33f, 0.07f)
                curveToRelative(0.9f, -0.2f, 1.83f, 0.02f, 2.55f, 0.6f)
                curveToRelative(0.71f, 0.57f, 1.12f, 1.42f, 1.12f, 2.33f)
                lineTo(13.0f, 21.0f)
                curveToRelative(0.0f, 0.91f, -0.41f, 1.76f, -1.12f, 2.33f)
                curveToRelative(-0.54f, 0.44f, -1.21f, 0.67f, -1.9f, 0.67f)
                close()
                moveTo(9.99f, 2.0f)
                curveToRelative(-0.07f, 0.0f, -0.15f, 0.0f, -0.22f, 0.02f)
                curveTo(5.34f, 2.99f, 2.0f, 7.28f, 2.0f, 12.0f)
                reflectiveCurveToRelative(3.34f, 9.01f, 7.76f, 9.98f)
                curveToRelative(0.31f, 0.07f, 0.62f, 0.0f, 0.87f, -0.2f)
                curveToRelative(0.14f, -0.11f, 0.37f, -0.36f, 0.37f, -0.77f)
                lineTo(11.0f, 3.0f)
                curveToRelative(0.0f, -0.41f, -0.23f, -0.66f, -0.37f, -0.77f)
                curveToRelative(-0.18f, -0.15f, -0.41f, -0.23f, -0.64f, -0.23f)
                close()
            }
        }
        .build()
        return _circleHalf!!
    }

private var _circleHalf: ImageVector? = null
