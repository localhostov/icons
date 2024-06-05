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
                moveTo(23.71f, 22.29f)
                lineToRelative(-1.71f, -1.71f)
                lineTo(22.0f, 11.62f)
                curveToRelative(0.62f, -0.71f, 1.01f, -1.63f, 1.0f, -2.64f)
                curveToRelative(-0.01f, -0.08f, -0.03f, -0.17f, -0.04f, -0.25f)
                lineToRelative(-1.17f, -4.1f)
                curveToRelative(-0.61f, -2.14f, -2.57f, -3.62f, -4.79f, -3.62f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                lineTo(15.0f, 1.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(9.0f, 5.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                lineTo(7.0f, 1.0f)
                curveToRelative(-1.26f, 0.0f, -2.42f, 0.48f, -3.31f, 1.28f)
                lineTo(1.71f, 0.29f)
                curveTo(1.32f, -0.1f, 0.68f, -0.1f, 0.29f, 0.29f)
                reflectiveCurveTo(-0.1f, 1.32f, 0.29f, 1.71f)
                lineTo(22.29f, 23.71f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                close()
                moveTo(14.0f, 12.44f)
                curveToRelative(0.38f, -0.22f, 0.71f, -0.5f, 1.0f, -0.83f)
                curveToRelative(0.73f, 0.84f, 1.8f, 1.38f, 3.0f, 1.38f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.35f, 0.0f, 0.68f, -0.06f, 1.0f, -0.14f)
                verticalLineToRelative(5.73f)
                lineToRelative(-6.0f, -6.0f)
                verticalLineToRelative(-0.14f)
                close()
                moveTo(17.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(-0.01f, 0.0f, -0.02f, 0.0f)
                horizontalLineToRelative(0.02f)
                close()
                moveTo(7.02f, 1.0f)
                reflectiveCurveToRelative(-0.01f, 0.0f, -0.02f, 0.0f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.02f, 0.0f, 0.02f, 0.0f)
                close()
                moveTo(12.74f, 17.0f)
                lineToRelative(1.26f, 1.26f)
                verticalLineToRelative(1.74f)
                curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f)
                lineTo(5.0f, 23.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f)
                lineTo(2.0f, 11.62f)
                curveToRelative(-0.62f, -0.71f, -1.0f, -1.62f, -1.0f, -2.64f)
                curveToRelative(0.01f, -0.09f, 0.03f, -0.17f, 0.04f, -0.26f)
                lineToRelative(0.76f, -2.67f)
                lineToRelative(6.3f, 6.3f)
                curveToRelative(-0.61f, 0.39f, -1.32f, 0.64f, -2.1f, 0.64f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.35f, 0.0f, -0.68f, -0.06f, -1.0f, -0.14f)
                verticalLineToRelative(4.14f)
                lineTo(12.74f, 16.99f)
                close()
            }
        }
        .build()
        return _shopSlash!!
    }

private var _shopSlash: ImageVector? = null
