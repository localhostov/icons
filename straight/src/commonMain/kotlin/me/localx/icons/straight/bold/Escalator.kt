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

public val Icons.Bold.Escalator: ImageVector
    get() {
        if (_escalator != null) {
            return _escalator!!
        }
        _escalator = Builder(name = "Escalator", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(24.0f, 5.0f)
                verticalLineToRelative(9.001f)
                horizontalLineToRelative(-3.957f)
                reflectiveCurveToRelative(-10.471f, 8.724f, -10.471f, 8.724f)
                curveToRelative(-0.986f, 0.822f, -2.236f, 1.275f, -3.521f, 1.275f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(3.957f)
                lineToRelative(1.043f, -0.869f)
                verticalLineToRelative(-6.131f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                verticalLineToRelative(0.298f)
                lineToRelative(2.428f, -2.023f)
                curveToRelative(0.986f, -0.822f, 2.236f, -1.275f, 3.521f, -1.275f)
                horizontalLineToRelative(6.052f)
                close()
                moveTo(21.0f, 8.0f)
                horizontalLineToRelative(-3.052f)
                curveToRelative(-0.584f, 0.0f, -1.151f, 0.206f, -1.601f, 0.58f)
                lineToRelative(-11.305f, 9.42f)
                horizontalLineToRelative(-2.043f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.052f)
                curveToRelative(0.584f, 0.0f, 1.151f, -0.206f, 1.601f, -0.58f)
                lineToRelative(11.305f, -9.42f)
                horizontalLineToRelative(2.043f)
                reflectiveCurveToRelative(0.0f, -3.0f, 0.0f, -3.0f)
                close()
            }
        }
        .build()
        return _escalator!!
    }

private var _escalator: ImageVector? = null
