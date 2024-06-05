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

public val Icons.Bold.Accident: ImageVector
    get() {
        if (_accident != null) {
            return _accident!!
        }
        _accident = Builder(name = "Accident", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 7.616f)
                lineToRelative(-3.826f, 2.335f)
                lineToRelative(1.438f, 4.245f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                lineToRelative(-5.612f, -1.969f)
                verticalLineToRelative(-6.228f)
                horizontalLineToRelative(-5.047f)
                lineToRelative(-1.204f, -3.557f)
                horizontalLineToRelative(0.0f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(3.836f, 1.392f, 3.836f, 1.392f)
                lineToRelative(1.392f, -3.836f)
                lineToRelative(2.335f, 3.826f)
                lineToRelative(4.245f, -1.438f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                lineToRelative(-1.392f, 3.836f)
                lineToRelative(3.836f, 1.392f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                close()
                moveTo(6.507f, 11.0f)
                curveToRelative(1.381f, -0.004f, 2.497f, -1.126f, 2.493f, -2.507f)
                reflectiveCurveToRelative(-1.126f, -2.497f, -2.507f, -2.493f)
                curveToRelative(-1.381f, 0.004f, -2.497f, 1.126f, -2.493f, 2.507f)
                curveToRelative(0.004f, 1.381f, 1.126f, 2.497f, 2.507f, 2.493f)
                close()
                moveTo(14.689f, 19.747f)
                lineToRelative(1.499f, -1.747f)
                horizontalLineToRelative(3.811f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-5.189f)
                lineToRelative(-3.448f, 4.016f)
                lineToRelative(-1.611f, -3.893f)
                lineToRelative(4.248f, -0.91f)
                verticalLineToRelative(-6.213f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.788f)
                lineToRelative(-5.659f, 1.212f)
                horizontalLineToRelative(-2.341f)
                verticalLineToRelative(-4.0f)
                lineTo(0.0f, 9.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(4.5f)
                lineToRelative(2.436f, 5.847f)
                curveToRelative(0.553f, 1.312f, 1.823f, 2.132f, 3.235f, 2.132f)
                curveToRelative(0.275f, 0.0f, 0.555f, -0.031f, 0.836f, -0.096f)
                lineToRelative(5.214f, -1.447f)
                lineToRelative(4.4f, 1.403f)
                lineToRelative(0.912f, -2.857f)
                lineToRelative(-5.253f, -1.677f)
                lineToRelative(-1.591f, 0.442f)
                close()
            }
        }
        .build()
        return _accident!!
    }

private var _accident: ImageVector? = null
