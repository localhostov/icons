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

public val Icons.Filled.Talent: ImageVector
    get() {
        if (_talent != null) {
            return _talent!!
        }
        _talent = Builder(name = "Talent", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 11.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(16.0f, 18.438f)
                verticalLineToRelative(5.562f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-5.562f)
                lineTo(1.822f, 12.735f)
                lineToRelative(1.356f, -1.47f)
                lineToRelative(6.213f, 5.735f)
                horizontalLineToRelative(5.218f)
                lineToRelative(6.213f, -5.735f)
                lineToRelative(1.356f, 1.47f)
                lineToRelative(-6.178f, 5.703f)
                close()
                moveTo(8.682f, 9.705f)
                lineToRelative(0.601f, 0.453f)
                lineToRelative(2.729f, -2.11f)
                lineToRelative(2.717f, 2.101f)
                lineToRelative(0.625f, -0.436f)
                lineToRelative(-1.105f, -3.357f)
                lineToRelative(2.75f, -1.591f)
                verticalLineToRelative(-0.764f)
                horizontalLineToRelative(-3.605f)
                lineToRelative(-0.98f, -3.75f)
                horizontalLineToRelative(-0.809f)
                lineToRelative(-0.981f, 3.75f)
                horizontalLineToRelative(-3.625f)
                verticalLineToRelative(0.769f)
                lineToRelative(2.769f, 1.54f)
                lineToRelative(-1.086f, 3.396f)
                close()
            }
        }
        .build()
        return _talent!!
    }

private var _talent: ImageVector? = null
