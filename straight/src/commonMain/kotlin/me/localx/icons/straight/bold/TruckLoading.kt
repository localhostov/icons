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

public val Icons.Bold.TruckLoading: ImageVector
    get() {
        if (_truckLoading != null) {
            return _truckLoading!!
        }
        _truckLoading = Builder(name = "TruckLoading", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 3.0f)
                lineTo(24.0f, 3.0f)
                lineTo(24.0f, 0.0f)
                lineTo(20.5f, 0.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 17.0f, 3.5f)
                lineTo(17.0f, 16.36f)
                lineToRelative(-0.614f, 0.171f)
                lineTo(13.51f, 6.854f)
                lineTo(0.072f, 10.715f)
                lineTo(2.79f, 20.307f)
                lineTo(0.1f, 21.055f)
                lineToRelative(0.8f, 2.89f)
                lineToRelative(16.267f, -4.518f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 20.5f, 17.0f)
                arcToRelative(3.432f, 3.432f, 0.0f, false, false, -0.5f, 0.036f)
                lineTo(20.0f, 3.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 20.5f, 3.0f)
                close()
                moveTo(3.773f, 12.772f)
                lineToRelative(7.707f, -2.214f)
                lineTo(13.5f, 17.333f)
                lineTo(5.681f, 19.5f)
                close()
                moveTo(9.791f, 12.982f)
                lineTo(10.619f, 15.866f)
                lineTo(7.119f, 16.866f)
                lineTo(6.291f, 13.982f)
                close()
            }
        }
        .build()
        return _truckLoading!!
    }

private var _truckLoading: ImageVector? = null
