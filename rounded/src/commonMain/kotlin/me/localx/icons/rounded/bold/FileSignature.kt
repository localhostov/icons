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

public val Icons.Bold.FileSignature: ImageVector
    get() {
        if (_fileSignature != null) {
            return _fileSignature!!
        }
        _fileSignature = Builder(name = "FileSignature", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 17.0f)
                curveToRelative(-1.1f, 0.0f, -2.05f, -0.37f, -2.84f, -0.97f)
                curveToRelative(-0.52f, 0.43f, -1.12f, 0.75f, -1.8f, 0.92f)
                curveToRelative(-0.12f, 0.03f, -0.24f, 0.05f, -0.36f, 0.05f)
                curveToRelative(-0.67f, 0.0f, -1.28f, -0.46f, -1.45f, -1.14f)
                curveToRelative(-0.2f, -0.8f, 0.29f, -1.62f, 1.09f, -1.82f)
                curveToRelative(0.24f, -0.06f, 0.46f, -0.18f, 0.65f, -0.35f)
                curveToRelative(-0.52f, -1.06f, -0.79f, -2.21f, -0.79f, -3.19f)
                curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                curveToRelative(0.0f, 1.02f, -0.2f, 2.09f, -0.6f, 3.07f)
                curveToRelative(0.33f, 0.26f, 0.7f, 0.43f, 1.1f, 0.43f)
                curveToRelative(0.25f, 0.0f, 0.47f, -0.07f, 0.66f, -0.17f)
                curveToRelative(-0.1f, -0.27f, -0.16f, -0.55f, -0.16f, -0.83f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                curveToRelative(0.0f, 1.2f, -1.53f, 4.0f, -4.5f, 4.0f)
                close()
                moveTo(8.5f, 19.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(3.0f, 5.5f)
                curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-1.76f)
                curveToRelative(0.0f, -1.2f, -0.47f, -2.33f, -1.32f, -3.18f)
                lineToRelative(-3.24f, -3.24f)
                curveToRelative(-0.85f, -0.85f, -1.98f, -1.32f, -3.18f, -1.32f)
                lineTo(5.5f, -0.0f)
                curveTo(2.47f, 0.0f, 0.0f, 2.47f, 0.0f, 5.5f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(23.51f, 12.85f)
                curveToRelative(-0.88f, -1.07f, -2.46f, -1.13f, -3.41f, -0.18f)
                lineToRelative(-6.81f, 6.81f)
                curveToRelative(-0.81f, 0.81f, -1.27f, 1.92f, -1.27f, 3.06f)
                verticalLineToRelative(0.95f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(0.95f)
                curveToRelative(1.15f, 0.0f, 2.25f, -0.46f, 3.06f, -1.27f)
                lineToRelative(6.71f, -6.71f)
                curveToRelative(0.85f, -0.85f, 1.01f, -2.24f, 0.25f, -3.17f)
                close()
            }
        }
        .build()
        return _fileSignature!!
    }

private var _fileSignature: ImageVector? = null
