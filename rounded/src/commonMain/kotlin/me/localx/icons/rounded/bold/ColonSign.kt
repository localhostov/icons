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

public val Icons.Bold.ColonSign: ImageVector
    get() {
        if (_colonSign != null) {
            return _colonSign!!
        }
        _colonSign = Builder(name = "ColonSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.19f, 15.4f)
                curveToRelative(-0.74f, -0.38f, -1.64f, -0.09f, -2.02f, 0.64f)
                curveToRelative(-0.75f, 1.45f, -2.23f, 2.5f, -3.88f, 2.84f)
                lineToRelative(3.71f, -11.14f)
                curveToRelative(0.05f, 0.09f, 0.11f, 0.19f, 0.16f, 0.29f)
                curveToRelative(0.37f, 0.74f, 1.27f, 1.05f, 2.01f, 0.67f)
                curveToRelative(0.74f, -0.37f, 1.04f, -1.27f, 0.68f, -2.01f)
                curveToRelative(-0.44f, -0.88f, -1.02f, -1.66f, -1.72f, -2.32f)
                lineToRelative(0.8f, -2.4f)
                curveToRelative(0.26f, -0.79f, -0.16f, -1.64f, -0.95f, -1.9f)
                curveToRelative(-0.78f, -0.26f, -1.63f, 0.16f, -1.9f, 0.95f)
                lineToRelative(-0.55f, 1.65f)
                curveToRelative(-0.53f, -0.22f, -1.09f, -0.4f, -1.67f, -0.51f)
                lineToRelative(0.06f, -0.19f)
                curveToRelative(0.26f, -0.79f, -0.16f, -1.64f, -0.95f, -1.9f)
                curveToRelative(-0.78f, -0.26f, -1.64f, 0.16f, -1.9f, 0.95f)
                lineToRelative(-0.32f, 0.97f)
                horizontalLineToRelative(-0.3f)
                curveTo(6.79f, 2.0f, 3.0f, 5.79f, 3.0f, 10.45f)
                verticalLineToRelative(3.09f)
                curveToRelative(0.0f, 2.49f, 1.09f, 4.74f, 2.81f, 6.29f)
                lineToRelative(-0.73f, 2.19f)
                curveToRelative(-0.26f, 0.79f, 0.16f, 1.64f, 0.95f, 1.9f)
                curveToRelative(0.16f, 0.05f, 0.32f, 0.08f, 0.47f, 0.08f)
                curveToRelative(0.63f, 0.0f, 1.21f, -0.4f, 1.42f, -1.03f)
                lineToRelative(0.51f, -1.53f)
                curveToRelative(0.54f, 0.21f, 1.1f, 0.36f, 1.69f, 0.45f)
                lineToRelative(-0.04f, 0.13f)
                curveToRelative(-0.26f, 0.79f, 0.16f, 1.64f, 0.95f, 1.9f)
                curveToRelative(0.16f, 0.05f, 0.32f, 0.08f, 0.47f, 0.08f)
                curveToRelative(0.63f, 0.0f, 1.21f, -0.4f, 1.42f, -1.03f)
                lineToRelative(0.33f, -0.98f)
                curveToRelative(3.19f, -0.03f, 6.16f, -1.82f, 7.58f, -4.58f)
                curveToRelative(0.38f, -0.74f, 0.09f, -1.64f, -0.64f, -2.02f)
                close()
                moveTo(6.0f, 13.54f)
                verticalLineToRelative(-3.09f)
                curveToRelative(0.0f, -2.76f, 2.07f, -5.05f, 4.74f, -5.41f)
                lineToRelative(-3.83f, 11.5f)
                curveToRelative(-0.57f, -0.86f, -0.9f, -1.89f, -0.9f, -3.0f)
                close()
                moveTo(9.38f, 18.59f)
                lineTo(13.9f, 5.05f)
                curveToRelative(0.59f, 0.08f, 1.15f, 0.24f, 1.68f, 0.49f)
                lineToRelative(-4.48f, 13.45f)
                curveToRelative(-0.6f, -0.04f, -1.17f, -0.18f, -1.71f, -0.4f)
                close()
            }
        }
        .build()
        return _colonSign!!
    }

private var _colonSign: ImageVector? = null
