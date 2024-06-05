package me.localx.icons.straight.bold

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

public val Icons.Bold.InputNumeric: ImageVector
    get() {
        if (_inputNumeric != null) {
            return _inputNumeric!!
        }
        _inputNumeric = Builder(name = "InputNumeric", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 7.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.621f)
                lineToRelative(-1.284f, 1.318f)
                lineToRelative(-1.433f, -1.395f)
                lineToRelative(3.215f, -3.303f)
                horizontalLineToRelative(1.501f)
                close()
                moveTo(24.0f, 5.5f)
                verticalLineToRelative(16.5f)
                lineTo(0.0f, 22.0f)
                lineTo(0.0f, 5.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21.0f, 5.5f)
                curveToRelative(0.0f, -0.275f, -0.224f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 5.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(18.0f)
                lineTo(21.0f, 5.5f)
                close()
            }
        }
        .build()
        return _inputNumeric!!
    }

private var _inputNumeric: ImageVector? = null
