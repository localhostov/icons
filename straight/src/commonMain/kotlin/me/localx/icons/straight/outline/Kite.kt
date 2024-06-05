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

public val Icons.Outline.Kite: ImageVector
    get() {
        if (_kite != null) {
            return _kite!!
        }
        _kite = Builder(name = "Kite", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.76f, 16.0f)
                arcToRelative(5.207f, 5.207f, 0.0f, false, false, -3.707f, 1.535f)
                lineToRelative(-3.0f, 3.0f)
                arcTo(4.971f, 4.971f, 0.0f, false, true, 8.517f, 22.0f)
                lineTo(3.123f, 22.0f)
                arcToRelative(1.121f, 1.121f, 0.0f, false, true, -0.793f, -1.914f)
                lineTo(5.52f, 16.9f)
                lineToRelative(13.253f, -3.535f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 10.464f)
                lineTo(21.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(10.536f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.9f, 2.227f)
                lineTo(4.1f, 15.485f)
                lineTo(0.916f, 18.672f)
                arcTo(3.121f, 3.121f, 0.0f, false, false, 3.123f, 24.0f)
                lineTo(8.517f, 24.0f)
                arcToRelative(6.955f, 6.955f, 0.0f, false, false, 4.95f, -2.051f)
                lineToRelative(3.0f, -3.0f)
                arcTo(3.243f, 3.243f, 0.0f, false, true, 22.0f, 21.242f)
                lineTo(22.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 21.242f)
                arcTo(5.249f, 5.249f, 0.0f, false, false, 18.76f, 16.0f)
                close()
                moveTo(19.0f, 3.416f)
                verticalLineToRelative(6.17f)
                lineTo(15.915f, 6.5f)
                close()
                moveTo(14.5f, 5.087f)
                lineTo(11.414f, 2.0f)
                horizontalLineToRelative(6.174f)
                close()
                moveTo(18.066f, 11.481f)
                lineTo(8.342f, 14.074f)
                lineTo(14.5f, 7.915f)
                close()
                moveTo(9.519f, 2.933f)
                lineTo(13.087f, 6.5f)
                lineTo(6.925f, 12.663f)
                close()
            }
        }
        .build()
        return _kite!!
    }

private var _kite: ImageVector? = null
