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

public val Icons.Filled.CoffeePot: ImageVector
    get() {
        if (_coffeePot != null) {
            return _coffeePot!!
        }
        _coffeePot = Builder(name = "CoffeePot", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.0f)
                horizontalLineTo(22.0f)
                arcTo(25.115f, 25.115f, 0.0f, false, false, 19.4f, 2.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(3.525f)
                lineToRelative(-2.0f, -5.0f)
                horizontalLineToRelative(19.04f)
                lineToRelative(0.291f, 0.485f)
                arcTo(26.226f, 26.226f, 0.0f, false, true, 24.0f, 13.0f)
                close()
                moveTo(3.774f, 7.0f)
                arcTo(20.365f, 20.365f, 0.0f, false, false, 1.5f, 12.0f)
                horizontalLineTo(15.4f)
                curveToRelative(0.2f, 0.606f, 0.393f, 1.275f, 0.577f, 2.0f)
                horizontalLineTo(0.946f)
                arcTo(36.679f, 36.679f, 0.0f, false, false, 0.0f, 20.856f)
                arcTo(3.008f, 3.008f, 0.0f, false, false, 3.0f, 24.0f)
                horizontalLineTo(18.0f)
                arcToRelative(3.008f, 3.008f, 0.0f, false, false, 3.0f, -3.144f)
                curveTo(20.625f, 12.954f, 18.247f, 8.547f, 17.227f, 7.0f)
                close()
            }
        }
        .build()
        return _coffeePot!!
    }

private var _coffeePot: ImageVector? = null
