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

public val Icons.Filled.Tubes: ImageVector
    get() {
        if (_tubes != null) {
            return _tubes!!
        }
        _tubes = Builder(name = "Tubes", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 11.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(2.0f, 9.0f)
                horizontalLineToRelative(8.0f)
                lineTo(10.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(11.0f, 0.0f)
                lineTo(1.0f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(13.0f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(8.0f)
                lineTo(22.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(23.0f, 0.0f)
                horizontalLineToRelative(-10.0f)
                close()
                moveTo(14.0f, 11.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-8.0f)
                close()
            }
        }
        .build()
        return _tubes!!
    }

private var _tubes: ImageVector? = null
