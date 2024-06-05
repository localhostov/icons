package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Candy: ImageVector
    get() {
        if (_candy != null) {
            return _candy!!
        }
        _candy = Builder(name = "Candy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.788f, 3.725f)
                arcTo(8.157f, 8.157f, 0.0f, false, false, 20.294f, 0.212f)
                arcToRelative(2.327f, 2.327f, 0.0f, false, false, -3.276f, 2.134f)
                verticalLineTo(3.912f)
                curveTo(9.5f, -0.084f, -0.081f, 9.51f, 3.912f, 17.018f)
                horizontalLineTo(2.346f)
                arcTo(2.327f, 2.327f, 0.0f, false, false, 0.212f, 20.294f)
                arcToRelative(8.157f, 8.157f, 0.0f, false, false, 3.513f, 3.494f)
                arcTo(2.326f, 2.326f, 0.0f, false, false, 7.0f, 21.654f)
                verticalLineTo(20.081f)
                curveTo(14.593f, 24.155f, 24.07f, 14.276f, 20.1f, 7.0f)
                horizontalLineToRelative(1.556f)
                arcTo(2.326f, 2.326f, 0.0f, false, false, 23.788f, 3.725f)
                close()
                moveTo(14.645f, 15.489f)
                curveTo(12.8f, 17.012f, 10.3f, 17.611f, 8.4f, 16.257f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.6f, 14.663f)
                curveToRelative(0.863f, 0.65f, 2.507f, 0.345f, 3.751f, -0.7f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.645f, 15.489f)
                close()
            }
        }
        .build()
        return _candy!!
    }

private var _candy: ImageVector? = null
