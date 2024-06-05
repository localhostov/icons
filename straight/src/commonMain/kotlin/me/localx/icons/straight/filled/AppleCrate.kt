package me.localx.icons.straight.filled

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
                moveTo(16.0f, 8.01f)
                curveToRelative(0.0f, -1.93f, -0.76f, -3.68f, -1.97f, -4.94f)
                curveToRelative(0.24f, -0.04f, 0.48f, -0.06f, 0.72f, -0.06f)
                horizontalLineToRelative(0.69f)
                curveToRelative(-0.14f, -0.94f, -0.49f, -1.67f, -0.66f, -1.99f)
                lineTo(16.53f, 0.06f)
                curveToRelative(0.14f, 0.26f, 0.32f, 0.62f, 0.48f, 1.06f)
                curveToRelative(0.05f, -0.07f, 0.11f, -0.13f, 0.18f, -0.2f)
                curveTo(18.24f, -0.13f, 20.0f, 0.0f, 20.0f, 0.0f)
                curveToRelative(0.0f, 0.0f, 0.13f, 1.76f, -0.92f, 2.81f)
                curveToRelative(-0.08f, 0.08f, -0.17f, 0.16f, -0.26f, 0.23f)
                curveToRelative(2.35f, 0.3f, 4.18f, 2.41f, 4.18f, 4.96f)
                curveToRelative(0.0f, 0.7f, -0.14f, 1.37f, -0.39f, 1.99f)
                horizontalLineToRelative(-6.89f)
                curveToRelative(0.18f, -0.64f, 0.28f, -1.31f, 0.28f, -1.99f)
                close()
                moveTo(13.6f, 10.0f)
                curveToRelative(0.26f, -0.62f, 0.4f, -1.3f, 0.4f, -1.99f)
                curveToRelative(0.0f, -2.55f, -1.83f, -4.66f, -4.18f, -4.96f)
                curveToRelative(0.09f, -0.07f, 0.18f, -0.14f, 0.26f, -0.23f)
                curveTo(11.13f, 1.77f, 11.0f, 0.0f, 11.0f, 0.0f)
                curveToRelative(0.0f, 0.0f, -1.76f, -0.13f, -2.81f, 0.92f)
                curveToRelative(-0.06f, 0.06f, -0.12f, 0.13f, -0.18f, 0.2f)
                curveToRelative(-0.16f, -0.44f, -0.34f, -0.8f, -0.48f, -1.06f)
                lineToRelative(-1.76f, 0.96f)
                curveToRelative(0.17f, 0.32f, 0.53f, 1.05f, 0.66f, 1.99f)
                horizontalLineToRelative(-0.69f)
                curveTo(3.13f, 3.01f, 1.0f, 5.25f, 1.0f, 8.01f)
                curveToRelative(0.0f, 0.69f, 0.14f, 1.37f, 0.4f, 1.99f)
                lineTo(13.6f, 10.0f)
                close()
                moveTo(0.0f, 21.0f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                lineTo(21.0f, 24.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                lineTo(0.0f, 19.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(24.0f, 12.0f)
                lineTo(0.0f, 12.0f)
                verticalLineToRelative(5.0f)
                lineTo(24.0f, 17.0f)
                verticalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _appleCrate!!
    }

private var _appleCrate: ImageVector? = null
