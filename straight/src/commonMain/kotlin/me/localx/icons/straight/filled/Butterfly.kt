package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.Butterfly: ImageVector
    get() {
        if (_butterfly != null) {
            return _butterfly!!
        }
        _butterfly = Builder(name = "Butterfly", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(10.0f, 2.0f)
                    curveTo(10.0f, 1.4696f, 10.2107f, 0.9609f, 10.5858f, 0.5858f)
                    curveTo(10.9609f, 0.2107f, 11.4696f, 0.0f, 12.0f, 0.0f)
                    curveTo(12.5305f, 0.0f, 13.0392f, 0.2107f, 13.4142f, 0.5858f)
                    curveTo(13.7893f, 0.9609f, 14.0f, 1.4696f, 14.0f, 2.0f)
                    curveTo(14.0f, 2.5304f, 13.7893f, 3.0391f, 13.4142f, 3.4142f)
                    curveTo(13.0392f, 3.7893f, 12.5305f, 4.0f, 12.0f, 4.0f)
                    curveTo(11.4696f, 4.0f, 10.9609f, 3.7893f, 10.5858f, 3.4142f)
                    curveTo(10.2107f, 3.0391f, 10.0f, 2.5304f, 10.0f, 2.0f)
                    close()
                    moveTo(22.613f, 2.506f)
                    curveTo(22.2445f, 1.8737f, 21.6575f, 1.3979f, 20.9626f, 1.1682f)
                    curveTo(20.2677f, 0.9386f, 19.5128f, 0.9709f, 18.84f, 1.259f)
                    curveTo(16.6447f, 2.3019f, 14.6639f, 3.7464f, 13.0f, 5.518f)
                    verticalLineTo(14.293f)
                    curveTo(14.2776f, 14.7762f, 15.6343f, 15.016f, 17.0f, 15.0f)
                    curveTo(18.8029f, 15.007f, 20.5384f, 14.3154f, 21.8423f, 13.0703f)
                    curveTo(23.1462f, 11.8251f, 23.917f, 10.1233f, 23.993f, 8.322f)
                    curveTo(24.0196f, 6.2992f, 23.5456f, 4.3012f, 22.613f, 2.506f)
                    close()
                    moveTo(22.271f, 15.261f)
                    curveTo(20.7443f, 16.3877f, 18.8975f, 16.997f, 17.0f, 17.0f)
                    curveTo(15.2859f, 17.0184f, 13.5855f, 16.692f, 12.0f, 16.04f)
                    curveTo(10.4146f, 16.692f, 8.7142f, 17.0184f, 7.0f, 17.0f)
                    curveTo(5.1026f, 16.997f, 3.2557f, 16.3877f, 1.729f, 15.261f)
                    curveTo(-0.186f, 18.348f, 2.249f, 22.761f, 3.066f, 23.496f)
                    lineTo(3.466f, 23.955f)
                    lineTo(4.058f, 23.807f)
                    curveTo(6.7031f, 23.0677f, 9.1007f, 21.6308f, 11.0f, 19.647f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(19.647f)
                    curveTo(14.8985f, 21.6304f, 17.2951f, 23.0672f, 19.939f, 23.807f)
                    lineTo(20.531f, 23.955f)
                    lineTo(20.931f, 23.496f)
                    curveTo(21.763f, 22.751f, 24.18f, 18.323f, 22.271f, 15.261f)
                    close()
                    moveTo(7.206f, 15.0f)
                    curveTo(8.505f, 15.0178f, 9.7946f, 14.7775f, 11.0f, 14.293f)
                    verticalLineTo(5.518f)
                    curveTo(9.3361f, 3.7464f, 7.3554f, 2.3019f, 5.16f, 1.259f)
                    curveTo(4.4872f, 0.9706f, 3.732f, 0.9381f, 3.0369f, 1.1678f)
                    curveTo(2.3418f, 1.3975f, 1.7546f, 1.8735f, 1.386f, 2.506f)
                    curveTo(0.4543f, 4.3015f, -0.0194f, 6.2993f, 0.007f, 8.322f)
                    curveTo(0.1085f, 10.1507f, 0.9155f, 11.8688f, 2.2583f, 13.1144f)
                    curveTo(3.6011f, 14.36f, 5.3748f, 15.036f, 7.206f, 15.0f)
                    close()
                }
            }
        }
        .build()
        return _butterfly!!
    }

private var _butterfly: ImageVector? = null
