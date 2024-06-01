package me.localx.icons.straight.filled

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
import me.localx.icons.straight.Icons

public val Icons.Filled.Flame: ImageVector
    get() {
        if (_flame != null) {
            return _flame!!
        }
        _flame = Builder(name = "Flame", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.4768f, 18.6102f)
                    curveTo(15.4768f, 17.3272f, 14.6688f, 16.5812f, 13.1198f, 15.2662f)
                    curveTo(12.7698f, 14.9662f, 12.3918f, 14.6482f, 12.0018f, 14.2942f)
                    curveTo(11.5568f, 14.7032f, 11.1338f, 15.0632f, 10.7458f, 15.3942f)
                    curveTo(9.1998f, 16.7002f, 8.5228f, 17.3392f, 8.5228f, 18.6102f)
                    curveTo(8.5228f, 19.5323f, 8.8891f, 20.4167f, 9.5412f, 21.0688f)
                    curveTo(10.1932f, 21.7209f, 11.0776f, 22.0872f, 11.9998f, 22.0872f)
                    curveTo(12.9219f, 22.0872f, 13.8063f, 21.7209f, 14.4584f, 21.0688f)
                    curveTo(15.1104f, 20.4167f, 15.4768f, 19.5323f, 15.4768f, 18.6102f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.4081f, 4.035f)
                    curveTo(15.2081f, 3.016f, 13.9681f, 1.963f, 12.7141f, 0.71f)
                    lineTo(12.0001f, 0.0f)
                    lineTo(11.3001f, 0.711f)
                    curveTo(9.0461f, 2.973f, 7.9801f, 6.447f, 7.5181f, 8.531f)
                    curveTo(7.1636f, 7.9821f, 6.9005f, 7.3792f, 6.7391f, 6.746f)
                    lineTo(6.3121f, 5.109f)
                    lineTo(5.0791f, 6.266f)
                    curveTo(2.9201f, 8.294f, 1.4791f, 10.305f, 1.4791f, 13.525f)
                    curveTo(1.4584f, 15.8485f, 2.2147f, 18.1123f, 3.6279f, 19.9568f)
                    curveTo(5.0411f, 21.8012f, 7.0302f, 23.1205f, 9.2791f, 23.705f)
                    curveTo(9.8442f, 23.8482f, 10.4196f, 23.9468f, 11.0001f, 24.0f)
                    curveTo(9.7414f, 23.7654f, 8.6042f, 23.0983f, 7.7852f, 22.1141f)
                    curveTo(6.9663f, 21.1299f, 6.517f, 19.8904f, 6.5151f, 18.61f)
                    curveTo(6.5151f, 16.36f, 7.8721f, 15.21f, 9.4431f, 13.868f)
                    curveTo(10.0041f, 13.391f, 10.6431f, 12.85f, 11.2881f, 12.201f)
                    lineTo(12.0001f, 11.493f)
                    lineTo(12.7081f, 12.201f)
                    curveTo(13.2841f, 12.777f, 13.8601f, 13.265f, 14.4171f, 13.739f)
                    curveTo(15.9931f, 15.076f, 17.4811f, 16.339f, 17.4811f, 18.61f)
                    curveTo(17.4795f, 19.8853f, 17.0339f, 21.1203f, 16.2207f, 22.1028f)
                    curveTo(15.4076f, 23.0853f, 14.2777f, 23.754f, 13.0251f, 23.994f)
                    curveTo(15.6257f, 23.7417f, 18.039f, 22.5298f, 19.7945f, 20.5946f)
                    curveTo(21.5499f, 18.6594f, 22.5216f, 16.1398f, 22.5201f, 13.527f)
                    curveTo(22.5201f, 9.225f, 19.6871f, 6.82f, 16.4081f, 4.035f)
                    close()
                }
            }
        }
        .build()
        return _flame!!
    }

private var _flame: ImageVector? = null
