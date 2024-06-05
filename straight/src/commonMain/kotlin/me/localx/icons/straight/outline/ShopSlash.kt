package me.localx.icons.straight.outline

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

public val Icons.Outline.ShopSlash: ImageVector
    get() {
        if (_shopSlash != null) {
            return _shopSlash!!
        }
        _shopSlash = Builder(name = "ShopSlash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 20.59f)
                lineTo(22.0f, 11.62f)
                curveToRelative(0.61f, -0.7f, 1.0f, -1.61f, 1.0f, -2.62f)
                verticalLineToRelative(-1.16f)
                lineToRelative(-2.28f, -6.84f)
                lineTo(3.25f, 1.0f)
                lineToRelative(-0.18f, 0.65f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                lineTo(22.54f, 23.96f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-1.96f, -1.96f)
                close()
                moveTo(15.0f, 11.62f)
                curveToRelative(0.73f, 0.84f, 1.8f, 1.38f, 3.0f, 1.38f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.35f, 0.0f, 0.68f, -0.06f, 1.0f, -0.14f)
                verticalLineToRelative(5.73f)
                lineToRelative(-6.09f, -6.09f)
                curveToRelative(0.42f, -0.23f, 0.78f, -0.52f, 1.09f, -0.88f)
                close()
                moveTo(21.0f, 8.16f)
                verticalLineToRelative(0.84f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 0.97f, -0.7f, 1.79f, -1.62f, 1.96f)
                lineTo(7.41f, 6.0f)
                horizontalLineToRelative(1.59f)
                lineTo(9.0f, 3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(16.0f, 3.0f)
                horizontalLineToRelative(3.28f)
                lineToRelative(1.72f, 5.16f)
                close()
                moveTo(4.75f, 3.0f)
                horizontalLineToRelative(2.25f)
                verticalLineToRelative(2.59f)
                lineToRelative(-2.32f, -2.32f)
                lineToRelative(0.08f, -0.26f)
                close()
                moveTo(4.0f, 16.0f)
                verticalLineToRelative(-3.14f)
                curveToRelative(0.32f, 0.08f, 0.65f, 0.14f, 1.0f, 0.14f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.78f, 0.0f, 1.51f, -0.24f, 2.13f, -0.63f)
                lineToRelative(-1.49f, -1.49f)
                curveToRelative(-0.2f, 0.07f, -0.42f, 0.12f, -0.64f, 0.12f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineToRelative(-0.84f)
                lineToRelative(0.23f, -0.69f)
                lineToRelative(-1.58f, -1.58f)
                lineToRelative(-0.65f, 1.95f)
                verticalLineToRelative(1.16f)
                curveToRelative(0.0f, 1.01f, 0.39f, 1.91f, 1.0f, 2.62f)
                verticalLineToRelative(8.38f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f)
                verticalLineToRelative(-0.76f)
                lineToRelative(-3.24f, -3.24f)
                lineTo(4.0f, 16.0f)
                close()
                moveTo(13.0f, 20.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                lineTo(5.0f, 21.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                lineTo(13.0f, 18.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _shopSlash!!
    }

private var _shopSlash: ImageVector? = null
