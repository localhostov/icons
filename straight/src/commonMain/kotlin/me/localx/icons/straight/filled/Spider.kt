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

public val Icons.Filled.Spider: ImageVector
    get() {
        if (_spider != null) {
            return _spider!!
        }
        _spider = Builder(name = "Spider", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.423f)
                lineToRelative(-7.978f, -3.497f)
                lineToRelative(5.978f, -2.79f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.863f)
                lineToRelative(-5.319f, 2.482f)
                curveToRelative(0.203f, -0.405f, 0.319f, -0.861f, 0.319f, -1.345f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.343f, -3.0f, 3.0f)
                curveToRelative(0.0f, 0.484f, 0.115f, 0.94f, 0.319f, 1.345f)
                lineToRelative(-5.319f, -2.482f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.137f)
                lineToRelative(5.978f, 2.79f)
                lineTo(0.0f, 12.423f)
                verticalLineToRelative(2.231f)
                lineToRelative(5.159f, -2.365f)
                lineTo(0.0f, 19.167f)
                verticalLineToRelative(4.833f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.167f)
                lineToRelative(4.313f, -5.751f)
                curveToRelative(-0.203f, 0.602f, -0.313f, 1.247f, -0.313f, 1.918f)
                curveToRelative(0.0f, 3.314f, 2.686f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.686f, 6.0f, -6.0f)
                curveToRelative(0.0f, -0.671f, -0.11f, -1.315f, -0.313f, -1.918f)
                lineToRelative(4.313f, 5.751f)
                verticalLineToRelative(4.167f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.833f)
                lineToRelative(-5.159f, -6.878f)
                lineToRelative(5.159f, 2.365f)
                verticalLineToRelative(-2.231f)
                close()
            }
        }
        .build()
        return _spider!!
    }

private var _spider: ImageVector? = null
