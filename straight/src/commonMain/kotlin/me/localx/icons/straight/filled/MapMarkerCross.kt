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

public val Icons.Filled.MapMarkerCross: ImageVector
    get() {
        if (_mapMarkerCross != null) {
            return _mapMarkerCross!!
        }
        _mapMarkerCross = Builder(name = "MapMarkerCross", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.071f, 2.929f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 4.937f, 17.079f)
                lineTo(12.0f, 23.987f)
                lineToRelative(7.071f, -6.916f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.0f, -14.142f)
                close()
                moveTo(15.971f, 12.553f)
                lineTo(14.557f, 13.967f)
                lineTo(12.0f, 11.414f)
                lineTo(9.447f, 13.967f)
                lineTo(8.033f, 12.553f)
                lineTo(10.586f, 10.0f)
                lineTo(8.033f, 7.447f)
                lineTo(9.447f, 6.033f)
                lineTo(12.0f, 8.586f)
                lineToRelative(2.553f, -2.553f)
                lineToRelative(1.414f, 1.414f)
                lineTo(13.414f, 10.0f)
                close()
            }
        }
        .build()
        return _mapMarkerCross!!
    }

private var _mapMarkerCross: ImageVector? = null
