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

public val Icons.Filled.PlusSmall: ImageVector
    get() {
        if (_plusSmall != null) {
            return _plusSmall!!
        }
        _plusSmall = Builder(name = "PlusSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                curveTo(13.0f, 6.7348f, 12.8946f, 6.4804f, 12.7071f, 6.2929f)
                curveTo(12.5196f, 6.1054f, 12.2652f, 6.0f, 12.0f, 6.0f)
                curveTo(11.7348f, 6.0f, 11.4804f, 6.1054f, 11.2929f, 6.2929f)
                curveTo(11.1054f, 6.4804f, 11.0f, 6.7348f, 11.0f, 7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                curveTo(6.7348f, 11.0f, 6.4804f, 11.1054f, 6.2929f, 11.2929f)
                curveTo(6.1054f, 11.4804f, 6.0f, 11.7348f, 6.0f, 12.0f)
                curveTo(6.0f, 12.2652f, 6.1054f, 12.5196f, 6.2929f, 12.7071f)
                curveTo(6.4804f, 12.8946f, 6.7348f, 13.0f, 7.0f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                curveTo(11.0f, 17.2652f, 11.1054f, 17.5196f, 11.2929f, 17.7071f)
                curveTo(11.4804f, 17.8946f, 11.7348f, 18.0f, 12.0f, 18.0f)
                curveTo(12.2652f, 18.0f, 12.5196f, 17.8946f, 12.7071f, 17.7071f)
                curveTo(12.8946f, 17.5196f, 13.0f, 17.2652f, 13.0f, 17.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.0f)
                curveTo(17.2652f, 13.0f, 17.5196f, 12.8946f, 17.7071f, 12.7071f)
                curveTo(17.8946f, 12.5196f, 18.0f, 12.2652f, 18.0f, 12.0f)
                curveTo(18.0f, 11.7348f, 17.8946f, 11.4804f, 17.7071f, 11.2929f)
                curveTo(17.5196f, 11.1054f, 17.2652f, 11.0f, 17.0f, 11.0f)
                close()
            }
        }
        .build()
        return _plusSmall!!
    }

private var _plusSmall: ImageVector? = null
