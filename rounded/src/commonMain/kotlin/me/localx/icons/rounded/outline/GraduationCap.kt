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

public val Icons.Outline.GraduationCap: ImageVector
    get() {
        if (_graduationCap != null) {
            return _graduationCap!!
        }
        _graduationCap = Builder(name = "GraduationCap", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0568f, 5.2298f)
                    lineTo(14.6828f, 1.7169f)
                    curveTo(13.0596f, 0.7473f, 11.0393f, 0.7301f, 9.3998f, 1.6718f)
                    lineTo(1.9428f, 5.2298f)
                    curveTo(1.9149f, 5.2439f, 1.8858f, 5.2589f, 1.8589f, 5.2748f)
                    curveTo(0.0892f, 6.2867f, -0.5251f, 8.5415f, 0.4867f, 10.3112f)
                    curveTo(0.8297f, 10.9111f, 1.3342f, 11.4026f, 1.9428f, 11.7299f)
                    lineTo(3.9999f, 12.7099f)
                    verticalLineTo(17.6099f)
                    curveTo(4.0011f, 19.8009f, 5.4268f, 21.7367f, 7.5189f, 22.3879f)
                    curveTo(8.9748f, 22.8091f, 10.4844f, 23.0153f, 11.9999f, 22.9999f)
                    curveTo(13.5152f, 23.0169f, 15.0248f, 22.8124f, 16.4809f, 22.3929f)
                    curveTo(18.573f, 21.7418f, 19.9987f, 19.806f, 19.9999f, 17.6149f)
                    verticalLineTo(12.7079f)
                    lineTo(21.9999f, 11.7519f)
                    verticalLineTo(19.9998f)
                    curveTo(21.9999f, 20.5521f, 22.4476f, 20.9998f, 22.9999f, 20.9998f)
                    curveTo(23.5522f, 20.9998f, 23.9999f, 20.5521f, 23.9999f, 19.9998f)
                    verticalLineTo(7.9998f)
                    curveTo(24.0065f, 6.8256f, 23.0793f, 5.7408f, 22.0568f, 5.2298f)
                    close()
                    moveTo(17.9998f, 17.6149f)
                    curveTo(18.0003f, 18.9255f, 17.15f, 20.0847f, 15.8998f, 20.4779f)
                    curveTo(14.6321f, 20.8401f, 13.3183f, 21.0159f, 11.9998f, 20.9999f)
                    curveTo(10.6814f, 21.0159f, 9.3676f, 20.8401f, 8.0998f, 20.4779f)
                    curveTo(6.8496f, 20.0847f, 5.9993f, 18.9255f, 5.9998f, 17.6149f)
                    verticalLineTo(13.6629f)
                    lineTo(9.3168f, 15.2429f)
                    curveTo(10.1353f, 15.7289f, 11.07f, 15.9843f, 12.0219f, 15.9819f)
                    curveTo(12.9279f, 15.9883f, 13.8186f, 15.7485f, 14.5989f, 15.2879f)
                    lineTo(17.9998f, 13.6629f)
                    verticalLineTo(17.6149f)
                    close()
                    moveTo(21.1998f, 9.9249f)
                    lineTo(13.6578f, 13.5249f)
                    curveTo(12.6063f, 14.1372f, 11.3028f, 14.1198f, 10.2678f, 13.4799f)
                    lineTo(2.8888f, 9.9698f)
                    curveTo(2.0663f, 9.5263f, 1.7591f, 8.5f, 2.2026f, 7.6775f)
                    curveTo(2.3526f, 7.3994f, 2.5775f, 7.1688f, 2.8519f, 7.0119f)
                    lineTo(10.3468f, 3.4319f)
                    curveTo(11.3988f, 2.8209f, 12.7015f, 2.8382f, 13.7368f, 3.4769f)
                    lineTo(21.1108f, 6.9899f)
                    curveTo(21.6531f, 7.291f, 21.9924f, 7.8596f, 21.9998f, 8.4799f)
                    curveTo(22.0008f, 9.0674f, 21.6983f, 9.6138f, 21.1998f, 9.9249f)
                    close()
                }
            }
        }
        .build()
        return _graduationCap!!
    }

private var _graduationCap: ImageVector? = null
