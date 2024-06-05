package me.localx.icons.rounded.outline

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

public val Icons.Outline.CoffeePot: ImageVector
    get() {
        if (_coffeePot != null) {
            return _coffeePot!!
        }
        _coffeePot = Builder(name = "CoffeePot", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.113f, 3.157f)
                arcTo(4.963f, 4.963f, 0.0f, false, false, 17.463f, 0.0f)
                lineTo(3.0f, 0.0f)
                arcToRelative(1.008f, 1.008f, 0.0f, false, false, -0.929f, 1.372f)
                lineTo(3.88f, 5.893f)
                arcTo(30.518f, 30.518f, 0.0f, false, false, 0.027f, 18.47f)
                arcTo(5.01f, 5.01f, 0.0f, false, false, 5.0f, 24.0f)
                lineTo(16.0f, 24.0f)
                arcToRelative(5.043f, 5.043f, 0.0f, false, false, 4.976f, -5.53f)
                arcTo(30.107f, 30.107f, 0.0f, false, false, 17.0f, 5.7f)
                lineTo(17.0f, 2.0f)
                arcToRelative(3.093f, 3.093f, 0.0f, false, true, 3.252f, 1.889f)
                arcTo(25.235f, 25.235f, 0.0f, false, true, 22.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                arcTo(27.247f, 27.247f, 0.0f, false, false, 22.113f, 3.157f)
                close()
                moveTo(18.223f, 21.007f)
                arcTo(2.964f, 2.964f, 0.0f, false, true, 16.0f, 22.0f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-4.4f, -0.266f, -2.719f, -5.4f, -2.176f, -8.0f)
                lineTo(15.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(3.387f, 12.0f)
                arcTo(24.194f, 24.194f, 0.0f, false, true, 5.55f, 7.0f)
                horizontalLineToRelative(9.9f)
                arcToRelative(29.109f, 29.109f, 0.0f, false, true, 3.533f, 11.677f)
                arcTo(3.02f, 3.02f, 0.0f, false, true, 18.223f, 21.007f)
                close()
                moveTo(15.0f, 5.0f)
                lineTo(5.677f, 5.0f)
                lineToRelative(-1.2f, -3.0f)
                lineTo(15.0f, 2.0f)
                close()
            }
        }
        .build()
        return _coffeePot!!
    }

private var _coffeePot: ImageVector? = null
