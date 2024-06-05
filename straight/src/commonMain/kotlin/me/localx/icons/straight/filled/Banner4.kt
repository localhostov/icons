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

public val Icons.Filled.Banner4: ImageVector
    get() {
        if (_banner4 != null) {
            return _banner4!!
        }
        _banner4 = Builder(name = "Banner4", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.0f, 10.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(8.0f)
                lineTo(6.0f, 18.0f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(4.0f, 8.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                lineTo(0.0f, 6.0f)
                verticalLineToRelative(0.068f)
                lineToRelative(3.111f, 3.932f)
                lineToRelative(-3.111f, 3.932f)
                verticalLineToRelative(0.068f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(20.0f, 14.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-0.068f)
                reflectiveCurveToRelative(-3.111f, -3.932f, -3.111f, -3.932f)
                lineToRelative(3.111f, -3.932f)
                verticalLineToRelative(-0.068f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                reflectiveCurveToRelative(0.0f, 6.0f, 0.0f, 6.0f)
                close()
            }
        }
        .build()
        return _banner4!!
    }

private var _banner4: ImageVector? = null
