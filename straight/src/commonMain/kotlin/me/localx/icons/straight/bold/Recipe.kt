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

public val Icons.Bold.Recipe: ImageVector
    get() {
        if (_recipe != null) {
            return _recipe!!
        }
        _recipe = Builder(name = "Recipe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 3.5f)
                verticalLineToRelative(14.836f)
                lineToRelative(-5.618f, 5.664f)
                lineTo(4.0f, 24.0f)
                verticalLineToRelative(-13.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(5.0f)
                lineTo(21.0f, 3.5f)
                curveToRelative(0.0f, -0.275f, -0.225f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-6.5f)
                lineTo(14.0f, 0.0f)
                horizontalLineToRelative(6.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(10.0f, 9.0f)
                verticalLineToRelative(-4.05f)
                curveToRelative(1.141f, -0.232f, 2.0f, -1.24f, 2.0f, -2.45f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-0.682f, 0.0f, -1.299f, 0.275f, -1.75f, 0.718f)
                curveToRelative(-0.451f, -0.443f, -1.068f, -0.718f, -1.75f, -0.718f)
                reflectiveCurveToRelative(-1.299f, 0.275f, -1.75f, 0.718f)
                curveToRelative(-0.451f, -0.443f, -1.068f, -0.718f, -1.75f, -0.718f)
                curveTo(1.119f, 0.0f, 0.0f, 1.119f, 0.0f, 2.5f)
                curveToRelative(0.0f, 1.209f, 0.859f, 2.218f, 2.0f, 2.45f)
                verticalLineToRelative(4.05f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(19.0f, 11.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(19.0f, 6.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(9.0f, 19.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _recipe!!
    }

private var _recipe: ImageVector? = null
