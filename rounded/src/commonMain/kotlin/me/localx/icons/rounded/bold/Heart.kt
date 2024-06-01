package me.localx.icons.rounded.bold

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
import me.localx.icons.rounded.Icons

public val Icons.Bold.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.25f, 1.8507f)
                    curveTo(16.2243f, 1.8606f, 15.2152f, 2.1107f, 14.3035f, 2.5807f)
                    curveTo(13.3918f, 3.0508f, 12.6029f, 3.7279f, 12.0f, 4.5577f)
                    curveTo(11.397f, 3.7279f, 10.6081f, 3.0508f, 9.6964f, 2.5807f)
                    curveTo(8.7848f, 2.1107f, 7.7757f, 1.8606f, 6.75f, 1.8507f)
                    curveTo(4.8917f, 1.9249f, 3.1385f, 2.7319f, 1.8736f, 4.0952f)
                    curveTo(0.6087f, 5.4585f, -0.065f, 7.2671f, -0.0f, 9.1257f)
                    curveTo(-0.0f, 13.6777f, 4.674f, 18.5507f, 8.6f, 21.8377f)
                    curveTo(9.5533f, 22.6393f, 10.7589f, 23.0788f, 12.0045f, 23.0788f)
                    curveTo(13.25f, 23.0788f, 14.4556f, 22.6393f, 15.409f, 21.8377f)
                    curveTo(19.331f, 18.5507f, 24.009f, 13.6777f, 24.009f, 9.1257f)
                    curveTo(24.0738f, 7.2656f, 23.399f, 5.4556f, 22.1322f, 4.0921f)
                    curveTo(20.8653f, 2.7286f, 19.1098f, 1.9226f, 17.25f, 1.8507f)
                    close()
                    moveTo(13.477f, 19.5387f)
                    curveTo(13.0634f, 19.8869f, 12.5401f, 20.0779f, 11.9995f, 20.0779f)
                    curveTo(11.4588f, 20.0779f, 10.9355f, 19.8869f, 10.522f, 19.5387f)
                    curveTo(5.742f, 15.5307f, 3.0f, 11.7357f, 3.0f, 9.1257f)
                    curveTo(2.9362f, 8.0629f, 3.2942f, 7.0179f, 3.9963f, 6.2175f)
                    curveTo(4.6984f, 5.4171f, 5.6879f, 4.926f, 6.75f, 4.8507f)
                    curveTo(7.812f, 4.926f, 8.8015f, 5.4171f, 9.5036f, 6.2175f)
                    curveTo(10.2057f, 7.0179f, 10.5637f, 8.0629f, 10.5f, 9.1257f)
                    curveTo(10.5f, 9.5235f, 10.658f, 9.9051f, 10.9393f, 10.1864f)
                    curveTo(11.2206f, 10.4677f, 11.6021f, 10.6257f, 12.0f, 10.6257f)
                    curveTo(12.3978f, 10.6257f, 12.7793f, 10.4677f, 13.0606f, 10.1864f)
                    curveTo(13.3419f, 9.9051f, 13.5f, 9.5235f, 13.5f, 9.1257f)
                    curveTo(13.4362f, 8.0629f, 13.7942f, 7.0179f, 14.4963f, 6.2175f)
                    curveTo(15.1984f, 5.4171f, 16.1879f, 4.926f, 17.25f, 4.8507f)
                    curveTo(18.312f, 4.926f, 19.3015f, 5.4171f, 20.0036f, 6.2175f)
                    curveTo(20.7057f, 7.0179f, 21.0637f, 8.0629f, 21.0f, 9.1257f)
                    curveTo(21.0f, 11.7357f, 18.258f, 15.5307f, 13.477f, 19.5387f)
                    close()
                }
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
