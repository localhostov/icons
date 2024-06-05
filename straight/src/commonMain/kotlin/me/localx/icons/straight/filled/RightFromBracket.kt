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

public val Icons.Filled.RightFromBracket: ImageVector
    get() {
        if (_rightFromBracket != null) {
            return _rightFromBracket!!
        }
        _rightFromBracket = Builder(name = "RightFromBracket", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.115f, 9.875f)
                lineTo(13.0f, 0.071f)
                verticalLineTo(7.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(10.0f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(6.952f)
                lineToRelative(10.117f, -9.824f)
                curveToRelative(0.57f, -0.567f, 0.883f, -1.323f, 0.883f, -2.126f)
                curveToRelative(0.0f, -0.804f, -0.314f, -1.56f, -0.885f, -2.126f)
                close()
                moveTo(3.0f, 22.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(3.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineTo(3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(3.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineTo(21.0f)
                curveToRelative(0.0f, 0.552f, 0.449f, 1.0f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _rightFromBracket!!
    }

private var _rightFromBracket: ImageVector? = null
