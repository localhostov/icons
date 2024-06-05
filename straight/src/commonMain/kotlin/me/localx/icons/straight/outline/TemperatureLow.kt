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

public val Icons.Outline.TemperatureLow: ImageVector
    get() {
        if (_temperatureLow != null) {
            return _temperatureLow!!
        }
        _temperatureLow = Builder(name = "TemperatureLow", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.184f)
                lineTo(12.0f, 12.0f)
                lineTo(10.0f, 12.0f)
                verticalLineToRelative(2.184f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 2.0f, 0.0f)
                close()
                moveTo(11.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 18.0f)
                close()
                moveTo(16.0f, 5.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 6.0f, 5.0f)
                verticalLineToRelative(7.11f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 10.0f, 0.0f)
                close()
                moveTo(11.0f, 22.0f)
                arcToRelative(4.994f, 4.994f, 0.0f, false, true, -3.332f, -8.719f)
                lineToRelative(0.332f, -0.3f)
                lineTo(8.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                verticalLineToRelative(7.983f)
                lineToRelative(0.332f, 0.3f)
                arcTo(4.994f, 4.994f, 0.0f, false, true, 11.0f, 22.0f)
                close()
                moveTo(21.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 3.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 0.0f)
                close()
                moveTo(21.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 4.0f)
                close()
            }
        }
        .build()
        return _temperatureLow!!
    }

private var _temperatureLow: ImageVector? = null
