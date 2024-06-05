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

public val Icons.Filled.ShopSlash: ImageVector
    get() {
        if (_shopSlash != null) {
            return _shopSlash!!
        }
        _shopSlash = Builder(name = "ShopSlash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.76f, 16.0f)
                lineToRelative(3.24f, 3.24f)
                verticalLineToRelative(0.76f)
                curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f)
                lineTo(5.0f, 23.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                lineTo(2.0f, 11.62f)
                curveToRelative(-0.61f, -0.7f, -1.0f, -1.61f, -1.0f, -2.62f)
                verticalLineToRelative(-1.16f)
                lineToRelative(0.65f, -1.95f)
                lineToRelative(6.48f, 6.48f)
                curveToRelative(-0.62f, 0.39f, -1.35f, 0.63f, -2.13f, 0.63f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.35f, 0.0f, -0.68f, -0.06f, -1.0f, -0.14f)
                verticalLineToRelative(3.14f)
                horizontalLineToRelative(7.76f)
                close()
                moveTo(23.96f, 22.54f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.04f, 1.46f)
                lineTo(1.46f, 0.04f)
                lineToRelative(1.6f, 1.6f)
                lineToRelative(0.18f, -0.65f)
                horizontalLineToRelative(3.75f)
                lineTo(6.99f, 5.0f)
                horizontalLineToRelative(2.0f)
                lineTo(8.99f, 1.0f)
                horizontalLineToRelative(6.0f)
                lineTo(14.99f, 5.0f)
                horizontalLineToRelative(2.0f)
                lineTo(16.99f, 1.0f)
                horizontalLineToRelative(3.72f)
                lineToRelative(2.28f, 6.84f)
                verticalLineToRelative(1.16f)
                curveToRelative(0.0f, 1.01f, -0.39f, 1.91f, -1.0f, 2.62f)
                verticalLineToRelative(8.97f)
                lineToRelative(1.96f, 1.96f)
                close()
                moveTo(20.0f, 12.86f)
                curveToRelative(-0.32f, 0.08f, -0.65f, 0.14f, -1.0f, 0.14f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.2f, 0.0f, -2.27f, -0.54f, -3.0f, -1.38f)
                curveToRelative(-0.31f, 0.35f, -0.68f, 0.65f, -1.09f, 0.88f)
                lineToRelative(6.09f, 6.09f)
                verticalLineToRelative(-5.73f)
                close()
            }
        }
        .build()
        return _shopSlash!!
    }

private var _shopSlash: ImageVector? = null
