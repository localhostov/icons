package me.localx.icons.rounded.outline

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

public val Icons.Outline.Spinner: ImageVector
    get() {
        if (_spinner != null) {
            return _spinner!!
        }
        _spinner = Builder(name = "Spinner", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 23.9999f)
                    curveTo(9.8652f, 23.9995f, 7.7692f, 23.4295f, 5.9282f, 22.3489f)
                    curveTo(4.0871f, 21.2682f, 2.5677f, 19.716f, 1.5266f, 17.8524f)
                    curveTo(0.4854f, 15.9887f, -0.0397f, 13.881f, 0.0054f, 11.7467f)
                    curveTo(0.0504f, 9.6124f, 0.664f, 7.5288f, 1.7828f, 5.7107f)
                    curveTo(2.9017f, 3.8926f, 4.4852f, 2.4059f, 6.3703f, 1.4039f)
                    curveTo(8.2552f, 0.4019f, 10.3734f, -0.0791f, 12.5063f, 0.0105f)
                    curveTo(14.6392f, 0.1001f, 16.7096f, 0.7571f, 18.5039f, 1.9136f)
                    curveTo(20.2982f, 3.0702f, 21.7516f, 4.6844f, 22.714f, 6.5899f)
                    curveTo(22.7779f, 6.7076f, 22.8176f, 6.8369f, 22.8306f, 6.9702f)
                    curveTo(22.8436f, 7.1034f, 22.8297f, 7.238f, 22.7898f, 7.3658f)
                    curveTo(22.7498f, 7.4936f, 22.6846f, 7.6121f, 22.598f, 7.7142f)
                    curveTo(22.5113f, 7.8163f, 22.4051f, 7.9f, 22.2855f, 7.9603f)
                    curveTo(22.166f, 8.0206f, 22.0355f, 8.0562f, 21.9019f, 8.0652f)
                    curveTo(21.7683f, 8.0741f, 21.6342f, 8.0561f, 21.5077f, 8.0122f)
                    curveTo(21.3812f, 7.9683f, 21.2648f, 7.8995f, 21.1654f, 7.8098f)
                    curveTo(21.066f, 7.7201f, 20.9856f, 7.6113f, 20.929f, 7.4899f)
                    curveTo(19.9155f, 5.4832f, 18.2553f, 3.8765f, 16.2164f, 2.9292f)
                    curveTo(14.1775f, 1.9819f, 11.8789f, 1.7492f, 9.6916f, 2.2688f)
                    curveTo(7.5043f, 2.7884f, 5.5558f, 4.03f, 4.1608f, 5.793f)
                    curveTo(2.7658f, 7.556f, 2.0055f, 9.7377f, 2.0028f, 11.9859f)
                    curveTo(2.0001f, 14.2341f, 2.755f, 16.4176f, 4.1457f, 18.1841f)
                    curveTo(5.5365f, 19.9505f, 7.4819f, 21.1968f, 9.6679f, 21.7217f)
                    curveTo(11.854f, 22.2466f, 14.1531f, 22.0196f, 16.1943f, 21.0772f)
                    curveTo(18.2355f, 20.1349f, 19.8996f, 18.5323f, 20.918f, 16.5279f)
                    curveTo(21.043f, 16.2999f, 21.2519f, 16.1295f, 21.5004f, 16.0529f)
                    curveTo(21.7489f, 15.9763f, 22.0174f, 15.9996f, 22.2491f, 16.1177f)
                    curveTo(22.4808f, 16.2358f, 22.6573f, 16.4395f, 22.7413f, 16.6856f)
                    curveTo(22.8253f, 16.9317f, 22.8101f, 17.2008f, 22.699f, 17.4359f)
                    curveTo(21.6995f, 19.4143f, 20.1696f, 21.0759f, 18.2803f, 22.235f)
                    curveTo(16.3909f, 23.3942f, 14.2165f, 24.0052f, 12.0f, 23.9999f)
                    close()
                }
            }
        }
        .build()
        return _spinner!!
    }

private var _spinner: ImageVector? = null
