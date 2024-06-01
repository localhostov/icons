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

public val Icons.Bold.Marker: ImageVector
    get() {
        if (_marker != null) {
            return _marker!!
        }
        _marker = Builder(name = "Marker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 0.0208f)
                    curveTo(9.3314f, 0.0239f, 6.773f, 1.0855f, 4.8861f, 2.9726f)
                    curveTo(2.9992f, 4.8597f, 1.9379f, 7.4181f, 1.935f, 10.0868f)
                    curveTo(1.935f, 15.3608f, 10.101f, 22.4158f, 11.035f, 23.2038f)
                    lineTo(12.002f, 24.0208f)
                    lineTo(12.969f, 23.2038f)
                    curveTo(13.901f, 22.4158f, 22.069f, 15.3608f, 22.069f, 10.0868f)
                    curveTo(22.0661f, 7.4175f, 21.0042f, 4.8584f, 19.1164f, 2.9712f)
                    curveTo(17.2287f, 1.084f, 14.6693f, 0.0229f, 12.0f, 0.0208f)
                    close()
                    moveTo(12.0f, 20.0638f)
                    curveTo(8.935f, 17.2718f, 4.933f, 12.7358f, 4.933f, 10.0868f)
                    curveTo(4.933f, 8.2125f, 5.6775f, 6.4149f, 7.0028f, 5.0896f)
                    curveTo(8.3282f, 3.7643f, 10.1257f, 3.0198f, 12.0f, 3.0198f)
                    curveTo(13.8743f, 3.0198f, 15.6718f, 3.7643f, 16.9971f, 5.0896f)
                    curveTo(18.3224f, 6.4149f, 19.067f, 8.2125f, 19.067f, 10.0868f)
                    curveTo(19.067f, 12.7308f, 15.064f, 17.2688f, 12.0f, 20.0638f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 12.9986f)
                    curveTo(13.6552f, 12.9986f, 14.997f, 11.6568f, 14.997f, 10.0016f)
                    curveTo(14.997f, 8.3464f, 13.6552f, 7.0046f, 12.0f, 7.0046f)
                    curveTo(10.3449f, 7.0046f, 9.003f, 8.3464f, 9.003f, 10.0016f)
                    curveTo(9.003f, 11.6568f, 10.3449f, 12.9986f, 12.0f, 12.9986f)
                    close()
                }
            }
        }
        .build()
        return _marker!!
    }

private var _marker: ImageVector? = null
