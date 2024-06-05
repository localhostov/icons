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

public val Icons.Outline.LightEmergencyOn: ImageVector
    get() {
        if (_lightEmergencyOn != null) {
            return _lightEmergencyOn!!
        }
        _lightEmergencyOn = Builder(name = "LightEmergencyOn", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 18.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -4.963f, -4.037f, -9.0f, -9.0f, -9.0f)
                reflectiveCurveTo(3.0f, 8.037f, 3.0f, 13.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(5.0f, 13.0f)
                curveToRelative(0.0f, -3.859f, 3.141f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.141f, 7.0f, 7.0f)
                verticalLineToRelative(5.0f)
                lineTo(5.0f, 18.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(22.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(2.335f, 6.646f)
                lineTo(0.018f, 4.426f)
                lineToRelative(1.383f, -1.443f)
                lineToRelative(2.317f, 2.22f)
                lineToRelative(-1.383f, 1.443f)
                close()
                moveTo(5.754f, 3.524f)
                lineToRelative(-1.212f, -2.717f)
                lineTo(6.368f, -0.008f)
                lineToRelative(1.212f, 2.717f)
                lineToRelative(-1.826f, 0.814f)
                close()
                moveTo(21.666f, 6.646f)
                lineToRelative(-1.383f, -1.443f)
                lineToRelative(2.317f, -2.22f)
                lineToRelative(1.383f, 1.443f)
                lineToRelative(-2.317f, 2.22f)
                close()
                moveTo(18.246f, 3.524f)
                lineToRelative(-1.826f, -0.814f)
                lineTo(17.633f, -0.008f)
                lineToRelative(1.826f, 0.814f)
                lineToRelative(-1.213f, 2.717f)
                close()
                moveTo(12.0f, 9.001f)
                verticalLineToRelative(2.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _lightEmergencyOn!!
    }

private var _lightEmergencyOn: ImageVector? = null
