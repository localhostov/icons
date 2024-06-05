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

public val Icons.Filled.GovernmentBudget: ImageVector
    get() {
        if (_governmentBudget != null) {
            return _governmentBudget!!
        }
        _governmentBudget = Builder(name = "GovernmentBudget", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 22.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.512f)
                curveToRelative(0.0f, -1.952f, 0.777f, -3.854f, 2.0f, -5.365f)
                verticalLineToRelative(-1.147f)
                horizontalLineToRelative(1.893f)
                curveToRelative(-0.315f, -0.61f, -0.525f, -1.281f, -0.525f, -2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(7.765f)
                curveToRelative(-0.178f, -0.178f, -0.373f, -0.341f, -0.602f, -0.466f)
                lineToRelative(-8.183f, -4.464f)
                curveToRelative(-0.069f, -0.038f, -0.147f, -0.054f, -0.219f, -0.086f)
                verticalLineToRelative(-0.958f)
                lineToRelative(3.0f, -1.944f)
                lineTo(10.129f, 0.0f)
                verticalLineToRelative(4.884f)
                curveToRelative(-0.163f, 0.053f, -0.327f, 0.105f, -0.479f, 0.188f)
                lineTo(1.469f, 9.534f)
                curveToRelative(-0.906f, 0.493f, -1.469f, 1.441f, -1.469f, 2.474f)
                verticalLineToRelative(1.992f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                lineTo(0.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(11.257f)
                curveToRelative(-0.477f, -0.577f, -0.82f, -1.261f, -1.03f, -2.0f)
                horizontalLineToRelative(-2.227f)
                close()
                moveTo(4.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(24.0f, 21.014f)
                curveToRelative(0.0f, 1.649f, -1.343f, 2.986f, -3.0f, 2.986f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.337f, -3.0f, -2.986f)
                curveToRelative(0.0f, -2.871f, 2.273f, -5.752f, 4.84f, -6.452f)
                curveToRelative(-0.706f, -0.667f, -1.472f, -1.608f, -1.472f, -2.562f)
                horizontalLineToRelative(5.263f)
                curveToRelative(0.0f, 0.954f, -0.766f, 1.896f, -1.472f, 2.562f)
                curveToRelative(2.567f, 0.699f, 4.84f, 3.581f, 4.84f, 6.452f)
                close()
            }
        }
        .build()
        return _governmentBudget!!
    }

private var _governmentBudget: ImageVector? = null
