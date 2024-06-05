package me.localx.icons.straight.outline

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

public val Icons.Outline.NotFoundAlt: ImageVector
    get() {
        if (_notFoundAlt != null) {
            return _notFoundAlt!!
        }
        _notFoundAlt = Builder(name = "NotFoundAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.973f, 22.559f)
                lineToRelative(-6.229f, -6.229f)
                curveToRelative(1.412f, -1.725f, 2.262f, -3.927f, 2.262f, -6.324f)
                curveTo(20.006f, 4.492f, 15.52f, 0.006f, 10.006f, 0.006f)
                reflectiveCurveTo(0.006f, 4.492f, 0.006f, 10.006f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                curveToRelative(2.398f, 0.0f, 4.6f, -0.85f, 6.324f, -2.262f)
                lineToRelative(6.229f, 6.229f)
                lineToRelative(1.414f, -1.414f)
                close()
                moveTo(10.006f, 18.006f)
                curveToRelative(-4.411f, 0.0f, -8.0f, -3.589f, -8.0f, -8.0f)
                reflectiveCurveTo(5.595f, 2.006f, 10.006f, 2.006f)
                reflectiveCurveToRelative(8.0f, 3.589f, 8.0f, 8.0f)
                reflectiveCurveToRelative(-3.589f, 8.0f, -8.0f, 8.0f)
                close()
                moveTo(13.957f, 7.457f)
                lineToRelative(-2.543f, 2.543f)
                lineToRelative(2.543f, 2.543f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.543f, -2.543f)
                lineToRelative(-2.543f, 2.543f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.543f, -2.543f)
                lineToRelative(-2.543f, -2.543f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.543f, 2.543f)
                lineToRelative(2.543f, -2.543f)
                lineToRelative(1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _notFoundAlt!!
    }

private var _notFoundAlt: ImageVector? = null
