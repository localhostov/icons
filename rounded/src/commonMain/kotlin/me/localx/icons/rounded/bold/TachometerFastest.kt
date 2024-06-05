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

public val Icons.Bold.TachometerFastest: ImageVector
    get() {
        if (_tachometerFastest != null) {
            return _tachometerFastest!!
        }
        _tachometerFastest = Builder(name = "TachometerFastest", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -3.482f, 8.442f)
                arcToRelative(3.512f, 3.512f, 0.0f, false, true, -4.718f, 0.276f)
                lineToRelative(-1.282f, -1.04f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 1.888f, -2.33f)
                lineToRelative(1.283f, 1.04f)
                arcToRelative(0.524f, 0.524f, 0.0f, false, false, 0.7f, -0.059f)
                arcTo(9.0f, 9.0f, 0.0f, true, false, 5.6f, 19.319f)
                arcToRelative(0.519f, 0.519f, 0.0f, false, false, 0.7f, 0.057f)
                lineToRelative(1.243f, -1.028f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 9.456f, 20.66f)
                lineTo(8.215f, 21.687f)
                arcToRelative(3.505f, 3.505f, 0.0f, false, true, -4.751f, -0.258f)
                arcTo(11.972f, 11.972f, 0.0f, false, true, 0.1f, 11.442f)
                curveTo(1.247f, 2.0f, 12.979f, -2.358f, 20.0f, 4.056f)
                arcTo(12.015f, 12.015f, 0.0f, false, true, 24.0f, 13.0f)
                close()
                moveTo(16.569f, 15.933f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.862f, -2.874f)
                lineTo(13.7f, 11.944f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -0.862f, 2.873f)
                close()
            }
        }
        .build()
        return _tachometerFastest!!
    }

private var _tachometerFastest: ImageVector? = null
