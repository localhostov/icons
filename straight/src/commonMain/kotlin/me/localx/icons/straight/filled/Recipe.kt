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

public val Icons.Filled.Recipe: ImageVector
    get() {
        if (_recipe != null) {
            return _recipe!!
        }
        _recipe = Builder(name = "Recipe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.974f, 0.0f)
                curveToRelative(0.635f, 0.838f, 1.026f, 1.87f, 1.026f, 3.0f)
                curveToRelative(0.0f, 1.598f, -0.766f, 3.07f, -2.0f, 3.999f)
                verticalLineToRelative(2.001f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 11.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(7.0f)
                lineTo(24.0f, 0.0f)
                horizontalLineToRelative(-11.026f)
                close()
                moveTo(13.0f, 19.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(20.0f, 15.0f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(10.0f, 9.0f)
                lineTo(2.0f, 9.0f)
                verticalLineToRelative(-3.171f)
                curveToRelative(-1.164f, -0.413f, -2.0f, -1.525f, -2.0f, -2.829f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                curveToRelative(0.488f, 0.0f, 0.965f, 0.124f, 1.395f, 0.357f)
                curveTo(5.403f, -0.113f, 6.597f, -0.113f, 7.605f, 0.357f)
                curveToRelative(0.429f, -0.233f, 0.907f, -0.357f, 1.395f, -0.357f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                curveToRelative(0.0f, 1.304f, -0.836f, 2.416f, -2.0f, 2.829f)
                verticalLineToRelative(3.171f)
                close()
                moveTo(19.0f, 23.414f)
                verticalLineToRelative(-4.414f)
                horizontalLineToRelative(4.414f)
                lineToRelative(-4.414f, 4.414f)
                close()
            }
        }
        .build()
        return _recipe!!
    }

private var _recipe: ImageVector? = null
