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
                moveTo(5.72f, 14.0f)
                lineToRelative(0.95f, -3.09f)
                lineToRelative(0.97f, 0.97f)
                lineToRelative(0.65f, 2.12f)
                horizontalLineToRelative(-2.57f)
                close()
                moveTo(11.61f, 18.0f)
                horizontalLineToRelative(-2.09f)
                lineToRelative(-0.61f, -2.0f)
                horizontalLineToRelative(-3.8f)
                lineToRelative(-0.61f, 2.0f)
                lineTo(2.39f, 18.0f)
                lineToRelative(2.67f, -8.69f)
                lineTo(0.36f, 4.6f)
                curveToRelative(-0.22f, 0.42f, -0.36f, 0.89f, -0.36f, 1.4f)
                verticalLineToRelative(15.0f)
                lineTo(16.76f, 21.0f)
                lineToRelative(-6.11f, -6.11f)
                lineToRelative(0.95f, 3.11f)
                close()
                moveTo(22.42f, 21.0f)
                horizontalLineToRelative(1.59f)
                lineTo(24.01f, 6.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                lineTo(4.41f, 3.0f)
                lineTo(1.41f, 0.0f)
                lineTo(0.0f, 1.41f)
                lineTo(5.73f, 7.14f)
                lineToRelative(0.05f, -0.17f)
                curveToRelative(0.19f, -0.61f, 0.67f, -1.0f, 1.22f, -1.0f)
                reflectiveCurveToRelative(1.03f, 0.39f, 1.22f, 0.99f)
                lineToRelative(1.18f, 3.83f)
                lineToRelative(3.6f, 3.6f)
                lineTo(13.0f, 6.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f)
                horizontalLineToRelative(-0.41f)
                lineToRelative(6.01f, 6.01f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-1.59f, -1.59f)
                close()
                moveTo(19.01f, 14.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _audioDescriptionSlash!!
    }

private var _audioDescriptionSlash: ImageVector? = null
