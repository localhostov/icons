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

public val Icons.Outline.Custard: ImageVector
    get() {
        if (_custard != null) {
            return _custard!!
        }
        _custard = Builder(name = "Custard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 17.0f)
                horizontalLineToRelative(-1.838f)
                lineToRelative(-2.24f, -12.695f)
                curveToRelative(-0.338f, -1.915f, -1.994f, -3.305f, -3.938f, -3.305f)
                horizontalLineToRelative(-7.966f)
                curveToRelative(-1.945f, 0.0f, -3.602f, 1.39f, -3.939f, 3.305f)
                lineToRelative(-2.24f, 12.695f)
                lineTo(0.0f, 17.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(8.017f, 3.0f)
                horizontalLineToRelative(7.966f)
                curveToRelative(0.973f, 0.0f, 1.801f, 0.695f, 1.97f, 1.652f)
                lineToRelative(0.238f, 1.348f)
                horizontalLineToRelative(-2.191f)
                curveToRelative(-0.768f, 0.0f, -1.469f, 0.29f, -2.0f, 0.766f)
                curveToRelative(-0.531f, -0.476f, -1.232f, -0.766f, -2.0f, -0.766f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.768f, 0.0f, -1.469f, 0.29f, -2.0f, 0.766f)
                curveToRelative(-0.531f, -0.476f, -1.232f, -0.766f, -2.0f, -0.766f)
                horizontalLineToRelative(-1.19f)
                lineToRelative(0.238f, -1.348f)
                curveToRelative(0.169f, -0.957f, 0.997f, -1.652f, 1.97f, -1.652f)
                close()
                moveTo(5.457f, 8.0f)
                horizontalLineToRelative(1.543f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.544f)
                lineToRelative(1.588f, 9.0f)
                lineTo(3.868f, 17.0f)
                lineToRelative(1.588f, -9.0f)
                close()
                moveTo(21.0f, 20.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(4.0f, 21.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _custard!!
    }

private var _custard: ImageVector? = null
