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

public val Icons.Filled.Kerning: ImageVector
    get() {
        if (_kerning != null) {
            return _kerning!!
        }
        _kerning = Builder(name = "Kerning", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.877f, 19.0f)
                horizontalLineToRelative(2.123f)
                lineToRelative(-4.293f, -12.022f)
                curveToRelative(-0.217f, -0.604f, -0.771f, -0.994f, -1.411f, -0.994f)
                reflectiveCurveToRelative(-1.194f, 0.39f, -1.411f, 0.995f)
                lineToRelative(-4.294f, 12.021f)
                horizontalLineToRelative(2.123f)
                lineToRelative(1.429f, -4.0f)
                horizontalLineToRelative(4.306f)
                lineToRelative(1.429f, 4.0f)
                close()
                moveTo(16.857f, 13.0f)
                lineToRelative(1.438f, -4.027f)
                lineToRelative(1.438f, 4.027f)
                horizontalLineToRelative(-2.877f)
                close()
                moveTo(5.704f, 19.0f)
                curveToRelative(-0.641f, 0.0f, -1.194f, -0.39f, -1.411f, -0.995f)
                lineTo(0.0f, 5.983f)
                lineTo(2.123f, 5.983f)
                lineToRelative(3.581f, 10.027f)
                lineToRelative(3.581f, -10.027f)
                horizontalLineToRelative(2.123f)
                lineToRelative(-4.293f, 12.022f)
                curveToRelative(-0.217f, 0.604f, -0.771f, 0.994f, -1.411f, 0.994f)
                close()
                moveTo(17.574f, 0.0f)
                lineTo(9.004f, 24.0f)
                horizontalLineToRelative(-2.124f)
                lineTo(15.451f, 0.0f)
                horizontalLineToRelative(2.124f)
                close()
            }
        }
        .build()
        return _kerning!!
    }

private var _kerning: ImageVector? = null
