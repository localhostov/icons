package me.localx.icons.rounded.filled

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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Folder: ImageVector
    get() {
        if (_folder != null) {
            return _folder!!
        }
        _folder = Builder(name = "Folder", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 191.808f)
                verticalLineTo(384.0f)
                curveToRelative(0.071f, 58.881f, 47.786f, 106.596f, 106.667f, 106.667f)
                horizontalLineToRelative(298.667f)
                curveTo(464.214f, 490.596f, 511.93f, 442.881f, 512.0f, 384.0f)
                verticalLineTo(189.44f)
                lineTo(0.0f, 191.808f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(405.333f, 64.0f)
                horizontalLineTo(266.069f)
                curveToRelative(-3.299f, 0.022f, -6.56f, -0.708f, -9.536f, -2.133f)
                lineToRelative(-67.328f, -33.792f)
                curveToRelative(-8.888f, -4.426f, -18.679f, -6.733f, -28.608f, -6.741f)
                horizontalLineToRelative(-53.931f)
                curveTo(47.786f, 21.404f, 0.071f, 69.119f, 0.0f, 128.0f)
                verticalLineToRelative(21.141f)
                lineToRelative(509.077f, -2.368f)
                curveTo(497.961f, 98.408f, 454.959f, 64.099f, 405.333f, 64.0f)
                close()
            }
        }
        .build()
        return _folder!!
    }

private var _folder: ImageVector? = null
