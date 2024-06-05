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

public val Icons.Outline.LeftFromBracket: ImageVector
    get() {
        if (_leftFromBracket != null) {
            return _leftFromBracket!!
        }
        _leftFromBracket = Builder(name = "LeftFromBracket", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 7.0f)
                lineTo(11.0f, 7.0f)
                lineTo(11.0f, 0.049f)
                lineTo(0.884f, 9.873f)
                curveToRelative(-0.57f, 0.567f, -0.884f, 1.322f, -0.884f, 2.126f)
                reflectiveCurveToRelative(0.314f, 1.559f, 0.885f, 2.126f)
                lineToRelative(10.115f, 9.804f)
                verticalLineToRelative(-6.929f)
                horizontalLineToRelative(8.0f)
                lineTo(19.0f, 7.0f)
                close()
                moveTo(17.0f, 15.0f)
                lineTo(9.0f, 15.0f)
                verticalLineToRelative(4.206f)
                lineTo(2.291f, 12.703f)
                curveToRelative(-0.188f, -0.188f, -0.291f, -0.438f, -0.291f, -0.705f)
                curveToRelative(0.0f, -0.268f, 0.104f, -0.52f, 0.285f, -0.7f)
                lineToRelative(6.715f, -6.52f)
                verticalLineToRelative(4.222f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(24.0f, 3.0f)
                lineTo(24.0f, 21.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.449f, 1.0f, -1.0f)
                lineTo(22.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(15.0f, 0.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _leftFromBracket!!
    }

private var _leftFromBracket: ImageVector? = null
