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

public val Icons.Bold.ShareAltSquare: ImageVector
    get() {
        if (_shareAltSquare != null) {
            return _shareAltSquare!!
        }
        _shareAltSquare = Builder(name = "ShareAltSquare", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 0.0f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                close()
                moveTo(12.975f, 10.213f)
                lineToRelative(-2.056f, 1.096f)
                curveToRelative(0.052f, 0.222f, 0.081f, 0.453f, 0.081f, 0.69f)
                reflectiveCurveToRelative(-0.028f, 0.469f, -0.081f, 0.69f)
                lineToRelative(2.056f, 1.096f)
                curveToRelative(0.534f, -0.488f, 1.244f, -0.787f, 2.025f, -0.787f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                curveToRelative(0.0f, -0.153f, 0.012f, -0.302f, 0.034f, -0.449f)
                lineToRelative(-2.203f, -1.175f)
                curveToRelative(-0.507f, 0.391f, -1.141f, 0.624f, -1.83f, 0.624f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.343f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.343f, -3.0f, 3.0f, -3.0f)
                curveToRelative(0.689f, 0.0f, 1.324f, 0.233f, 1.83f, 0.624f)
                lineToRelative(2.203f, -1.175f)
                curveToRelative(-0.022f, -0.146f, -0.034f, -0.296f, -0.034f, -0.449f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.343f, 3.0f, -3.0f, 3.0f)
                curveToRelative(-0.78f, 0.0f, -1.491f, -0.298f, -2.025f, -0.787f)
                close()
            }
        }
        .build()
        return _shareAltSquare!!
    }

private var _shareAltSquare: ImageVector? = null
