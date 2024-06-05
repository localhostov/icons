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

public val Icons.Bold.MakeupBrush: ImageVector
    get() {
        if (_makeupBrush != null) {
            return _makeupBrush!!
        }
        _makeupBrush = Builder(name = "MakeupBrush", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.953f, 4.563f)
                lineToRelative(-4.517f, -4.518f)
                lineToRelative(-14.236f, 12.087f)
                lineToRelative(-5.167f, 2.668f)
                verticalLineToRelative(1.99f)
                arcToRelative(7.189f, 7.189f, 0.0f, false, false, 7.18f, 7.181f)
                horizontalLineToRelative(2.005f)
                lineToRelative(2.589f, -5.047f)
                close()
                moveTo(19.881f, 4.732f)
                lineTo(14.614f, 10.958f)
                lineTo(13.055f, 9.4f)
                lineTo(19.27f, 4.121f)
                close()
                moveTo(7.385f, 20.968f)
                horizontalLineToRelative(-0.172f)
                arcToRelative(4.185f, 4.185f, 0.0f, false, true, -4.18f, -4.181f)
                verticalLineToRelative(-0.162f)
                lineToRelative(3.473f, -1.79f)
                lineToRelative(2.661f, 2.665f)
                close()
            }
        }
        .build()
        return _makeupBrush!!
    }

private var _makeupBrush: ImageVector? = null
