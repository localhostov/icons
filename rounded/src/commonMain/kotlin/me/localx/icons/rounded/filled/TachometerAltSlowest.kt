package me.localx.icons.rounded.filled

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

public val Icons.Filled.TachometerAltSlowest: ImageVector
    get() {
        if (_tachometerAltSlowest != null) {
            return _tachometerAltSlowest!!
        }
        _tachometerAltSlowest = Builder(name = "TachometerAltSlowest", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 13.0f)
                arcToRelative(11.878f, 11.878f, 0.0f, false, false, 3.759f, 8.712f)
                arcTo(4.84f, 4.84f, 0.0f, false, false, 7.113f, 23.0f)
                lineTo(16.88f, 23.0f)
                arcToRelative(4.994f, 4.994f, 0.0f, false, false, 3.509f, -1.429f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 0.0f, 13.0f)
                close()
                moveTo(5.109f, 14.875f)
                lineTo(10.024f, 12.761f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.787f, 1.839f)
                lineTo(5.9f, 16.712f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.79f, -1.837f)
                close()
                moveTo(3.069f, 11.881f)
                arcTo(8.92f, 8.92f, 0.0f, false, true, 5.636f, 6.636f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 18.364f, 19.364f)
                curveToRelative(-0.134f, 0.134f, -0.27f, 0.263f, -0.411f, 0.387f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.324f, -1.5f)
                curveToRelative(0.109f, -0.1f, 0.217f, -0.2f, 0.321f, -0.3f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -9.9f, -9.9f)
                arcToRelative(6.929f, 6.929f, 0.0f, false, false, -2.0f, 4.079f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.985f, -0.248f)
                close()
            }
        }
        .build()
        return _tachometerAltSlowest!!
    }

private var _tachometerAltSlowest: ImageVector? = null
