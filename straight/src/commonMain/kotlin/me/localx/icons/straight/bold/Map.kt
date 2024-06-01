package me.localx.icons.straight.bold

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

public val Icons.Bold.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = Builder(name = "Map", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.543f, 1.6385f)
                    lineTo(17.191f, 0.1814f)
                    curveTo(16.4979f, -0.0504f, 15.7495f, -0.0595f, 15.051f, 0.1555f)
                    lineTo(8.962f, 1.9835f)
                    lineTo(4.848f, 0.2725f)
                    curveTo(4.3162f, 0.0505f, 3.7379f, -0.0367f, 3.1644f, 0.0186f)
                    curveTo(2.5909f, 0.0738f, 2.0398f, 0.2698f, 1.5602f, 0.5892f)
                    curveTo(1.0806f, 0.9085f, 0.6872f, 1.3413f, 0.4151f, 1.8492f)
                    curveTo(0.1429f, 2.357f, 3.0E-4f, 2.9242f, -0.0f, 3.5004f)
                    lineTo(-0.0f, 21.6315f)
                    lineTo(8.5f, 24.0604f)
                    lineTo(15.549f, 22.0515f)
                    lineTo(24.019f, 24.1145f)
                    verticalLineTo(4.9834f)
                    curveTo(24.02f, 4.234f, 23.7798f, 3.5041f, 23.3339f, 2.9017f)
                    curveTo(22.888f, 2.2993f, 22.2601f, 1.8564f, 21.543f, 1.6385f)
                    close()
                    moveTo(14.018f, 3.6235f)
                    verticalLineTo(19.3685f)
                    lineTo(10.0f, 20.5135f)
                    verticalLineTo(4.8734f)
                    curveTo(10.035f, 4.8635f, 10.07f, 4.8604f, 10.1f, 4.8505f)
                    lineTo(14.018f, 3.6235f)
                    close()
                    moveTo(3.0f, 3.5004f)
                    curveTo(3.0f, 3.418f, 3.0203f, 3.3368f, 3.0593f, 3.2641f)
                    curveTo(3.0983f, 3.1914f, 3.1546f, 3.1294f, 3.2233f, 3.0838f)
                    curveTo(3.292f, 3.0382f, 3.371f, 3.0102f, 3.4531f, 3.0025f)
                    curveTo(3.5352f, 2.9948f, 3.618f, 3.0075f, 3.694f, 3.0394f)
                    lineTo(7.0f, 4.4165f)
                    verticalLineTo(20.5165f)
                    lineTo(3.0f, 19.3694f)
                    verticalLineTo(3.5004f)
                    close()
                    moveTo(21.018f, 20.3004f)
                    lineTo(17.018f, 19.3265f)
                    verticalLineTo(3.2864f)
                    lineTo(20.655f, 4.5005f)
                    curveTo(20.7594f, 4.5302f, 20.8513f, 4.5931f, 20.9168f, 4.6797f)
                    curveTo(20.9823f, 4.7663f, 21.0178f, 4.8719f, 21.018f, 4.9805f)
                    verticalLineTo(20.3004f)
                    close()
                }
            }
        }
        .build()
        return _map!!
    }

private var _map: ImageVector? = null
