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

public val Icons.Outline.Transporter2: ImageVector
    get() {
        if (_transporter2 != null) {
            return _transporter2!!
        }
        _transporter2 = Builder(name = "Transporter2", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.5f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(21.167f, 2.333f)
                lineToRelative(-1.167f, -2.333f)
                lineToRelative(-1.167f, 2.333f)
                lineToRelative(-2.333f, 1.167f)
                lineToRelative(2.333f, 1.167f)
                lineToRelative(1.167f, 2.333f)
                lineToRelative(1.167f, -2.333f)
                lineToRelative(2.333f, -1.167f)
                lineToRelative(-2.333f, -1.167f)
                close()
                moveTo(6.5f, 16.5f)
                lineToRelative(-2.0f, -1.0f)
                lineToRelative(-1.0f, -2.0f)
                lineToRelative(-1.0f, 2.0f)
                lineToRelative(-2.0f, 1.0f)
                lineToRelative(2.0f, 1.0f)
                lineToRelative(1.0f, 2.0f)
                lineToRelative(1.0f, -2.0f)
                lineToRelative(2.0f, -1.0f)
                close()
                moveTo(4.0f, 24.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-2.0f)
                lineTo(4.0f, 22.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(16.0f, 19.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(17.0f, 12.0f)
                lineTo(7.0f, 12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(9.519f, 8.431f)
                curveToRelative(0.187f, -0.27f, 0.494f, -0.431f, 0.822f, -0.431f)
                horizontalLineToRelative(3.318f)
                curveToRelative(0.328f, 0.0f, 0.635f, 0.161f, 0.822f, 0.431f)
                lineToRelative(1.086f, 1.569f)
                horizontalLineToRelative(2.432f)
                lineToRelative(-1.874f, -2.707f)
                curveToRelative(-0.56f, -0.81f, -1.482f, -1.293f, -2.467f, -1.293f)
                horizontalLineToRelative(-3.318f)
                curveToRelative(-0.984f, 0.0f, -1.906f, 0.483f, -2.467f, 1.292f)
                lineToRelative(-1.874f, 2.708f)
                horizontalLineToRelative(2.432f)
                lineToRelative(1.086f, -1.569f)
                close()
            }
        }
        .build()
        return _transporter2!!
    }

private var _transporter2: ImageVector? = null
