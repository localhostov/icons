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

public val Icons.Bold.EarthAfrica: ImageVector
    get() {
        if (_earthAfrica != null) {
            return _earthAfrica!!
        }
        _earthAfrica = Builder(name = "EarthAfrica", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                curveToRelative(-4.963f, 0.0f, -9.0f, -4.038f, -9.0f, -9.0f)
                curveToRelative(0.0f, -3.224f, 1.705f, -6.058f, 4.26f, -7.647f)
                lineToRelative(0.74f, 0.647f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(2.5f, -1.5f)
                lineToRelative(1.5f, 1.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(-3.0f, 2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(1.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(3.0f, -5.0f)
                verticalLineToRelative(-2.5f)
                lineToRelative(-1.5f, -1.5f)
                horizontalLineToRelative(2.257f)
                curveToRelative(0.796f, 0.0f, 1.559f, -0.316f, 2.121f, -0.879f)
                lineToRelative(0.473f, -0.473f)
                curveToRelative(0.418f, 1.037f, 0.648f, 2.168f, 0.648f, 3.352f)
                curveToRelative(0.0f, 4.962f, -4.037f, 9.0f, -9.0f, 9.0f)
                close()
            }
        }
        .build()
        return _earthAfrica!!
    }

private var _earthAfrica: ImageVector? = null
