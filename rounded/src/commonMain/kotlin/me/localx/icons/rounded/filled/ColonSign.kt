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

public val Icons.Filled.ColonSign: ImageVector
    get() {
        if (_colonSign != null) {
            return _colonSign!!
        }
        _colonSign = Builder(name = "ColonSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.19f, 16.12f)
                curveToRelative(-0.49f, -0.25f, -1.09f, -0.06f, -1.35f, 0.43f)
                curveToRelative(-1.1f, 2.13f, -3.27f, 3.45f, -5.66f, 3.45f)
                horizontalLineToRelative(-0.18f)
                lineToRelative(4.54f, -14.26f)
                curveToRelative(0.54f, 0.51f, 1.0f, 1.1f, 1.34f, 1.8f)
                curveToRelative(0.25f, 0.49f, 0.85f, 0.7f, 1.34f, 0.45f)
                curveToRelative(0.49f, -0.25f, 0.7f, -0.85f, 0.45f, -1.34f)
                curveToRelative(-0.6f, -1.2f, -1.46f, -2.2f, -2.48f, -2.96f)
                lineToRelative(0.76f, -2.38f)
                curveToRelative(0.17f, -0.53f, -0.12f, -1.09f, -0.65f, -1.26f)
                curveToRelative(-0.53f, -0.17f, -1.09f, 0.12f, -1.26f, 0.65f)
                lineToRelative(-0.62f, 1.96f)
                curveToRelative(-0.55f, -0.23f, -1.14f, -0.4f, -1.74f, -0.51f)
                lineToRelative(0.27f, -0.85f)
                curveToRelative(0.17f, -0.53f, -0.12f, -1.09f, -0.65f, -1.26f)
                curveToRelative(-0.53f, -0.17f, -1.09f, 0.12f, -1.26f, 0.65f)
                lineToRelative(-0.41f, 1.3f)
                horizontalLineToRelative(-1.27f)
                curveTo(6.75f, 2.0f, 3.0f, 5.75f, 3.0f, 10.36f)
                verticalLineToRelative(3.27f)
                curveToRelative(0.0f, 2.89f, 1.48f, 5.45f, 3.72f, 6.95f)
                lineToRelative(-0.67f, 2.11f)
                curveToRelative(-0.17f, 0.53f, 0.12f, 1.09f, 0.65f, 1.26f)
                curveToRelative(0.1f, 0.03f, 0.2f, 0.05f, 0.3f, 0.05f)
                curveToRelative(0.42f, 0.0f, 0.82f, -0.27f, 0.95f, -0.7f)
                lineToRelative(0.58f, -1.81f)
                curveToRelative(0.56f, 0.2f, 1.15f, 0.35f, 1.76f, 0.43f)
                lineToRelative(-0.25f, 0.77f)
                curveToRelative(-0.17f, 0.53f, 0.12f, 1.09f, 0.65f, 1.26f)
                curveToRelative(0.1f, 0.03f, 0.2f, 0.05f, 0.3f, 0.05f)
                curveToRelative(0.42f, 0.0f, 0.82f, -0.27f, 0.95f, -0.7f)
                lineToRelative(0.41f, -1.3f)
                horizontalLineToRelative(0.81f)
                curveToRelative(3.14f, 0.0f, 5.99f, -1.74f, 7.43f, -4.53f)
                curveToRelative(0.25f, -0.49f, 0.06f, -1.09f, -0.43f, -1.35f)
                close()
                moveTo(5.0f, 13.63f)
                verticalLineToRelative(-3.27f)
                curveToRelative(0.0f, -3.51f, 2.85f, -6.36f, 6.36f, -6.36f)
                horizontalLineToRelative(0.63f)
                lineToRelative(-4.64f, 14.58f)
                curveToRelative(-1.44f, -1.17f, -2.36f, -2.95f, -2.36f, -4.94f)
                close()
                moveTo(9.13f, 19.58f)
                lineTo(14.08f, 4.06f)
                curveToRelative(0.61f, 0.08f, 1.19f, 0.26f, 1.74f, 0.51f)
                lineToRelative(-4.9f, 15.41f)
                curveToRelative(-0.62f, -0.04f, -1.22f, -0.18f, -1.78f, -0.39f)
                close()
            }
        }
        .build()
        return _colonSign!!
    }

private var _colonSign: ImageVector? = null
