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

public val Icons.Bold.CircleThreeQuarters: ImageVector
    get() {
        if (_circleThreeQuarters != null) {
            return _circleThreeQuarters!!
        }
        _circleThreeQuarters = Builder(name = "CircleThreeQuarters", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.86f, 24.0f)
                curveToRelative(-1.5f, 0.0f, -3.0f, -0.29f, -4.46f, -0.87f)
                curveToRelative(-2.97f, -1.18f, -5.36f, -3.57f, -6.54f, -6.54f)
                curveTo(-0.44f, 13.3f, -0.26f, 9.76f, 1.37f, 6.62f)
                curveTo(3.06f, 3.36f, 6.16f, 0.93f, 9.65f, 0.1f)
                curveToRelative(1.06f, -0.25f, 2.17f, -0.01f, 3.02f, 0.67f)
                curveToRelative(0.84f, 0.67f, 1.32f, 1.66f, 1.32f, 2.73f)
                verticalLineToRelative(6.51f)
                horizontalLineToRelative(6.5f)
                curveToRelative(1.07f, 0.0f, 2.07f, 0.49f, 2.74f, 1.33f)
                curveToRelative(0.67f, 0.85f, 0.92f, 1.95f, 0.66f, 3.01f)
                curveToRelative(-0.83f, 3.5f, -3.27f, 6.59f, -6.52f, 8.28f)
                curveToRelative(-1.75f, 0.91f, -3.63f, 1.37f, -5.52f, 1.37f)
                close()
                moveTo(10.48f, 3.0f)
                reflectiveCurveToRelative(-0.09f, 0.0f, -0.14f, 0.02f)
                curveToRelative(-2.66f, 0.63f, -5.02f, 2.5f, -6.31f, 4.98f)
                curveToRelative(-1.23f, 2.36f, -1.36f, 5.01f, -0.38f, 7.48f)
                curveToRelative(0.88f, 2.21f, 2.65f, 3.98f, 4.86f, 4.86f)
                curveToRelative(2.47f, 0.98f, 5.12f, 0.85f, 7.48f, -0.38f)
                curveToRelative(2.49f, -1.29f, 4.36f, -3.65f, 4.99f, -6.32f)
                curveToRelative(0.05f, -0.22f, -0.04f, -0.38f, -0.1f, -0.46f)
                curveToRelative(-0.07f, -0.09f, -0.19f, -0.19f, -0.39f, -0.19f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.68f, -1.5f, -1.51f)
                verticalLineTo(3.5f)
                curveToRelative(0.0f, -0.19f, -0.1f, -0.31f, -0.18f, -0.38f)
                curveToRelative(-0.06f, -0.05f, -0.17f, -0.12f, -0.33f, -0.12f)
                close()
            }
        }
        .build()
        return _circleThreeQuarters!!
    }

private var _circleThreeQuarters: ImageVector? = null
