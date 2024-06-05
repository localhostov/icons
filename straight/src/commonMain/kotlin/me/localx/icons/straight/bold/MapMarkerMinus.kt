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
                moveTo(12.0f, 23.987f)
                lineToRelative(7.071f, -6.916f)
                arcToRelative(10.009f, 10.009f, 0.0f, false, false, 0.0f, -14.142f)
                horizontalLineToRelative(0.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 4.941f, 17.083f)
                close()
                moveTo(7.051f, 5.05f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 9.911f, 9.888f)
                lineTo(12.0f, 19.791f)
                lineTo(7.05f, 14.95f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 0.0f, -9.9f)
                close()
                moveTo(16.0f, 11.5f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _mapMarkerMinus!!
    }

private var _mapMarkerMinus: ImageVector? = null
