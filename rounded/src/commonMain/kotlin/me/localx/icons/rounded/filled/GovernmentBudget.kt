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
                moveToRelative(12.0f, 14.0f)
                horizontalLineToRelative(1.876f)
                curveToRelative(-0.314f, -0.799f, -0.429f, -1.766f, 0.009f, -2.529f)
                curveToRelative(0.52f, -0.907f, 1.489f, -1.471f, 2.531f, -1.471f)
                horizontalLineToRelative(4.818f)
                curveToRelative(-0.132f, -0.119f, -0.273f, -0.231f, -0.433f, -0.318f)
                lineToRelative(-8.452f, -4.61f)
                curveToRelative(-0.111f, -0.06f, -0.232f, -0.092f, -0.35f, -0.137f)
                verticalLineToRelative(-0.737f)
                lineToRelative(2.504f, -1.688f)
                curveToRelative(0.427f, -0.288f, 0.363f, -0.935f, -0.113f, -1.133f)
                lineTo(11.262f, 0.071f)
                curveToRelative(-0.6f, -0.25f, -1.262f, 0.191f, -1.262f, 0.841f)
                verticalLineToRelative(4.022f)
                curveToRelative(-0.117f, 0.045f, -0.239f, 0.077f, -0.35f, 0.137f)
                lineTo(1.199f, 9.682f)
                curveToRelative(-0.739f, 0.403f, -1.199f, 1.177f, -1.199f, 2.019f)
                curveToRelative(0.0f, 1.166f, 0.875f, 2.121f, 2.0f, 2.269f)
                verticalLineToRelative(8.03f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(6.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(24.0f, 21.014f)
                curveToRelative(0.0f, 1.649f, -1.343f, 2.986f, -3.0f, 2.986f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.337f, -3.0f, -2.986f)
                curveToRelative(0.0f, -2.806f, 2.174f, -5.608f, 4.67f, -6.387f)
                curveToRelative(-0.382f, -0.372f, -0.771f, -0.814f, -1.052f, -1.294f)
                curveToRelative(-0.346f, -0.59f, 0.115f, -1.333f, 0.799f, -1.333f)
                horizontalLineToRelative(3.167f)
                curveToRelative(0.684f, 0.0f, 1.144f, 0.743f, 0.799f, 1.333f)
                curveToRelative(-0.281f, 0.48f, -0.67f, 0.922f, -1.052f, 1.294f)
                curveToRelative(2.495f, 0.779f, 4.67f, 3.581f, 4.67f, 6.387f)
                close()
            }
        }
        .build()
        return _governmentBudget!!
    }

private var _governmentBudget: ImageVector? = null
