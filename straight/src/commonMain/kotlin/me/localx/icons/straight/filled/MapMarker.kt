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

public val Icons.Filled.MapMarker: ImageVector
    get() {
        if (_mapMarker != null) {
            return _mapMarker!!
        }
        _mapMarker = Builder(name = "MapMarker", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 7.0f)
                close()
                moveTo(16.95f, 11.957f)
                lineTo(12.0f, 16.8f)
                lineTo(7.058f, 11.964f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 9.892f, -0.008f)
                close()
                moveTo(16.0f, 7.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 16.0f, 7.0f)
                close()
                moveTo(21.867f, 10.613f)
                lineTo(20.432f, 10.133f)
                arcToRelative(8.948f, 8.948f, 0.0f, false, true, -2.068f, 3.239f)
                lineTo(12.0f, 19.6f)
                lineToRelative(-6.34f, -6.2f)
                arcTo(8.989f, 8.989f, 0.0f, false, true, 3.24f, 9.029f)
                arcTo(2.968f, 2.968f, 0.0f, false, false, 0.0f, 12.0f)
                verticalLineToRelative(9.752f)
                lineToRelative(7.983f, 2.281f)
                lineToRelative(8.02f, -2.0f)
                lineToRelative(8.0f, 1.948f)
                lineTo(24.003f, 13.483f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.867f, 10.612f)
                close()
            }
        }
        .build()
        return _mapMarker!!
    }

private var _mapMarker: ImageVector? = null
