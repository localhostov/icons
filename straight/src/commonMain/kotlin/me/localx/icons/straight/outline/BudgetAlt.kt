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

public val Icons.Outline.BudgetAlt: ImageVector
    get() {
        if (_budgetAlt != null) {
            return _budgetAlt!!
        }
        _budgetAlt = Builder(name = "BudgetAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.482f, 13.769f)
                curveToRelative(0.756f, -0.747f, 1.518f, -1.753f, 1.518f, -2.769f)
                lineTo(3.0f, 11.0f)
                curveToRelative(0.0f, 1.016f, 0.762f, 2.021f, 1.518f, 2.769f)
                curveToRelative(-2.552f, 0.927f, -4.518f, 4.083f, -4.518f, 6.743f)
                curveToRelative(0.0f, 1.923f, 1.57f, 3.488f, 3.5f, 3.488f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.565f, 3.5f, -3.488f)
                curveToRelative(0.0f, -2.66f, -1.966f, -5.816f, -4.518f, -6.743f)
                close()
                moveTo(8.5f, 22.0f)
                lineTo(3.5f, 22.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.667f, -1.5f, -1.488f)
                curveToRelative(0.0f, -2.295f, 2.168f, -5.012f, 4.0f, -5.012f)
                reflectiveCurveToRelative(4.0f, 2.717f, 4.0f, 5.012f)
                curveToRelative(0.0f, 0.821f, -0.673f, 1.488f, -1.5f, 1.488f)
                close()
                moveTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(6.5f, 0.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(2.0f)
                lineTo(5.0f, 3.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 0.551f, -0.449f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-4.211f)
                curveToRelative(-0.21f, 0.741f, -0.567f, 1.421f, -1.046f, 2.0f)
                horizontalLineToRelative(5.257f)
                curveToRelative(0.017f, 0.0f, 0.035f, 0.0f, 0.052f, -0.001f)
                curveToRelative(1.63f, -0.028f, 2.948f, -1.362f, 2.948f, -2.999f)
                lineTo(21.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(22.0f, 4.0f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.537f, -0.122f, -1.045f, -0.338f, -1.5f)
                horizontalLineToRelative(11.338f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _budgetAlt!!
    }

private var _budgetAlt: ImageVector? = null
