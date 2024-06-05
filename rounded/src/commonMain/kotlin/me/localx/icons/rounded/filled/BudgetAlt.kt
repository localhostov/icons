package me.localx.icons.rounded.filled

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
                moveTo(11.0f, 6.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.209f, -1.791f, 4.0f, -4.0f, 4.0f)
                horizontalLineToRelative(-4.257f)
                curveToRelative(0.785f, -0.949f, 1.257f, -2.165f, 1.257f, -3.488f)
                curveToRelative(0.0f, -2.597f, -1.329f, -5.316f, -3.302f, -7.076f)
                curveToRelative(0.439f, -0.906f, 0.405f, -1.952f, -0.105f, -2.848f)
                curveToRelative(-0.558f, -0.979f, -1.601f, -1.588f, -2.722f, -1.588f)
                horizontalLineToRelative(-3.74f)
                curveToRelative(-0.392f, 0.0f, -0.774f, 0.075f, -1.13f, 0.213f)
                lineTo(3.001f, 2.643f)
                curveTo(3.0f, 1.335f, 3.941f, 0.143f, 5.242f, 0.013f)
                curveToRelative(1.496f, -0.15f, 2.758f, 1.021f, 2.758f, 2.487f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(24.0f, 3.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-12.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.924f, -0.28f, -1.784f, -0.76f, -2.5f)
                horizontalLineToRelative(11.76f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _budgetAlt!!
    }

private var _budgetAlt: ImageVector? = null
