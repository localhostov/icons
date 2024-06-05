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

public val Icons.Bold.MapMarkerHome: ImageVector
    get() {
        if (_mapMarkerHome != null) {
            return _mapMarkerHome!!
        }
        _mapMarkerHome = Builder(name = "MapMarkerHome", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(10.9f, 10.9f, 0.0f, false, false, 4.22f, 3.237f)
                arcTo(11.1f, 11.1f, 0.0f, false, false, 4.262f, 18.9f)
                lineTo(8.0f, 22.359f)
                arcToRelative(5.706f, 5.706f, 0.0f, false, false, 7.977f, 0.031f)
                lineToRelative(3.807f, -3.536f)
                arcToRelative(11.091f, 11.091f, 0.0f, false, false, 0.0f, -15.616f)
                arcTo(10.9f, 10.9f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(17.7f, 16.7f)
                lineTo(13.9f, 20.226f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -3.832f, -0.031f)
                lineTo(6.346f, 16.736f)
                arcToRelative(8.083f, 8.083f, 0.0f, false, true, 0.0f, -11.382f)
                arcToRelative(7.967f, 7.967f, 0.0f, false, true, 11.308f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcTo(8.073f, 8.073f, 0.0f, false, true, 17.7f, 16.7f)
                close()
                moveTo(17.0f, 10.128f)
                lineTo(17.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(15.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(14.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(11.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(8.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(7.0f, 10.128f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.86f, -1.643f)
                lineToRelative(3.0f, -2.082f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.28f, 0.0f)
                lineToRelative(3.0f, 2.082f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 17.0f, 10.128f)
                close()
            }
        }
        .build()
        return _mapMarkerHome!!
    }

private var _mapMarkerHome: ImageVector? = null
