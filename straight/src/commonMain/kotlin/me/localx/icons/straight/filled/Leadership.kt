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

public val Icons.Filled.Leadership: ImageVector
    get() {
        if (_leadership != null) {
            return _leadership!!
        }
        _leadership = Builder(name = "Leadership", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(3.5f, 10.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(24.033f, 12.141f)
                verticalLineToRelative(2.267f)
                lineToRelative(-13.825f, 9.593f)
                horizontalLineToRelative(-3.267f)
                lineToRelative(0.058f, -0.04f)
                verticalLineToRelative(-3.96f)
                lineTo(2.987f, 20.001f)
                lineToRelative(-0.033f, 2.531f)
                lineToRelative(-0.463f, 1.469f)
                lineTo(0.393f, 24.001f)
                lineToRelative(0.607f, -1.924f)
                verticalLineToRelative(-8.076f)
                curveToRelative(0.0f, -1.24f, 0.745f, -2.336f, 1.898f, -2.791f)
                lineToRelative(0.175f, -0.052f)
                lineToRelative(4.96f, -1.007f)
                lineToRelative(3.467f, -3.188f)
                lineToRelative(0.004f, 0.004f)
                curveToRelative(0.548f, -0.591f, 1.325f, -0.967f, 2.192f, -0.967f)
                horizontalLineToRelative(5.304f)
                lineTo(19.0f, 0.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(4.0f, 2.5f)
                lineToRelative(-3.0f, 1.875f)
                verticalLineToRelative(3.625f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.633f)
                lineToRelative(5.033f, -3.492f)
                close()
                moveTo(13.0f, 19.797f)
                lineToRelative(4.03f, -2.796f)
                horizontalLineToRelative(-0.03f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(4.796f)
                close()
                moveTo(11.0f, 21.185f)
                verticalLineToRelative(-10.953f)
                lineToRelative(-2.0f, 1.769f)
                lineToRelative(-3.0f, 0.622f)
                verticalLineToRelative(5.378f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.572f)
                lineToRelative(2.0f, -1.388f)
                close()
            }
        }
        .build()
        return _leadership!!
    }

private var _leadership: ImageVector? = null
