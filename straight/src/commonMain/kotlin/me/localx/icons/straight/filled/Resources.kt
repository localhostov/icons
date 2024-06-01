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

public val Icons.Filled.Resources: ImageVector
    get() {
        if (_resources != null) {
            return _resources!!
        }
        _resources = Builder(name = "Resources", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 23.0006f)
                    curveTo(15.3137f, 23.0006f, 18.0f, 20.3143f, 18.0f, 17.0006f)
                    curveTo(18.0f, 13.6869f, 15.3137f, 11.0006f, 12.0f, 11.0006f)
                    curveTo(8.6863f, 11.0006f, 6.0f, 13.6869f, 6.0f, 17.0006f)
                    curveTo(6.0f, 20.3143f, 8.6863f, 23.0006f, 12.0f, 23.0006f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.383f, 9.024f)
                    lineTo(7.706f, 2.653f)
                    curveTo(7.6182f, 2.501f, 7.492f, 2.3747f, 7.34f, 2.287f)
                    curveTo(7.188f, 2.1992f, 7.0155f, 2.153f, 6.84f, 2.153f)
                    curveTo(6.6645f, 2.153f, 6.492f, 2.1992f, 6.34f, 2.287f)
                    curveTo(6.188f, 2.3747f, 6.0618f, 2.501f, 5.974f, 2.653f)
                    lineTo(0.0f, 13.0f)
                    horizontalLineTo(5.074f)
                    curveTo(5.7242f, 11.8752f, 6.6383f, 10.9255f, 7.7374f, 10.2328f)
                    curveTo(8.8366f, 9.5401f, 10.0877f, 9.1252f, 11.383f, 9.024f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.0004f, 3.9994f)
                    verticalLineTo(9.0614f)
                    curveTo(14.5893f, 9.2644f, 16.0811f, 9.9385f, 17.2836f, 10.9968f)
                    curveTo(18.486f, 12.055f, 19.3441f, 13.4491f, 19.7474f, 14.9994f)
                    horizontalLineTo(24.0004f)
                    verticalLineTo(3.9994f)
                    horizontalLineTo(13.0004f)
                    close()
                }
            }
        }
        .build()
        return _resources!!
    }

private var _resources: ImageVector? = null
