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
                moveTo(23.27f, 9.03f)
                curveToRelative(-0.57f, -0.66f, -1.4f, -1.03f, -2.27f, -1.03f)
                horizontalLineToRelative(-0.09f)
                curveTo(20.41f, 3.51f, 16.59f, 0.0f, 11.97f, 0.0f)
                reflectiveCurveTo(3.53f, 3.51f, 3.03f, 8.0f)
                horizontalLineToRelative(-0.06f)
                curveToRelative(-0.87f, 0.0f, -1.7f, 0.38f, -2.27f, 1.03f)
                curveTo(0.13f, 9.69f, -0.12f, 10.56f, 0.0f, 11.42f)
                lineToRelative(1.06f, 7.42f)
                curveToRelative(0.42f, 2.94f, 2.97f, 5.15f, 5.94f, 5.15f)
                horizontalLineToRelative(9.97f)
                curveToRelative(2.97f, 0.0f, 5.52f, -2.21f, 5.94f, -5.15f)
                lineToRelative(1.06f, -7.42f)
                curveToRelative(0.12f, -0.86f, -0.13f, -1.73f, -0.7f, -2.39f)
                close()
                moveTo(11.97f, 2.0f)
                curveToRelative(3.52f, 0.0f, 6.43f, 2.61f, 6.92f, 6.0f)
                horizontalLineTo(5.05f)
                curveToRelative(0.49f, -3.39f, 3.4f, -6.0f, 6.92f, -6.0f)
                close()
            }
        }
        .build()
        return _basketShoppingSimple!!
    }

private var _basketShoppingSimple: ImageVector? = null
