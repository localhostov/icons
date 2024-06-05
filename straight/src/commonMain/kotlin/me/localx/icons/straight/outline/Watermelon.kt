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

public val Icons.Outline.Watermelon: ImageVector
    get() {
        if (_watermelon != null) {
            return _watermelon!!
        }
        _watermelon = Builder(name = "Watermelon", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.019f, 0.793f)
                lineTo(19.312f, 0.086f)
                lineTo(0.086f, 19.312f)
                lineToRelative(0.707f, 0.707f)
                arcTo(13.595f, 13.595f, 0.0f, false, false, 20.019f, 0.793f)
                close()
                moveTo(18.6f, 18.6f)
                arcToRelative(11.61f, 11.61f, 0.0f, false, true, -15.66f, 0.677f)
                lineTo(19.281f, 2.944f)
                arcTo(11.61f, 11.61f, 0.0f, false, true, 18.6f, 18.6f)
                close()
                moveTo(19.632f, 10.632f)
                arcToRelative(1.243f, 1.243f, 0.0f, false, true, -1.757f, 0.0f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 17.0f, 8.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 2.636f, 0.879f)
                arcTo(1.243f, 1.243f, 0.0f, false, true, 19.636f, 10.636f)
                close()
                moveTo(14.632f, 16.875f)
                arcToRelative(1.242f, 1.242f, 0.0f, true, true, -1.757f, 1.757f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 12.0f, 16.0f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 14.636f, 16.879f)
                close()
                moveTo(17.632f, 13.875f)
                arcToRelative(1.242f, 1.242f, 0.0f, true, true, -1.757f, 1.757f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 15.0f, 13.0f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 17.636f, 13.879f)
                close()
                moveTo(9.632f, 17.875f)
                arcToRelative(1.242f, 1.242f, 0.0f, true, true, -1.757f, 1.757f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 7.0f, 17.0f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 9.636f, 17.879f)
                close()
            }
        }
        .build()
        return _watermelon!!
    }

private var _watermelon: ImageVector? = null
