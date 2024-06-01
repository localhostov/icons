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

public val Icons.Filled.Bell: ImageVector
    get() {
        if (_bell != null) {
            return _bell!!
        }
        _bell = Builder(name = "Bell", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(4.068f, 18.0f)
                    horizontalLineTo(19.724f)
                    curveTo(20.2059f, 18.0f, 20.6806f, 17.884f, 21.1081f, 17.6617f)
                    curveTo(21.5356f, 17.4394f, 21.9033f, 17.1174f, 22.18f, 16.723f)
                    curveTo(22.4567f, 16.3285f, 22.6344f, 15.8732f, 22.6979f, 15.3956f)
                    curveTo(22.7615f, 14.918f, 22.709f, 14.4321f, 22.545f, 13.979f)
                    lineTo(19.693f, 6.094f)
                    curveTo(19.206f, 4.3417f, 18.1583f, 2.7972f, 16.7104f, 1.6967f)
                    curveTo(15.2624f, 0.5961f, 13.4938f, 2.0E-4f, 11.675f, 0.0f)
                    verticalLineTo(0.0f)
                    curveTo(9.7818f, -0.0f, 7.9451f, 0.6456f, 6.4683f, 1.8303f)
                    curveTo(4.9914f, 3.0149f, 3.9627f, 4.6678f, 3.5521f, 6.516f)
                    lineTo(1.202f, 14.116f)
                    curveTo(1.0637f, 14.5647f, 1.0326f, 15.0396f, 1.1112f, 15.5025f)
                    curveTo(1.1899f, 15.9654f, 1.3761f, 16.4034f, 1.6549f, 16.7812f)
                    curveTo(1.9337f, 17.1591f, 2.2973f, 17.4662f, 2.7164f, 17.6779f)
                    curveTo(3.1355f, 17.8895f, 3.5985f, 17.9999f, 4.068f, 18.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(7.0999f, 20.0f)
                    curveTo(7.3294f, 21.1303f, 7.9426f, 22.1465f, 8.8356f, 22.8764f)
                    curveTo(9.7286f, 23.6063f, 10.8465f, 24.005f, 11.9999f, 24.005f)
                    curveTo(13.1532f, 24.005f, 14.2711f, 23.6063f, 15.1641f, 22.8764f)
                    curveTo(16.0571f, 22.1465f, 16.6703f, 21.1303f, 16.8999f, 20.0f)
                    horizontalLineTo(7.0999f)
                    close()
                }
            }
        }
        .build()
        return _bell!!
    }

private var _bell: ImageVector? = null
