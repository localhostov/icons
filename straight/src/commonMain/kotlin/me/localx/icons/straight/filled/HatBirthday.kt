package me.localx.icons.straight.filled

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

public val Icons.Filled.HatBirthday: ImageVector
    get() {
        if (_hatBirthday != null) {
            return _hatBirthday!!
        }
        _hatBirthday = Builder(name = "HatBirthday", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.0311f, 11.9999f)
                    lineTo(10.2071f, 23.9999f)
                    horizontalLineTo(6.1771f)
                    lineTo(14.9431f, 8.2389f)
                    lineTo(17.0311f, 11.9999f)
                    close()
                    moveTo(18.1681f, 14.0459f)
                    lineTo(12.5081f, 23.9999f)
                    horizontalLineTo(16.7001f)
                    lineTo(20.2481f, 17.7909f)
                    lineTo(18.1681f, 14.0459f)
                    close()
                    moveTo(21.3851f, 19.8369f)
                    lineTo(19.0061f, 23.9999f)
                    horizontalLineTo(23.7001f)
                    lineTo(21.3851f, 19.8369f)
                    close()
                    moveTo(12.5421f, 3.9159f)
                    curveTo(13.007f, 3.785f, 13.4089f, 3.4902f, 13.6735f, 3.0861f)
                    curveTo(13.938f, 2.6819f, 14.0474f, 2.1957f, 13.9813f, 1.7171f)
                    curveTo(13.9152f, 1.2386f, 13.6782f, 0.8002f, 13.314f, 0.4829f)
                    curveTo(12.9498f, 0.1655f, 12.4831f, -0.0093f, 12.0001f, -0.0093f)
                    curveTo(11.517f, -0.0093f, 11.0503f, 0.1655f, 10.6861f, 0.4829f)
                    curveTo(10.322f, 0.8002f, 10.085f, 1.2386f, 10.0189f, 1.7171f)
                    curveTo(9.9528f, 2.1957f, 10.0621f, 2.6819f, 10.3267f, 3.0861f)
                    curveTo(10.5912f, 3.4902f, 10.9931f, 3.785f, 11.4581f, 3.9159f)
                    lineTo(0.3001f, 23.9999f)
                    horizontalLineTo(3.8891f)
                    lineTo(13.8001f, 6.1799f)
                    lineTo(12.5421f, 3.9159f)
                    close()
                }
            }
        }
        .build()
        return _hatBirthday!!
    }

private var _hatBirthday: ImageVector? = null
