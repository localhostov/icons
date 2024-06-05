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

public val Icons.Outline.Recipe: ImageVector
    get() {
        if (_recipe != null) {
            return _recipe!!
        }
        _recipe = Builder(name = "Recipe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 13.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(19.0f, 7.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(9.0f, 17.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(2.0f, 9.0f)
                verticalLineToRelative(-3.171f)
                curveToRelative(-1.164f, -0.413f, -2.0f, -1.525f, -2.0f, -2.829f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                curveToRelative(0.488f, 0.0f, 0.965f, 0.124f, 1.395f, 0.357f)
                curveTo(5.403f, -0.113f, 6.597f, -0.113f, 7.605f, 0.357f)
                curveToRelative(0.429f, -0.233f, 0.907f, -0.357f, 1.395f, -0.357f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                curveToRelative(0.0f, 1.304f, -0.836f, 2.416f, -2.0f, 2.829f)
                verticalLineToRelative(3.171f)
                lineTo(2.0f, 9.0f)
                close()
                moveTo(2.0f, 3.0f)
                curveToRelative(0.0f, 0.552f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.449f, -1.0f, -1.0f, -1.0f)
                curveToRelative(-0.302f, 0.0f, -0.526f, 0.149f, -0.661f, 0.274f)
                lineToRelative(-0.599f, 0.557f)
                lineToRelative(-0.665f, -0.476f)
                curveToRelative(-0.649f, -0.465f, -1.503f, -0.465f, -2.152f, 0.0f)
                lineToRelative(-0.665f, 0.476f)
                lineToRelative(-0.599f, -0.557f)
                curveToRelative(-0.134f, -0.125f, -0.358f, -0.274f, -0.661f, -0.274f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                close()
                moveTo(24.0f, 3.0f)
                verticalLineToRelative(13.414f)
                lineToRelative(-7.586f, 7.586f)
                lineTo(4.0f, 24.0f)
                verticalLineToRelative(-13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(7.0f)
                lineTo(22.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(14.0f, 0.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                close()
                moveTo(17.0f, 20.586f)
                lineToRelative(3.586f, -3.586f)
                horizontalLineToRelative(-3.586f)
                verticalLineToRelative(3.586f)
                close()
            }
        }
        .build()
        return _recipe!!
    }

private var _recipe: ImageVector? = null
