package me.localx.icons.straight.outline

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

public val Icons.Outline.CandyCane: ImageVector
    get() {
        if (_candyCane != null) {
            return _candyCane!!
        }
        _candyCane = Builder(name = "CandyCane", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.99f, 7.12f)
                curveToRelative(-0.06f, -1.95f, -0.89f, -3.77f, -2.36f, -5.14f)
                curveTo(20.17f, 0.63f, 18.26f, -0.07f, 16.28f, 0.0f)
                curveToRelative(-1.99f, 0.08f, -3.84f, 0.92f, -5.19f, 2.38f)
                curveToRelative(-0.68f, 0.73f, -1.98f, 2.52f, -6.05f, 10.0f)
                curveTo(2.84f, 16.41f, 0.56f, 20.49f, 0.56f, 20.49f)
                lineToRelative(-0.5f, 0.9f)
                lineToRelative(5.09f, 2.64f)
                lineToRelative(0.47f, -0.85f)
                reflectiveCurveToRelative(2.27f, -4.06f, 4.45f, -8.06f)
                curveToRelative(4.14f, -7.59f, 5.12f, -8.73f, 5.22f, -8.84f)
                curveToRelative(0.65f, -0.7f, 1.75f, -0.75f, 2.44f, -0.1f)
                curveToRelative(0.66f, 0.62f, 0.67f, 1.65f, 0.02f, 2.35f)
                lineToRelative(-1.0f, 1.39f)
                lineToRelative(4.81f, 3.28f)
                lineToRelative(0.58f, -0.74f)
                curveToRelative(1.26f, -1.63f, 1.9f, -3.47f, 1.85f, -5.34f)
                close()
                moveTo(10.37f, 7.0f)
                horizontalLineToRelative(2.02f)
                curveToRelative(-0.45f, 0.73f, -1.03f, 1.71f, -1.77f, 3.0f)
                horizontalLineToRelative(-1.99f)
                curveToRelative(0.65f, -1.16f, 1.23f, -2.15f, 1.73f, -3.0f)
                close()
                moveTo(7.53f, 12.0f)
                horizontalLineToRelative(1.98f)
                curveToRelative(-0.37f, 0.66f, -0.76f, 1.38f, -1.19f, 2.16f)
                curveToRelative(-0.15f, 0.28f, -0.3f, 0.56f, -0.46f, 0.84f)
                horizontalLineToRelative(-1.97f)
                curveToRelative(0.3f, -0.55f, 0.6f, -1.1f, 0.91f, -1.66f)
                curveToRelative(0.25f, -0.46f, 0.5f, -0.91f, 0.73f, -1.34f)
                close()
                moveTo(4.35f, 21.36f)
                lineToRelative(-1.53f, -0.8f)
                curveToRelative(0.45f, -0.8f, 1.16f, -2.08f, 1.97f, -3.56f)
                horizontalLineToRelative(1.97f)
                curveToRelative(-1.0f, 1.82f, -1.9f, 3.43f, -2.42f, 4.36f)
                close()
                moveTo(13.82f, 4.92f)
                reflectiveCurveToRelative(-0.05f, 0.05f, -0.07f, 0.08f)
                horizontalLineToRelative(-2.13f)
                curveToRelative(0.39f, -0.59f, 0.7f, -1.0f, 0.94f, -1.26f)
                curveToRelative(0.91f, -0.98f, 2.12f, -1.58f, 3.44f, -1.72f)
                verticalLineToRelative(1.74f)
                curveToRelative(-0.81f, 0.12f, -1.58f, 0.51f, -2.18f, 1.15f)
                close()
                moveTo(18.0f, 4.01f)
                verticalLineToRelative(-1.82f)
                curveToRelative(0.84f, 0.23f, 1.61f, 0.65f, 2.27f, 1.26f)
                curveToRelative(0.49f, 0.46f, 0.88f, 0.98f, 1.17f, 1.55f)
                horizontalLineToRelative(-2.07f)
                curveToRelative(-0.09f, -0.1f, -0.18f, -0.19f, -0.27f, -0.28f)
                curveToRelative(-0.33f, -0.3f, -0.7f, -0.54f, -1.09f, -0.7f)
                close()
                moveTo(21.09f, 10.46f)
                lineToRelative(-1.51f, -1.03f)
                curveToRelative(0.51f, -0.74f, 0.72f, -1.6f, 0.64f, -2.43f)
                horizontalLineToRelative(1.76f)
                curveToRelative(0.0f, 0.06f, 0.0f, 0.12f, 0.0f, 0.18f)
                curveToRelative(0.03f, 1.12f, -0.28f, 2.23f, -0.9f, 3.28f)
                close()
            }
        }
        .build()
        return _candyCane!!
    }

private var _candyCane: ImageVector? = null
