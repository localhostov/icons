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

public val Icons.Bold.Surfing: ImageVector
    get() {
        if (_surfing != null) {
            return _surfing!!
        }
        _surfing = Builder(name = "Surfing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.021f, 0.9785f)
                    curveTo(22.6667f, 0.6229f, 22.2378f, 0.3506f, 21.7652f, 0.1813f)
                    curveTo(21.2927f, 0.0119f, 20.7884f, -0.0501f, 20.289f, -5.0E-4f)
                    curveTo(18.489f, 0.1755f, 12.289f, 1.0865f, 7.939f, 5.4395f)
                    curveTo(4.4066f, 8.8751f, 1.8259f, 13.1683f, 0.449f, 17.8995f)
                    lineTo(0.149f, 18.7785f)
                    lineTo(5.22f, 23.8495f)
                    lineTo(6.099f, 23.5555f)
                    curveTo(10.829f, 22.1772f, 15.1209f, 19.5962f, 18.556f, 16.0645f)
                    curveTo(22.914f, 11.7065f, 23.825f, 5.5075f, 24.0f, 3.7115f)
                    curveTo(24.0495f, 3.2119f, 23.9873f, 2.7075f, 23.818f, 2.2348f)
                    curveTo(23.6487f, 1.7622f, 23.3764f, 1.3331f, 23.021f, 0.9785f)
                    close()
                    moveTo(16.439f, 13.9385f)
                    curveTo(13.5537f, 16.9181f, 9.9776f, 19.1394f, 6.028f, 20.4055f)
                    lineTo(5.871f, 20.2495f)
                    lineTo(17.561f, 8.5605f)
                    lineTo(15.439f, 6.4385f)
                    lineTo(3.75f, 18.1285f)
                    lineTo(3.594f, 17.9725f)
                    curveTo(4.8599f, 14.0225f, 7.0812f, 10.446f, 10.061f, 7.5605f)
                    curveTo(13.709f, 3.9115f, 19.035f, 3.1355f, 20.581f, 2.9845f)
                    curveTo(20.6394f, 2.9783f, 20.6984f, 2.9855f, 20.7536f, 3.0054f)
                    curveTo(20.8089f, 3.0253f, 20.8589f, 3.0575f, 20.9f, 3.0995f)
                    curveTo(20.9419f, 3.1406f, 20.9741f, 3.1906f, 20.9942f, 3.2458f)
                    curveTo(21.0142f, 3.301f, 21.0217f, 3.36f, 21.016f, 3.4185f)
                    curveTo(20.864f, 4.9645f, 20.088f, 10.2905f, 16.439f, 13.9385f)
                    close()
                }
            }
        }
        .build()
        return _surfing!!
    }

private var _surfing: ImageVector? = null
