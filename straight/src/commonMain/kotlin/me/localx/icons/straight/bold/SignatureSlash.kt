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

public val Icons.Bold.SignatureSlash: ImageVector
    get() {
        if (_signatureSlash != null) {
            return _signatureSlash!!
        }
        _signatureSlash = Builder(name = "SignatureSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.2f, 18.15f)
                lineToRelative(2.16f, 2.16f)
                lineToRelative(-0.56f, 0.39f)
                curveToRelative(-1.21f, 0.78f, -2.65f, 1.29f, -4.31f, 1.29f)
                curveToRelative(-1.94f, 0.0f, -3.68f, -0.98f, -5.16f, -2.45f)
                curveToRelative(-1.56f, 1.47f, -3.37f, 2.45f, -5.34f, 2.45f)
                verticalLineToRelative(-3.0f)
                curveToRelative(1.17f, 0.0f, 2.36f, -0.71f, 3.44f, -1.79f)
                curveTo(1.26f, 13.93f, 0.0f, 9.79f, 0.0f, 7.5f)
                curveToRelative(0.0f, -0.74f, 0.15f, -1.46f, 0.43f, -2.12f)
                lineToRelative(2.6f, 2.6f)
                curveToRelative(0.14f, 1.84f, 1.06f, 4.48f, 2.38f, 6.72f)
                curveToRelative(0.57f, -0.91f, 1.08f, -1.89f, 1.48f, -2.86f)
                lineToRelative(2.27f, 2.27f)
                curveToRelative(-0.52f, 1.09f, -1.14f, 2.16f, -1.85f, 3.16f)
                curveToRelative(1.0f, 1.05f, 2.1f, 1.73f, 3.19f, 1.73f)
                curveToRelative(0.8f, 0.0f, 1.52f, -0.21f, 2.17f, -0.53f)
                lineToRelative(0.54f, -0.32f)
                close()
                moveTo(23.98f, 13.42f)
                curveToRelative(-0.41f, -2.11f, -1.28f, -3.93f, -2.56f, -5.41f)
                lineToRelative(-2.27f, 1.96f)
                curveToRelative(0.94f, 1.09f, 1.58f, 2.44f, 1.89f, 4.03f)
                lineToRelative(2.94f, -0.58f)
                close()
                moveTo(22.34f, 20.22f)
                lineToRelative(1.61f, 1.61f)
                lineToRelative(-2.12f, 2.12f)
                lineTo(0.04f, 2.16f)
                lineTo(2.16f, 0.04f)
                lineToRelative(2.1f, 2.1f)
                curveToRelative(0.4f, -0.09f, 0.82f, -0.14f, 1.24f, -0.14f)
                curveToRelative(3.03f, 0.0f, 5.5f, 2.47f, 5.5f, 5.5f)
                curveToRelative(0.0f, 0.4f, -0.03f, 0.82f, -0.1f, 1.28f)
                lineToRelative(1.89f, 1.89f)
                curveToRelative(0.64f, -0.43f, 1.41f, -0.67f, 2.21f, -0.67f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                curveToRelative(0.0f, 0.71f, -0.19f, 1.52f, -0.53f, 2.35f)
                lineToRelative(1.76f, 1.76f)
                curveToRelative(0.38f, -0.44f, 0.65f, -1.01f, 0.76f, -1.63f)
                lineToRelative(2.95f, 0.54f)
                curveToRelative(-0.22f, 1.22f, -0.79f, 2.34f, -1.59f, 3.21f)
                close()
                moveTo(15.98f, 13.86f)
                curveToRelative(-0.06f, -0.45f, -0.41f, -0.8f, -0.86f, -0.86f)
                lineToRelative(0.86f, 0.86f)
                close()
            }
        }
        .build()
        return _signatureSlash!!
    }

private var _signatureSlash: ImageVector? = null
