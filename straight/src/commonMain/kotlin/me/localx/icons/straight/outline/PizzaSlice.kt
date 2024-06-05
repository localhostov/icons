package me.localx.icons.straight.outline

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
import me.localx.icons.straight.Icons

public val Icons.Outline.PizzaSlice: ImageVector
    get() {
        if (_pizzaSlice != null) {
            return _pizzaSlice!!
        }
        _pizzaSlice = Builder(name = "PizzaSlice", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.2f, 0.8f)
                arcTo(2.714f, 2.714f, 0.0f, false, false, 20.3f, 0.178f)
                lineTo(0.0f, 8.322f)
                verticalLineTo(9.0f)
                arcTo(15.017f, 15.017f, 0.0f, false, false, 15.0f, 24.0f)
                horizontalLineToRelative(0.676f)
                lineTo(23.832f, 3.67f)
                arcTo(2.708f, 2.708f, 0.0f, false, false, 23.2f, 0.8f)
                close()
                moveTo(21.01f, 2.045f)
                arcToRelative(0.715f, 0.715f, 0.0f, false, true, 0.771f, 0.171f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, true, 0.183f, 0.74f)
                lineTo(21.288f, 4.64f)
                curveToRelative(-5.708f, -1.956f, -8.914f, 6.126f, -3.466f, 8.639f)
                lineTo(15.93f, 18.0f)
                curveTo(9.551f, 17.97f, 6.029f, 14.447f, 6.0f, 8.068f)
                close()
                moveTo(17.0f, 9.0f)
                arcToRelative(2.655f, 2.655f, 0.0f, false, true, 3.54f, -2.5f)
                lineToRelative(-1.973f, 4.918f)
                arcTo(2.665f, 2.665f, 0.0f, false, true, 17.0f, 9.0f)
                close()
                moveTo(14.331f, 21.983f)
                arcTo(13.019f, 13.019f, 0.0f, false, true, 2.017f, 9.667f)
                lineToRelative(2.016f, -0.809f)
                curveToRelative(0.321f, 6.706f, 4.4f, 10.787f, 11.106f, 11.109f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.0f, 13.0f)
                close()
            }
        }
        .build()
        return _pizzaSlice!!
    }

private var _pizzaSlice: ImageVector? = null
