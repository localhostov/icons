package me.localx.icons.straight.outline

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

public val Icons.Outline.CursorFinger: ImageVector
    get() {
        if (_cursorFinger != null) {
            return _cursorFinger!!
        }
        _cursorFinger = Builder(name = "CursorFinger", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0003f, 8.18f)
                    verticalLineTo(3.107f)
                    curveTo(12.0096f, 2.3838f, 11.7642f, 1.6804f, 11.3072f, 1.1199f)
                    curveTo(10.8501f, 0.5594f, 10.2106f, 0.1775f, 9.5003f, 0.041f)
                    curveTo(9.0701f, -0.0317f, 8.6291f, -0.0097f, 8.2083f, 0.1055f)
                    curveTo(7.7874f, 0.2207f, 7.3967f, 0.4263f, 7.0635f, 0.708f)
                    curveTo(6.7302f, 0.9898f, 6.4625f, 1.3408f, 6.2789f, 1.7366f)
                    curveTo(6.0953f, 2.1325f, 6.0002f, 2.5636f, 6.0003f, 3.0f)
                    verticalLineTo(10.581f)
                    lineTo(1.8793f, 14.636f)
                    curveTo(1.3169f, 15.1986f, 1.001f, 15.9615f, 1.001f, 16.757f)
                    curveTo(1.001f, 17.5525f, 1.3169f, 18.3154f, 1.8793f, 18.878f)
                    lineTo(7.0003f, 24.0f)
                    horizontalLineTo(22.0003f)
                    verticalLineTo(10.18f)
                    lineTo(12.0003f, 8.18f)
                    close()
                    moveTo(20.0003f, 22.0f)
                    horizontalLineTo(7.8283f)
                    lineTo(3.2933f, 17.464f)
                    curveTo(3.1069f, 17.2775f, 3.0017f, 17.0249f, 3.0005f, 16.7612f)
                    curveTo(2.9994f, 16.4975f, 3.1025f, 16.2441f, 3.2873f, 16.056f)
                    lineTo(6.0003f, 13.387f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(8.0003f)
                    verticalLineTo(3.0f)
                    curveTo(8.0001f, 2.8537f, 8.032f, 2.7092f, 8.0937f, 2.5766f)
                    curveTo(8.1554f, 2.444f, 8.2455f, 2.3265f, 8.3575f, 2.2325f)
                    curveTo(8.4696f, 2.1385f, 8.6009f, 2.0702f, 8.7422f, 2.0324f)
                    curveTo(8.8835f, 1.9947f, 9.0313f, 1.9884f, 9.1753f, 2.014f)
                    curveTo(9.4175f, 2.0736f, 9.6318f, 2.2148f, 9.7821f, 2.4139f)
                    curveTo(9.9323f, 2.613f, 10.0094f, 2.8577f, 10.0003f, 3.107f)
                    verticalLineTo(9.82f)
                    lineTo(20.0003f, 11.82f)
                    verticalLineTo(22.0f)
                    close()
                }
            }
        }
        .build()
        return _cursorFinger!!
    }

private var _cursorFinger: ImageVector? = null
