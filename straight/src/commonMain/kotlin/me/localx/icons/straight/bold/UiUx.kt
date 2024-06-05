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

public val Icons.Bold.UiUx: ImageVector
    get() {
        if (_uiUx != null) {
            return _uiUx!!
        }
        _uiUx = Builder(name = "UiUx", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 10.5f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 13.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(8.5f, 9.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(12.0f, 0.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(5.333f)
                curveToRelative(0.0f, 0.643f, -0.357f, 1.167f, -1.0f, 1.167f)
                reflectiveCurveToRelative(-1.0f, -0.523f, -1.0f, -1.167f)
                lineTo(7.5f, 0.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                close()
                moveTo(10.5f, 20.333f)
                curveToRelative(0.0f, 0.643f, -0.357f, 1.167f, -1.0f, 1.167f)
                reflectiveCurveToRelative(-1.0f, -0.523f, -1.0f, -1.167f)
                verticalLineToRelative(-5.333f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(5.333f)
                close()
                moveTo(15.0f, 24.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(15.453f, 9.0f)
                lineToRelative(0.806f, -1.595f)
                lineToRelative(0.806f, 1.595f)
                horizontalLineToRelative(2.935f)
                lineToRelative(-2.274f, -4.5f)
                lineToRelative(0.006f, -0.012f)
                lineToRelative(2.268f, -4.488f)
                horizontalLineToRelative(-2.935f)
                lineToRelative(-0.8f, 1.583f)
                lineToRelative(-0.006f, 0.012f)
                lineToRelative(-0.006f, -0.012f)
                lineToRelative(-0.8f, -1.583f)
                horizontalLineToRelative(-2.935f)
                lineToRelative(2.268f, 4.488f)
                lineToRelative(0.006f, 0.012f)
                lineToRelative(-2.274f, 4.5f)
                horizontalLineToRelative(2.935f)
                close()
            }
        }
        .build()
        return _uiUx!!
    }

private var _uiUx: ImageVector? = null
