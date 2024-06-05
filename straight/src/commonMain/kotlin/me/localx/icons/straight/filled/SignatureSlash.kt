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

public val Icons.Filled.SignatureSlash: ImageVector
    get() {
        if (_signatureSlash != null) {
            return _signatureSlash!!
        }
        _signatureSlash = Builder(name = "SignatureSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.95f, 17.32f)
                lineToRelative(-1.9f, -0.63f)
                curveToRelative(-0.36f, 1.07f, -0.87f, 1.88f, -1.52f, 2.43f)
                lineToRelative(-3.08f, -3.08f)
                curveToRelative(0.35f, -0.93f, 0.55f, -1.83f, 0.55f, -2.58f)
                curveToRelative(0.0f, -1.84f, -1.63f, -3.45f, -3.49f, -3.45f)
                curveToRelative(-0.81f, 0.0f, -1.61f, 0.32f, -2.24f, 0.85f)
                lineToRelative(-1.48f, -1.48f)
                curveToRelative(0.13f, -0.68f, 0.22f, -1.31f, 0.22f, -1.87f)
                curveToRelative(0.0f, -2.88f, -2.66f, -5.5f, -5.57f, -5.5f)
                curveToRelative(-0.58f, 0.0f, -1.16f, 0.1f, -1.71f, 0.3f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                lineTo(22.54f, 23.96f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.01f, -2.01f)
                curveToRelative(0.87f, -0.78f, 1.55f, -1.86f, 2.0f, -3.22f)
                close()
                moveTo(14.51f, 12.0f)
                curveToRelative(0.75f, 0.0f, 1.49f, 0.72f, 1.49f, 1.45f)
                curveToRelative(0.0f, 0.28f, -0.05f, 0.62f, -0.14f, 0.99f)
                lineToRelative(-2.16f, -2.16f)
                curveToRelative(0.25f, -0.17f, 0.53f, -0.28f, 0.81f, -0.28f)
                close()
                moveTo(5.43f, 4.0f)
                curveToRelative(1.84f, 0.0f, 3.57f, 1.7f, 3.57f, 3.5f)
                curveToRelative(0.0f, 0.02f, 0.0f, 0.06f, 0.0f, 0.08f)
                lineToRelative(-3.58f, -3.58f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.01f, 0.0f)
                close()
                moveTo(22.02f, 14.19f)
                curveToRelative(-0.35f, -1.78f, -1.07f, -3.31f, -2.13f, -4.54f)
                lineToRelative(1.51f, -1.31f)
                curveToRelative(1.29f, 1.5f, 2.16f, 3.33f, 2.58f, 5.46f)
                lineToRelative(-1.96f, 0.39f)
                close()
                moveTo(11.41f, 15.65f)
                lineToRelative(6.33f, 6.33f)
                curveToRelative(-1.3f, -0.07f, -2.45f, -0.67f, -3.4f, -1.54f)
                curveToRelative(-1.1f, 0.89f, -2.53f, 1.56f, -4.34f, 1.56f)
                curveToRelative(-1.65f, 0.0f, -3.26f, -0.97f, -4.67f, -2.45f)
                curveToRelative(-1.56f, 1.47f, -3.36f, 2.45f, -5.33f, 2.45f)
                verticalLineToRelative(-2.0f)
                curveToRelative(1.39f, 0.0f, 2.77f, -0.8f, 4.02f, -2.01f)
                curveTo(1.62f, 14.72f, 0.0f, 10.22f, 0.0f, 7.5f)
                curveToRelative(0.0f, -0.89f, 0.26f, -1.77f, 0.69f, -2.57f)
                lineToRelative(1.5f, 1.5f)
                curveToRelative(-0.12f, 0.35f, -0.19f, 0.7f, -0.19f, 1.07f)
                curveToRelative(0.0f, 2.38f, 1.46f, 6.16f, 3.39f, 8.94f)
                curveToRelative(0.99f, -1.31f, 1.85f, -2.83f, 2.47f, -4.33f)
                lineToRelative(1.52f, 1.52f)
                curveToRelative(-0.71f, 1.55f, -1.61f, 3.1f, -2.7f, 4.45f)
                curveToRelative(1.08f, 1.17f, 2.24f, 1.93f, 3.32f, 1.93f)
                curveToRelative(1.23f, 0.0f, 2.23f, -0.45f, 3.03f, -1.07f)
                curveToRelative(-0.73f, -1.04f, -1.28f, -2.21f, -1.62f, -3.28f)
                close()
            }
        }
        .build()
        return _signatureSlash!!
    }

private var _signatureSlash: ImageVector? = null
