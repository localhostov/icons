package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Dumpster: ImageVector
    get() {
        if (_dumpster != null) {
            return _dumpster!!
        }
        _dumpster = Builder(name = "Dumpster", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 0.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(7.0f, 0.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(19.0f, 6.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.209f, -1.791f, -4.0f, -4.0f, -4.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(0.091f, 8.0f)
                lineToRelative(0.584f, 6.451f)
                curveToRelative(0.233f, 2.576f, 2.393f, 4.549f, 4.98f, 4.549f)
                horizontalLineToRelative(12.691f)
                curveToRelative(2.587f, 0.0f, 4.746f, -1.973f, 4.98f, -4.549f)
                lineToRelative(0.584f, -6.451f)
                lineTo(0.091f, 8.0f)
                close()
                moveTo(17.0f, 0.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(4.0f)
                lineTo(17.0f, 0.0f)
                close()
                moveTo(5.0f, 6.0f)
                lineTo(5.0f, 0.0f)
                horizontalLineToRelative(-1.0f)
                curveTo(1.791f, 0.0f, 0.0f, 1.791f, 0.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(4.0f, 21.0f)
                verticalLineToRelative(0.083f)
                curveToRelative(0.0f, 1.608f, 1.346f, 2.917f, 3.0f, 2.917f)
                reflectiveCurveToRelative(3.0f, -1.309f, 3.0f, -2.917f)
                verticalLineToRelative(-0.083f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(14.0f, 21.0f)
                verticalLineToRelative(0.083f)
                curveToRelative(0.0f, 1.608f, 1.346f, 2.917f, 3.0f, 2.917f)
                reflectiveCurveToRelative(3.0f, -1.309f, 3.0f, -2.917f)
                verticalLineToRelative(-0.083f)
                horizontalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _dumpster!!
    }

private var _dumpster: ImageVector? = null
