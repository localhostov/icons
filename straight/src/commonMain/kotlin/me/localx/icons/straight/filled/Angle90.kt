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

public val Icons.Filled.Angle90: ImageVector
    get() {
        if (_angle90 != null) {
            return _angle90!!
        }
        _angle90 = Builder(name = "Angle90", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.982f, 9.432f)
                lineToRelative(1.414f, -1.414f)
                curveToRelative(1.275f, 1.424f, 2.335f, 3.042f, 3.109f, 4.817f)
                lineToRelative(-1.89f, 0.68f)
                curveToRelative(-0.667f, -1.498f, -1.561f, -2.87f, -2.633f, -4.084f)
                close()
                moveTo(11.165f, 3.496f)
                lineToRelative(-0.68f, 1.89f)
                curveToRelative(1.498f, 0.667f, 2.87f, 1.561f, 4.084f, 2.633f)
                lineToRelative(1.414f, -1.414f)
                curveToRelative(-1.424f, -1.275f, -3.041f, -2.335f, -4.817f, -3.109f)
                close()
                moveTo(19.317f, 15.389f)
                curveToRelative(0.441f, 1.461f, 0.684f, 3.008f, 0.684f, 4.611f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.841f, -0.28f, -3.617f, -0.796f, -5.291f)
                lineToRelative(-1.888f, 0.68f)
                close()
                moveTo(9.29f, 2.796f)
                curveToRelative(-1.674f, -0.516f, -3.45f, -0.796f, -5.29f, -0.796f)
                verticalLineToRelative(2.0f)
                curveToRelative(1.603f, 0.0f, 3.149f, 0.243f, 4.611f, 0.684f)
                lineToRelative(0.68f, -1.888f)
                close()
                moveTo(24.0f, 22.0f)
                lineTo(3.0f, 22.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                lineTo(2.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                verticalLineToRelative(21.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _angle90!!
    }

private var _angle90: ImageVector? = null
