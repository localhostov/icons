package me.localx.icons.rounded.outline

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
                moveToRelative(7.86f, 13.924f)
                curveToRelative(0.365f, -0.383f, 0.719f, -0.815f, 0.993f, -1.276f)
                curveToRelative(0.431f, -0.727f, -0.14f, -1.648f, -0.982f, -1.648f)
                horizontalLineToRelative(-3.741f)
                curveToRelative(-0.843f, 0.0f, -1.413f, 0.921f, -0.982f, 1.648f)
                curveToRelative(0.273f, 0.461f, 0.628f, 0.894f, 0.993f, 1.276f)
                curveToRelative(-2.366f, 1.086f, -4.14f, 4.061f, -4.14f, 6.587f)
                curveToRelative(0.0f, 1.923f, 1.57f, 3.488f, 3.5f, 3.488f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.565f, 3.5f, -3.488f)
                curveToRelative(0.0f, -2.527f, -1.775f, -5.501f, -4.14f, -6.587f)
                close()
                moveTo(8.5f, 22.0f)
                lineTo(3.5f, 22.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.667f, -1.5f, -1.488f)
                curveToRelative(0.0f, -2.295f, 2.168f, -5.012f, 4.0f, -5.012f)
                reflectiveCurveToRelative(4.0f, 2.717f, 4.0f, 5.012f)
                curveToRelative(0.0f, 0.821f, -0.673f, 1.488f, -1.5f, 1.488f)
                close()
                moveTo(21.0f, 0.0f)
                lineTo(6.499f, 0.0f)
                curveToRelative(-1.929f, 0.0f, -3.499f, 1.571f, -3.499f, 3.5f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                lineTo(5.0f, 3.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                curveToRelative(0.0f, 1.378f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(21.0f, 6.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(22.0f, 3.5f)
                curveToRelative(0.0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-11.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                curveToRelative(0.0f, -0.537f, -0.122f, -1.045f, -0.338f, -1.5f)
                horizontalLineToRelative(11.338f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(0.5f)
                close()
            }
        }
        .build()
        return _budgetAlt!!
    }

private var _budgetAlt: ImageVector? = null
