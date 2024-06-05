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

public val Icons.Filled.Build: ImageVector
    get() {
        if (_build != null) {
            return _build!!
        }
        _build = Builder(name = "Build", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 16.0f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(22.0f, 6.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.737f, 0.0f, -1.375f, -0.405f, -1.722f, -1.0f)
                horizontalLineToRelative(-2.278f)
                verticalLineToRelative(4.981f)
                lineTo(1.28f, 8.061f)
                curveToRelative(-0.79f, -0.4f, -1.28f, -1.189f, -1.28f, -2.061f)
                reflectiveCurveToRelative(0.49f, -1.661f, 1.28f, -2.061f)
                lineTo(11.0f, 0.019f)
                verticalLineToRelative(4.981f)
                horizontalLineToRelative(2.278f)
                curveToRelative(0.347f, -0.595f, 0.985f, -1.0f, 1.722f, -1.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                close()
                moveTo(18.0f, 18.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(8.0f, 24.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(6.0f, 18.0f)
                lineTo(0.0f, 18.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _build!!
    }

private var _build: ImageVector? = null
