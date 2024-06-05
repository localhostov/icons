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

public val Icons.Outline.EarthAfrica: ImageVector
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
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                curveToRelative(0.0f, -3.474f, 1.781f, -6.539f, 4.477f, -8.332f)
                lineToRelative(1.523f, 1.332f)
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
                lineToRelative(1.235f, -1.235f)
                curveToRelative(0.569f, 1.255f, 0.886f, 2.648f, 0.886f, 4.114f)
                curveToRelative(0.0f, 5.514f, -4.486f, 10.0f, -10.0f, 10.0f)
                close()
            }
        }
        .build()
        return _earthAfrica!!
    }

private var _earthAfrica: ImageVector? = null
