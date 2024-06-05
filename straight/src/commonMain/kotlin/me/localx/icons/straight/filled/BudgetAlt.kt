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

public val Icons.Filled.BudgetAlt: ImageVector
    get() {
        if (_budgetAlt != null) {
            return _budgetAlt!!
        }
        _budgetAlt = Builder(name = "BudgetAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 20.512f)
                curveToRelative(0.0f, 1.923f, -1.57f, 3.488f, -3.5f, 3.488f)
                lineTo(3.5f, 24.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.565f, -3.5f, -3.488f)
                curveToRelative(0.0f, -2.66f, 1.966f, -5.816f, 4.518f, -6.743f)
                curveToRelative(-0.756f, -0.747f, -1.518f, -1.753f, -1.518f, -2.769f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.016f, -0.762f, 2.021f, -1.518f, 2.769f)
                curveToRelative(2.552f, 0.927f, 4.518f, 4.083f, 4.518f, 6.743f)
                close()
                moveTo(21.0f, 0.0f)
                horizontalLineToRelative(-11.76f)
                curveToRelative(0.48f, 0.716f, 0.76f, 1.576f, 0.76f, 2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(8.0f, 2.5f)
                curveTo(8.0f, 1.034f, 6.739f, -0.137f, 5.242f, 0.013f)
                curveToRelative(-1.301f, 0.13f, -2.242f, 1.322f, -2.242f, 2.63f)
                verticalLineToRelative(6.357f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.781f, -0.228f, 1.515f, -0.576f, 2.181f)
                curveToRelative(2.173f, 1.78f, 3.576f, 4.691f, 3.576f, 7.331f)
                curveToRelative(0.0f, 1.324f, -0.472f, 2.539f, -1.257f, 3.488f)
                horizontalLineToRelative(4.257f)
                curveToRelative(2.209f, 0.0f, 4.0f, -1.791f, 4.0f, -4.0f)
                lineTo(21.0f, 6.0f)
                horizontalLineToRelative(-13.0f)
                verticalLineToRelative(-3.5f)
                close()
            }
        }
        .build()
        return _budgetAlt!!
    }

private var _budgetAlt: ImageVector? = null
