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

public val Icons.Filled.FileSignature: ImageVector
    get() {
        if (_fileSignature != null) {
            return _fileSignature!!
        }
        _fileSignature = Builder(name = "FileSignature", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.15f)
                curveToRelative(0.46f, 0.15f, 0.88f, 0.39f, 1.23f, 0.73f)
                lineToRelative(3.9f, 3.94f)
                curveToRelative(0.33f, 0.33f, 0.56f, 0.73f, 0.7f, 1.17f)
                horizontalLineToRelative(-4.83f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                lineTo(12.0f, 0.15f)
                close()
                moveTo(20.08f, 12.67f)
                curveToRelative(0.9f, -0.9f, 2.35f, -0.9f, 3.25f, 0.0f)
                curveToRelative(0.9f, 0.9f, 0.9f, 2.35f, 0.0f, 3.25f)
                lineToRelative(-6.81f, 6.81f)
                curveToRelative(-0.81f, 0.81f, -1.92f, 1.27f, -3.06f, 1.27f)
                horizontalLineToRelative(-1.45f)
                verticalLineToRelative(-1.45f)
                curveToRelative(0.0f, -1.15f, 0.46f, -2.25f, 1.27f, -3.06f)
                lineToRelative(6.81f, -6.81f)
                close()
                moveTo(6.0f, 10.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                curveToRelative(0.0f, 0.68f, 0.45f, 1.61f, 1.13f, 2.4f)
                curveToRelative(0.51f, -0.77f, 0.87f, -1.68f, 0.87f, -2.4f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(18.0f, 8.0f)
                verticalLineToRelative(3.92f)
                lineToRelative(-6.14f, 6.14f)
                curveToRelative(-1.07f, 1.07f, -1.7f, 2.45f, -1.83f, 3.93f)
                lineTo(5.0f, 21.99f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                lineTo(0.0f, 5.0f)
                curveTo(0.0f, 2.24f, 2.24f, 0.0f, 5.0f, 0.0f)
                horizontalLineToRelative(5.0f)
                lineTo(10.0f, 5.0f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(13.0f, 13.5f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                curveToRelative(0.0f, 0.32f, 0.1f, 0.67f, 0.29f, 0.99f)
                curveToRelative(-0.32f, 0.28f, -0.74f, 0.51f, -1.29f, 0.51f)
                curveToRelative(-0.44f, 0.0f, -0.88f, -0.13f, -1.3f, -0.34f)
                curveToRelative(0.81f, -1.16f, 1.3f, -2.55f, 1.3f, -3.66f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.35f, -3.0f, 3.0f)
                curveToRelative(0.0f, 1.22f, 0.68f, 2.65f, 1.71f, 3.8f)
                curveToRelative(-0.24f, 0.13f, -0.48f, 0.2f, -0.71f, 0.2f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                curveToRelative(0.83f, 0.0f, 1.61f, -0.33f, 2.3f, -0.85f)
                curveToRelative(0.84f, 0.53f, 1.76f, 0.85f, 2.7f, 0.85f)
                curveToRelative(2.6f, 0.0f, 4.0f, -2.48f, 4.0f, -3.5f)
                close()
            }
        }
        .build()
        return _fileSignature!!
    }

private var _fileSignature: ImageVector? = null
