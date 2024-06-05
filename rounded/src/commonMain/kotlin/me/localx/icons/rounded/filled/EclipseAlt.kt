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

public val Icons.Filled.EclipseAlt: ImageVector
    get() {
        if (_eclipseAlt != null) {
            return _eclipseAlt!!
        }
        _eclipseAlt = Builder(name = "EclipseAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 11.0f)
                lineTo(19.938f, 11.0f)
                arcToRelative(7.956f, 7.956f, 0.0f, false, false, -0.575f, -2.129f)
                lineToRelative(2.655f, -1.546f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.012f, 5.6f)
                lineTo(18.354f, 7.145f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -1.507f, -1.5f)
                lineToRelative(1.541f, -2.648f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.729f, -1.006f)
                lineTo(15.12f, 4.633f)
                arcTo(7.971f, 7.971f, 0.0f, false, false, 13.0f, 4.062f)
                lineTo(13.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                lineTo(11.0f, 4.062f)
                arcToRelative(7.965f, 7.965f, 0.0f, false, false, -2.108f, 0.566f)
                lineTo(7.355f, 1.986f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 5.627f, 2.992f)
                lineTo(7.163f, 5.633f)
                arcTo(8.046f, 8.046f, 0.0f, false, false, 5.651f, 7.139f)
                lineTo(3.0f, 5.6f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 7.325f)
                lineTo(4.64f, 8.865f)
                arcTo(7.955f, 7.955f, 0.0f, false, false, 4.062f, 11.0f)
                lineTo(1.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(4.062f, 13.0f)
                arcToRelative(7.957f, 7.957f, 0.0f, false, false, 0.576f, 2.129f)
                lineTo(2.0f, 16.662f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.01f, 18.391f)
                lineToRelative(2.637f, -1.535f)
                arcToRelative(8.083f, 8.083f, 0.0f, false, false, 1.5f, 1.5f)
                lineTo(5.6f, 21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.33f, 22.007f)
                lineToRelative(1.538f, -2.646f)
                arcTo(7.943f, 7.943f, 0.0f, false, false, 11.0f, 19.938f)
                lineTo(11.0f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(13.0f, 19.938f)
                arcToRelative(7.934f, 7.934f, 0.0f, false, false, 2.143f, -0.582f)
                lineToRelative(1.543f, 2.651f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.414f, 21.0f)
                lineToRelative(-1.546f, -2.657f)
                arcToRelative(8.076f, 8.076f, 0.0f, false, false, 1.49f, -1.494f)
                lineToRelative(2.647f, 1.541f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.006f, -1.729f)
                lineToRelative(-2.646f, -1.54f)
                arcTo(7.941f, 7.941f, 0.0f, false, false, 19.938f, 13.0f)
                lineTo(23.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 11.0f)
                close()
                moveTo(13.818f, 16.714f)
                curveTo(6.862f, 18.876f, 4.051f, 8.627f, 11.2f, 7.064f)
                arcToRelative(5.468f, 5.468f, 0.0f, false, true, 2.1f, 0.085f)
                arcToRelative(0.68f, 0.68f, 0.0f, false, true, 0.3f, 1.148f)
                arcToRelative(4.618f, 4.618f, 0.0f, false, false, 0.4f, 7.241f)
                arcTo(0.681f, 0.681f, 0.0f, false, true, 13.818f, 16.714f)
                close()
            }
        }
        .build()
        return _eclipseAlt!!
    }

private var _eclipseAlt: ImageVector? = null
