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

public val Icons.Bold.GovernmentFlag: ImageVector
    get() {
        if (_governmentFlag != null) {
            return _governmentFlag!!
        }
        _governmentFlag = Builder(name = "GovernmentFlag", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 15.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.182f, -0.645f, -2.268f, -1.683f, -2.833f)
                lineToRelative(-7.771f, -4.239f)
                curveToRelative(-0.015f, -0.008f, -0.031f, -0.016f, -0.046f, -0.024f)
                verticalLineToRelative(-1.404f)
                lineToRelative(3.0f, -2.0f)
                lineTo(10.5f, 0.0f)
                verticalLineToRelative(5.904f)
                curveToRelative(-0.015f, 0.008f, -0.03f, 0.016f, -0.045f, 0.024f)
                lineToRelative(-7.772f, 4.238f)
                curveToRelative(-1.038f, 0.566f, -1.682f, 1.652f, -1.682f, 2.834f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                lineTo(1.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(22.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(11.891f, 8.561f)
                curveToRelative(0.068f, -0.037f, 0.149f, -0.037f, 0.218f, 0.0f)
                lineToRelative(6.305f, 3.439f)
                lineTo(5.586f, 12.0f)
                lineToRelative(6.305f, -3.439f)
                close()
                moveTo(13.0f, 15.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(6.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(18.0f, 21.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _governmentFlag!!
    }

private var _governmentFlag: ImageVector? = null
