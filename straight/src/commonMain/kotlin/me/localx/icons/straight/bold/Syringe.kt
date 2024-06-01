package me.localx.icons.straight.bold

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

public val Icons.Bold.Syringe: ImageVector
    get() {
        if (_syringe != null) {
            return _syringe!!
        }
        _syringe = Builder(name = "Syringe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.8659f, 7.987f)
                    lineTo(24.0089f, 5.887f)
                    lineTo(18.2589f, 0.013f)
                    lineTo(16.1159f, 2.113f)
                    lineTo(18.0099f, 4.047f)
                    lineTo(16.3599f, 5.582f)
                    lineTo(15.7999f, 5.025f)
                    curveTo(15.1436f, 4.3689f, 14.2535f, 4.0002f, 13.3254f, 4.0002f)
                    curveTo(12.3974f, 4.0002f, 11.5073f, 4.3689f, 10.8509f, 5.025f)
                    lineTo(2.9999f, 12.879f)
                    verticalLineTo(18.879f)
                    lineTo(-0.0611f, 21.939f)
                    lineTo(2.0609f, 24.061f)
                    lineTo(5.1209f, 21.0f)
                    horizontalLineTo(11.1209f)
                    lineTo(18.9749f, 13.146f)
                    curveTo(19.6311f, 12.4897f, 19.9997f, 11.5996f, 19.9997f, 10.6715f)
                    curveTo(19.9997f, 9.7434f, 19.6311f, 8.8533f, 18.9749f, 8.197f)
                    lineTo(18.4829f, 7.705f)
                    lineTo(20.1089f, 6.192f)
                    lineTo(21.8659f, 7.987f)
                    close()
                    moveTo(16.8539f, 11.025f)
                    lineTo(9.8789f, 18.0f)
                    horizontalLineTo(5.9999f)
                    verticalLineTo(14.2f)
                    lineTo(8.3999f, 16.6f)
                    lineTo(10.5209f, 14.479f)
                    lineTo(8.0829f, 12.039f)
                    lineTo(9.7309f, 10.39f)
                    lineTo(12.1699f, 12.83f)
                    lineTo(14.2919f, 10.708f)
                    lineTo(11.8519f, 8.269f)
                    lineTo(12.9749f, 7.146f)
                    curveTo(13.0687f, 7.0523f, 13.1959f, 6.9996f, 13.3284f, 6.9996f)
                    curveTo(13.461f, 6.9996f, 13.5882f, 7.0523f, 13.6819f, 7.146f)
                    lineTo(16.8539f, 10.318f)
                    curveTo(16.9477f, 10.4118f, 17.0003f, 10.5389f, 17.0003f, 10.6715f)
                    curveTo(17.0003f, 10.8041f, 16.9477f, 10.9312f, 16.8539f, 11.025f)
                    close()
                }
            }
        }
        .build()
        return _syringe!!
    }

private var _syringe: ImageVector? = null
