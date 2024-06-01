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

public val Icons.Bold.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.0382f, 8.8841f)
                    curveTo(20.6097f, 5.1373f, 16.4637f, 2.8585f, 11.999f, 2.8166f)
                    curveTo(7.5342f, 2.8585f, 3.3882f, 5.1373f, 0.9598f, 8.8841f)
                    curveTo(-0.3199f, 10.7622f, -0.3199f, 13.2322f, 0.9598f, 15.1103f)
                    curveTo(3.3869f, 18.8594f, 7.5331f, 21.1405f, 11.999f, 21.1838f)
                    curveTo(16.4637f, 21.1419f, 20.6097f, 18.8631f, 23.0382f, 15.1164f)
                    curveTo(24.3206f, 13.2368f, 24.3206f, 10.7636f, 23.0382f, 8.8841f)
                    close()
                    moveTo(20.5533f, 13.4075f)
                    curveTo(18.6992f, 16.3483f, 15.4753f, 18.1424f, 11.999f, 18.1682f)
                    curveTo(8.5227f, 18.1425f, 5.2987f, 16.3483f, 3.4446f, 13.4075f)
                    curveTo(2.8666f, 12.5583f, 2.8666f, 11.4421f, 3.4446f, 10.5929f)
                    curveTo(5.2987f, 7.6522f, 8.5226f, 5.858f, 11.999f, 5.8323f)
                    curveTo(15.4753f, 5.858f, 18.6992f, 7.6522f, 20.5533f, 10.5929f)
                    curveTo(21.1313f, 11.4421f, 21.1313f, 12.5583f, 20.5533f, 13.4075f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.9989f, 16.0209f)
                    curveTo(14.2195f, 16.0209f, 16.0197f, 14.2207f, 16.0197f, 12.0001f)
                    curveTo(16.0197f, 9.7794f, 14.2195f, 7.9792f, 11.9989f, 7.9792f)
                    curveTo(9.7782f, 7.9792f, 7.9781f, 9.7794f, 7.9781f, 12.0001f)
                    curveTo(7.9781f, 14.2207f, 9.7782f, 16.0209f, 11.9989f, 16.0209f)
                    close()
                }
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
