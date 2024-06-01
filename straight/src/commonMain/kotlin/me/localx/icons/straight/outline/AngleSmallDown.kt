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

public val Icons.Outline.AngleSmallDown: ImageVector
    get() {
        if (_angleSmallDown != null) {
            return _angleSmallDown!!
        }
        _angleSmallDown = Builder(name = "AngleSmallDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9998f, 15.5f)
                curveTo(11.7372f, 15.5005f, 11.4771f, 15.449f, 11.2345f, 15.3486f)
                curveTo(10.9918f, 15.2483f, 10.7714f, 15.1009f, 10.5858f, 14.915f)
                lineTo(5.2929f, 9.621f)
                lineTo(6.7069f, 8.207f)
                lineTo(11.9998f, 13.5f)
                lineTo(17.2928f, 8.207f)
                lineTo(18.7068f, 9.621f)
                lineTo(13.4138f, 14.914f)
                curveTo(13.2284f, 15.1001f, 13.008f, 15.2476f, 12.7653f, 15.3482f)
                curveTo(12.5227f, 15.4488f, 12.2625f, 15.5004f, 11.9998f, 15.5f)
                close()
            }
        }
        .build()
        return _angleSmallDown!!
    }

private var _angleSmallDown: ImageVector? = null
