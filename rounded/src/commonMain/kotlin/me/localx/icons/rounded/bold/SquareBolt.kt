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

public val Icons.Bold.SquareBolt: ImageVector
    get() {
        if (_squareBolt != null) {
            return _squareBolt!!
        }
        _squareBolt = Builder(name = "SquareBolt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.75f, 11.61f)
                curveToRelative(0.37f, 0.68f, 0.33f, 1.51f, -0.1f, 2.16f)
                lineToRelative(-2.88f, 4.54f)
                curveToRelative(-0.29f, 0.45f, -0.77f, 0.7f, -1.27f, 0.7f)
                curveToRelative(-0.28f, 0.0f, -0.55f, -0.08f, -0.8f, -0.23f)
                curveToRelative(-0.7f, -0.44f, -0.91f, -1.37f, -0.46f, -2.07f)
                lineToRelative(2.03f, -3.2f)
                horizontalLineToRelative(-2.15f)
                curveToRelative(-0.67f, 0.0f, -1.3f, -0.32f, -1.7f, -0.85f)
                curveToRelative(-0.4f, -0.54f, -0.52f, -1.23f, -0.33f, -1.87f)
                curveToRelative(0.04f, -0.13f, 0.09f, -0.25f, 0.17f, -0.37f)
                lineToRelative(2.97f, -4.71f)
                curveToRelative(0.44f, -0.7f, 1.37f, -0.91f, 2.07f, -0.47f)
                curveToRelative(0.7f, 0.44f, 0.91f, 1.37f, 0.47f, 2.07f)
                lineToRelative(-2.02f, 3.2f)
                horizontalLineToRelative(2.15f)
                curveToRelative(0.78f, 0.0f, 1.49f, 0.42f, 1.85f, 1.11f)
                close()
                moveTo(24.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
                lineTo(5.5f, 24.0f)
                curveToRelative(-3.03f, 0.0f, -5.5f, -2.47f, -5.5f, -5.5f)
                lineTo(0.0f, 5.5f)
                curveTo(0.0f, 2.47f, 2.47f, 0.0f, 5.5f, 0.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.03f, 0.0f, 5.5f, 2.47f, 5.5f, 5.5f)
                close()
                moveTo(21.0f, 5.5f)
                curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(5.5f, 3.0f)
                curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(21.0f, 5.5f)
                close()
            }
        }
        .build()
        return _squareBolt!!
    }

private var _squareBolt: ImageVector? = null
