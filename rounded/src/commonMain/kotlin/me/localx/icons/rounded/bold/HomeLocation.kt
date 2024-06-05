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

public val Icons.Bold.HomeLocation: ImageVector
    get() {
        if (_homeLocation != null) {
            return _homeLocation!!
        }
        _homeLocation = Builder(name = "HomeLocation", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.656f, 5.419f)
                lineTo(14.975f, 0.91f)
                arcToRelative(5.292f, 5.292f, 0.0f, false, false, -5.95f, 0.0f)
                lineTo(2.344f, 5.418f)
                arcTo(5.31f, 5.31f, 0.0f, false, false, 0.0f, 9.827f)
                verticalLineToRelative(8.855f)
                arcTo(5.324f, 5.324f, 0.0f, false, false, 5.318f, 24.0f)
                lineTo(18.682f, 24.0f)
                arcTo(5.324f, 5.324f, 0.0f, false, false, 24.0f, 18.682f)
                lineTo(24.0f, 9.827f)
                arcTo(5.307f, 5.307f, 0.0f, false, false, 21.656f, 5.419f)
                close()
                moveTo(21.0f, 18.682f)
                arcTo(2.321f, 2.321f, 0.0f, false, true, 18.682f, 21.0f)
                lineTo(5.318f, 21.0f)
                arcTo(2.321f, 2.321f, 0.0f, false, true, 3.0f, 18.682f)
                lineTo(3.0f, 9.827f)
                arcTo(2.317f, 2.317f, 0.0f, false, true, 4.021f, 7.905f)
                lineTo(10.7f, 3.4f)
                arcToRelative(2.311f, 2.311f, 0.0f, false, true, 2.593f, 0.0f)
                lineToRelative(6.682f, 4.51f)
                arcTo(2.314f, 2.314f, 0.0f, false, true, 21.0f, 9.827f)
                close()
                moveTo(12.0f, 8.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -3.536f, 8.535f)
                lineToRelative(2.649f, 2.591f)
                arcToRelative(1.269f, 1.269f, 0.0f, false, false, 1.774f, 0.0f)
                lineToRelative(2.648f, -2.591f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 8.0f)
                close()
                moveTo(12.0f, 14.554f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 1.5f, -1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 14.554f)
                close()
            }
        }
        .build()
        return _homeLocation!!
    }

private var _homeLocation: ImageVector? = null
