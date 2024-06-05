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

public val Icons.Bold.DisplaySlash: ImageVector
    get() {
        if (_displaySlash != null) {
            return _displaySlash!!
        }
        _displaySlash = Builder(name = "DisplaySlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.121f, 18.0f)
                horizontalLineToRelative(3.878f)
                lineTo(23.999f, 4.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(3.121f, 1.0f)
                lineTo(2.111f, -0.011f)
                lineTo(-0.01f, 2.11f)
                lineToRelative(21.9f, 21.9f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-3.889f, -3.889f)
                close()
                moveTo(20.999f, 4.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-3.878f)
                lineTo(6.121f, 4.0f)
                horizontalLineToRelative(14.878f)
                close()
                moveTo(15.049f, 20.0f)
                lineToRelative(2.45f, 2.45f)
                verticalLineToRelative(0.55f)
                lineTo(6.5f, 23.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                lineTo(0.0f, 18.0f)
                lineTo(0.0f, 4.95f)
                lineToRelative(3.0f, 3.0f)
                verticalLineToRelative(7.05f)
                horizontalLineToRelative(7.05f)
                lineToRelative(3.45f, 3.45f)
                verticalLineToRelative(1.55f)
                horizontalLineToRelative(1.55f)
                close()
            }
        }
        .build()
        return _displaySlash!!
    }

private var _displaySlash: ImageVector? = null
