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

public val Icons.Filled.Scarecrow: ImageVector
    get() {
        if (_scarecrow != null) {
            return _scarecrow!!
        }
        _scarecrow = Builder(name = "Scarecrow", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 10.0f)
                lineTo(0.0f, 10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(8.0f, 6.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.209f, -1.791f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.791f, -4.0f, -4.0f)
                close()
                moveTo(18.0f, 2.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.014f)
                curveToRelative(0.075f, -1.114f, 0.995f, -2.0f, 2.128f, -2.0f)
                horizontalLineToRelative(3.715f)
                curveToRelative(1.133f, 0.0f, 2.053f, 0.886f, 2.128f, 2.0f)
                horizontalLineToRelative(2.014f)
                close()
            }
        }
        .build()
        return _scarecrow!!
    }

private var _scarecrow: ImageVector? = null
