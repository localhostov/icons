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

public val Icons.Bold.BasketShoppingPlus: ImageVector
    get() {
        if (_basketShoppingPlus != null) {
            return _basketShoppingPlus!!
        }
        _basketShoppingPlus = Builder(name = "BasketShoppingPlus", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.928f, 8.0f)
                curveTo(20.429f, 3.507f, 16.611f, 0.0f, 11.987f, 0.0f)
                reflectiveCurveTo(3.546f, 3.507f, 3.046f, 8.0f)
                lineTo(0.071f, 8.0f)
                lineToRelative(1.911f, 13.008f)
                curveToRelative(0.25f, 1.706f, 1.739f, 2.992f, 3.462f, 2.992f)
                horizontalLineToRelative(13.111f)
                curveToRelative(1.724f, 0.0f, 3.212f, -1.286f, 3.462f, -2.992f)
                lineToRelative(1.911f, -13.008f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(11.987f, 3.0f)
                curveToRelative(2.967f, 0.0f, 5.431f, 2.167f, 5.91f, 5.0f)
                lineTo(6.078f, 8.0f)
                curveToRelative(0.478f, -2.833f, 2.942f, -5.0f, 5.91f, -5.0f)
                close()
                moveTo(19.05f, 20.573f)
                curveToRelative(-0.036f, 0.244f, -0.249f, 0.427f, -0.495f, 0.427f)
                lineTo(5.444f, 21.0f)
                curveToRelative(-0.246f, 0.0f, -0.458f, -0.184f, -0.495f, -0.427f)
                lineToRelative(-1.406f, -9.573f)
                lineTo(20.456f, 11.0f)
                lineToRelative(-1.406f, 9.573f)
                close()
                moveTo(10.5f, 17.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.5f)
                close()
            }
        }
        .build()
        return _basketShoppingPlus!!
    }

private var _basketShoppingPlus: ImageVector? = null
