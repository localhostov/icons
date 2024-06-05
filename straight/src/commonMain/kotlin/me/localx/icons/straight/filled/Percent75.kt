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

public val Icons.Filled.Percent75: ImageVector
    get() {
        if (_percent75 != null) {
            return _percent75!!
        }
        _percent75 = Builder(name = "Percent75", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(16.25f, 7.981f)
                curveToRelative(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f)
                reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
                reflectiveCurveToRelative(-1.25f, -0.56f, -1.25f, -1.25f)
                reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
                close()
                moveTo(8.0f, 9.163f)
                lineToRelative(-3.385f, 6.857f)
                lineToRelative(-1.432f, -0.715f)
                lineToRelative(2.81f, -5.705f)
                horizontalLineToRelative(-2.994f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.163f)
                close()
                moveTo(11.5f, 16.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.496f, 0.0f, 0.9f, -0.404f, 0.9f, -0.9f)
                reflectiveCurveToRelative(-0.404f, -0.9f, -0.9f, -0.9f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-4.6f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-2.9f)
                verticalLineToRelative(1.4f)
                horizontalLineToRelative(0.9f)
                curveToRelative(1.381f, 0.0f, 2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(14.867f, 15.981f)
                lineToRelative(5.222f, -8.0f)
                horizontalLineToRelative(1.911f)
                lineToRelative(-5.222f, 8.0f)
                horizontalLineToRelative(-1.911f)
                close()
                moveTo(20.75f, 15.981f)
                curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f)
                reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
                reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
                reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
                close()
            }
        }
        .build()
        return _percent75!!
    }

private var _percent75: ImageVector? = null
