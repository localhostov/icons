package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.ArrowFromBottom: ImageVector
    get() {
        if (_arrowFromBottom != null) {
            return _arrowFromBottom!!
        }
        _arrowFromBottom = Builder(name = "ArrowFromBottom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0001f, 21.9759f)
                verticalLineTo(2.7999f)
                lineTo(17.3001f, 7.0999f)
                lineTo(18.7141f, 5.6849f)
                lineTo(13.7681f, 0.7389f)
                curveTo(13.536f, 0.5067f, 13.2603f, 0.3225f, 12.957f, 0.1968f)
                curveTo(12.6536f, 0.0712f, 12.3285f, 0.0065f, 12.0001f, 0.0065f)
                curveTo(11.6718f, 0.0065f, 11.3466f, 0.0712f, 11.0433f, 0.1968f)
                curveTo(10.7399f, 0.3225f, 10.4643f, 0.5067f, 10.2321f, 0.7389f)
                lineTo(5.2821f, 5.6879f)
                lineTo(6.7001f, 7.0999f)
                lineTo(11.0001f, 2.7999f)
                verticalLineTo(21.9759f)
                horizontalLineTo(5.0001f)
                verticalLineTo(23.9759f)
                horizontalLineTo(19.0001f)
                verticalLineTo(21.9759f)
                horizontalLineTo(13.0001f)
                close()
            }
        }
        .build()
        return _arrowFromBottom!!
    }

private var _arrowFromBottom: ImageVector? = null
