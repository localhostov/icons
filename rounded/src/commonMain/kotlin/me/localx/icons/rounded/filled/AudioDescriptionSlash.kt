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

public val Icons.Filled.AudioDescriptionSlash: ImageVector
    get() {
        if (_audioDescriptionSlash != null) {
            return _audioDescriptionSlash!!
        }
        _audioDescriptionSlash = Builder(name = "AudioDescriptionSlash", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.04f, 19.3f)
                curveToRelative(0.63f, 0.63f, 0.18f, 1.7f, -0.7f, 1.7f)
                lineTo(5.0f, 21.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                lineTo(0.0f, 8.0f)
                curveToRelative(0.0f, -0.49f, 0.07f, -0.96f, 0.2f, -1.41f)
                curveToRelative(0.22f, -0.74f, 1.13f, -1.0f, 1.68f, -0.45f)
                lineToRelative(3.11f, 3.11f)
                lineToRelative(-2.18f, 7.46f)
                curveToRelative(-0.16f, 0.53f, 0.15f, 1.09f, 0.68f, 1.24f)
                curveToRelative(0.53f, 0.15f, 1.09f, -0.15f, 1.24f, -0.68f)
                lineToRelative(0.37f, -1.28f)
                horizontalLineToRelative(3.77f)
                lineToRelative(0.37f, 1.28f)
                curveToRelative(0.13f, 0.44f, 0.53f, 0.72f, 0.96f, 0.72f)
                curveToRelative(0.09f, 0.0f, 0.19f, -0.01f, 0.28f, -0.04f)
                curveToRelative(0.53f, -0.16f, 0.83f, -0.71f, 0.68f, -1.24f)
                lineToRelative(-0.54f, -1.83f)
                lineToRelative(4.41f, 4.41f)
                close()
                moveTo(24.0f, 16.0f)
                lineTo(24.0f, 8.0f)
                curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f)
                lineTo(5.0f, 3.0f)
                curveToRelative(-0.19f, 0.0f, -0.37f, 0.01f, -0.56f, 0.03f)
                lineTo(1.71f, 0.29f)
                curveTo(1.32f, -0.1f, 0.68f, -0.1f, 0.29f, 0.29f)
                reflectiveCurveTo(-0.1f, 1.32f, 0.29f, 1.71f)
                lineTo(5.64f, 7.05f)
                verticalLineToRelative(-0.05f)
                curveToRelative(0.21f, -0.61f, 0.74f, -1.0f, 1.35f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.6f, 0.0f, 1.14f, 0.39f, 1.33f, 0.98f)
                lineToRelative(1.14f, 3.89f)
                lineToRelative(3.55f, 3.55f)
                verticalLineToRelative(-6.41f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(2.48f, 0.0f, 4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 2.45f, -1.97f, 4.45f, -4.42f, 4.5f)
                lineToRelative(5.71f, 5.71f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(-2.06f, -2.06f)
                curveToRelative(1.41f, -0.89f, 2.35f, -2.45f, 2.35f, -4.24f)
                close()
                moveTo(8.29f, 14.0f)
                lineToRelative(-0.6f, -2.06f)
                lineToRelative(-1.08f, -1.08f)
                lineToRelative(-0.92f, 3.13f)
                horizontalLineToRelative(2.6f)
                close()
                moveTo(19.0f, 13.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _audioDescriptionSlash!!
    }

private var _audioDescriptionSlash: ImageVector? = null
