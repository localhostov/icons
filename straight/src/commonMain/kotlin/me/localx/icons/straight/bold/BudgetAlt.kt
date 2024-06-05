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

public val Icons.Bold.BudgetAlt: ImageVector
    get() {
        if (_budgetAlt != null) {
            return _budgetAlt!!
        }
        _budgetAlt = Builder(name = "BudgetAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.896f, 13.329f)
                curveToRelative(0.63f, -0.644f, 1.235f, -1.481f, 1.235f, -2.329f)
                lineTo(3.868f, 11.0f)
                curveToRelative(0.0f, 0.848f, 0.605f, 1.685f, 1.235f, 2.329f)
                curveToRelative(-2.774f, 0.758f, -5.104f, 3.646f, -5.104f, 6.682f)
                curveToRelative(0.0f, 2.199f, 1.794f, 3.988f, 4.0f, 3.988f)
                horizontalLineToRelative(5.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.789f, 4.0f, -3.988f)
                curveToRelative(0.0f, -3.037f, -2.33f, -5.925f, -5.104f, -6.682f)
                close()
                moveTo(9.0f, 21.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.443f, -1.0f, -0.988f)
                curveToRelative(0.0f, -1.886f, 1.799f, -3.88f, 3.5f, -3.88f)
                reflectiveCurveToRelative(3.5f, 1.995f, 3.5f, 3.88f)
                curveToRelative(0.0f, 0.545f, -0.449f, 0.988f, -1.0f, 0.988f)
                close()
                moveTo(24.0f, 6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(14.5f)
                curveToRelative(0.0f, 1.826f, -1.5f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-4.037f)
                curveToRelative(0.743f, -0.827f, 1.257f, -1.858f, 1.448f, -3.0f)
                horizontalLineToRelative(2.589f)
                curveToRelative(0.276f, 0.0f, 0.5f, -0.224f, 0.5f, -0.5f)
                lineTo(18.0f, 6.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.551f, -0.449f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-5.0f)
                curveTo(3.0f, 1.794f, 4.794f, 0.0f, 7.0f, 0.0f)
                horizontalLineToRelative(13.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(2.5f)
                close()
            }
        }
        .build()
        return _budgetAlt!!
    }

private var _budgetAlt: ImageVector? = null
