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

public val Icons.Filled.Spa: ImageVector
    get() {
        if (_spa != null) {
            return _spa!!
        }
        _spa = Builder(name = "Spa", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 19.5f)
                    curveTo(24.0f, 21.985f, 18.627f, 24.0f, 12.0f, 24.0f)
                    curveTo(5.373f, 24.0f, 0.0f, 21.985f, 0.0f, 19.5f)
                    curveTo(0.0f, 17.015f, 5.373f, 15.0f, 12.0f, 15.0f)
                    curveTo(18.627f, 15.0f, 24.0f, 17.015f, 24.0f, 19.5f)
                    close()
                    moveTo(12.5f, 7.0f)
                    curveTo(7.253f, 7.0f, 3.0f, 8.567f, 3.0f, 10.5f)
                    curveTo(3.0f, 12.433f, 7.253f, 14.0f, 12.5f, 14.0f)
                    curveTo(17.747f, 14.0f, 22.0f, 12.433f, 22.0f, 10.5f)
                    curveTo(22.0f, 8.567f, 17.747f, 7.0f, 12.5f, 7.0f)
                    close()
                    moveTo(10.5f, 0.0f)
                    curveTo(7.462f, 0.0f, 5.0f, 1.343f, 5.0f, 3.0f)
                    curveTo(5.0f, 4.657f, 7.462f, 6.0f, 10.5f, 6.0f)
                    curveTo(13.538f, 6.0f, 16.0f, 4.657f, 16.0f, 3.0f)
                    curveTo(16.0f, 1.343f, 13.538f, 0.0f, 10.5f, 0.0f)
                    close()
                }
            }
        }
        .build()
        return _spa!!
    }

private var _spa: ImageVector? = null
