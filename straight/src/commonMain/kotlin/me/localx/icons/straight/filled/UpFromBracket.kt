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

public val Icons.Filled.UpFromBracket: ImageVector
    get() {
        if (_upFromBracket != null) {
            return _upFromBracket!!
        }
        _upFromBracket = Builder(name = "UpFromBracket", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 19.0f)
                horizontalLineToRelative(10.0f)
                lineTo(17.0f, 11.0f)
                horizontalLineToRelative(6.952f)
                lineTo(14.128f, 0.883f)
                curveToRelative(-0.567f, -0.569f, -1.322f, -0.883f, -2.125f, -0.883f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.804f, 0.0f, -1.56f, 0.314f, -2.126f, 0.885f)
                lineTo(0.071f, 11.0f)
                lineTo(7.0f, 11.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(24.0f, 15.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-6.0f)
                lineTo(2.0f, 15.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.552f, 0.449f, 1.0f, 1.0f, 1.0f)
                lineTo(21.0f, 22.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _upFromBracket!!
    }

private var _upFromBracket: ImageVector? = null
