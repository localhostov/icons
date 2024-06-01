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

public val Icons.Filled.Cube: ImageVector
    get() {
        if (_cube != null) {
            return _cube!!
        }
        _cube = Builder(name = "Cube", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.7618f, 11.5869f)
                    curveTo(14.2152f, 11.8981f, 13.6192f, 12.1132f, 12.9998f, 12.2229f)
                    verticalLineTo(23.8739f)
                    curveTo(13.5269f, 23.7713f, 14.0336f, 23.5832f, 14.4998f, 23.3169f)
                    lineTo(20.5268f, 19.8379f)
                    curveTo(21.286f, 19.3978f, 21.9164f, 18.7662f, 22.355f, 18.0062f)
                    curveTo(22.7937f, 17.2462f, 23.0254f, 16.3844f, 23.0268f, 15.5069f)
                    verticalLineTo(8.5469f)
                    curveTo(23.0236f, 8.0127f, 22.9342f, 7.4826f, 22.7618f, 6.9769f)
                    lineTo(14.7618f, 11.5869f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(10.242f, 9.8569f)
                    curveTo(10.7775f, 10.165f, 11.3846f, 10.3271f, 12.0024f, 10.3271f)
                    curveTo(12.6203f, 10.3271f, 13.2274f, 10.165f, 13.7629f, 9.8569f)
                    lineTo(21.763f, 5.2469f)
                    curveTo(21.4086f, 4.8398f, 20.9905f, 4.4929f, 20.525f, 4.2199f)
                    lineTo(14.5f, 0.7369f)
                    curveTo(13.7394f, 0.2995f, 12.8773f, 0.0693f, 12.0f, 0.0693f)
                    curveTo(11.1226f, 0.0693f, 10.2605f, 0.2995f, 9.5f, 0.7369f)
                    lineTo(3.4729f, 4.2169f)
                    curveTo(3.024f, 4.4798f, 2.6191f, 4.8115f, 2.2729f, 5.1999f)
                    lineTo(10.242f, 9.8569f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.0f, 12.2232f)
                    curveTo(10.3802f, 12.1138f, 9.7839f, 11.8986f, 9.237f, 11.5872f)
                    lineTo(1.257f, 6.9232f)
                    curveTo(1.0723f, 7.4449f, 0.9763f, 7.9938f, 0.973f, 8.5472f)
                    verticalLineTo(15.5072f)
                    curveTo(0.9745f, 16.3847f, 1.2061f, 17.2465f, 1.6448f, 18.0065f)
                    curveTo(2.0835f, 18.7665f, 2.7139f, 19.3981f, 3.473f, 19.8382f)
                    lineTo(9.5f, 23.3172f)
                    curveTo(9.9663f, 23.5835f, 10.473f, 23.7716f, 11.0f, 23.8742f)
                    verticalLineTo(12.2232f)
                    close()
                }
            }
        }
        .build()
        return _cube!!
    }

private var _cube: ImageVector? = null
