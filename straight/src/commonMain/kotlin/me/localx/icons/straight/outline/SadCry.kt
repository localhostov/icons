package me.localx.icons.straight.outline

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

public val Icons.Outline.SadCry: ImageVector
    get() {
        if (_sadCry != null) {
            return _sadCry!!
        }
        _sadCry = Builder(name = "SadCry", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 11.0f)
                curveToRelative(0.0f, -1.054f, -0.679f, -2.0f, -1.0f, -2.0f)
                reflectiveCurveToRelative(-1.0f, 0.946f, -1.0f, 2.0f)
                lineTo(5.0f, 11.0f)
                curveTo(5.0f, 9.108f, 6.232f, 7.0f, 8.0f, 7.0f)
                reflectiveCurveToRelative(3.0f, 2.108f, 3.0f, 4.0f)
                close()
                moveTo(16.0f, 7.0f)
                curveToRelative(-1.768f, 0.0f, -3.0f, 2.108f, -3.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.054f, 0.679f, -2.0f, 1.0f, -2.0f)
                reflectiveCurveToRelative(1.0f, 0.946f, 1.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                curveTo(19.0f, 9.108f, 17.768f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -1.343f, 2.0f, -3.0f)
                reflectiveCurveToRelative(-0.895f, -3.0f, -2.0f, -3.0f)
                reflectiveCurveToRelative(-2.0f, 1.343f, -2.0f, 3.0f)
                reflectiveCurveTo(10.9f, 19.0f, 12.0f, 19.0f)
                close()
                moveTo(17.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                lineTo(19.0f, 13.0f)
                lineTo(17.0f, 13.0f)
                close()
                moveTo(5.0f, 24.0f)
                lineTo(7.0f, 24.0f)
                lineTo(7.0f, 13.0f)
                lineTo(5.0f, 13.0f)
                close()
                moveTo(21.0f, 19.911f)
                arcTo(11.993f, 11.993f, 0.0f, true, false, 0.0f, 12.0f)
                arcToRelative(11.938f, 11.938f, 0.0f, false, false, 3.0f, 7.911f)
                lineTo(3.0f, 16.33f)
                arcTo(9.995f, 9.995f, 0.0f, true, true, 22.0f, 12.0f)
                arcToRelative(9.923f, 9.923f, 0.0f, false, true, -1.0f, 4.33f)
                close()
                moveTo(9.0f, 21.539f)
                verticalLineToRelative(2.066f)
                arcToRelative(11.59f, 11.59f, 0.0f, false, false, 6.0f, 0.0f)
                lineTo(15.0f, 21.539f)
                arcToRelative(9.992f, 9.992f, 0.0f, false, true, -6.0f, 0.0f)
                close()
            }
        }
        .build()
        return _sadCry!!
    }

private var _sadCry: ImageVector? = null
