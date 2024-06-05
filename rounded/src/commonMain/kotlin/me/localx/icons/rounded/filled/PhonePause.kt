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

public val Icons.Filled.PhonePause: ImageVector
    get() {
        if (_phonePause != null) {
            return _phonePause!!
        }
        _phonePause = Builder(name = "PhonePause", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 7.0f)
                lineTo(20.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                lineTo(22.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 7.0f)
                close()
                moveTo(17.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(18.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                lineTo(16.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 8.0f)
                close()
                moveTo(23.094f, 16.738f)
                curveToRelative(-0.03f, -0.031f, -2.437f, -1.883f, -2.437f, -1.883f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, -4.283f, 0.007f)
                lineToRelative(-1.9f, 1.606f)
                arcTo(12.781f, 12.781f, 0.0f, false, true, 7.537f, 9.523f)
                lineToRelative(1.6f, -1.9f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, 0.005f, -4.28f)
                reflectiveCurveTo(7.292f, 0.94f, 7.26f, 0.909f)
                arcTo(3.08f, 3.08f, 0.0f, false, false, 2.933f, 0.862f)
                lineToRelative(-1.149f, 1.0f)
                curveToRelative(-7.721f, 8.209f, 12.2f, 28.139f, 20.4f, 20.3f)
                lineToRelative(0.912f, -1.05f)
                arcTo(3.1f, 3.1f, 0.0f, false, false, 23.094f, 16.739f)
                close()
            }
        }
        .build()
        return _phonePause!!
    }

private var _phonePause: ImageVector? = null
