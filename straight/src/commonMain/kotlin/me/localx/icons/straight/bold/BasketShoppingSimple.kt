package me.localx.icons.straight.bold

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

public val Icons.Bold.BasketShoppingSimple: ImageVector
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
                curveTo(20.45f, 3.51f, 16.62f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(3.55f, 3.51f, 3.06f, 8.0f)
                lineTo(0.02f, 8.0f)
                lineToRelative(1.86f, 12.99f)
                curveToRelative(0.25f, 1.71f, 1.73f, 3.01f, 3.46f, 3.01f)
                horizontalLineToRelative(13.32f)
                curveToRelative(1.73f, 0.0f, 3.22f, -1.29f, 3.46f, -3.0f)
                lineToRelative(1.86f, -13.0f)
                horizontalLineToRelative(-3.04f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(2.97f, 0.0f, 5.44f, 2.17f, 5.92f, 5.0f)
                lineTo(6.08f, 8.0f)
                curveToRelative(0.48f, -2.83f, 2.95f, -5.0f, 5.92f, -5.0f)
                close()
                moveTo(19.15f, 20.57f)
                curveToRelative(-0.03f, 0.24f, -0.25f, 0.43f, -0.49f, 0.43f)
                lineTo(5.34f, 21.0f)
                curveToRelative(-0.25f, 0.0f, -0.46f, -0.18f, -0.49f, -0.43f)
                lineToRelative(-1.37f, -9.57f)
                lineTo(20.52f, 11.0f)
                lineToRelative(-1.37f, 9.57f)
                close()
            }
        }
        .build()
        return _basketShoppingSimple!!
    }

private var _basketShoppingSimple: ImageVector? = null
