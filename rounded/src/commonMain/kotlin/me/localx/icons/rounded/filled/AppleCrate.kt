package me.localx.icons.rounded.filled

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

public val Icons.Filled.AppleCrate: ImageVector
    get() {
        if (_appleCrate != null) {
            return _appleCrate!!
        }
        _appleCrate = Builder(name = "AppleCrate", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.35f, 1.76f)
                curveToRelative(-0.42f, -0.36f, -0.47f, -0.99f, -0.11f, -1.41f)
                curveToRelative(0.36f, -0.42f, 0.99f, -0.47f, 1.41f, -0.12f)
                curveToRelative(0.1f, 0.09f, 0.64f, 0.57f, 1.11f, 1.29f)
                curveToRelative(0.12f, -0.22f, 0.26f, -0.44f, 0.45f, -0.63f)
                curveTo(17.83f, 0.27f, 18.72f, 0.07f, 19.33f, 0.0f)
                curveToRelative(0.38f, -0.04f, 0.71f, 0.29f, 0.67f, 0.67f)
                curveToRelative(-0.06f, 0.61f, -0.27f, 1.49f, -0.89f, 2.12f)
                curveToRelative(-0.1f, 0.1f, -0.22f, 0.19f, -0.33f, 0.27f)
                curveToRelative(2.37f, 0.28f, 4.23f, 2.38f, 4.23f, 4.94f)
                curveToRelative(0.0f, 0.69f, -0.14f, 1.37f, -0.4f, 1.99f)
                horizontalLineToRelative(-6.89f)
                curveToRelative(0.19f, -0.65f, 0.29f, -1.32f, 0.29f, -1.99f)
                curveToRelative(0.0f, -1.92f, -0.75f, -3.66f, -1.96f, -4.92f)
                curveToRelative(0.23f, -0.04f, 0.47f, -0.08f, 0.71f, -0.08f)
                horizontalLineToRelative(0.55f)
                curveToRelative(-0.27f, -0.56f, -0.73f, -1.05f, -0.95f, -1.25f)
                close()
                moveTo(13.6f, 10.0f)
                curveToRelative(0.26f, -0.62f, 0.4f, -1.3f, 0.4f, -1.99f)
                curveToRelative(0.0f, -2.57f, -1.86f, -4.67f, -4.23f, -4.94f)
                curveToRelative(0.11f, -0.08f, 0.23f, -0.17f, 0.33f, -0.27f)
                curveToRelative(0.63f, -0.63f, 0.83f, -1.51f, 0.89f, -2.12f)
                curveToRelative(0.04f, -0.38f, -0.29f, -0.71f, -0.67f, -0.67f)
                curveToRelative(-0.61f, 0.06f, -1.49f, 0.27f, -2.12f, 0.89f)
                curveToRelative(-0.19f, 0.19f, -0.33f, 0.41f, -0.45f, 0.63f)
                curveToRelative(-0.47f, -0.72f, -1.01f, -1.2f, -1.11f, -1.29f)
                curveToRelative(-0.42f, -0.35f, -1.05f, -0.3f, -1.41f, 0.12f)
                curveToRelative(-0.36f, 0.42f, -0.31f, 1.05f, 0.11f, 1.41f)
                curveToRelative(0.22f, 0.19f, 0.68f, 0.68f, 0.95f, 1.25f)
                horizontalLineToRelative(-0.55f)
                curveTo(3.13f, 3.01f, 1.0f, 5.25f, 1.0f, 8.01f)
                curveToRelative(0.0f, 0.69f, 0.14f, 1.37f, 0.4f, 1.99f)
                lineTo(13.6f, 10.0f)
                close()
                moveTo(5.0f, 24.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                lineTo(0.0f, 19.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                close()
                moveTo(24.0f, 17.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                lineTo(3.0f, 12.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                lineTo(24.0f, 17.0f)
                close()
            }
        }
        .build()
        return _appleCrate!!
    }

private var _appleCrate: ImageVector? = null
