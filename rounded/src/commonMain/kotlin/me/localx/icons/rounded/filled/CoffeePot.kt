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
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcToRelative(25.235f, 25.235f, 0.0f, false, false, -1.748f, -9.111f)
                arcTo(3.093f, 3.093f, 0.0f, false, false, 17.0f, 2.0f)
                lineTo(17.0f, 5.0f)
                lineTo(3.523f, 5.0f)
                lineTo(2.072f, 1.372f)
                arcTo(1.007f, 1.007f, 0.0f, false, true, 3.0f, 0.0f)
                lineTo(17.463f, 0.0f)
                arcToRelative(4.963f, 4.963f, 0.0f, false, true, 4.65f, 3.157f)
                arcTo(27.247f, 27.247f, 0.0f, false, true, 24.0f, 13.0f)
                close()
                moveTo(20.973f, 18.47f)
                curveTo(20.3f, 11.987f, 18.235f, 8.383f, 17.261f, 7.0f)
                lineTo(3.739f, 7.0f)
                arcToRelative(18.948f, 18.948f, 0.0f, false, false, -2.381f, 5.0f)
                lineTo(15.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineTo(0.79f, 14.0f)
                arcToRelative(33.33f, 33.33f, 0.0f, false, false, -0.763f, 4.47f)
                arcTo(5.043f, 5.043f, 0.0f, false, false, 5.0f, 24.0f)
                lineTo(16.0f, 24.0f)
                arcTo(5.043f, 5.043f, 0.0f, false, false, 20.973f, 18.47f)
                close()
            }
        }
        .build()
        return _coffeePot!!
    }

private var _coffeePot: ImageVector? = null
