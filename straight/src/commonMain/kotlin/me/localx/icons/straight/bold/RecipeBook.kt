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

public val Icons.Bold.RecipeBook: ImageVector
    get() {
        if (_recipeBook != null) {
            return _recipeBook!!
        }
        _recipeBook = Builder(name = "RecipeBook", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.794f, 0.0f, 1.0f, 1.794f, 1.0f, 4.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(18.0f)
                lineTo(23.0f, 2.5f)
                curveToRelative(0.0f, -1.379f, -1.122f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(5.0f, 3.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(13.0f)
                lineTo(5.0f, 16.0f)
                curveToRelative(-0.347f, 0.0f, -0.678f, 0.058f, -1.0f, 0.142f)
                lineTo(4.0f, 4.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(5.0f, 21.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 21.0f)
                close()
                moveTo(6.0f, 7.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                curveToRelative(0.682f, 0.0f, 1.299f, 0.275f, 1.75f, 0.718f)
                curveToRelative(0.451f, -0.443f, 1.068f, -0.718f, 1.75f, -0.718f)
                reflectiveCurveToRelative(1.299f, 0.275f, 1.75f, 0.718f)
                curveToRelative(0.451f, -0.443f, 1.068f, -0.718f, 1.75f, -0.718f)
                curveToRelative(1.381f, 0.0f, 2.5f, 1.119f, 2.5f, 2.5f)
                curveToRelative(0.0f, 1.209f, -0.859f, 2.218f, -2.0f, 2.45f)
                verticalLineToRelative(4.05f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-4.05f)
                curveToRelative(-1.141f, -0.232f, -2.0f, -1.24f, -2.0f, -2.45f)
                close()
            }
        }
        .build()
        return _recipeBook!!
    }

private var _recipeBook: ImageVector? = null
