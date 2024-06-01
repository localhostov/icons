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

public val Icons.Filled.Leaf: ImageVector
    get() {
        if (_leaf != null) {
            return _leaf!!
        }
        _leaf = Builder(name = "Leaf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0421f, -0.0476f)
                    lineTo(24.0001f, 1.0404f)
                    curveTo(23.9791f, 1.5914f, 23.4171f, 14.6084f, 18.9291f, 19.0964f)
                    curveTo(17.1904f, 20.831f, 14.8704f, 21.8597f, 12.4175f, 21.9836f)
                    curveTo(9.9646f, 22.1075f, 7.5528f, 21.318f, 5.6481f, 19.7674f)
                    lineTo(16.7081f, 8.7074f)
                    lineTo(15.2931f, 7.2934f)
                    lineTo(4.2331f, 18.3534f)
                    curveTo(2.6824f, 16.449f, 1.8924f, 14.0376f, 2.0156f, 11.5848f)
                    curveTo(2.1388f, 9.132f, 3.1664f, 6.8119f, 4.9001f, 5.0724f)
                    curveTo(9.3001f, 0.6724f, 22.4001f, 0.0264f, 22.9551f, 4.0E-4f)
                    lineTo(24.0421f, -0.0476f)
                    close()
                    moveTo(4.2331f, 18.3534f)
                    lineTo(0.0431f, 22.5434f)
                    lineTo(1.4571f, 23.9574f)
                    lineTo(5.6471f, 19.7674f)
                    curveTo(5.1294f, 19.3448f, 4.6557f, 18.871f, 4.2331f, 18.3534f)
                    close()
                }
            }
        }
        .build()
        return _leaf!!
    }

private var _leaf: ImageVector? = null
