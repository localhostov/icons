package me.localx.icons.straight.bold

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

public val Icons.Bold.Info: ImageVector
    get() {
        if (_info != null) {
            return _info!!
        }
        _info = Builder(name = "Info", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 24.0f)
                    curveTo(9.6266f, 24.0f, 7.3066f, 23.2962f, 5.3332f, 21.9776f)
                    curveTo(3.3598f, 20.6591f, 1.8217f, 18.7849f, 0.9135f, 16.5922f)
                    curveTo(0.0052f, 14.3995f, -0.2324f, 11.9867f, 0.2306f, 9.6589f)
                    curveTo(0.6936f, 7.3312f, 1.8365f, 5.1929f, 3.5147f, 3.5147f)
                    curveTo(5.1929f, 1.8365f, 7.3312f, 0.6936f, 9.6589f, 0.2306f)
                    curveTo(11.9867f, -0.2324f, 14.3995f, 0.0052f, 16.5922f, 0.9135f)
                    curveTo(18.7849f, 1.8217f, 20.6591f, 3.3598f, 21.9776f, 5.3332f)
                    curveTo(23.2962f, 7.3066f, 24.0f, 9.6266f, 24.0f, 12.0f)
                    curveTo(23.9966f, 15.1815f, 22.7312f, 18.2318f, 20.4815f, 20.4815f)
                    curveTo(18.2318f, 22.7312f, 15.1815f, 23.9966f, 12.0f, 24.0f)
                    close()
                    moveTo(12.0f, 3.0f)
                    curveTo(10.22f, 3.0f, 8.4799f, 3.5278f, 6.9999f, 4.5168f)
                    curveTo(5.5198f, 5.5057f, 4.3663f, 6.9113f, 3.6851f, 8.5559f)
                    curveTo(3.0039f, 10.2004f, 2.8257f, 12.01f, 3.1729f, 13.7558f)
                    curveTo(3.5202f, 15.5016f, 4.3774f, 17.1053f, 5.636f, 18.364f)
                    curveTo(6.8947f, 19.6226f, 8.4984f, 20.4798f, 10.2442f, 20.8271f)
                    curveTo(11.99f, 21.1743f, 13.7996f, 20.9961f, 15.4442f, 20.3149f)
                    curveTo(17.0887f, 19.6337f, 18.4943f, 18.4802f, 19.4832f, 17.0001f)
                    curveTo(20.4722f, 15.5201f, 21.0f, 13.78f, 21.0f, 12.0f)
                    curveTo(20.9971f, 9.6139f, 20.0479f, 7.3265f, 18.3608f, 5.6393f)
                    curveTo(16.6736f, 3.9521f, 14.3861f, 3.0029f, 12.0f, 3.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.4552f, 18.6817f)
                    horizontalLineTo(11.4552f)
                    verticalLineTo(12.5447f)
                    horizontalLineTo(10.0912f)
                    verticalLineTo(9.5447f)
                    horizontalLineTo(12.0002f)
                    curveTo(12.6512f, 9.5452f, 13.2753f, 9.804f, 13.7356f, 10.2643f)
                    curveTo(14.1959f, 10.7246f, 14.4547f, 11.3487f, 14.4552f, 11.9997f)
                    verticalLineTo(18.6817f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.284f, 8.4664f)
                    curveTo(13.2317f, 8.4664f, 14.0f, 7.6981f, 14.0f, 6.7504f)
                    curveTo(14.0f, 5.8027f, 13.2317f, 5.0344f, 12.284f, 5.0344f)
                    curveTo(11.3363f, 5.0344f, 10.568f, 5.8027f, 10.568f, 6.7504f)
                    curveTo(10.568f, 7.6981f, 11.3363f, 8.4664f, 12.284f, 8.4664f)
                    close()
                }
            }
        }
        .build()
        return _info!!
    }

private var _info: ImageVector? = null
