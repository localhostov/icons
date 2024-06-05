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

public val Icons.Bold.HeadSide: ImageVector
    get() {
        if (_headSide != null) {
            return _headSide!!
        }
        _headSide = Builder(name = "HeadSide", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.97f, 20.93f)
                curveToRelative(2.38f, -0.38f, 4.28f, -2.29f, 4.59f, -4.74f)
                lineToRelative(0.15f, -1.19f)
                curveToRelative(1.48f, -0.09f, 2.28f, -1.3f, 2.28f, -2.45f)
                curveToRelative(0.0f, -1.65f, -3.1f, -6.83f, -4.13f, -8.13f)
                curveTo(17.38f, 1.11f, 13.29f, -0.52f, 9.18f, 0.15f)
                curveTo(4.95f, 0.85f, 1.5f, 3.97f, 0.39f, 8.1f)
                curveToRelative(-0.9f, 3.33f, -0.17f, 6.85f, 2.0f, 9.64f)
                curveToRelative(0.28f, 0.36f, 0.61f, 0.93f, 0.61f, 1.64f)
                verticalLineToRelative(1.12f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.78f, 0.0f, 3.26f, -1.34f, 3.47f, -3.07f)
                close()
                moveTo(17.48f, 6.23f)
                reflectiveCurveToRelative(0.02f, 0.03f, 0.03f, 0.04f)
                curveToRelative(0.96f, 1.19f, 2.65f, 4.25f, 3.27f, 5.72f)
                horizontalLineToRelative(-0.39f)
                curveToRelative(-0.76f, 0.0f, -1.39f, 0.56f, -1.49f, 1.31f)
                lineToRelative(-0.32f, 2.5f)
                curveToRelative(-0.16f, 1.25f, -1.22f, 2.19f, -2.48f, 2.19f)
                horizontalLineToRelative(-0.61f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(6.5f, 20.99f)
                curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-1.12f)
                curveToRelative(0.0f, -1.23f, -0.43f, -2.44f, -1.24f, -3.48f)
                curveToRelative(-0.93f, -1.2f, -2.37f, -3.71f, -1.47f, -7.02f)
                curveToRelative(0.79f, -2.95f, 3.36f, -5.27f, 6.38f, -5.76f)
                curveToRelative(0.45f, -0.07f, 0.9f, -0.11f, 1.34f, -0.11f)
                curveToRelative(2.53f, 0.0f, 4.92f, 1.17f, 6.47f, 3.23f)
                close()
            }
        }
        .build()
        return _headSide!!
    }

private var _headSide: ImageVector? = null
