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

public val Icons.Bold.SubtitlesSlash: ImageVector
    get() {
        if (_subtitlesSlash != null) {
            return _subtitlesSlash!!
        }
        _subtitlesSlash = Builder(name = "SubtitlesSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.05f, 19.0f)
                lineToRelative(3.0f, 3.0f)
                lineTo(0.0f, 22.0f)
                lineTo(0.0f, 5.5f)
                curveToRelative(0.0f, -0.171f, 0.027f, -0.335f, 0.051f, -0.5f)
                lineToRelative(2.949f, 2.949f)
                verticalLineToRelative(11.05f)
                lineTo(14.05f, 18.999f)
                close()
                moveTo(5.0f, 17.0f)
                horizontalLineToRelative(7.05f)
                lineToRelative(-3.0f, -3.0f)
                lineTo(5.0f, 14.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(24.0f, 5.5f)
                lineTo(24.0f, 21.8f)
                lineToRelative(-2.161f, 2.161f)
                lineTo(0.04f, 2.161f)
                lineTo(2.161f, 0.04f)
                lineToRelative(1.96f, 1.96f)
                lineTo(20.5f, 2.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21.0f, 5.5f)
                curveToRelative(0.0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
                lineTo(7.121f, 5.0f)
                lineToRelative(4.0f, 4.0f)
                horizontalLineToRelative(7.879f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.879f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineToRelative(2.879f)
                verticalLineToRelative(2.879f)
                lineToRelative(2.0f, 2.0f)
                lineTo(21.0f, 5.5f)
                close()
                moveTo(5.0f, 12.0f)
                horizontalLineToRelative(2.05f)
                lineToRelative(-2.05f, -2.05f)
                verticalLineToRelative(2.05f)
                close()
            }
        }
        .build()
        return _subtitlesSlash!!
    }

private var _subtitlesSlash: ImageVector? = null
