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

public val Icons.Outline.SignalAltSlash: ImageVector
    get() {
        if (_signalAltSlash != null) {
            return _signalAltSlash!!
        }
        _signalAltSlash = Builder(name = "SignalAltSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 21.251f)
                lineToRelative(-2.0f, -1.996f)
                verticalLineToRelative(2.746f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.742f)
                lineToRelative(-2.0f, -1.996f)
                verticalLineToRelative(6.739f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.735f)
                lineToRelative(-1.541f, -1.538f)
                curveToRelative(-0.286f, 0.346f, -0.459f, 0.79f, -0.459f, 1.273f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(16.754f)
                lineToRelative(-2.004f, -2.0f)
                lineToRelative(-0.751f, -0.749f)
                close()
                moveTo(7.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(21.0f, 19.591f)
                lineTo(21.0f, 2.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(2.609f)
                lineTo(1.416f, 0.042f)
                lineTo(0.003f, 1.458f)
                lineToRelative(22.588f, 22.548f)
                lineToRelative(1.413f, -1.416f)
                lineToRelative(-3.004f, -2.999f)
                close()
                moveTo(17.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(15.594f)
                lineToRelative(-2.0f, -1.996f)
                lineTo(17.0f, 2.0f)
                close()
                moveTo(13.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.602f)
                lineToRelative(-2.0f, -1.996f)
                verticalLineToRelative(-4.605f)
                close()
            }
        }
        .build()
        return _signalAltSlash!!
    }

private var _signalAltSlash: ImageVector? = null
