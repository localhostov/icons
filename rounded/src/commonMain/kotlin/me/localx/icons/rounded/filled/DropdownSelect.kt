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

public val Icons.Filled.DropdownSelect: ImageVector
    get() {
        if (_dropdownSelect != null) {
            return _dropdownSelect!!
        }
        _dropdownSelect = Builder(name = "DropdownSelect", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(16.57f, 12.052f)
                lineToRelative(-3.509f, 3.509f)
                curveToRelative(-0.586f, 0.586f, -1.536f, 0.586f, -2.121f, 0.0f)
                lineToRelative(-3.509f, -3.509f)
                curveToRelative(-0.757f, -0.757f, -0.221f, -2.052f, 0.85f, -2.052f)
                horizontalLineToRelative(7.44f)
                curveToRelative(1.071f, 0.0f, 1.607f, 1.294f, 0.85f, 2.052f)
                close()
            }
        }
        .build()
        return _dropdownSelect!!
    }

private var _dropdownSelect: ImageVector? = null
