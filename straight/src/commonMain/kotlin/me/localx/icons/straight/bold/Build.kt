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

public val Icons.Bold.Build: ImageVector
    get() {
        if (_build != null) {
            return _build!!
        }
        _build = Builder(name = "Build", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 11.0f)
                verticalLineToRelative(5.0f)
                lineTo(0.0f, 16.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-13.0f)
                horizontalLineToRelative(-11.0f)
                close()
                moveTo(10.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(21.0f, 16.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(1.514f, 8.993f)
                lineToRelative(9.486f, 4.089f)
                verticalLineToRelative(-5.082f)
                horizontalLineToRelative(2.501f)
                curveToRelative(0.456f, 0.607f, 1.182f, 1.0f, 1.999f, 1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.121f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.816f, 0.0f, -1.542f, 0.393f, -1.999f, 1.0f)
                horizontalLineToRelative(-2.501f)
                lineTo(11.0f, 0.018f)
                lineTo(1.514f, 4.107f)
                curveToRelative(-0.934f, 0.473f, -1.514f, 1.409f, -1.514f, 2.442f)
                reflectiveCurveToRelative(0.58f, 1.97f, 1.514f, 2.443f)
                close()
                moveTo(8.0f, 4.577f)
                verticalLineToRelative(3.946f)
                lineToRelative(-4.581f, -1.973f)
                lineToRelative(4.581f, -1.973f)
                close()
            }
        }
        .build()
        return _build!!
    }

private var _build: ImageVector? = null
