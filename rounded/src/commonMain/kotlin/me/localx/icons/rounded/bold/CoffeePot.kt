package me.localx.icons.rounded.bold

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

public val Icons.Bold.CoffeePot: ImageVector
    get() {
        if (_coffeePot != null) {
            return _coffeePot!!
        }
        _coffeePot = Builder(name = "CoffeePot", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.286f, 3.486f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 17.167f, 0.0f)
                horizontalLineTo(3.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 2.107f, 2.057f)
                lineToRelative(1.7f, 4.254f)
                arcTo(27.184f, 27.184f, 0.0f, false, false, 0.029f, 18.12f)
                arcTo(5.326f, 5.326f, 0.0f, false, false, 5.322f, 24.0f)
                horizontalLineTo(15.678f)
                arcToRelative(5.326f, 5.326f, 0.0f, false, false, 5.293f, -5.88f)
                arcTo(26.683f, 26.683f, 0.0f, false, false, 17.0f, 6.02f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(0.167f)
                arcTo(2.512f, 2.512f, 0.0f, false, true, 19.5f, 4.6f)
                arcTo(21.421f, 21.421f, 0.0f, false, true, 21.0f, 12.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                arcTo(24.456f, 24.456f, 0.0f, false, false, 22.286f, 3.486f)
                close()
                moveTo(17.4f, 20.233f)
                arcTo(2.289f, 2.289f, 0.0f, false, true, 15.678f, 21.0f)
                horizontalLineTo(5.322f)
                arcToRelative(2.328f, 2.328f, 0.0f, false, true, -2.309f, -2.57f)
                arcTo(29.645f, 29.645f, 0.0f, false, true, 3.578f, 15.0f)
                horizontalLineTo(13.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineTo(4.43f)
                arcTo(20.4f, 20.4f, 0.0f, false, true, 6.29f, 8.0f)
                horizontalLineToRelative(8.419f)
                arcToRelative(24.618f, 24.618f, 0.0f, false, true, 3.278f, 10.43f)
                arcTo(2.307f, 2.307f, 0.0f, false, true, 17.4f, 20.233f)
                close()
                moveTo(14.0f, 5.0f)
                horizontalLineTo(6.515f)
                lineToRelative(-0.8f, -2.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _coffeePot!!
    }

private var _coffeePot: ImageVector? = null
