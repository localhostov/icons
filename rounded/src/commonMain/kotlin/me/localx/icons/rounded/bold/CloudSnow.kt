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

public val Icons.Bold.CloudSnow: ImageVector
    get() {
        if (_cloudSnow != null) {
            return _cloudSnow!!
        }
        _cloudSnow = Builder(name = "CloudSnow", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 18.63f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.064f, -2.556f)
                curveToRelative(2.809f, -2.6f, 1.562f, -7.521f, -2.214f, -8.21f)
                arcToRelative(3.417f, 3.417f, 0.0f, false, true, -2.447f, -1.9f)
                arcTo(5.184f, 5.184f, 0.0f, false, false, 4.983f, 7.285f)
                arcTo(5.347f, 5.347f, 0.0f, false, false, 5.0f, 9.174f)
                arcToRelative(3.412f, 3.412f, 0.0f, false, true, -1.089f, 3.143f)
                arcToRelative(2.748f, 2.748f, 0.0f, false, false, -0.254f, 3.821f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.322f, 1.9f)
                arcTo(5.767f, 5.767f, 0.0f, false, true, 1.9f, 10.1f)
                arcToRelative(0.427f, 0.427f, 0.0f, false, false, 0.163f, -0.354f)
                arcToRelative(8.325f, 8.325f, 0.0f, false, true, -0.035f, -2.95f)
                arcTo(8.131f, 8.131f, 0.0f, false, true, 8.558f, 0.14f)
                arcToRelative(8.243f, 8.243f, 0.0f, false, true, 8.929f, 4.54f)
                arcToRelative(0.437f, 0.437f, 0.0f, false, false, 0.322f, 0.242f)
                curveToRelative(6.1f, 1.134f, 8.255f, 9.008f, 3.755f, 13.265f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.5f, 18.63f)
                close()
                moveTo(14.611f, 23.223f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.428f, -2.078f)
                lineTo(14.284f, 20.0f)
                lineTo(15.5f, 20.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                lineTo(14.284f, 17.0f)
                lineToRelative(0.755f, -1.145f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.506f, -1.65f)
                lineTo(11.5f, 15.773f)
                lineToRelative(-1.033f, -1.568f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.506f, 1.65f)
                lineTo(8.716f, 17.0f)
                lineTo(7.5f, 17.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                lineTo(8.716f, 20.0f)
                lineToRelative(-0.755f, 1.145f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.506f, 1.65f)
                lineTo(11.5f, 21.227f)
                lineTo(12.533f, 22.8f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.078f, 0.428f)
                close()
            }
        }
        .build()
        return _cloudSnow!!
    }

private var _cloudSnow: ImageVector? = null
