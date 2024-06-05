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

public val Icons.Filled.TachometerAltSlow: ImageVector
    get() {
        if (_tachometerAltSlow != null) {
            return _tachometerAltSlow!!
        }
        _tachometerAltSlow = Builder(name = "TachometerAltSlow", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 13.0f)
                arcToRelative(12.019f, 12.019f, 0.0f, false, false, 5.112f, 9.818f)
                lineTo(5.371f, 23.0f)
                lineTo(18.629f, 23.0f)
                lineToRelative(0.259f, -0.182f)
                curveTo(28.417f, 16.166f, 23.622f, 0.98f, 12.0f, 1.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 0.0f, 13.0f)
                close()
                moveTo(16.618f, 18.249f)
                curveToRelative(5.726f, -5.081f, 0.241f, -14.377f, -6.963f, -11.836f)
                lineTo(8.129f, 4.887f)
                curveTo(17.553f, 0.538f, 25.644f, 12.771f, 17.94f, 19.751f)
                close()
                moveTo(10.0f, 13.0f)
                arcToRelative(2.017f, 2.017f, 0.0f, false, true, 0.074f, -0.512f)
                lineTo(5.293f, 7.707f)
                lineTo(6.707f, 6.293f)
                lineToRelative(4.781f, 4.781f)
                arcTo(2.0f, 2.0f, 0.0f, true, true, 10.0f, 13.0f)
                close()
                moveTo(3.0f, 13.0f)
                arcToRelative(8.929f, 8.929f, 0.0f, false, true, 0.887f, -3.871f)
                lineToRelative(1.526f, 1.526f)
                arcToRelative(6.99f, 6.99f, 0.0f, false, false, 1.969f, 7.594f)
                lineToRelative(-1.322f, 1.5f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 3.0f, 13.0f)
                close()
            }
        }
        .build()
        return _tachometerAltSlow!!
    }

private var _tachometerAltSlow: ImageVector? = null
