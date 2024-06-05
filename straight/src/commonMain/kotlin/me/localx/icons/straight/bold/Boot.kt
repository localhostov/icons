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

public val Icons.Bold.Boot: ImageVector
    get() {
        if (_boot != null) {
            return _boot!!
        }
        _boot = Builder(name = "Boot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.655f, 9.87f)
                lineToRelative(-3.653f, -1.137f)
                verticalLineToRelative(-2.733f)
                reflectiveCurveToRelative(0.998f, 0.0f, 0.998f, 0.0f)
                lineTo(16.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.995f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.005f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-7.528f)
                curveToRelative(0.0f, -3.179f, -2.243f, -5.942f, -5.345f, -6.602f)
                close()
                moveTo(4.0f, 19.0f)
                lineTo(4.0f, 6.0f)
                horizontalLineToRelative(8.001f)
                verticalLineToRelative(2.0f)
                reflectiveCurveToRelative(-3.001f, 0.0f, -3.001f, 0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.192f)
                lineToRelative(5.794f, 1.795f)
                curveToRelative(1.747f, 0.35f, 3.015f, 1.896f, 3.015f, 3.677f)
                verticalLineToRelative(2.528f)
                lineTo(4.0f, 19.0f)
                close()
            }
        }
        .build()
        return _boot!!
    }

private var _boot: ImageVector? = null
