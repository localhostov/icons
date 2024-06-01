package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.ChartPie: ImageVector
    get() {
        if (_chartPie != null) {
            return _chartPie!!
        }
        _chartPie = Builder(name = "ChartPie", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.3002f, 10.1779f)
                    curveTo(12.4039f, 10.4105f, 12.5253f, 10.6348f, 12.6632f, 10.8489f)
                    lineTo(23.5252f, 8.6879f)
                    curveTo(23.0825f, 7.1321f, 22.3288f, 5.6823f, 21.3098f, 4.4261f)
                    curveTo(20.2908f, 3.1699f, 19.0275f, 2.1334f, 17.5965f, 1.3793f)
                    curveTo(16.1655f, 0.6253f, 14.5964f, 0.1693f, 12.9841f, 0.0389f)
                    curveTo(11.3718f, -0.0915f, 9.7498f, 0.1065f, 8.2163f, 0.6209f)
                    lineTo(12.3002f, 10.1779f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.631f, 13.742f)
                    curveTo(11.6838f, 13.0173f, 10.9372f, 12.0628f, 10.462f, 10.969f)
                    lineTo(6.377f, 1.406f)
                    curveTo(4.8275f, 2.2245f, 3.4763f, 3.3726f, 2.4184f, 4.7696f)
                    curveTo(1.3606f, 6.1666f, 0.6217f, 7.7785f, 0.2539f, 9.4918f)
                    curveTo(-0.1139f, 11.2051f, -0.1017f, 12.9782f, 0.2896f, 14.6863f)
                    curveTo(0.6809f, 16.3944f, 1.4419f, 17.996f, 2.5189f, 19.3783f)
                    curveTo(3.5959f, 20.7606f, 4.9627f, 21.8901f, 6.5233f, 22.6872f)
                    curveTo(8.0838f, 23.4843f, 9.8001f, 23.9297f, 11.5514f, 23.992f)
                    curveTo(13.3026f, 24.0543f, 15.0462f, 23.7321f, 16.6595f, 23.0479f)
                    curveTo(18.2727f, 22.3637f, 19.7165f, 21.3343f, 20.889f, 20.032f)
                    lineTo(12.631f, 13.742f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.3652f, 12.5489f)
                    lineTo(22.1062f, 18.4489f)
                    curveTo(23.3433f, 16.5255f, 24.0008f, 14.2868f, 24.0002f, 11.9999f)
                    curveTo(23.9985f, 11.5484f, 23.9715f, 11.0974f, 23.9192f, 10.6489f)
                    lineTo(14.3652f, 12.5489f)
                    close()
                }
            }
        }
        .build()
        return _chartPie!!
    }

private var _chartPie: ImageVector? = null
