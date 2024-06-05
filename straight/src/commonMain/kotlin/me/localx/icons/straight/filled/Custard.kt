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

public val Icons.Filled.Custard: ImageVector
    get() {
        if (_custard != null) {
            return _custard!!
        }
        _custard = Builder(name = "Custard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.778f, 6.0f)
                lineToRelative(0.299f, -1.695f)
                curveToRelative(0.338f, -1.915f, 1.995f, -3.305f, 3.939f, -3.305f)
                horizontalLineToRelative(7.966f)
                curveToRelative(1.944f, 0.0f, 3.601f, 1.39f, 3.938f, 3.305f)
                lineToRelative(0.299f, 1.695f)
                horizontalLineToRelative(-4.221f)
                curveToRelative(-0.768f, 0.0f, -1.469f, 0.29f, -2.0f, 0.766f)
                curveToRelative(-0.531f, -0.476f, -1.232f, -0.766f, -2.0f, -0.766f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.768f, 0.0f, -1.469f, 0.29f, -2.0f, 0.766f)
                curveToRelative(-0.531f, -0.476f, -1.232f, -0.766f, -2.0f, -0.766f)
                horizontalLineToRelative(-3.222f)
                close()
                moveTo(16.0f, 8.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.552f, -0.449f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.552f, -0.449f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.574f)
                lineToRelative(-1.412f, 8.0f)
                horizontalLineToRelative(19.972f)
                lineToRelative(-1.411f, -8.0f)
                horizontalLineToRelative(-4.574f)
                close()
                moveTo(24.0f, 18.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(4.0f, 23.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(0.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(24.0f)
                close()
            }
        }
        .build()
        return _custard!!
    }

private var _custard: ImageVector? = null
