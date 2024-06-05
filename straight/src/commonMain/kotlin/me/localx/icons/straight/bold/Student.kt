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

public val Icons.Bold.Student: ImageVector
    get() {
        if (_student != null) {
            return _student!!
        }
        _student = Builder(name = "Student", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 22.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.378f, -1.122f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -3.033f, 2.467f, -5.5f, 5.5f, -5.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, 2.467f, 5.5f, 5.5f)
                close()
                moveTo(22.0f, 4.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-6.022f)
                lineToRelative(-1.0f, 0.5f)
                verticalLineToRelative(2.506f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                verticalLineToRelative(-2.506f)
                lineToRelative(-3.957f, -1.978f)
                lineTo(10.235f, 0.405f)
                curveToRelative(1.072f, -0.534f, 2.456f, -0.535f, 3.527f, -0.001f)
                lineToRelative(8.238f, 4.097f)
                close()
                moveTo(8.752f, 4.5f)
                lineToRelative(2.825f, 1.412f)
                curveToRelative(0.233f, 0.117f, 0.612f, 0.117f, 0.845f, 0.0f)
                lineToRelative(2.825f, -1.412f)
                lineToRelative(-2.825f, -1.412f)
                curveToRelative(-0.231f, -0.116f, -0.613f, -0.115f, -0.847f, 0.0f)
                lineToRelative(-2.824f, 1.412f)
                close()
                moveTo(15.0f, 7.978f)
                lineToRelative(-1.236f, 0.618f)
                curveToRelative(-0.535f, 0.268f, -1.15f, 0.402f, -1.764f, 0.402f)
                reflectiveCurveToRelative(-1.229f, -0.134f, -1.765f, -0.402f)
                lineToRelative(-1.235f, -0.618f)
                verticalLineToRelative(1.006f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-1.007f)
                close()
            }
        }
        .build()
        return _student!!
    }

private var _student: ImageVector? = null
