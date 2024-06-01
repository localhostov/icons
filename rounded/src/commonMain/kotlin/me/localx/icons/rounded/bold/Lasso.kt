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

public val Icons.Bold.Lasso: ImageVector
    get() {
        if (_lasso != null) {
            return _lasso!!
        }
        _lasso = Builder(name = "Lasso", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.9999f, 0.0f)
                    curveTo(6.9349f, 0.0f, 1.9999f, 4.037f, 1.9999f, 9.0f)
                    curveTo(2.0027f, 9.3755f, 2.0341f, 9.7503f, 2.0939f, 10.121f)
                    curveTo(2.0759f, 10.138f, 2.0549f, 10.149f, 2.0369f, 10.167f)
                    curveTo(1.3853f, 10.8206f, 0.9803f, 11.6798f, 0.891f, 12.5984f)
                    curveTo(0.8017f, 13.517f, 1.0334f, 14.4381f, 1.5469f, 15.205f)
                    curveTo(0.5124f, 16.3929f, -0.0395f, 17.9253f, -1.0E-4f, 19.5f)
                    curveTo(-0.0177f, 20.0957f, 0.0867f, 20.6887f, 0.3066f, 21.2426f)
                    curveTo(0.5265f, 21.7966f, 0.8574f, 22.2997f, 1.2788f, 22.7211f)
                    curveTo(1.7002f, 23.1425f, 2.2033f, 23.4733f, 2.7572f, 23.6933f)
                    curveTo(3.3111f, 23.9132f, 3.9042f, 24.0176f, 4.4999f, 24.0f)
                    curveTo(4.8933f, 23.9997f, 5.2707f, 23.8439f, 5.5496f, 23.5664f)
                    curveTo(5.8286f, 23.289f, 5.9865f, 22.9124f, 5.9889f, 22.519f)
                    curveTo(5.9919f, 22.1235f, 5.8394f, 21.7426f, 5.5642f, 21.4585f)
                    curveTo(5.2891f, 21.1743f, 4.9133f, 21.0097f, 4.5179f, 21.0f)
                    curveTo(4.3148f, 21.0217f, 4.1094f, 20.9979f, 3.9166f, 20.9304f)
                    curveTo(3.7238f, 20.863f, 3.5485f, 20.7535f, 3.4032f, 20.61f)
                    curveTo(3.2579f, 20.4664f, 3.1463f, 20.2923f, 3.0766f, 20.1004f)
                    curveTo(3.0068f, 19.9084f, 2.9806f, 19.7033f, 2.9999f, 19.5f)
                    curveTo(2.9783f, 18.9785f, 3.0773f, 18.459f, 3.2892f, 17.9821f)
                    curveTo(3.5012f, 17.5051f, 3.8203f, 17.0835f, 4.2219f, 16.75f)
                    curveTo(5.2945f, 16.9395f, 6.3827f, 17.0276f, 7.4719f, 17.013f)
                    curveTo(7.6399f, 17.013f, 7.7969f, 17.003f, 7.9639f, 17.0f)
                    curveTo(9.5601f, 17.6625f, 11.2717f, 18.0023f, 12.9999f, 18.0f)
                    curveTo(19.0649f, 18.0f, 23.9999f, 13.963f, 23.9999f, 9.0f)
                    curveTo(23.9999f, 4.037f, 19.0649f, 0.0f, 12.9999f, 0.0f)
                    close()
                    moveTo(12.9999f, 15.0f)
                    curveTo(12.0754f, 14.9975f, 11.1555f, 14.8707f, 10.2649f, 14.623f)
                    curveTo(9.6115f, 13.0255f, 8.7398f, 11.5262f, 7.6749f, 10.168f)
                    curveTo(6.9618f, 9.4583f, 6.0055f, 9.0464f, 4.9999f, 9.016f)
                    verticalLineTo(9.0f)
                    curveTo(4.9999f, 5.691f, 8.5889f, 3.0f, 12.9999f, 3.0f)
                    curveTo(17.4109f, 3.0f, 20.9999f, 5.691f, 20.9999f, 9.0f)
                    curveTo(20.9999f, 12.309f, 17.4109f, 15.0f, 12.9999f, 15.0f)
                    close()
                }
            }
        }
        .build()
        return _lasso!!
    }

private var _lasso: ImageVector? = null
