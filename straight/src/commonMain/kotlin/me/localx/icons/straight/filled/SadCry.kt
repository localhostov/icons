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

public val Icons.Filled.SadCry: ImageVector
    get() {
        if (_sadCry != null) {
            return _sadCry!!
        }
        _sadCry = Builder(name = "SadCry", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(0.339f, 0.026f, -4.347f, 15.052f, 5.0f, 21.733f)
                lineTo(5.0f, 13.0f)
                lineTo(7.0f, 13.0f)
                verticalLineToRelative(9.9f)
                arcToRelative(12.008f, 12.008f, 0.0f, false, false, 10.0f, 0.0f)
                lineTo(17.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.733f)
                curveTo(28.351f, 15.047f, 23.654f, 0.024f, 12.0f, 0.0f)
                close()
                moveTo(8.0f, 9.0f)
                curveToRelative(-0.321f, 0.0f, -1.0f, 0.946f, -1.0f, 2.0f)
                lineTo(5.0f, 11.0f)
                curveToRelative(0.249f, -5.287f, 5.754f, -5.281f, 6.0f, 0.0f)
                lineTo(9.0f, 11.0f)
                curveTo(9.0f, 9.946f, 8.321f, 9.0f, 8.0f, 9.0f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(-2.63f, -0.074f, -2.63f, -5.927f, 0.0f, -6.0f)
                curveTo(14.63f, 13.074f, 14.63f, 18.927f, 12.0f, 19.0f)
                close()
                moveTo(17.0f, 11.0f)
                curveToRelative(0.0f, -1.054f, -0.679f, -2.0f, -1.0f, -2.0f)
                reflectiveCurveToRelative(-1.0f, 0.946f, -1.0f, 2.0f)
                lineTo(13.0f, 11.0f)
                curveToRelative(0.249f, -5.287f, 5.754f, -5.281f, 6.0f, 0.0f)
                close()
            }
        }
        .build()
        return _sadCry!!
    }

private var _sadCry: ImageVector? = null
