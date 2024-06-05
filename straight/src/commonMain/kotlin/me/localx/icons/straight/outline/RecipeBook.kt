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

public val Icons.Outline.RecipeBook: ImageVector
    get() {
        if (_recipeBook != null) {
            return _recipeBook!!
        }
        _recipeBook = Builder(name = "RecipeBook", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(17.0f)
                lineTo(22.0f, 2.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(5.0f, 2.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(16.0f)
                lineTo(5.0f, 18.0f)
                curveToRelative(-0.352f, 0.0f, -0.686f, 0.072f, -1.0f, 0.184f)
                lineTo(4.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(5.0f, 22.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 22.0f)
                close()
                moveTo(8.0f, 10.829f)
                verticalLineToRelative(4.171f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-4.171f)
                curveToRelative(1.164f, -0.413f, 2.0f, -1.525f, 2.0f, -2.829f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                curveToRelative(-0.488f, 0.0f, -0.965f, 0.124f, -1.395f, 0.357f)
                curveToRelative(-1.009f, -0.471f, -2.202f, -0.471f, -3.211f, 0.0f)
                curveToRelative(-0.429f, -0.233f, -0.907f, -0.357f, -1.395f, -0.357f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                curveToRelative(0.0f, 1.304f, 0.836f, 2.416f, 2.0f, 2.829f)
                close()
                moveTo(9.0f, 7.0f)
                curveToRelative(0.302f, 0.0f, 0.526f, 0.149f, 0.661f, 0.274f)
                lineToRelative(0.599f, 0.557f)
                lineToRelative(0.665f, -0.476f)
                curveToRelative(0.649f, -0.465f, 1.503f, -0.465f, 2.152f, 0.0f)
                lineToRelative(0.665f, 0.476f)
                lineToRelative(0.599f, -0.557f)
                curveToRelative(0.134f, -0.125f, 0.358f, -0.274f, 0.661f, -0.274f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.449f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.449f, -1.0f, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _recipeBook!!
    }

private var _recipeBook: ImageVector? = null
