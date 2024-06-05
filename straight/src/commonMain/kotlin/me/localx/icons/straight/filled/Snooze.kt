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

public val Icons.Filled.Snooze: ImageVector
    get() {
        if (_snooze != null) {
            return _snooze!!
        }
        _snooze = Builder(name = "Snooze", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 24.0f)
                lineTo(1.703f, 24.0f)
                curveToRelative(-0.691f, 0.0f, -1.308f, -0.412f, -1.572f, -1.051f)
                reflectiveCurveToRelative(-0.119f, -1.366f, 0.37f, -1.854f)
                lineToRelative(7.134f, -8.096f)
                lineTo(0.0f, 12.999f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(8.297f)
                curveToRelative(0.691f, 0.0f, 1.308f, 0.413f, 1.572f, 1.051f)
                reflectiveCurveToRelative(0.119f, 1.366f, -0.37f, 1.854f)
                lineToRelative(-7.134f, 8.096f)
                horizontalLineToRelative(7.634f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(24.0f, 22.0f)
                horizontalLineToRelative(-5.553f)
                curveToRelative(-0.587f, 0.0f, -1.111f, -0.351f, -1.336f, -0.893f)
                reflectiveCurveToRelative(-0.102f, -1.161f, 0.313f, -1.576f)
                lineToRelative(3.916f, -4.531f)
                horizontalLineToRelative(-4.34f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.553f)
                curveToRelative(0.587f, 0.0f, 1.111f, 0.351f, 1.336f, 0.893f)
                reflectiveCurveToRelative(0.102f, 1.161f, -0.313f, 1.576f)
                lineToRelative(-3.916f, 4.531f)
                horizontalLineToRelative(4.34f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(19.0f, 10.0f)
                horizontalLineToRelative(-6.489f)
                curveToRelative(-0.613f, 0.0f, -1.161f, -0.366f, -1.395f, -0.932f)
                curveToRelative(-0.235f, -0.566f, -0.106f, -1.212f, 0.327f, -1.646f)
                lineToRelative(4.937f, -5.422f)
                horizontalLineToRelative(-5.38f)
                lineTo(11.0f, 0.0f)
                horizontalLineToRelative(6.489f)
                curveToRelative(0.613f, 0.0f, 1.161f, 0.366f, 1.395f, 0.932f)
                curveToRelative(0.235f, 0.566f, 0.106f, 1.212f, -0.327f, 1.646f)
                lineToRelative(-4.937f, 5.422f)
                horizontalLineToRelative(5.38f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _snooze!!
    }

private var _snooze: ImageVector? = null
