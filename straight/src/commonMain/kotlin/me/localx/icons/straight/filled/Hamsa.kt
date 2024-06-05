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

public val Icons.Filled.Hamsa: ImageVector
    get() {
        if (_hamsa != null) {
            return _hamsa!!
        }
        _hamsa = Builder(name = "Hamsa", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.5f, 17.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 13.237f)
                verticalLineToRelative(1.473f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-2.823f, 0.0f, -2.994f, 2.288f, -3.0f, 2.79f)
                curveToRelative(0.0f, 4.442f, -1.869f, 6.5f, -6.0f, 6.5f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-4.131f, 0.0f, -6.0f, -2.052f, -6.0f, -6.5f)
                curveToRelative(-0.006f, -0.496f, -0.177f, -2.79f, -3.0f, -2.79f)
                lineTo(0.0f, 14.71f)
                verticalLineToRelative(-1.473f)
                curveToRelative(0.602f, -1.205f, 2.103f, -2.684f, 4.0f, -3.237f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                lineTo(10.0f, 2.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(1.897f, 0.553f, 3.398f, 2.033f, 4.0f, 3.237f)
                close()
                moveTo(16.334f, 17.0f)
                curveToRelative(-0.371f, -0.777f, -1.664f, -3.0f, -4.334f, -3.0f)
                reflectiveCurveToRelative(-3.963f, 2.224f, -4.334f, 3.0f)
                curveToRelative(0.369f, 0.775f, 1.662f, 3.0f, 4.334f, 3.0f)
                reflectiveCurveToRelative(3.963f, -2.223f, 4.334f, -3.0f)
                close()
            }
        }
        .build()
        return _hamsa!!
    }

private var _hamsa: ImageVector? = null
