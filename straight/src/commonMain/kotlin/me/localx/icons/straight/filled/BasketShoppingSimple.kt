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

public val Icons.Filled.BasketShoppingSimple: ImageVector
    get() {
        if (_basketShoppingSimple != null) {
            return _basketShoppingSimple!!
        }
        _basketShoppingSimple = Builder(name = "BasketShoppingSimple", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.94f, 8.0f)
                curveTo(20.44f, 3.51f, 16.62f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(3.56f, 3.51f, 3.06f, 8.0f)
                horizontalLineTo(-0.02f)
                lineToRelative(1.92f, 13.42f)
                curveToRelative(0.21f, 1.47f, 1.49f, 2.58f, 2.97f, 2.58f)
                horizontalLineToRelative(14.27f)
                curveToRelative(1.48f, 0.0f, 2.76f, -1.11f, 2.97f, -2.58f)
                lineToRelative(1.92f, -13.42f)
                horizontalLineToRelative(-3.08f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(3.52f, 0.0f, 6.43f, 2.61f, 6.92f, 6.0f)
                horizontalLineTo(5.08f)
                curveToRelative(0.49f, -3.39f, 3.4f, -6.0f, 6.92f, -6.0f)
                close()
            }
        }
        .build()
        return _basketShoppingSimple!!
    }

private var _basketShoppingSimple: ImageVector? = null
