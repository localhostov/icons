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

public val Icons.Bold.HouseChimneyWindow: ImageVector
    get() {
        if (_houseChimneyWindow != null) {
            return _houseChimneyWindow!!
        }
        _houseChimneyWindow = Builder(name = "HouseChimneyWindow", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.657f, 7.395f)
                lineToRelative(-0.657f, -0.514f)
                lineTo(22.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.533f)
                lineTo(14.157f, 0.743f)
                curveToRelative(-1.271f, -0.992f, -3.044f, -0.992f, -4.313f, 0.0f)
                lineTo(1.342f, 7.396f)
                curveToRelative(-0.853f, 0.669f, -1.342f, 1.674f, -1.342f, 2.756f)
                verticalLineToRelative(13.849f)
                lineTo(24.0f, 24.001f)
                lineTo(24.0f, 10.151f)
                curveToRelative(0.0f, -1.082f, -0.489f, -2.087f, -1.343f, -2.757f)
                close()
                moveTo(21.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 10.151f)
                curveToRelative(0.0f, -0.154f, 0.07f, -0.299f, 0.192f, -0.394f)
                lineTo(11.692f, 3.106f)
                curveToRelative(0.182f, -0.143f, 0.435f, -0.143f, 0.616f, 0.0f)
                lineToRelative(8.499f, 6.65f)
                curveToRelative(0.123f, 0.096f, 0.193f, 0.24f, 0.193f, 0.395f)
                verticalLineToRelative(10.849f)
                close()
                moveTo(8.0f, 18.0f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 10.0f)
                lineTo(8.0f, 10.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(11.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _houseChimneyWindow!!
    }

private var _houseChimneyWindow: ImageVector? = null
