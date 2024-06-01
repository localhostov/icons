package me.localx.icons.rounded.bold

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

public val Icons.Bold.Label: ImageVector
    get() {
        if (_label != null) {
            return _label!!
        }
        _label = Builder(name = "Label", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.2139f, 4.3921f)
                    lineTo(12.7339f, 0.1921f)
                    curveTo(12.5097f, 0.0663f, 12.257f, 2.0E-4f, 11.9999f, 2.0E-4f)
                    curveTo(11.7428f, 2.0E-4f, 11.4901f, 0.0663f, 11.2659f, 0.1921f)
                    lineTo(3.7859f, 4.3921f)
                    curveTo(3.2445f, 4.6968f, 2.7939f, 5.1398f, 2.4801f, 5.6759f)
                    curveTo(2.1662f, 6.212f, 2.0005f, 6.8219f, 1.9999f, 7.4431f)
                    verticalLineTo(17.5001f)
                    curveTo(2.002f, 19.2234f, 2.6875f, 20.8754f, 3.906f, 22.094f)
                    curveTo(5.1246f, 23.3125f, 6.7766f, 23.998f, 8.4999f, 24.0001f)
                    horizontalLineTo(15.4999f)
                    curveTo(17.2232f, 23.998f, 18.8752f, 23.3125f, 20.0938f, 22.094f)
                    curveTo(21.3123f, 20.8754f, 21.9978f, 19.2234f, 21.9999f, 17.5001f)
                    verticalLineTo(7.4431f)
                    curveTo(21.9992f, 6.8219f, 21.8334f, 6.2121f, 21.5196f, 5.676f)
                    curveTo(21.2058f, 5.1399f, 20.7552f, 4.6968f, 20.2139f, 4.3921f)
                    close()
                    moveTo(18.9999f, 17.5001f)
                    curveTo(18.9999f, 18.4284f, 18.6312f, 19.3186f, 17.9748f, 19.975f)
                    curveTo(17.3184f, 20.6314f, 16.4282f, 21.0001f, 15.4999f, 21.0001f)
                    horizontalLineTo(8.4999f)
                    curveTo(7.5717f, 21.0001f, 6.6814f, 20.6314f, 6.025f, 19.975f)
                    curveTo(5.3687f, 19.3186f, 4.9999f, 18.4284f, 4.9999f, 17.5001f)
                    verticalLineTo(7.4431f)
                    curveTo(4.9999f, 7.3543f, 5.0235f, 7.2672f, 5.0683f, 7.1905f)
                    curveTo(5.1131f, 7.1139f, 5.1775f, 7.0506f, 5.2549f, 7.0071f)
                    lineTo(11.9999f, 3.2211f)
                    lineTo(18.7439f, 7.0071f)
                    curveTo(18.8215f, 7.0505f, 18.8861f, 7.1137f, 18.9311f, 7.1904f)
                    curveTo(18.9761f, 7.267f, 18.9998f, 7.3542f, 18.9999f, 7.4431f)
                    verticalLineTo(17.5001f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0001f, 11.0002f)
                    curveTo(13.1046f, 11.0002f, 14.0001f, 10.1048f, 14.0001f, 9.0002f)
                    curveTo(14.0001f, 7.8957f, 13.1046f, 7.0002f, 12.0001f, 7.0002f)
                    curveTo(10.8955f, 7.0002f, 10.0001f, 7.8957f, 10.0001f, 9.0002f)
                    curveTo(10.0001f, 10.1048f, 10.8955f, 11.0002f, 12.0001f, 11.0002f)
                    close()
                }
            }
        }
        .build()
        return _label!!
    }

private var _label: ImageVector? = null
