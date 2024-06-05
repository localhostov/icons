package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.ShirtTankTop: ImageVector
    get() {
        if (_shirtTankTop != null) {
            return _shirtTankTop!!
        }
        _shirtTankTop = Builder(name = "ShirtTankTop", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.649f, 8.472f)
                curveToRelative(-1.033f, -0.645f, -1.649f, -1.756f, -1.649f, -2.972f)
                lineTo(18.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                lineTo(8.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 1.216f, -0.616f, 2.327f, -1.65f, 2.972f)
                curveToRelative(-0.832f, 0.521f, -1.35f, 1.479f, -1.35f, 2.502f)
                verticalLineToRelative(8.026f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-8.026f)
                curveToRelative(0.0f, -1.023f, -0.518f, -1.981f, -1.351f, -2.502f)
                close()
                moveTo(19.0f, 19.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-8.026f)
                curveToRelative(0.0f, -0.339f, 0.157f, -0.648f, 0.409f, -0.806f)
                curveToRelative(0.901f, -0.562f, 1.591f, -1.356f, 2.035f, -2.274f)
                curveToRelative(1.101f, 1.286f, 2.733f, 2.106f, 4.556f, 2.106f)
                reflectiveCurveToRelative(3.454f, -0.819f, 4.556f, -2.106f)
                curveToRelative(0.444f, 0.918f, 1.133f, 1.711f, 2.034f, 2.274f)
                curveToRelative(0.253f, 0.158f, 0.41f, 0.467f, 0.41f, 0.806f)
                verticalLineToRelative(8.026f)
                close()
            }
        }
        .build()
        return _shirtTankTop!!
    }

private var _shirtTankTop: ImageVector? = null
