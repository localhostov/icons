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
                moveToRelative(6.113f, 6.737f)
                curveToRelative(0.237f, -0.798f, 0.904f, -1.435f, 1.709f, -1.647f)
                curveToRelative(0.944f, -0.25f, 1.832f, 0.042f, 2.428f, 0.628f)
                curveToRelative(0.451f, -0.443f, 1.068f, -0.718f, 1.75f, -0.718f)
                reflectiveCurveToRelative(1.299f, 0.275f, 1.75f, 0.718f)
                curveToRelative(0.597f, -0.586f, 1.484f, -0.878f, 2.428f, -0.628f)
                curveToRelative(0.804f, 0.213f, 1.472f, 0.85f, 1.709f, 1.647f)
                curveToRelative(0.453f, 1.527f, -0.512f, 2.933f, -1.887f, 3.213f)
                verticalLineToRelative(1.55f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-1.55f)
                curveToRelative(-1.375f, -0.279f, -2.34f, -1.686f, -1.887f, -3.213f)
                close()
                moveTo(23.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.032f, -2.467f, 5.5f, -5.5f, 5.5f)
                lineTo(5.5f, 24.0f)
                curveToRelative(-2.378f, 0.0f, -4.31f, -1.859f, -4.469f, -4.197f)
                curveToRelative(-0.02f, -0.098f, -0.031f, -0.199f, -0.031f, -0.303f)
                lineTo(1.0f, 5.5f)
                curveTo(1.0f, 2.468f, 3.467f, 0.0f, 6.5f, 0.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, 2.468f, 5.5f, 5.5f)
                close()
                moveTo(4.0f, 5.5f)
                verticalLineToRelative(9.776f)
                curveToRelative(0.471f, -0.168f, 0.971f, -0.276f, 1.5f, -0.276f)
                horizontalLineToRelative(14.5f)
                lineTo(20.0f, 5.5f)
                curveToRelative(0.0f, -1.379f, -1.122f, -2.5f, -2.5f, -2.5f)
                lineTo(6.5f, 3.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                close()
                moveTo(20.0f, 18.5f)
                verticalLineToRelative(-0.5f)
                lineTo(5.5f, 18.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.673f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _recipeBook!!
    }

private var _recipeBook: ImageVector? = null
