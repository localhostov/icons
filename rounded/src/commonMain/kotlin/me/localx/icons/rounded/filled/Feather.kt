package me.localx.icons.rounded.filled

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

public val Icons.Filled.Feather: ImageVector
    get() {
        if (_feather != null) {
            return _feather!!
        }
        _feather = Builder(name = "Feather", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(5.82f, 19.3062f)
                    curveTo(5.874f, 19.3502f, 5.9359f, 19.3802f, 5.991f, 19.4232f)
                    lineTo(1.7069f, 23.7072f)
                    curveTo(1.5184f, 23.8894f, 1.2658f, 23.9902f, 1.0036f, 23.9879f)
                    curveTo(0.7414f, 23.9856f, 0.4905f, 23.8804f, 0.3051f, 23.695f)
                    curveTo(0.1197f, 23.5096f, 0.0146f, 23.2588f, 0.0123f, 22.9966f)
                    curveTo(0.01f, 22.7344f, 0.1108f, 22.4818f, 0.2929f, 22.2932f)
                    lineTo(4.578f, 18.0082f)
                    curveTo(4.9408f, 18.487f, 5.3576f, 18.9226f, 5.82f, 19.3062f)
                    close()
                    moveTo(10.0f, 12.5862f)
                    lineTo(16.2929f, 6.2932f)
                    curveTo(16.3852f, 6.1977f, 16.4955f, 6.1215f, 16.6175f, 6.0691f)
                    curveTo(16.7395f, 6.0167f, 16.8708f, 5.9891f, 17.0035f, 5.988f)
                    curveTo(17.1363f, 5.9868f, 17.268f, 6.0121f, 17.3909f, 6.0624f)
                    curveTo(17.5138f, 6.1127f, 17.6255f, 6.1869f, 17.7193f, 6.2808f)
                    curveTo(17.8132f, 6.3747f, 17.8875f, 6.4864f, 17.9378f, 6.6093f)
                    curveTo(17.9881f, 6.7322f, 18.0134f, 6.8638f, 18.0122f, 6.9966f)
                    curveTo(18.011f, 7.1294f, 17.9835f, 7.2606f, 17.9311f, 7.3826f)
                    curveTo(17.8786f, 7.5046f, 17.8025f, 7.615f, 17.707f, 7.7072f)
                    lineTo(14.414f, 11.0002f)
                    horizontalLineTo(21.6f)
                    curveTo(22.5722f, 9.0614f, 23.3365f, 7.025f, 23.8799f, 4.9252f)
                    curveTo(24.0397f, 4.2589f, 24.0252f, 3.5627f, 23.838f, 2.9036f)
                    curveTo(23.6507f, 2.2445f, 23.297f, 1.6447f, 22.8108f, 1.1619f)
                    curveTo(22.3245f, 0.6791f, 21.7222f, 0.3295f, 21.0618f, 0.1469f)
                    curveTo(20.4014f, -0.0357f, 19.7051f, -0.0452f, 19.04f, 0.1192f)
                    curveTo(15.8374f, 0.97f, 12.7874f, 2.3156f, 10.0f, 4.1072f)
                    verticalLineTo(12.5862f)
                    close()
                    moveTo(12.5f, 13.0002f)
                    curveTo(12.475f, 13.0002f, 12.453f, 12.9872f, 12.428f, 12.9862f)
                    lineTo(5.991f, 19.4232f)
                    curveTo(7.304f, 20.4485f, 8.923f, 21.0037f, 10.589f, 21.0002f)
                    curveTo(11.6932f, 20.996f, 12.7852f, 20.7683f, 13.7992f, 20.331f)
                    curveTo(14.8131f, 19.8936f, 15.7281f, 19.2555f, 16.489f, 18.4552f)
                    curveTo(18.048f, 16.8032f, 19.4054f, 14.9721f, 20.533f, 13.0002f)
                    horizontalLineTo(12.5f)
                    close()
                    moveTo(7.9999f, 14.5002f)
                    verticalLineTo(5.5072f)
                    curveTo(7.0324f, 6.231f, 6.1156f, 7.0201f, 5.2559f, 7.8692f)
                    curveTo(4.4976f, 8.6322f, 3.9061f, 9.5446f, 3.5193f, 10.5484f)
                    curveTo(3.1325f, 11.5523f, 2.9587f, 12.6256f, 3.0089f, 13.7002f)
                    curveTo(3.0806f, 15.2601f, 3.6281f, 16.7607f, 4.578f, 18.0002f)
                    lineTo(8.014f, 14.5632f)
                    curveTo(8.0129f, 14.5472f, 7.9999f, 14.5252f, 7.9999f, 14.5002f)
                    close()
                }
            }
        }
        .build()
        return _feather!!
    }

private var _feather: ImageVector? = null
