package me.localx.icons.rounded.filled

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
import me.localx.icons.rounded.Icons

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
                    moveTo(12.0f, 24.0f)
                    curveTo(4.149f, 24.0f, 0.0f, 22.617f, 0.0f, 20.0f)
                    curveTo(0.0f, 17.383f, 4.149f, 16.0f, 12.0f, 16.0f)
                    curveTo(19.963f, 16.0f, 24.0f, 17.346f, 24.0f, 20.0f)
                    curveTo(24.0f, 22.654f, 19.963f, 24.0f, 12.0f, 24.0f)
                    close()
                    moveTo(12.5f, 15.0f)
                    curveTo(4.648f, 15.0f, 3.0f, 12.825f, 3.0f, 11.0f)
                    curveTo(3.0f, 9.175f, 4.648f, 7.0f, 12.5f, 7.0f)
                    curveTo(18.448f, 7.0f, 22.0f, 8.495f, 22.0f, 11.0f)
                    curveTo(22.0f, 13.505f, 18.448f, 15.0f, 12.5f, 15.0f)
                    close()
                    moveTo(10.0f, 6.0f)
                    curveTo(6.355f, 6.0f, 4.0f, 4.822f, 4.0f, 3.0f)
                    curveTo(4.0f, 1.178f, 6.355f, 0.0f, 10.0f, 0.0f)
                    curveTo(13.645f, 0.0f, 16.0f, 1.178f, 16.0f, 3.0f)
                    curveTo(16.0f, 4.822f, 13.645f, 6.0f, 10.0f, 6.0f)
                    close()
                }
            }
        }
        .build()
        return _spa!!
    }

private var _spa: ImageVector? = null
