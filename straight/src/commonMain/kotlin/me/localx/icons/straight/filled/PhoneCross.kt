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

public val Icons.Filled.PhoneCross: ImageVector
    get() {
        if (_phoneCross != null) {
            return _phoneCross!!
        }
        _phoneCross = Builder(name = "PhoneCross", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.579f, 8.9607f)
                    lineTo(19.517f, 5.9088f)
                    lineTo(16.467f, 8.9668f)
                    lineTo(15.045f, 7.5617f)
                    lineTo(18.1f, 4.4998f)
                    lineTo(15.039f, 1.4418f)
                    lineTo(16.453f, 0.0278f)
                    curveTo(16.68f, 0.2548f, 17.984f, 1.5558f, 19.513f, 3.0798f)
                    lineTo(22.564f, 0.0208f)
                    lineTo(23.978f, 1.4358f)
                    lineTo(20.929f, 4.4917f)
                    lineTo(23.985f, 7.5388f)
                    lineTo(22.579f, 8.9607f)
                    close()
                    moveTo(13.501f, 16.9608f)
                    curveTo(10.5902f, 15.7277f, 8.2753f, 13.4075f, 7.049f, 10.4938f)
                    lineTo(11.174f, 6.3678f)
                    lineTo(4.908f, 0.0998f)
                    lineTo(1.738f, 3.2698f)
                    curveTo(1.1875f, 3.8228f, 0.7524f, 4.4796f, 0.4578f, 5.2021f)
                    curveTo(0.1632f, 5.9247f, 0.0151f, 6.6985f, 0.022f, 7.4788f)
                    curveTo(0.022f, 14.7268f, 9.274f, 23.9788f, 16.522f, 23.9788f)
                    curveTo(17.3019f, 23.985f, 18.0752f, 23.8365f, 18.7973f, 23.542f)
                    curveTo(19.5194f, 23.2474f, 20.176f, 22.8126f, 20.729f, 22.2628f)
                    lineTo(23.9f, 19.0918f)
                    lineTo(17.636f, 12.8258f)
                    lineTo(13.501f, 16.9608f)
                    close()
                }
            }
        }
        .build()
        return _phoneCross!!
    }

private var _phoneCross: ImageVector? = null
