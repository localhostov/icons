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
                moveTo(20.5f, 17.0f)
                arcToRelative(3.432f, 3.432f, 0.0f, false, false, -0.5f, 0.036f)
                lineTo(20.0f, 5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 22.5f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 17.0f, 5.5f)
                lineTo(17.0f, 16.377f)
                lineToRelative(-0.791f, 0.233f)
                arcToRelative(3.285f, 3.285f, 0.0f, false, false, -0.144f, -0.591f)
                lineToRelative(-2.032f, -6.58f)
                arcToRelative(3.505f, 3.505f, 0.0f, false, false, -4.4f, -2.273f)
                lineTo(2.44f, 9.457f)
                arcTo(3.519f, 3.519f, 0.0f, false, false, 0.151f, 13.812f)
                lineToRelative(2.03f, 6.623f)
                curveToRelative(0.033f, 0.092f, 0.069f, 0.182f, 0.109f, 0.269f)
                lineToRelative(-1.213f, 0.357f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.846f, 2.878f)
                lineToRelative(15.235f, -4.481f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 20.5f, 17.0f)
                close()
                moveTo(5.028f, 19.492f)
                lineTo(3.021f, 12.938f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.329f, -0.622f)
                lineToRelative(7.2f, -2.292f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.624f, 0.313f)
                lineToRelative(2.042f, 6.608f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.312f, 0.636f)
                lineToRelative(-0.036f, 0.013f)
                lineTo(5.505f, 19.758f)
                arcTo(0.479f, 0.479f, 0.0f, false, true, 5.028f, 19.492f)
                close()
                moveTo(10.122f, 13.443f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.976f, 1.884f)
                lineToRelative(-1.6f, 0.507f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -0.908f, -2.859f)
                lineToRelative(1.595f, -0.507f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.122f, 13.443f)
                close()
            }
        }
        .build()
        return _truckLoading!!
    }

private var _truckLoading: ImageVector? = null
