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

public val Icons.Outline.DownFromBracket: ImageVector
    get() {
        if (_downFromBracket != null) {
            return _downFromBracket!!
        }
        _downFromBracket = Builder(name = "DownFromBracket", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 5.0f)
                lineTo(7.0f, 5.0f)
                lineTo(7.0f, 13.0f)
                lineTo(0.071f, 13.0f)
                lineToRelative(9.795f, 10.106f)
                lineToRelative(0.009f, 0.009f)
                curveToRelative(0.567f, 0.57f, 1.322f, 0.885f, 2.126f, 0.885f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.804f, 0.0f, 1.559f, -0.313f, 2.134f, -0.893f)
                lineToRelative(9.815f, -10.107f)
                horizontalLineToRelative(-6.951f)
                lineTo(16.999f, 5.0f)
                close()
                moveTo(19.222f, 15.0f)
                lineToRelative(-6.511f, 6.705f)
                curveToRelative(-0.189f, 0.19f, -0.441f, 0.295f, -0.708f, 0.295f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.266f, 0.0f, -0.516f, -0.104f, -0.705f, -0.291f)
                lineToRelative(-6.502f, -6.709f)
                horizontalLineToRelative(4.206f)
                lineTo(9.002f, 7.0f)
                horizontalLineToRelative(6.0f)
                lineTo(15.002f, 15.0f)
                horizontalLineToRelative(4.222f)
                close()
                moveTo(24.0f, 3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(22.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, -0.449f, -1.0f, -1.0f, -1.0f)
                lineTo(3.0f, 2.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                lineTo(0.0f, 9.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                lineTo(21.0f, 0.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _downFromBracket!!
    }

private var _downFromBracket: ImageVector? = null