package me.localx.icons.rounded.bold

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
                moveToRelative(8.094f, 13.381f)
                curveToRelative(0.289f, -0.306f, 0.566f, -0.649f, 0.783f, -1.013f)
                curveToRelative(0.359f, -0.603f, -0.116f, -1.368f, -0.818f, -1.368f)
                horizontalLineToRelative(-3.118f)
                curveToRelative(-0.702f, 0.0f, -1.178f, 0.765f, -0.818f, 1.368f)
                curveToRelative(0.217f, 0.364f, 0.495f, 0.707f, 0.783f, 1.013f)
                curveToRelative(-2.686f, 0.837f, -4.906f, 3.666f, -4.906f, 6.631f)
                curveToRelative(0.0f, 2.199f, 1.794f, 3.988f, 4.0f, 3.988f)
                horizontalLineToRelative(5.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.789f, 4.0f, -3.988f)
                curveToRelative(0.0f, -2.965f, -2.22f, -5.793f, -4.906f, -6.631f)
                close()
                moveTo(9.0f, 21.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.443f, -1.0f, -0.988f)
                curveToRelative(0.0f, -1.886f, 1.799f, -3.88f, 3.5f, -3.88f)
                reflectiveCurveToRelative(3.5f, 1.995f, 3.5f, 3.88f)
                curveToRelative(0.0f, 0.545f, -0.449f, 0.988f, -1.0f, 0.988f)
                close()
                moveTo(24.0f, 3.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 3.033f, -2.467f, 5.5f, -5.5f, 5.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                lineTo(18.0f, 6.0f)
                horizontalLineToRelative(-8.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.551f, -0.449f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-3.5f)
                curveTo(3.0f, 1.794f, 4.794f, 0.0f, 7.0f, 0.0f)
                horizontalLineToRelative(13.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
            }
        }
        .build()
        return _budgetAlt!!
    }

private var _budgetAlt: ImageVector? = null
