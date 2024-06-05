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
                moveTo(23.15f, 9.21f)
                curveToRelative(-0.57f, -0.66f, -1.36f, -1.08f, -2.22f, -1.18f)
                curveTo(20.44f, 3.52f, 16.62f, 0.0f, 11.99f, 0.0f)
                reflectiveCurveTo(3.53f, 3.52f, 3.04f, 8.03f)
                curveToRelative(-0.84f, 0.11f, -1.62f, 0.53f, -2.19f, 1.18f)
                curveTo(0.19f, 9.98f, -0.11f, 11.0f, 0.04f, 12.01f)
                lineToRelative(1.01f, 6.86f)
                curveToRelative(0.43f, 2.92f, 2.98f, 5.13f, 5.94f, 5.13f)
                horizontalLineToRelative(10.04f)
                curveToRelative(2.96f, 0.0f, 5.51f, -2.21f, 5.94f, -5.13f)
                lineToRelative(1.01f, -6.86f)
                curveToRelative(0.15f, -1.01f, -0.15f, -2.03f, -0.82f, -2.8f)
                close()
                moveTo(11.99f, 3.0f)
                curveToRelative(2.96f, 0.0f, 5.43f, 2.17f, 5.91f, 5.0f)
                lineTo(6.07f, 8.0f)
                curveToRelative(0.48f, -2.83f, 2.95f, -5.0f, 5.91f, -5.0f)
                close()
                moveTo(21.0f, 11.57f)
                lineToRelative(-1.01f, 6.86f)
                curveToRelative(-0.21f, 1.46f, -1.49f, 2.56f, -2.97f, 2.56f)
                lineTo(6.98f, 20.99f)
                curveToRelative(-1.48f, 0.0f, -2.75f, -1.1f, -2.97f, -2.56f)
                lineToRelative(-1.01f, -6.86f)
                curveToRelative(-0.03f, -0.2f, 0.06f, -0.33f, 0.12f, -0.4f)
                curveToRelative(0.06f, -0.06f, 0.18f, -0.17f, 0.38f, -0.17f)
                lineTo(20.5f, 11.0f)
                curveToRelative(0.2f, 0.0f, 0.32f, 0.11f, 0.38f, 0.17f)
                curveToRelative(0.06f, 0.06f, 0.15f, 0.2f, 0.12f, 0.4f)
                close()
            }
        }
        .build()
        return _basketShoppingSimple!!
    }

private var _basketShoppingSimple: ImageVector? = null
