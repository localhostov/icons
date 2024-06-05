package me.localx.icons.straight.bold

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

public val Icons.Bold.HeadSideBrain: ImageVector
    get() {
        if (_headSideBrain != null) {
            return _headSideBrain!!
        }
        _headSideBrain = Builder(name = "HeadSideBrain", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 9.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                curveToRelative(-0.25f, 0.0f, -2.51f, 0.0f, -2.51f, 0.0f)
                curveToRelative(-0.14f, 0.18f, -0.31f, 0.34f, -0.49f, 0.48f)
                verticalLineToRelative(7.52f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-6.28f)
                curveToRelative(-0.29f, 0.17f, -0.63f, 0.28f, -1.0f, 0.28f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                curveToRelative(0.0f, -0.79f, 0.46f, -1.46f, 1.12f, -1.79f)
                curveToRelative(-0.07f, -0.23f, -0.12f, -0.46f, -0.12f, -0.71f)
                curveToRelative(0.0f, -1.3f, 1.0f, -2.36f, 2.26f, -2.48f)
                curveToRelative(0.34f, -0.61f, 0.99f, -1.02f, 1.74f, -1.02f)
                curveToRelative(0.79f, 0.0f, 1.46f, 0.46f, 1.79f, 1.12f)
                curveToRelative(0.23f, -0.07f, 0.46f, -0.12f, 0.71f, -0.12f)
                curveToRelative(0.86f, 0.0f, 1.61f, 0.43f, 2.06f, 1.09f)
                curveToRelative(0.83f, 0.24f, 1.44f, 1.0f, 1.44f, 1.91f)
                close()
                moveTo(24.0f, 12.68f)
                verticalLineToRelative(2.32f)
                horizontalLineToRelative(-2.28f)
                lineToRelative(-0.37f, 2.94f)
                curveToRelative(-0.22f, 1.75f, -1.71f, 3.06f, -3.47f, 3.06f)
                horizontalLineToRelative(-0.87f)
                verticalLineToRelative(3.0f)
                lineTo(3.0f, 24.0f)
                verticalLineToRelative(-4.98f)
                curveToRelative(0.0f, -0.34f, -0.12f, -0.68f, -0.35f, -0.95f)
                curveTo(0.27f, 15.22f, -0.55f, 11.58f, 0.39f, 8.1f)
                curveTo(1.5f, 3.97f, 4.95f, 0.85f, 9.18f, 0.15f)
                curveToRelative(4.12f, -0.68f, 8.21f, 0.96f, 10.7f, 4.28f)
                curveToRelative(1.14f, 1.41f, 2.2f, 3.85f, 3.32f, 6.43f)
                curveToRelative(0.22f, 0.51f, 0.8f, 1.82f, 0.8f, 1.82f)
                close()
                moveTo(20.43f, 12.0f)
                curveToRelative(-0.98f, -2.26f, -2.0f, -4.59f, -2.91f, -5.72f)
                curveToRelative(-1.85f, -2.46f, -4.84f, -3.66f, -7.85f, -3.17f)
                curveToRelative(-3.03f, 0.5f, -5.59f, 2.82f, -6.39f, 5.76f)
                curveToRelative(-0.68f, 2.53f, -0.07f, 5.18f, 1.67f, 7.26f)
                curveToRelative(0.68f, 0.81f, 1.05f, 1.83f, 1.05f, 2.88f)
                verticalLineToRelative(1.98f)
                lineTo(14.0f, 20.99f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.87f)
                curveToRelative(0.25f, 0.0f, 0.46f, -0.19f, 0.5f, -0.44f)
                lineToRelative(0.7f, -5.56f)
                horizontalLineToRelative(1.35f)
                close()
            }
        }
        .build()
        return _headSideBrain!!
    }

private var _headSideBrain: ImageVector? = null
