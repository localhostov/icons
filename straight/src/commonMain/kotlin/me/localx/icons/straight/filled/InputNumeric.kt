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

public val Icons.Filled.InputNumeric: ImageVector
    get() {
        if (_inputNumeric != null) {
            return _inputNumeric!!
        }
        _inputNumeric = Builder(name = "InputNumeric", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 2.5f)
                lineTo(3.0f, 2.5f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 5.5f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(8.0f, 17.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.621f)
                lineToRelative(-1.284f, 1.318f)
                lineToRelative(-1.433f, -1.395f)
                lineToRelative(3.215f, -3.303f)
                horizontalLineToRelative(1.501f)
                verticalLineToRelative(10.0f)
                close()
            }
        }
        .build()
        return _inputNumeric!!
    }

private var _inputNumeric: ImageVector? = null
