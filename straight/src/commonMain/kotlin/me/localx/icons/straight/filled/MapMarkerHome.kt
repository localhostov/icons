package me.localx.icons.straight.filled

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

public val Icons.Filled.MapMarkerHome: ImageVector
    get() {
        if (_mapMarkerHome != null) {
            return _mapMarkerHome!!
        }
        _mapMarkerHome = Builder(name = "MapMarkerHome", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.071f, 2.936f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 4.937f, 17.085f)
                lineTo(12.0f, 23.994f)
                lineToRelative(7.071f, -6.917f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.0f, -14.141f)
                close()
                moveTo(17.0f, 14.0f)
                lineTo(7.0f, 14.0f)
                lineTo(7.0f, 9.409f)
                arcToRelative(2.513f, 2.513f, 0.0f, false, true, 0.983f, -1.986f)
                lineToRelative(2.5f, -1.91f)
                arcToRelative(2.507f, 2.507f, 0.0f, false, true, 3.035f, 0.0f)
                lineToRelative(2.5f, 1.91f)
                arcTo(2.515f, 2.515f, 0.0f, false, true, 17.0f, 9.409f)
                close()
                moveTo(14.8f, 9.013f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.2f, 0.4f)
                lineTo(15.0f, 12.0f)
                lineTo(13.0f, 12.0f)
                lineTo(13.0f, 10.0f)
                lineTo(11.0f, 10.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 12.0f)
                lineTo(9.0f, 9.409f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.2f, -0.4f)
                lineTo(11.7f, 7.1f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.608f, 0.0f)
                close()
            }
        }
        .build()
        return _mapMarkerHome!!
    }

private var _mapMarkerHome: ImageVector? = null
