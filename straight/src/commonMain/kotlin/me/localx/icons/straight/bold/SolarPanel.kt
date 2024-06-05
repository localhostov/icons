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

public val Icons.Bold.SolarPanel: ImageVector
    get() {
        if (_solarPanel != null) {
            return _solarPanel!!
        }
        _solarPanel = Builder(name = "SolarPanel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.5f, 17.0f)
                horizontalLineToRelative(10.492f)
                lineToRelative(-1.781f, -13.944f)
                curveToRelative(-0.222f, -1.742f, -1.715f, -3.056f, -3.472f, -3.056f)
                lineTo(5.261f, -0.0f)
                curveToRelative(-1.757f, 0.0f, -3.25f, 1.313f, -3.472f, 3.056f)
                lineTo(0.008f, 17.0f)
                horizontalLineToRelative(10.492f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(13.803f, 10.0f)
                lineToRelative(0.143f, 4.0f)
                horizontalLineToRelative(-3.891f)
                lineToRelative(0.143f, -4.0f)
                horizontalLineToRelative(3.605f)
                close()
                moveTo(10.305f, 7.0f)
                lineToRelative(0.143f, -4.0f)
                horizontalLineToRelative(3.105f)
                lineToRelative(0.143f, 4.0f)
                horizontalLineToRelative(-3.391f)
                close()
                moveTo(16.948f, 14.0f)
                lineToRelative(-0.143f, -4.0f)
                horizontalLineToRelative(3.269f)
                lineToRelative(0.511f, 4.0f)
                horizontalLineToRelative(-3.638f)
                close()
                moveTo(19.236f, 3.437f)
                lineToRelative(0.455f, 3.563f)
                horizontalLineToRelative(-2.993f)
                lineToRelative(-0.143f, -4.0f)
                horizontalLineToRelative(2.185f)
                curveToRelative(0.251f, 0.0f, 0.464f, 0.188f, 0.496f, 0.437f)
                close()
                moveTo(5.261f, 3.0f)
                horizontalLineToRelative(2.185f)
                lineToRelative(-0.143f, 4.0f)
                horizontalLineToRelative(-2.993f)
                lineToRelative(0.455f, -3.563f)
                curveToRelative(0.032f, -0.249f, 0.245f, -0.437f, 0.496f, -0.437f)
                close()
                moveTo(3.926f, 10.0f)
                horizontalLineToRelative(3.269f)
                lineToRelative(-0.143f, 4.0f)
                horizontalLineToRelative(-3.638f)
                lineToRelative(0.511f, -4.0f)
                close()
            }
        }
        .build()
        return _solarPanel!!
    }

private var _solarPanel: ImageVector? = null
