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

public val Icons.Bold.Meditation: ImageVector
    get() {
        if (_meditation != null) {
            return _meditation!!
        }
        _meditation = Builder(name = "Meditation", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 3.0f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(2.894f, 1.343f, 2.894f, 3.0f)
                reflectiveCurveToRelative(-1.237f, 3.0f, -2.894f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                close()
                moveTo(16.0f, 12.954f)
                lineToRelative(1.422f, 2.133f)
                lineToRelative(4.257f, 2.783f)
                lineToRelative(1.642f, -2.511f)
                lineToRelative(-3.743f, -2.447f)
                lineToRelative(-2.236f, -3.354f)
                curveToRelative(-0.65f, -0.976f, -1.739f, -1.559f, -2.912f, -1.559f)
                horizontalLineToRelative(-4.859f)
                curveToRelative(-1.173f, 0.0f, -2.262f, 0.583f, -2.912f, 1.559f)
                lineToRelative(-2.236f, 3.354f)
                lineTo(0.679f, 15.36f)
                lineToRelative(1.642f, 2.511f)
                lineToRelative(4.257f, -2.783f)
                lineToRelative(1.422f, -2.133f)
                verticalLineToRelative(4.734f)
                lineToRelative(-5.321f, 3.479f)
                lineToRelative(-0.679f, 0.521f)
                verticalLineToRelative(2.312f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.727f)
                lineToRelative(3.0f, -1.961f)
                lineTo(11.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.312f)
                lineToRelative(2.583f, 1.688f)
                horizontalLineToRelative(-5.583f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(10.5f)
                lineToRelative(1.5f, -0.077f)
                verticalLineToRelative(-2.312f)
                lineToRelative(-6.0f, -3.923f)
                verticalLineToRelative(-4.734f)
                close()
            }
        }
        .build()
        return _meditation!!
    }

private var _meditation: ImageVector? = null
