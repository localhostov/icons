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

public val Icons.Bold.Flatbread: ImageVector
    get() {
        if (_flatbread != null) {
            return _flatbread!!
        }
        _flatbread = Builder(name = "Flatbread", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.963f, 0.0f, -9.0f, -4.037f, -9.0f, -9.0f)
                reflectiveCurveTo(7.037f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.038f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.037f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(18.061f, 8.061f)
                lineToRelative(-10.0f, 10.0f)
                lineToRelative(-2.121f, -2.121f)
                lineTo(15.939f, 5.939f)
                lineToRelative(2.121f, 2.121f)
                close()
                moveTo(19.061f, 14.061f)
                lineToRelative(-5.0f, 5.0f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(5.0f, -5.0f)
                lineToRelative(2.121f, 2.121f)
                close()
                moveTo(7.061f, 12.061f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(5.0f, -5.0f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _flatbread!!
    }

private var _flatbread: ImageVector? = null
