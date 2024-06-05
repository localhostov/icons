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

public val Icons.Bold.Stamp: ImageVector
    get() {
        if (_stamp != null) {
            return _stamp!!
        }
        _stamp = Builder(name = "Stamp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 24.0f)
                lineTo(2.0f, 24.0f)
                verticalLineToRelative(-3.0f)
                lineTo(22.0f, 21.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(24.0f, 14.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-5.37f)
                curveToRelative(0.453f, -2.886f, 0.87f, -6.081f, 0.87f, -7.091f)
                curveTo(16.0f, 1.704f, 14.206f, -0.091f, 12.0f, -0.091f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                curveToRelative(0.0f, 1.01f, 0.417f, 4.205f, 0.87f, 7.091f)
                lineTo(3.499f, 11.0f)
                curveToRelative(-1.929f, 0.0f, -3.499f, 1.57f, -3.499f, 3.5f)
                verticalLineToRelative(4.5f)
                lineTo(24.0f, 19.0f)
                verticalLineToRelative(-4.5f)
                close()
                moveTo(3.0f, 14.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.499f, -0.5f)
                lineTo(20.5f, 14.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                lineTo(3.0f, 16.0f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(13.0f, 3.909f)
                curveToRelative(0.0f, 0.766f, -0.45f, 4.326f, -1.0f, 7.657f)
                curveToRelative(-0.55f, -3.331f, -1.0f, -6.891f, -1.0f, -7.657f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.449f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _stamp!!
    }

private var _stamp: ImageVector? = null
