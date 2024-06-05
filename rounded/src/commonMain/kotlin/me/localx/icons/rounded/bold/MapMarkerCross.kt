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

public val Icons.Bold.MapMarkerCross: ImageVector
    get() {
        if (_mapMarkerCross != null) {
            return _mapMarkerCross!!
        }
        _mapMarkerCross = Builder(name = "MapMarkerCross", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.439f, 12.439f)
                lineTo(9.879f, 11.0f)
                lineTo(8.439f, 9.561f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.122f, -2.122f)
                lineTo(12.0f, 8.879f)
                lineToRelative(1.439f, -1.44f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.122f, 2.122f)
                lineTo(14.121f, 11.0f)
                lineToRelative(1.44f, 1.439f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.122f, 2.122f)
                lineTo(12.0f, 13.121f)
                lineToRelative(-1.439f, 1.44f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.122f, -2.122f)
                close()
                moveTo(4.262f, 18.894f)
                arcTo(11.1f, 11.1f, 0.0f, false, true, 4.22f, 3.238f)
                arcToRelative(10.967f, 10.967f, 0.0f, false, true, 15.561f, 0.0f)
                arcToRelative(11.09f, 11.09f, 0.0f, false, true, 0.0f, 15.615f)
                lineTo(15.973f, 22.39f)
                arcTo(5.706f, 5.706f, 0.0f, false, true, 8.0f, 22.36f)
                close()
                moveTo(6.346f, 16.737f)
                lineTo(10.068f, 20.191f)
                arcToRelative(2.755f, 2.755f, 0.0f, false, false, 3.833f, 0.03f)
                lineTo(17.7f, 16.7f)
                arcToRelative(8.074f, 8.074f, 0.0f, false, false, -0.043f, -11.342f)
                horizontalLineToRelative(0.0f)
                arcToRelative(7.967f, 7.967f, 0.0f, false, false, -11.308f, 0.0f)
                arcTo(8.084f, 8.084f, 0.0f, false, false, 6.346f, 16.737f)
                close()
            }
        }
        .build()
        return _mapMarkerCross!!
    }

private var _mapMarkerCross: ImageVector? = null
