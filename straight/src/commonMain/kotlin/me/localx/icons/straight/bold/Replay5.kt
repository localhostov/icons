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

public val Icons.Bold.Replay5: ImageVector
    get() {
        if (_replay5 != null) {
            return _replay5!!
        }
        _replay5 = Builder(name = "Replay5", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 6.911f)
                lineTo(1.0f, 1.0f)
                lineTo(3.521f, 3.521f)
                curveTo(5.743f, 1.288f, 8.754f, 0.0f, 12.0f, 0.0f)
                curveToRelative(5.579f, 0.0f, 10.26f, 3.834f, 11.596f, 9.0f)
                horizontalLineToRelative(-3.122f)
                curveToRelative(-1.24f, -3.49f, -4.565f, -6.0f, -8.474f, -6.0f)
                curveToRelative(-2.434f, 0.0f, -4.693f, 0.966f, -6.359f, 2.641f)
                lineToRelative(2.359f, 2.359f)
                lineTo(2.091f, 8.0f)
                curveToRelative(-0.602f, 0.0f, -1.09f, -0.487f, -1.091f, -1.089f)
                close()
                moveTo(20.0f, 16.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.449f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(3.0f, 12.0f)
                lineTo(0.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, 5.383f, 12.0f, 12.0f, 12.0f)
                curveToRelative(0.683f, 0.0f, 1.348f, -0.071f, 2.0f, -0.181f)
                verticalLineToRelative(-3.051f)
                curveToRelative(-0.644f, 0.147f, -1.312f, 0.232f, -2.0f, 0.232f)
                curveToRelative(-4.962f, 0.0f, -9.0f, -4.038f, -9.0f, -9.0f)
                close()
            }
        }
        .build()
        return _replay5!!
    }

private var _replay5: ImageVector? = null
