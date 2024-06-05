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

public val Icons.Filled.SubtitlesSlash: ImageVector
    get() {
        if (_subtitlesSlash != null) {
            return _subtitlesSlash!!
        }
        _subtitlesSlash = Builder(name = "SubtitlesSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.757f, 18.0f)
                lineToRelative(4.0f, 4.0f)
                lineTo(0.0f, 22.0f)
                lineTo(0.0f, 5.0f)
                curveToRelative(0.0f, -0.233f, 0.033f, -0.457f, 0.083f, -0.674f)
                lineToRelative(6.674f, 6.674f)
                horizontalLineToRelative(-2.757f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.757f)
                lineToRelative(4.757f, 4.757f)
                lineTo(4.0f, 16.0f)
                verticalLineToRelative(2.0f)
                lineTo(13.757f, 18.0f)
                close()
                moveTo(24.007f, 22.593f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(-0.007f, 1.407f)
                lineTo(1.407f, -0.007f)
                lineTo(3.414f, 2.0f)
                lineTo(21.0f, 2.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                lineTo(24.0f, 22.0f)
                horizontalLineToRelative(-0.586f)
                lineToRelative(0.593f, 0.593f)
                close()
                moveTo(20.0f, 18.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.586f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineToRelative(0.586f)
                close()
                moveTo(20.0f, 11.0f)
                horizontalLineToRelative(-7.586f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineToRelative(5.586f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _subtitlesSlash!!
    }

private var _subtitlesSlash: ImageVector? = null
