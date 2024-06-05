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

public val Icons.Filled.PlateUtensils: ImageVector
    get() {
        if (_plateUtensils != null) {
            return _plateUtensils!!
        }
        _plateUtensils = Builder(name = "PlateUtensils", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 0.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(14.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.551f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                lineTo(18.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, -0.449f, 1.0f, -1.0f)
                lineTo(22.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(12.0f, 9.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                curveToRelative(1.538f, 0.0f, 2.937f, -0.586f, 4.0f, -1.54f)
                verticalLineToRelative(-2.561f)
                curveToRelative(-2.279f, -0.465f, -4.0f, -2.484f, -4.0f, -4.899f)
                close()
                moveTo(4.0f, 12.0f)
                curveToRelative(0.0f, -4.411f, 3.589f, -8.0f, 8.0f, -8.0f)
                lineTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                curveToRelative(1.405f, 0.0f, 2.747f, -0.254f, 4.0f, -0.697f)
                verticalLineToRelative(-4.385f)
                curveToRelative(-1.178f, 0.684f, -2.542f, 1.082f, -4.0f, 1.082f)
                curveToRelative(-4.411f, 0.0f, -8.0f, -3.589f, -8.0f, -8.0f)
                close()
            }
        }
        .build()
        return _plateUtensils!!
    }

private var _plateUtensils: ImageVector? = null
