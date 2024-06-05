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

public val Icons.Bold.It: ImageVector
    get() {
        if (_it != null) {
            return _it!!
        }
        _it = Builder(name = "It", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.5f, 19.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                lineTo(6.5f, 24.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                lineTo(0.0f, 19.0f)
                lineTo(0.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(18.0f)
                lineTo(21.0f, 5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(-10.5f)
                close()
                moveTo(6.052f, 7.695f)
                lineToRelative(1.523f, -0.877f)
                curveToRelative(-0.049f, -0.265f, -0.075f, -0.539f, -0.075f, -0.818f)
                reflectiveCurveToRelative(0.026f, -0.553f, 0.075f, -0.818f)
                lineToRelative(-1.523f, -0.877f)
                lineToRelative(1.498f, -2.6f)
                lineToRelative(1.525f, 0.878f)
                curveToRelative(0.416f, -0.357f, 0.898f, -0.639f, 1.425f, -0.826f)
                lineTo(10.5f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.757f)
                curveToRelative(0.527f, 0.187f, 1.009f, 0.469f, 1.425f, 0.826f)
                lineToRelative(1.525f, -0.878f)
                lineToRelative(1.498f, 2.6f)
                lineToRelative(-1.523f, 0.877f)
                curveToRelative(0.049f, 0.265f, 0.075f, 0.539f, 0.075f, 0.818f)
                reflectiveCurveToRelative(-0.026f, 0.553f, -0.075f, 0.818f)
                lineToRelative(1.523f, 0.877f)
                lineToRelative(-1.498f, 2.6f)
                lineToRelative(-1.525f, -0.878f)
                curveToRelative(-0.416f, 0.357f, -0.898f, 0.639f, -1.425f, 0.826f)
                verticalLineToRelative(1.757f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.757f)
                curveToRelative(-0.527f, -0.187f, -1.009f, -0.469f, -1.425f, -0.826f)
                lineToRelative(-1.525f, 0.878f)
                lineToRelative(-1.498f, -2.6f)
                close()
                moveTo(10.5f, 6.0f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.673f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.673f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.673f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _it!!
    }

private var _it: ImageVector? = null
