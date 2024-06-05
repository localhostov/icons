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

public val Icons.Bold.BlindsOpen: ImageVector
    get() {
        if (_blindsOpen != null) {
            return _blindsOpen!!
        }
        _blindsOpen = Builder(name = "BlindsOpen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 9.0f)
                lineTo(0.0f, 9.0f)
                verticalLineToRelative(-3.0f)
                lineTo(17.0f, 6.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(17.0f, 12.0f)
                lineTo(0.0f, 12.0f)
                verticalLineToRelative(3.0f)
                lineTo(17.0f, 15.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(22.0f, 17.337f)
                lineTo(22.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(0.0f, 0.0f)
                lineTo(0.0f, 3.0f)
                lineTo(18.5f, 3.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(13.837f)
                curveToRelative(-1.182f, 0.562f, -2.0f, 1.767f, -2.0f, 3.163f)
                curveToRelative(0.0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.567f, 3.5f, -3.5f)
                curveToRelative(0.0f, -1.396f, -0.818f, -2.601f, -2.0f, -3.163f)
                close()
                moveTo(0.0f, 18.0f)
                verticalLineToRelative(3.0f)
                lineTo(15.025f, 21.0f)
                curveToRelative(-0.015f, -0.165f, -0.025f, -0.331f, -0.025f, -0.5f)
                curveToRelative(0.0f, -0.901f, 0.221f, -1.749f, 0.605f, -2.5f)
                lineTo(0.0f, 18.0f)
                close()
            }
        }
        .build()
        return _blindsOpen!!
    }

private var _blindsOpen: ImageVector? = null
