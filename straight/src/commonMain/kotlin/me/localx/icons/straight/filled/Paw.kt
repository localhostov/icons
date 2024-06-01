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

public val Icons.Filled.Paw: ImageVector
    get() {
        if (_paw != null) {
            return _paw!!
        }
        _paw = Builder(name = "Paw", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.5001f, 23.9998f)
                    curveTo(16.6829f, 23.961f, 15.8752f, 23.8085f, 15.1001f, 23.5468f)
                    curveTo(13.0883f, 22.8608f, 10.9059f, 22.8608f, 8.8941f, 23.5468f)
                    curveTo(5.5941f, 24.7268f, 2.8701f, 23.5678f, 2.9941f, 20.3688f)
                    curveTo(3.0001f, 15.6408f, 7.4581f, 10.9998f, 12.0001f, 10.9998f)
                    curveTo(16.5421f, 10.9998f, 21.0001f, 15.6408f, 21.0001f, 20.3688f)
                    curveTo(21.0001f, 22.0248f, 20.3931f, 23.9998f, 17.5001f, 23.9998f)
                    close()
                    moveTo(21.8441f, 5.0138f)
                    curveTo(20.4801f, 4.8508f, 19.2441f, 6.1418f, 19.0301f, 8.4738f)
                    curveTo(18.5971f, 13.9818f, 23.3371f, 14.6988f, 23.9711f, 9.0628f)
                    curveTo(24.1841f, 6.7318f, 23.2081f, 5.1768f, 21.8441f, 5.0138f)
                    close()
                    moveTo(0.0291f, 9.0628f)
                    curveTo(0.6641f, 14.6998f, 5.4001f, 13.9778f, 4.9701f, 8.4738f)
                    curveTo(4.7561f, 6.1418f, 3.5201f, 4.8508f, 2.1561f, 5.0138f)
                    curveTo(0.7921f, 5.1768f, -0.1839f, 6.7318f, 0.0291f, 9.0628f)
                    close()
                    moveTo(5.9771f, 4.0628f)
                    curveTo(6.6121f, 9.7018f, 11.3511f, 8.9778f, 10.9171f, 3.4738f)
                    curveTo(10.7001f, 1.1418f, 9.4681f, -0.1492f, 8.1001f, 0.0138f)
                    curveTo(6.7321f, 0.1768f, 5.7631f, 1.7318f, 5.9771f, 4.0628f)
                    close()
                    moveTo(15.8441f, 0.0138f)
                    curveTo(14.4801f, -0.1492f, 13.2441f, 1.1418f, 13.0301f, 3.4738f)
                    curveTo(12.5971f, 8.9818f, 17.3371f, 9.6988f, 17.9711f, 4.0628f)
                    curveTo(18.1841f, 1.7318f, 17.2081f, 0.1768f, 15.8441f, 0.0138f)
                    close()
                }
            }
        }
        .build()
        return _paw!!
    }

private var _paw: ImageVector? = null
