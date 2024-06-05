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

public val Icons.Filled.CustomizeEdit: ImageVector
    get() {
        if (_customizeEdit != null) {
            return _customizeEdit!!
        }
        _customizeEdit = Builder(name = "CustomizeEdit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 10.692f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.343f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-5.0f)
                reflectiveCurveToRelative(1.0f, -6.0f, 5.0f, -6.0f)
                close()
                moveTo(15.666f, 11.938f)
                lineToRelative(7.626f, -7.818f)
                curveToRelative(0.943f, -0.942f, 0.945f, -2.47f, 0.003f, -3.413f)
                curveToRelative(-0.941f, -0.942f, -2.467f, -0.943f, -3.409f, -0.002f)
                curveToRelative(-0.032f, 0.032f, -7.453f, 8.222f, -7.453f, 8.222f)
                curveToRelative(1.491f, 0.45f, 2.686f, 1.564f, 3.232f, 3.011f)
                close()
                moveTo(15.914f, 14.549f)
                curveToRelative(-0.409f, 2.348f, -2.45f, 4.143f, -4.913f, 4.143f)
                lineTo(3.639f, 18.692f)
                lineToRelative(0.388f, -2.329f)
                curveToRelative(0.431f, -2.587f, 2.129f, -6.789f, 5.803f, -7.542f)
                curveToRelative(0.0f, 0.0f, 4.242f, -4.682f, 5.275f, -5.822f)
                lineTo(3.0f, 2.999f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(15.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-11.666f)
                lineToRelative(-5.087f, 5.215f)
                close()
            }
        }
        .build()
        return _customizeEdit!!
    }

private var _customizeEdit: ImageVector? = null
