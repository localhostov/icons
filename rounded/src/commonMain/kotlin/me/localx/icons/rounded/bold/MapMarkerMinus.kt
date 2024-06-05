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

public val Icons.Bold.MapMarkerMinus: ImageVector
    get() {
        if (_mapMarkerMinus != null) {
            return _mapMarkerMinus!!
        }
        _mapMarkerMinus = Builder(name = "MapMarkerMinus", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 22.36f)
                arcToRelative(5.706f, 5.706f, 0.0f, false, false, 7.976f, 0.03f)
                lineToRelative(3.808f, -3.537f)
                arcToRelative(11.093f, 11.093f, 0.0f, false, false, 0.0f, -15.615f)
                arcToRelative(10.967f, 10.967f, 0.0f, false, false, -15.561f, 0.0f)
                arcToRelative(11.1f, 11.1f, 0.0f, false, false, 0.042f, 15.656f)
                close()
                moveTo(6.346f, 5.354f)
                arcToRelative(7.967f, 7.967f, 0.0f, false, true, 11.308f, 0.0f)
                arcTo(8.074f, 8.074f, 0.0f, false, true, 17.7f, 16.7f)
                lineToRelative(-3.8f, 3.525f)
                arcToRelative(2.754f, 2.754f, 0.0f, false, true, -3.832f, -0.03f)
                lineTo(6.346f, 16.737f)
                arcTo(8.084f, 8.084f, 0.0f, false, true, 6.346f, 5.354f)
                close()
                moveTo(7.0f, 11.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.5f, 9.5f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                horizontalLineToRelative(-7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.0f, 11.0f)
                close()
            }
        }
        .build()
        return _mapMarkerMinus!!
    }

private var _mapMarkerMinus: ImageVector? = null
