package me.localx.icons.straight.outline

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

public val Icons.Outline.Skewer: ImageVector
    get() {
        if (_skewer != null) {
            return _skewer!!
        }
        _skewer = Builder(name = "Skewer", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.989f, 1.425f)
                lineTo(22.575f, 0.011f)
                lineTo(19.5f, 3.086f)
                lineTo(17.207f, 0.793f)
                lineTo(15.793f, 2.207f)
                lineTo(18.086f, 4.5f)
                lineTo(16.5f, 6.086f)
                lineTo(14.207f, 3.793f)
                lineTo(12.793f, 5.207f)
                lineTo(15.086f, 7.5f)
                lineTo(13.515f, 9.071f)
                lineTo(11.029f, 6.586f)
                lineToRelative(-0.707f, 0.707f)
                arcToRelative(4.524f, 4.524f, 0.0f, false, false, -0.627f, 5.6f)
                lineTo(8.476f, 14.11f)
                lineTo(6.183f, 11.817f)
                lineTo(4.769f, 13.231f)
                lineToRelative(2.293f, 2.293f)
                lineTo(5.61f, 16.976f)
                arcToRelative(1.11f, 1.11f, 0.0f, false, true, -1.076f, 0.18f)
                arcToRelative(3.52f, 3.52f, 0.0f, false, false, -4.073f, 1.6f)
                arcToRelative(3.479f, 3.479f, 0.0f, false, false, 0.0f, 3.488f)
                arcToRelative(3.518f, 3.518f, 0.0f, false, false, 2.6f, 1.728f)
                arcTo(3.563f, 3.563f, 0.0f, false, false, 3.508f, 24.0f)
                arcToRelative(3.471f, 3.471f, 0.0f, false, false, 2.467f, -1.026f)
                lineTo(4.561f, 21.561f)
                arcToRelative(1.506f, 1.506f, 0.0f, false, true, -2.377f, -0.332f)
                arcToRelative(1.475f, 1.475f, 0.0f, false, true, 0.0f, -1.458f)
                arcToRelative(1.509f, 1.509f, 0.0f, false, true, 1.76f, -0.705f)
                arcToRelative(3.007f, 3.007f, 0.0f, false, false, 3.08f, -0.676f)
                lineToRelative(1.452f, -1.452f)
                lineToRelative(2.293f, 2.293f)
                lineToRelative(1.414f, -1.414f)
                lineTo(9.89f, 15.524f)
                lineToRelative(1.218f, -1.218f)
                arcToRelative(4.528f, 4.528f, 0.0f, false, false, 5.6f, -0.628f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(-2.485f, -2.486f)
                lineTo(16.5f, 8.914f)
                lineToRelative(2.293f, 2.293f)
                lineToRelative(1.414f, -1.414f)
                lineTo(17.914f, 7.5f)
                lineTo(19.5f, 5.914f)
                lineToRelative(2.293f, 2.293f)
                lineToRelative(1.414f, -1.414f)
                lineTo(20.914f, 4.5f)
                close()
                moveTo(11.736f, 12.264f)
                arcToRelative(2.52f, 2.52f, 0.0f, false, true, -0.559f, -2.7f)
                lineToRelative(3.261f, 3.261f)
                arcTo(2.513f, 2.513f, 0.0f, false, true, 11.736f, 12.264f)
                close()
            }
        }
        .build()
        return _skewer!!
    }

private var _skewer: ImageVector? = null
