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

public val Icons.Bold.AudioDescriptionSlash: ImageVector
    get() {
        if (_audioDescriptionSlash != null) {
            return _audioDescriptionSlash!!
        }
        _audioDescriptionSlash = Builder(name = "AudioDescriptionSlash", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.41f, 22.0f)
                horizontalLineToRelative(0.59f)
                lineTo(24.0f, 5.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3.41f, 2.0f)
                lineTo(1.41f, 0.0f)
                lineTo(0.0f, 1.41f)
                lineTo(6.37f, 7.78f)
                curveToRelative(-0.2f, 0.24f, -0.35f, 0.53f, -0.43f, 0.86f)
                lineToRelative(-1.94f, 8.36f)
                horizontalLineToRelative(2.05f)
                lineToRelative(0.23f, -1.0f)
                horizontalLineToRelative(3.43f)
                lineToRelative(0.23f, 1.0f)
                horizontalLineToRelative(2.05f)
                lineToRelative(-1.92f, -8.29f)
                curveToRelative(-0.15f, -0.66f, -0.58f, -1.27f, -1.2f, -1.53f)
                curveToRelative(-0.13f, -0.06f, -0.27f, -0.09f, -0.4f, -0.12f)
                lineToRelative(-2.06f, -2.06f)
                horizontalLineToRelative(14.09f)
                curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(-0.59f)
                lineToRelative(-2.51f, -2.51f)
                curveToRelative(1.24f, -0.68f, 2.09f, -1.98f, 2.09f, -3.49f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(2.59f)
                lineToRelative(7.01f, 7.01f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-0.59f, -0.59f)
                close()
                moveTo(9.25f, 14.0f)
                horizontalLineToRelative(-2.5f)
                lineToRelative(1.14f, -4.91f)
                curveToRelative(0.01f, -0.05f, 0.06f, -0.09f, 0.11f, -0.09f)
                reflectiveCurveToRelative(0.1f, 0.04f, 0.11f, 0.09f)
                lineToRelative(1.14f, 4.91f)
                close()
                moveTo(15.0f, 9.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(14.76f, 19.0f)
                lineToRelative(3.0f, 3.0f)
                lineTo(0.0f, 22.0f)
                lineTo(0.0f, 5.0f)
                curveToRelative(0.0f, -0.23f, 0.04f, -0.45f, 0.09f, -0.67f)
                lineToRelative(2.91f, 2.91f)
                verticalLineToRelative(11.76f)
                lineTo(14.76f, 19.0f)
                close()
            }
        }
        .build()
        return _audioDescriptionSlash!!
    }

private var _audioDescriptionSlash: ImageVector? = null
